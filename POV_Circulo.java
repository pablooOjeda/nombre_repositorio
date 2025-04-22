package recu_entornos;

public class POV_Circulo {
	@Override
	public String toString() {
		return "POV_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}

	public POV_Circulo(int id, double radio, String color) {
		super();
		this.id = id;
		this.radio = radio;
		this.color = color;
	}
	
	public static double area_circulo(POV_Circulo circulo1) {
		double radio1 = circulo1.getRadio();
		double area2 = radio1*3.14;
		System.out.println("Area cuadrado: " +area2);
		return area2;
	}

	private int id;
	private double radio;
	private String color;
	
	public static void main(String[] args) {
		

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
