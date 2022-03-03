package Main;

import java.util.Arrays;

import Pregunta1y2.Arbol;
import Pregunta3.Matrices;
import Pregunta4.DAC;
import Pregunta5.MergeSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pregunta 1
		System.out.println("Pregunta 1:");

		Arbol arbol = new Arbol();
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(3);
		arbol.insertar(4);
		arbol.insertar(0);
		System.out.println("Recorriendo inorden:");
		arbol.inorden();
		System.out.println("Recorriendo postorden:");
		arbol.postorden();
		System.out.println("Recorriendo preorden:");
		arbol.preorden();

		// Pregunta 2

		System.out.println("Pregunta 2:");

		System.out.println(arbol.existe(1)); // true
		System.out.println(arbol.existe(7)); // false
		System.out.println(arbol.existe(0)); // true
		// Pregunta3

		System.out.println("Pregunta 3:");

		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 }, };

		for (int[] input : test) {
			System.out.println("Array with Duplicates       : " + Arrays.toString(input));
			System.out.println("After removing duplicates   : " + Arrays.toString(Matrices.removeDuplicates(input)));
		}

		// Pregunta4

		System.out.println("Pregunta 4:");

		int min, max;

		// Initializing the array
		int a[] = { 70, 250, 50, 80, 140, 12, 14 };

		// Recursion - DAC_Max function called
		max = DAC.DAC_Max(a, 0, 7);

		// Recursion - DAC_Max function called
		min = DAC.DAC_Min(a, 0, 7);

		System.out.printf("The minimum number in " + "a given array is : %d\n", min);
		System.out.printf("The maximum number in " + "a given array is : %d\n", max);

		// Pregunta 5
		System.out.println("Pregunta 5:");

		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		MergeSort.printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		MergeSort.printArray(arr);
	}

}
