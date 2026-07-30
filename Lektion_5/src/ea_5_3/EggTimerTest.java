package ea_5_3;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EggTimerTest {
    public static void main(String[] args) {
        EggTimerModel model = new EggTimerModel(60);
 
        EggTimerCanvas canvas = new EggTimerCanvas(model);
        
        Frame frame = new Frame("Kurzzeitwecker");
        
        frame.add(canvas, BorderLayout.CENTER);
        
        // Fenster schließen
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Fenstergröße und Position
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Controller starten – muss optional auch Canvas referenzieren
        new EggTimerController(model, canvas);  
    }
        
    }
