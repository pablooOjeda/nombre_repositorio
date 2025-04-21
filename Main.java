package recu_entornos;

public class Main {

	public static void main(String[] args) {
		POV_Circulo circulo1 = new POV_Circulo(1, 3, "verde");
		POV_Rectangulo rectangulo1 = new POV_Rectangulo(1, 3, 3, "rojo");
		
		
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area1 = ladoA * ladoB;
		System.out.println("Area rectangulo: " + area1);
		
		
		double radio1 = circulo1.getRadio();
		double area2 = radio1*3.14;
		System.out.println("Area cuadrado: " +area2);
		
		
		double diferencia = area1 -area2;
		System.out.println("Diferencia areas: " +diferencia);
		
		
		System.out.println("Rectangulo: " +rectangulo1);
		System.out.println("Circulo: " +circulo1);
		System.out.println("Diferencia: " +diferencia);
	}

}
