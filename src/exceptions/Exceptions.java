package exceptions;

public class Exceptions {

	public Exceptions() {
	}

	public boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	public boolean returnsNull(String nulo) {
		if (nulo == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTooBig(double resultado) {
		if (resultado > 1E300 || resultado < -1E300) {
			return true;
		} else {
			return false;
		}
	}
}