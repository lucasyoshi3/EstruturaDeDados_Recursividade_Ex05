package controller;

public class Controle {

	public int digitos(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 0;
		}
		return 1+digitos(num/10);
	}
	
}
