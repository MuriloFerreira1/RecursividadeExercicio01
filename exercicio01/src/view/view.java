package view;
import controller.Controller;
public class view {

	public static void main(String[] args) {
		Controller c = new Controller();
		int input=5;
		int resultado = c.somaN(input);
		System.out.println("soma = "+resultado);
	}

}
