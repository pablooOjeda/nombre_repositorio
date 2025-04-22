package recu_entornos;

public class Main {

	public static void main(String[] args) {
		POV_Circulo circulo1 = new POV_Circulo(1, 3, "verde");
		POV_Rectangulo rectangulo1 = new POV_Rectangulo(1, 3, 3, "rojo");
		
		
		double area1 = rectangulo1.area_rectangulo(rectangulo1);
		
		
		double area2 = circulo1.area_circulo(circulo1);
		
		
		double diferencia = extracted(area1, area2);
		
		
		extracted(circulo1, rectangulo1, diferencia);
	}

	public static void extracted(POV_Circulo circulo1, POV_Rectangulo rectangulo1, double diferencia) {
		System.out.println("Rectangulo: " +rectangulo1);
		System.out.println("Circulo: " +circulo1);
		System.out.println("Diferencia: " +diferencia);
	}

	public static double extracted(double area1, double area2) {
		double diferencia = area1 -area2;
		System.out.println("Diferencia areas: " +diferencia);
		return diferencia;
	}

	

	

}
