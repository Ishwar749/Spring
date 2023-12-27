package com.firstSpringProject.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int numbers[], int numberToSearchFor) {
        // Implement Sorting Logic First
        sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search Algorithm comes here
        return 3;
    }
}
