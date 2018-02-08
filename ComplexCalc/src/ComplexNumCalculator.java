

public class ComplexNumCalculator implements Comparable {
	private double a = 0, b = 0;
	
	public ComplexNumCalculator() {}
	
	public ComplexNumCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumCalculator(double a) {
		this.a = a;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}

	public ComplexNumCalculator add(ComplexNumCalculator secondComplex) {
		double newA = a + secondComplex.getA();
		double newB = b + secondComplex.getB();
		
		return new ComplexNumCalculator(newA, newB);
	}
	
	public ComplexNumCalculator substract(ComplexNumCalculator secondComplex) {
		double newA = a - secondComplex.getA();
		double newB = b - secondComplex.getB();
		
		return new ComplexNumCalculator(newA, newB);
	}

	public ComplexNumCalculator multiply(ComplexNumCalculator secondComplex) {
		double newA = a * secondComplex.getA() - b * secondComplex.getB();
		double newB = b * secondComplex.getA() + a * secondComplex.getB();
		
		return new ComplexNumCalculator(newA, newB);
	}
	
	public ComplexNumCalculator devide(ComplexNumCalculator secondComplex) {
		double newA = (a * secondComplex.getA() - b * secondComplex.getB()) /
				(Math.pow(secondComplex.getA(), 2.0) + Math.pow(secondComplex.getB(), 2.0));
		double newB = (b * secondComplex.getA() - a * secondComplex.getB()) /
				(Math.pow(secondComplex.getA(), 2.0) + Math.pow(secondComplex.getB(), 2.0));		
		return new ComplexNumCalculator(newA, newB);
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
	
	public boolean equals(ComplexNumCalculator secondComplex) {
		if(this.getA() != secondComplex.getB())
			return false;
		else if(this.getB() != secondComplex.getB())
			return false;
		else
			return true;
	}
	
	@Override
	public int compareTo(Object secondComplex) {

		double d = this.abs() - ((ComplexNumCalculator)secondComplex).abs();
		if(d > 0.0)
			return 1;
		else if(d < 0.0)
			return -1;
		else
			return 0;
	}


}
