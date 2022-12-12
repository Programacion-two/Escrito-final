package logica;

import logica.Producto;

public class Main {
	
	public static void main(String args[]) {
		Producto p1=new Producto(1111, "Jabon", 50);
		Producto p2= new Producto(2222,"Toalla", 100);
	
		System.out.println(p1);
		System.out.println(p2);
	}
}

