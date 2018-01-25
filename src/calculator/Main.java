package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import exceptions.Exceptions;
import graphics.Graphics;
import operations.Operations;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7021024001343107052L;

	public static void main(String[] args) {

		final JPanel jpanel = new JPanel();
		jpanel.setName("Mi Calculadora");
		jpanel.setSize(500, 400);

		JButton buttonExit = new JButton(" Salir ");
		buttonExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent Exit) {
				System.exit(0);
			}
		});

		final JRadioButton jRadioButtonA = new JRadioButton("Suma");
		final JRadioButton jRadioButtonB = new JRadioButton("Resta");
		final JRadioButton jRadioButtonC = new JRadioButton("Producto");
		final JRadioButton jRadioButtonD = new JRadioButton("Cociente");
		final JRadioButton jRadioButtonE = new JRadioButton("Potencia");
		final JRadioButton jRadioButtonF = new JRadioButton("Raiz");

		JButton buttonCalcular = new JButton(" Calcular ");
		buttonCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent Ejecucion) {
				if (jRadioButtonA.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca el primer valor");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							String y = JOptionPane.showInputDialog("Introduzca el segundo valor");
							if (nulo.returnsNull(y)) {
							} else {
								if (isNotDouble.isDouble(y)) {
									JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
								} else {
									double b = Double.parseDouble(y);
									Operations c = new Operations(a, b);
									JOptionPane.showMessageDialog(null, "El resultado es = " + c.suma(a, b));
								}
							}
						}
					}
				} else if (jRadioButtonB.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca el primer valor");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							String y = JOptionPane.showInputDialog("Introduzca el segundo valor");
							if (nulo.returnsNull(y)) {
							} else {
								if (isNotDouble.isDouble(y)) {
									JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
								} else {
									double b = Double.parseDouble(y);
									Operations c = new Operations(a, b);
									JOptionPane.showMessageDialog(null, "El resultado es = " + c.resta(a, b));
								}
							}
						}
					}
				} else if (jRadioButtonC.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca el primer valor");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							String y = JOptionPane.showInputDialog("Introduzca el segundo valor");
							if (nulo.returnsNull(y)) {
							} else {
								if (isNotDouble.isDouble(y)) {
									JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
								} else {
									double b = Double.parseDouble(y);
									Operations c = new Operations(a, b);
									JOptionPane.showMessageDialog(null, "El resultado es = " + c.producto(a, b));
								}
							}
						}
					}
				} else if (jRadioButtonD.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca el primer valor");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							String y = JOptionPane.showInputDialog("Introduzca el segundo valor");
							if (nulo.returnsNull(y)) {
							} else {
								if (isNotDouble.isDouble(y)) {
									JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
								} else {
									double b = Double.parseDouble(y);
									if (b == 0) {
										JOptionPane.showMessageDialog(null, "Indeterminación");
									} else {
										Operations c = new Operations(a, b);
										JOptionPane.showMessageDialog(null, "El resultado es = " + c.cociente(a, b));
									}
								}
							}
						}
					}
				} else if (jRadioButtonE.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca la base de la potencia");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							String y = JOptionPane.showInputDialog("Introduzca el exponente de la potencia");
							if (nulo.returnsNull(y)) {
							} else {
								if (isNotDouble.isDouble(y)) {
									JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
								} else {
									double b = Double.parseDouble(y);
									Operations c = new Operations(a, b);
									Exceptions resultado = new Exceptions();
									if (resultado.isTooBig(c.potencia(a, b))) {
										JOptionPane.showMessageDialog(null,
												"El resultado tiene una cantidad excepcionalmente grande de cifras.");
									} else {
										JOptionPane.showMessageDialog(null, "El resultado es = " + c.potencia(a, b));
									}
								}
							}
						}
					}
				} else if (jRadioButtonF.isSelected()) {
					String x = JOptionPane.showInputDialog("Introduzca la base de la raiz");
					Exceptions nulo = new Exceptions();
					if (nulo.returnsNull(x)) {
					} else {
						Exceptions isNotDouble = new Exceptions();
						if (isNotDouble.isDouble(x)) {
							JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
						} else {
							double a = Double.parseDouble(x);
							if (a < 0) {
								JOptionPane.showMessageDialog(null,
										"Utilize el modo avanzado para \n" + "calcular raices de base negativa.");
							} else {
								String y = JOptionPane.showInputDialog("Introduzca el exponente de la raiz");
								if (nulo.returnsNull(y)) {
								} else {
									if (isNotDouble.isDouble(y)) {
										JOptionPane.showMessageDialog(null, "El valor ha de ser un número.");
									} else {
										double b = Double.parseDouble(y);
										if (a == 0 && b < 0) {
											JOptionPane.showMessageDialog(null, "Indeterminación");
										} else if (a != 0 && b == 0) {
											JOptionPane.showMessageDialog(null, "Indeterminación");
										} else {
											Operations c = new Operations(a, b);
											JOptionPane.showMessageDialog(null, "El resultado es = " + c.raiz(a, b));
										}
									}
								}
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Elija la operación a realizar");
				}
			}
		});
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonA);
		buttonGroup.add(jRadioButtonB);
		buttonGroup.add(jRadioButtonC);
		buttonGroup.add(jRadioButtonD);
		buttonGroup.add(jRadioButtonE);
		buttonGroup.add(jRadioButtonF);

		jpanel.add(jRadioButtonA);
		jpanel.add(jRadioButtonB);
		jpanel.add(jRadioButtonC);
		jpanel.add(jRadioButtonD);
		jpanel.add(jRadioButtonE);
		jpanel.add(jRadioButtonF);
		jpanel.add(buttonCalcular);
		jpanel.add(buttonExit);
		Graphics Icon = new Graphics();
		JOptionPane.showOptionDialog(null, jpanel, "Mi Calculadora", JOptionPane.CANCEL_OPTION,
				JOptionPane.CLOSED_OPTION, Icon.getGraphics(), args, "TEXT");
	}
}
