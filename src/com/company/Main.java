package com.company;

public class Main {

    public static void main(String[] args) {
        monteCarlo numbers = new monteCarlo(10, 10, 5);
        System.out.println(numbers.nextRainDrop_x());
        System.out.println(numbers.nextRainDrop_y());
        System.out.println(numbers.insideCircle());
    }
}
