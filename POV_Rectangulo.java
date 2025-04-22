package recu_entornos;

public class POV_Rectangulo {
	public POV_Rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		this.id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}
	
	public static double area_rectangulo(POV_Rectangulo rectangulo1) {
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area1 = ladoA * ladoB;
		System.out.println("Area rectangulo: " + area1);
		return area1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "POV_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	private int id;
	private double ladoA;
	private double ladoB;
	private String color;
	public static void main(String[] args) {
		

	}

}
