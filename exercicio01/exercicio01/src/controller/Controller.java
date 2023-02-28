package controller;

public class Controller {
	public int somaN(int n) {
		//caso n chegue a 0 ou seja um número negativo
		if(n<=0) {
			return 0;
		}else {
			//O próximo passo compara o número anterior até começar a soma da pilha 
			return n+somaN(n-1);
		}
	}
}
