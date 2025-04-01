package ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
        int vetor[] = new int[6];
    	
    	for (int i = 0; i < vetor.length; i++) {
    	vetor[i] = rd.nextInt(100);
    	}

	    for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i] +" * "+n+" = "+ vetor[i] * n);
		sc.close();
		
	    }
      }
    }
