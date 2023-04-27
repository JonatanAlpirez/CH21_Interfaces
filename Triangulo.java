public class Triangulo implements Figura{
	
	private String name;
	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(String name, double base, double altura, double lado) {
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//Constructor
	
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (this.base * this.altura)/2;	
	}


	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.lado*3);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	@Override
	public String toString() {
		return "Triángulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
}//class Triangulo
