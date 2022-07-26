package TitulodeEleitor;

import java.util.Scanner;

public class ValidarTitulodeEleitor {

	public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
		
		String titulo = "1023.8501.06.71";
		String S1,S2,S3,S4,S5,S6,S7,S8,S9,S10, confere = "";
		int N1,N2,N3,N4,N5,N6,N7,N8,UF1,UF2, verificador1, verificador2, DV1, DV2;
		System.out.print("Digite o seu numero de eleitor: ");
		
		titulo = teclado.next();
		
		S1 = titulo.substring(0,1); N1 = Integer.parseInt(S1);
		S2 = titulo.substring(1,2); N2 = Integer.parseInt(S2);
		S3 = titulo.substring(2,3); N3 = Integer.parseInt(S3);
		S4 = titulo.substring(3,4); N4 = Integer.parseInt(S4);
		S5 = titulo.substring(5,6); N5 = Integer.parseInt(S5);
		S6 = titulo.substring(6,7); N6 = Integer.parseInt(S6);
		S7 = titulo.substring(7,8); N7 = Integer.parseInt(S7);
		S8 = titulo.substring(8,9); N8 = Integer.parseInt(S8);
		S9 = titulo.substring(10,11); UF1 = Integer.parseInt(S9);
		S10 = titulo.substring(11,12); UF2 = Integer.parseInt(S10);
		
		verificador1 = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 5 + N5 * 6 + N6 * 7 + N7 * 8 + N8 * 9 );
		
		DV1 = (verificador1 %11);
		
		verificador2 =(UF1 * 7 + UF2 * 8 + DV1 * 9);
		
		DV2 = (verificador2 %11);
		
	 confere=(S1 + S2 + S3 + S4 +"."+ S5 + S6 + S7 + S8 +"."+ S9 + S10+ "."+ DV1 +""+ DV2 );
		
	 if(confere.equals(titulo)) {
			System.out.print("\t\t\t<----------O seu titulo de eleitor é válido---------->");
		}else {
			System.out.print("\n\t\t\t<----------O seu titulo de eleitor não é válido---------->  " );
		}
		
		}
	

	}


