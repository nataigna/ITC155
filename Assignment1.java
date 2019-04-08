import java.awt.Color;
import java.awt.Graphics;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(550, 500);
		//set background color
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();
        //draw circles 
        g.setColor(Color.BLUE);
        g.fillOval(100,100,100,100);
        g.fillOval(300,100,100,100);
        //draw rect
        g.setColor(Color.RED); 
        g.fillRect(150, 150, 200, 200);
        //draw line
        g.setColor(Color.BLACK);
        g.drawLine(150, 250, 350, 250);
        
        
	}
	
	
}
