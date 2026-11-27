package com.building.core;

import java.util.function.DoubleConsumer;

public class GameLoop {
    private Thread thread;
    private volatile boolean running;

    private static final double UPDATES_PER_SECOND = 60.0;
    private static final int MAX_CATCH_UP_UPDATES = 5;

    private final DoubleConsumer update;
    private final Runnable render;

    public GameLoop(DoubleConsumer update, Runnable processInput, Runnable render) {
        this.update = update;
        this.render = render;
    }

    public void start() {
        running = true;

        thread = new Thread( () -> runLoop(), "Game Loop");
    }

    public void stop() {
        running = false;
        if (thread != null) {
            thread.interrupt();
        }
    }

    private void runLoop() {
        final long fixedDeltaNanos = (long) (1_000_000_000.0 / UPDATES_PER_SECOND);

        long previousTime = System.nanoTime();
        long accumulator = 0;

        while (running) {
            long currentTime = System.nanoTime();
            long elapsedTime = currentTime - previousTime;
            previousTime = currentTime;

            accumulator += elapsedTime;

            int updates = 0;

            while (accumulator >= fixedDeltaNanos && updates < MAX_CATCH_UP_UPDATES) {
                update.accept(fixedDeltaNanos);

                accumulator -= fixedDeltaNanos;
                updates++;
            }

            if (updates == MAX_CATCH_UP_UPDATES && accumulator >= fixedDeltaNanos) {
                accumulator = 0;
            }

            render.run();

            long remainingTime = fixedDeltaNanos - accumulator;

            if (remainingTime > 0) {
                try {
                    long millis = remainingTime / 1_000_000;
                    int nano = (int) (remainingTime % 1_000_000);
                    Thread.sleep(millis, nano);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
