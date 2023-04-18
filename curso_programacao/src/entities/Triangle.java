package entities;

public class Triangle {
	double a;
	double b;
	double c;
	
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public void set(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
