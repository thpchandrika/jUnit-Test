package edu.mum.cs.cs425.demowebapps.elibrary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ArrayManipulationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ArrayManipulationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ArrayFlattener arrayFlattener = new ArrayFlattener();
		ArrayReversor arrayReversor = new ArrayReversor(arrayFlattener);

		int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
		int[] result = arrayFlattener.flattenArray(inputArray);
		System.out.println(Arrays.toString(result));

		int[][] inputArray1 = {{1, 3}, {0}, {4, 5, 9}};
		int[] result1 = arrayReversor.reverseArray(inputArray);
		System.out.println(Arrays.toString(result1));
	}
}
