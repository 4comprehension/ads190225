package com.for_comprehension.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10_0000);
        ExecutorService e = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            e.submit(() -> {});
        }
    }
}
