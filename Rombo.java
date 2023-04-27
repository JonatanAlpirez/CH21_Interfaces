
public class Rombo implements Figura{
	
	private String name;
	private double dmenor;
	private double dmayor;
	private double lado;
	public Rombo(String name, double dmenor, double dmayor, double lado) {
		super();
		this.name = name;
		this.dmenor = dmenor;
		this.dmayor = dmayor;
		this.lado = lado;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.dmayor * this.dmenor / 2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", dmenor=" + dmenor + ", dmayor=" + dmayor + ", lado=" + lado + "]";
	}
	
	

}
