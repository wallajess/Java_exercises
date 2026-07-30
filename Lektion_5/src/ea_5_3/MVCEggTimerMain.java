package ea_5_3;

import java.awt.*;
import java.awt.event.*;

public class MVCEggTimerMain {
    public static void main(String[] args) {
        EggTimerModel model = new EggTimerModel(60);
        EggTimerCanvas canvas = new EggTimerCanvas(model);
        Button startButton = new Button("Start");
        
        Frame frame = new Frame("Kurzzeitwecker");
        
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(startButton, BorderLayout.SOUTH);
        
        // Fenstergröße und Position
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
 
        // Fenster schließen
        frame.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



        // Controller starten
        EggTimerController controller = new EggTimerController(model, canvas, startButton);
        
        startButton.addActionListener(controller);
    }
        
    }
