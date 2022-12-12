package logica;

public class Limpieza extends Producto {
	private int anioVencimiento;
	
	
	public Limpieza() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Limpieza(int codigo, String nombre, double costo, int anioVencimiento) {
		super(codigo, nombre, costo);
		this.anioVencimiento=anioVencimiento;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getAnioVencimiento() {
		return anioVencimiento;
	}
	
	
	public void setAnioVencimiento(int anioVencimiento) {
		this.anioVencimiento = anioVencimiento;
	}
	
	
	@Override
	public String toString() {
		return "[toString producto=" + super.toString() + "]" + "Limpieza [anioVencimiento=" + anioVencimiento + "]";
	}
	
	
	public double precioVenta() {
		if(anioVencimiento<2022) {
			return super.precioVenta()-0.10;
		}else {
			return super.precioVenta();

		}
	}
}
