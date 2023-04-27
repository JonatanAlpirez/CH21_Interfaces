public class testFiguras {
	
	public static void main(String[] args) {
		
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		Cuadrado c1 = new  Cuadrado("Cuadrado c1", 20.0);
		Rectangulo r1 = new  Rectangulo("Rectangulo r1", 10, 15);
		Rombo rr1 = new  Rombo("Rombo rr1", 10, 15, 20);
		
		
		imprimirCalculo(t1); 
		imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(rr1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Figura t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras