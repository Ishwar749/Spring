package com.firstSpringProject.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

    public int binarySearch(int numbers[], int numberToSearchFor) {
        // Implement Sorting Logic Firsts
        bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);

        // Search Algorithm comes here
        return 3;
    }
}
