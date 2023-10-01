package edu.mum.cs.cs425.demowebapps.elibrary;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public int[] flattenArray(int[][] inputArray) {
        System.out.println("Flattened array service");
        if (inputArray == null) {
            return null;
        }

        List<Integer> flattenedList = new ArrayList<>();

        for (int[] row : inputArray) {
            if (row != null) {
                for (int value : row) {
                    flattenedList.add(value);
                }
            }
        }

        int[] result = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            result[i] = flattenedList.get(i);
        }

        return result;
    }
}
