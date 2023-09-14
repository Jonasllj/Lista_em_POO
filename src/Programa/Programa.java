package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		 
		lista.add("Maria");
		lista.add("Alex"); 
		lista.add("Bob"); 
		lista.add("Anna"); 
		lista.add(2, "Marco");
		System.out.println(lista.size());
		
		for(String x: lista) {
			System.out.println(x);
		}
		System.out.println("------------------");
		//remoção por predicado por lista
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		System.out.println("Indice de Bob " + lista.indexOf("Bob"));
		System.out.println("Indice de Marco " + lista.indexOf("Marco"));

		System.out.println("------------------");
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for(String x: resultado) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
		String nome1 = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome1);

	}
	
	

}
