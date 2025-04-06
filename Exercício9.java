package Exercícios;

import java.util.Arrays;
import java.util.Random;

public class Exercício9 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int vetor[] = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = rd.nextInt(101);
		}
		
	    int[] pares = new int[10];
	    int[] ímpares = new int[10];
	    int contpares = 0;
	    int contímpares = 0;
	    
	    for (int i = 0; i < vetor.length; i++) {
	    if (vetor[i] % 2 == 0) {
	    pares[contpares] = vetor[i];
	    contpares++;
	    } else {
	    ímpares[contímpares] = vetor[i];
	    contímpares++;
	    }
		}
	    
	    Arrays.sort(pares, 0, contpares);    
        Arrays.sort(ímpares, 0, contímpares);
	    Arrays.sort(vetor);
	    
	    System.out.print("Vetor original: ");
	    for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + " ");
		} System.out.println();
	    System.out.print("Pares: ");
	    for (int i = 0; i < contpares; i++) {
	    System.out.print(pares[i] + " ");
		} System.out.println();
		System.out.print("Ímpares: ");
	    for (int i = 0; i < contímpares; i++) {
	    System.out.print(ímpares[i] + " ");
	    }
	}
}
