import com.sun.scenario.effect.impl.prism.PrImage;

import java.awt.FontMetrics;
import  java.awt.Dimension;
import  java.awt.Graphics;
import javax.swing.JPanel;
public class MessagePanel {
  private  String message = "Weclome to Java";
  private  int xCoordinate = 20;
  private  int yCoordinate =20;
  private  boolean centered;
  private  int interval = 10;

    public MessagePanel() {
    }

    public MessagePanel(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public boolean isCentered() {
        return centered;
    }

    public void setCentered(boolean centered) {
        this.centered = centered;
        repaint();
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
        repaint();
    }
    protected  void  paintComponent(Graphics g){
        super.paintComponent(g);
        if(centered){
            FontMetrics fm = g.getFontMetrics();
            int stringWidth = fm.stringWidth(message);
            int stringAscent = fm.getAscent();
            xCoordinate = getWidth();
            yCoordinate = getHeight();
        }
        g.drawString(message,xCoordinate,yCoordinate);
    }
    public void moveLeft(){
        xCoordinate -= interval;
        repaint();
    }

    public void moveRight(){
      xCoordinate +=interval;
        repaint();
    }
    public  void moveUp(){
        yCoordinate-= interval;
        repaint();
    }
    public  void moveDown(){
        yCoordinate +=interval;
    }
    public Dimension getPreferredSize(){
        return  new Dimension(200,30)
    }
}
