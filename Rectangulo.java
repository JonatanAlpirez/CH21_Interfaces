
public class Rectangulo implements Figura{
	private String name;
	private double base;
	private double altura;
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.base * this.altura;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.base *2 + this.altura*2;
	}
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
	
	
	

}
