package controller;

public class QtdeIntController {

	//função recursiva
	public int qtdeDigInt(int n) {
		if (n < 10 && n > -10) { //caso base
			return 1; //se o n for maior q 10 e for menor q -10, retornar 1, pq n só tem 1 dígito 
		}
		else {
			return 1 + qtdeDigInt(n / 10);
		}
	}
}
