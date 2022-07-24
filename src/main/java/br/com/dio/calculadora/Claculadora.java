package br.com.dio.calculadora;

import java.util.Scanner;

public class Claculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a= scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b= scan.nextInt();
		
		int soma= soma(a,b);
		int sub= subtraction(a,b);
		double div = division(a,b);
		int times= multiplication(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + sub);
		System.out.println("Divisao: " + div);
		System.out.println("Multiplicacao: " + times);

	}
	
	public static int soma (int a, int b)
	{
		return a+b;
	}
	public static int subtraction (int a, int b)
	{
		return a-b;
	}
	public static double division (int a, int b)
	{
		return a/b;
	}
	public static int multiplication (int a, int b)
	{
		return a*b;
	}

}
