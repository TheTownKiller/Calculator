package operations;

public class Operations {

	double x;
	double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double suma(double x, double y) {
		double z = x + y;
		return z;
	}

	public double resta(double x, double y) {
		double z = x - y;
		return z;
	}

	public double producto(double x, double y) {
		double z = x * y;
		return z;
	}

	public double cociente(double x, double y) {
		double z = x / y;
		return z;
	}

	public double potencia(double x, double y) {
		double z = Math.pow(x, y);
		return z;
	}

	public double raiz(double x, double y) {
		double z = Math.pow(x, 1 / y);
		return z;
	}

	public double seno(double x) {
		double z = Math.sin(x);
		return z;
	}

	public double coseno(double x) {
		double z = Math.cos(x);
		return z;
	}

	public double tangente(double x) {
		double z = Math.tan(x);
		return z;
	}

	public double logaritmo(double x, double y) {
		double z = Math.log(y) / Math.log(x);
		return z;
	}
	
	public String raizCompleja(double x, double y) {
		if (y%2 == 0) {
		String z = (Math.pow(x*(-1), 1/y))+ " i.";
		return z;
		}else {
			String z = (Math.pow(x*(-1), 1/y))*-1 + "."; 	
			return z;
		}
	}

	
	public Operations(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Operations(double x) {
		this.x = x;
	}
}