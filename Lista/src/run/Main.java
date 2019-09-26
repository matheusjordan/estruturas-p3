package run;


import java.util.Scanner;

import exceptions.RemoveFromEmptyListException;
import impl.SequencialList;

public class Main {
	private static Scanner read = new Scanner(System.in);
	private static SequencialList list = new SequencialList();
	
	
	public static void main(String[] args) {
		boolean loop = true;
		
		System.out.println("Menu - By Matheus Jordan");
		
		while (loop) {
			System.out.printf("\n1 - Adicionar no final\n2 - Adicionar no inicio\n3 - Remover valores\n4 - Listar Valores\n0 - sair\nEscolha uma opcao: ");
			int opc = read.nextInt();
			
			int insertions, deletions;
			switch (opc) {
			
				case 1:
					System.out.printf("\nQuantidade de inserçoes: ");
					
					insertions = read.nextInt();
					
					for (; insertions > 0; insertions--) {
						System.out.printf("--> ");
						int value = read.nextInt();
						list.add(value);
					}
					
					break;
				
				case 2:
					System.out.printf("\nQuantidade de inserçoes: ");
					
					insertions = read.nextInt();
					
					for (; insertions > 0; insertions--) {
						System.out.printf("--> ");
						int value = read.nextInt();
						list.addFirst(value);
					}
					
					break;
					
				case 3:
					System.out.println("\nDigite a quantidade de remoçoes: ");
					
					deletions = read.nextInt();
					
					for(; deletions > 0; deletions--) {
						try {
							list.remove();
						} catch (RemoveFromEmptyListException e) {
							System.out.println(e.getMessage());
							break;
						}
					}
					
					break;
					
				case 4:
					System.out.println("\nTamanho da Lista: " + list.length());
					
					System.out.println("Valores inseridos:");
					
					if (list.length() == 0) {
						System.out.printf("Lista Vazia!!!");
					}
					
					for (Object value : list.values()) {
						System.out.printf(value + " ");
					}
					
					System.out.println();
					
					break;
				
				case 0:
					loop = false;
				
					System.out.println("Saiu...");
					break;
				
				default:
					System.out.println("Digita uma opcao entre 0 e 3 mongoloide analfabeto!!!");
					
					break;
			}
		}
		
		
	}
}
