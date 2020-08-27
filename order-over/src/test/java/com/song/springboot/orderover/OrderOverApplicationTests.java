package com.song.springboot.orderover;

import com.song.springboot.orderover.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.song.springboot.orderover.mapper")
public class OrderOverApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void contextLoads() throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(5);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(()->{
                try {
                    cyclicBarrier.await();// 所有线程,在此等待 等5个线程
                    Integer orderid = orderService.createOrder(1);
                    System.out.println("订单id:" + orderid);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    cdl.countDown();
                }

            });
        }

        cdl.await();
        executorService.shutdown();
    }

}
