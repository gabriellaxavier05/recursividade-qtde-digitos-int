package controller;

public class QtdeIntController {

	//função recursiva
	public int qtdeDigInt(int n) {
		if (n < 10 && n > -10) { //caso base
			return 1; //se o n for maior q 10 e for menor q -10, retornar 1, pq n só tem 1 dígito 
		}
		else {
			return 1 + qtdeDigInt(n / 10);
			/*
			 * se n for maior q 10, o valor vai ser dividido por 10. o resultado dessa divisão será passado como argumento
			 * quando a função for chamada novamente. Pra cada divisão realizada, é somado 1, q é como se fosse o contador.
			 * Quando n (o resultado da divisão) torna-se menor q 10, a recursividade para e o tamanho do número informado é retornado.
			 */
		}
	}
}
