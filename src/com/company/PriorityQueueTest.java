package com.company;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3.2);
        priorityQueue.offer(9.8);
        priorityQueue.offer(5.4);
        priorityQueue.offer(1.2);
        priorityQueue.offer(5.2);

        System.out.printf("pooling from queue ");

        while(priorityQueue.size() > 0) {
            System.out.printf("element: %.1f%n", priorityQueue.peek());
            priorityQueue.poll();
        }

    }

}
