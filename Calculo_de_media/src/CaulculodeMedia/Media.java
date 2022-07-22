package CaulculodeMedia;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		//	vamos utilizar matriz array
		String resposta;
		String[] nome = new String[24];
		float[] nota1 = new float[24];
		float[] nota2 = new float[24];
		float[] nota3 = new float[24];
		float[] nota4 = new float[24];
		float[] nota5 = new float[24];
		float[] media = new float[24];
		for (int x=0; x<24; x++) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Nome do aluno-"+(x+1)+":");
			nome[x] = teclado.nextLine();
			System.out.print("Nota1:");
			nota1[x] = teclado.nextFloat();
			System.out.print("Nota2:");
			nota2[x] = teclado.nextFloat();
			System.out.print("Nota3:");
			nota3[x] = teclado.nextFloat();
			System.out.print("Nota4:");
			nota4[x] = teclado.nextFloat();
			System.out.print("Nota5:");
			nota5[x] = teclado.nextFloat();
			media[x] = (nota1[x]+nota2[x]+nota3[x]+nota4[x]+nota5[x])/5;
			System.out.printf("Obteve Média:%.2f\n",media[x]);
			System.out.print("Cadastrar outro aluno (s/n)");
			resposta = teclado.next();
			if (resposta.contentEquals("N")) {
				break;
			}
		}

		//OKAY aqui iremos listar os alunos e suas médias
		for (int x=0; x<24; x++) {
			if (nome[x]==null) {
				break;
			}
			System.out.printf("==================================================="+
			"===================================================\nNome:%s \t\t\tMédia: %.2f\n",nome[x],media[x]);
		}
		System.out.print("======================================================================================================");
		
		
		}
}
		

