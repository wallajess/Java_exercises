package ea_5_3;

import java.awt.*;
import java.awt.event.*;

public class EggTimerController implements TickListener, ActionListener {
    private EggTimerModel model;
    private EventBasedTimer timer;
    private EggTimerCanvas canvas;
    private Button startButton;

    
    public EggTimerController (EggTimerModel model, EggTimerCanvas canvas, Button startButton) {
        this.model = model;
        this.canvas = canvas;
        this.startButton = startButton;
        
        this.timer = new EventBasedTimer();
        
        timer.addTickListener(this);
 
    }
        
     @Override
     public void actionPerformed(ActionEvent e) {
         startButton.setEnabled(false);
         timer.start();
     }
    
      @Override
      public void tickPerformed() {
          model.increaseElapsedTime();
          canvas.repaint();
          
          double elapsedTime = model.getElapsedPart();
          System.out.println("Elapsed time: " + elapsedTime);
          
          if (elapsedTime == 1.0) {
              timer.stop();
          }
                
    }
    
}
