package controller;

public class Controller {
	public int somaN(int n) {
		//caso n chegue a 0 ou seja um n�mero negativo
		if(n<=0) {
			return 0;
		}else {
			//O pr�ximo passo compara o n�mero anterior at� come�ar a soma da pilha 
			return n+somaN(n-1);
		}
	}
}
