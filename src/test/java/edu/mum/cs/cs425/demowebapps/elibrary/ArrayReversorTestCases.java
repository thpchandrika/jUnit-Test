package edu.mum.cs.cs425.demowebapps.elibrary;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ArrayReversorTestCases {

    @Mock
    private ArrayFlattener flattenerService;

    private ArrayReversor reversor;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        reversor = new ArrayReversor(flattenerService);
    }

    @Test
    public void testReverseArrayWithLegitInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        // Mock the flattener service to return the flattened array.
        when(flattenerService.flattenArray(inputArray)).thenReturn(flattenedArray);

        int[] result = reversor.reverseArray(inputArray);
        assertArrayEquals(expectedOutput, result);
        // Verify that the flattener service was invoked.
        verify(flattenerService).flattenArray(inputArray);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] inputArray = null;
        int[] result = reversor.reverseArray(inputArray);
        assertNull(result);
    }
}
