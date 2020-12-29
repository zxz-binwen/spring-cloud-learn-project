package com.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServerApplication {

    private static  final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {

        Future<?> future = executorService.submit(() -> {

        });

        try {
            Object o = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            future.cancel(true);
        }

        SpringApplication.run(CloudEurekaServerApplication.class, args);
    }

}
