package com.projeto.operadoresbasicos;

public class Operador {

	public static void main(String[] args) {

		int primeiro = 9;
		int segundo = 2;
		int resultado = 0;
		
		//soma
		resultado = primeiro + segundo;
		System.out.println("O resultado da soma é " + resultado);
		
		//subração
		resultado = primeiro - segundo;
		System.out.println("O resultado da subtração é " + resultado);
		
		//multiplicação
		resultado = primeiro * segundo;
		System.out.println("O resultado da multiplicação é " + resultado);
		
		//divisão
		resultado = primeiro / segundo;
		System.out.println("O resultado da divisão é " + resultado);		
		
		//módulo
		resultado = primeiro % segundo;
		System.out.println("O resultado do mod é " + resultado);		
		
	}

}
