package view;

import controller.QtdeIntController;

public class PrincipalQtdeInt {

	public static void main(String[] args) {
		
		//instanciando a classe controller e criando um objeto
		QtdeIntController q = new QtdeIntController();
		
		int n = 20;
		
		//chamando a função recursiva
		int qtde = q.qtdeDigInt(n);
		System.out.printf("O número %d tem %d dígito(s). ", n, qtde); //o número 20 tem 2 dígitos
	}

}
