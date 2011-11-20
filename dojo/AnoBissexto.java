package dojo;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while(true){
			System.out.println("::Ano bissexto::");	
			System.out.print("Digite um ano: ");
			int ano = entrada.nextInt();	
			if(ano <= 0){
				System.out.println("Voc� digitou um ano inv�lido!");
				continue;
			}	
			System.out.println(calculaAnoBissexto(ano)+"\n");
		}
	}
	
	public static String calculaAnoBissexto(int ano) {
		String bissextoOuNao = "";
		if(ano % 4 == 0 && ano % 100 != 0){
			bissextoOuNao = ano+" � um ano bissexto!";
		}else if(ano % 400 == 0){
			bissextoOuNao = ano+" � um ano bissexto!";
		}else{
			bissextoOuNao = ano+" n�o � um ano bissexto!";
		}
		return bissextoOuNao;
	}

}

