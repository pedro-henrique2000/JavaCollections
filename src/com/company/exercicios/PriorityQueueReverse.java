package com.company.exercicios;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueReverse {

    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

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
