package ea_5_3;

import java.awt.*;

public class EggTimerCanvas extends Canvas{
    
    private EggTimerModel model;
    
    public EggTimerCanvas(EggTimerModel model) {
        this.model = model;
        
        setPreferredSize(new Dimension(320, 320));
    }
    
    @Override
    public void paint(Graphics g) {
        int angle = (int) (360 * model.getElapsedPart());
        
        //Size of circle
        int diameter = 300;
        
        int canvasWidth = getWidth();
        int canvasHeight = getHeight();
        
        //Kreis zentrieren
        //Berechnen der oberen linken Ecke
        int x = (canvasWidth - diameter)/2;
        int y = (canvasHeight - diameter)/2;
        
        //Hintergrundfrabe
        g.setColor(Color.BLACK);
        g.fillRect(0,  0,  getWidth(), getHeight());
        
        
        g.setColor(Color.RED);
        g.fillArc(x,  y,  diameter,  diameter, 90, -360);
   
        g.setColor(Color.GREEN);
        g.fillArc(x,  y,  diameter, diameter, 90, -angle);
        
       
       
    }
}
