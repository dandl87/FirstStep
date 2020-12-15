package generics;

public class Rectangle extends Shape{
	private String name;
	private double altezza;
	private double larghezza;
	
	
	
	
	
	public Rectangle(String name, double altezza, double larghezza) {
		super();
		this.name = name;
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	@Override
	public void stampa() {
		// TODO Auto-generated method stub
		System.out.println("Figura: "+getName());
		System.out.println("altezza: "+getAltezza()+" larghezza: "+getLarghezza());
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	
	

}
