package logica;

import logica.Producto;
import java.util.ArrayList;

public class ListaProducto {
	private ArrayList<Producto>lista;
	
	Producto p2=new Producto();
	Producto p3=new Producto();
	ListaProducto listado= new ListaProducto();
	
	
	public ListaProducto() {
	}
	
	public ListaProducto(ArrayList<Producto> lista, Producto p2, Producto p3,ListaProducto listado) {
		super();
		this.lista = lista;
		this.p2 = p2;
		this.p3 = p3;
		this.listado = listado;
	}
	
	
	public ArrayList<Producto> getLista() {
		return lista;
	}
	
	
	public void setLista(ArrayList<Producto> lista) {
		this.lista = lista;
	}
	
	
	public Producto getP2() {
		return p2;
	}
	
	
	public void setP2(Producto p2) {
		this.p2 = p2;
	}
	
	
	public Producto getP3() {
		return p3;
	}
	
	public void setP3(Producto p3) {
		this.p3 = p3;
	}
	
	
	public ListaProducto getListado() {
		return listado;
	}
	
	
	public void setListado(ListaProducto listado) {
		this.listado = listado;
	}
	
	
	@Override
	public String toString() {
		return "ListaProducto [lista=" + lista + ", p2=" + p2 + ", p3=" + p3 + ", listado=" + listado + "]";
	}
	
	
	public void insertarProductos(ListaProducto p2, ListaProducto p3) {
		lista.add(p2,p3);
		System.out.println(lista.add());
	}
	
	
	public void cantidadProductos(ListaProducto p2, ListaProducto p3) {
		lista.size(p2,p3);
		System.out.println(lista.size());
	}
}
