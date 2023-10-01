package edu.mum.cs.cs425.demowebapps.elibrary;

public class ArrayReversor {

    private ArrayFlattener flattenerService;

    public ArrayReversor(ArrayFlattener flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] inputArray) {
        System.out.println("Reverse array service");
        if (inputArray == null) {
            return null;
        }

        int[] flattenedArray = flattenerService.flattenArray(inputArray);
        int[] reversedArray = new int[flattenedArray.length];

        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }

        return reversedArray;
    }

}
