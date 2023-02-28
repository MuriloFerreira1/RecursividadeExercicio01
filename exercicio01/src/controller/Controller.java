package controller;

public class Controller {
	public int somaN(int n) {
		if(n<=0) {
			return 0;
		}else {
			return n+somaN(n-1);
		}
	}
}
