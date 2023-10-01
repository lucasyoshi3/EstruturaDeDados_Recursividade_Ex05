package view;
import java.util.*;

import controller.Controle;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Num: ");
		int num=sc.nextInt();
		
		Controle controle=new Controle();
		int digitos=controle.digitos(num);
		System.out.println("Qnt de digitos: "+digitos);
	}
}
