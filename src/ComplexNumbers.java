
public class ComplexNumbers implements Comparable {
	private double a = 0, b = 0;
	
	public ComplexNumbers() {}
	
	public ComplexNumbers(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumbers(double a) {
		this.a = a;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public ComplexNumbers add(ComplexNumbers secondComplex) {
		double newA = a + secondComplex.getA();
		double newB = b + secondComplex.getB();
		
		return new ComplexNumbers(newA, newB);
	}
	
	public ComplexNumbers substract(ComplexNumbers secondComplex) {
		double newA = a - secondComplex.getA();
		double newB = b - secondComplex.getB();
		
		return new ComplexNumbers(newA, newB);
	}
	
	public ComplexNumbers multiply(ComplexNumbers secondComplex) {
		double newA = a * secondComplex.getA() - b * secondComplex.getB();
		double newB = b * secondComplex.getA() + a * secondComplex.getB();
		
		return new ComplexNumbers(newA, newB);
	}
	
	public ComplexNumbers devide(ComplexNumbers secondComplex) {
		double newA = (a * secondComplex.getA() - b * secondComplex.getB()) /
				(Math.pow(secondComplex.getA(), 2.0) + Math.pow(secondComplex.getB(), 2.0));
		double newB = (b * secondComplex.getA() - a * secondComplex.getB()) /
				(Math.pow(secondComplex.getA(), 2.0) + Math.pow(secondComplex.getB(), 2.0));		
		return new ComplexNumbers(newA, newB);
	}
	
	public double abs() {
		return Math.sqrt(a * a + b * b);
	}
	
	public String toString() {
		if(b != 0)
			return a + "+" + b + "i";
		else
			return a + "";
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
	
	public boolean equals(ComplexNumbers secondComplex) {
		if(this.getA() != secondComplex.getB())
			return false;
		else if(this.getB() != secondComplex.getB())
			return false;
		else
			return true;
	}
	
	@Override
	public int compareTo(Object secondComplex) {
		double d = this.abs() - ((ComplexNumbers)secondComplex).abs();
		if(d > 0.0)
			return 1;
		else if(d < 0.0)
			return -1;
		else
			return 0;
	}


}
