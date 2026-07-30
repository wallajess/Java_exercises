package ea_6_3;

import java.awt.*;
import java.awt.event.*;

public class Test {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        SimpleModel model = new SimpleModel();
        SimpleView view = new SimpleView(model);
        f.add(view);

        Button startButton = new Button("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    model.incr();
                    view.repaint();
                }
            }
        });
        f.add(startButton, BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);
    }
}
