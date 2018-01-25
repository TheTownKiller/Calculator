package graphics;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Graphics {
	ImageIcon icon = new ImageIcon(Graphics.class.getResource("/graphics/Calculator.png"));
    Image image = icon.getImage(); 
    Image newimg = image.getScaledInstance(55, 55,  java.awt.Image.SCALE_SMOOTH); 
    ImageIcon titleIcon = new ImageIcon(newimg);    
    
    public ImageIcon getGraphics() {
    	return titleIcon;
    }
}
