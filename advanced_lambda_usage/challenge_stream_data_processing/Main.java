package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(3200, 4500, 2100, 5000, 3800, 1900);
        int result = processSalaries(salaries);
        System.out.println("Total increased salaries above threshold: " + result);
    }

    public static int processSalaries(List<Integer> salaries) {
        // Write your code here
        int threshold = 3000;
        double increaseRate = 0.10;

        int salaryList = salaries.stream()
            .filter(salary -> salary>threshold)
            .map(salary -> (int) Math.round(salary * (1 + increaseRate)))
            .reduce(0, Integer::sum);
        
        return salaryList;
    }
}
