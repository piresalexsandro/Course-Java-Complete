package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Julio");
		list.add("Alex");
		list.add("Andreia");
		list.add("Thifany");
		list.add("Alexsandro");
		list.add("Giulia");
		list.add("Anastacia");
		//add elementeo no meio da lista
		list.add(2, "Jaqueline");
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Tamanho da lista: " + list.size());


		System.out.println("----------------------------------------------------------------------");
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------------------------------------------------");
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		System.out.println("Index of Juliana: " + list.indexOf("Juliana")); // quando nao encontra o elemento ele mostra -1
		
		list.remove("Mariah");
		list.remove(3);
		list.removeIf(x -> x.charAt(0) == 'G'); 

		System.out.println("------- so iniciado com a letra A -------");
		                                        // x -> x.charAt(0) == 'A') = expressao lambda  
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-------- primeiro elemento que comece com a letra 'A'  -------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-------- Quando nao encontra com a letra solicitada -------------");
		String notFound = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
		System.out.println(notFound);
		
	}

}
