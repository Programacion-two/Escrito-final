package logica;

public class Producto {
	private int codigo;
	private String nombre;
	private double costo;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Producto(int codigo, String nombre, double costo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.costo = costo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", costo=" + costo + "]";
	}
	
	public double precioVenta() {
		if(costo>200) {
			return costo*0.20;
		}else {
			return costo*0.10;
		}
	
	}
}
	


