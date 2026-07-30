package ea_5_2;

import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends Frame {
    public BaseFrame() {
        class ClosingBeobachter extends WindowAdapter {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        
        addWindowListener(new ClosingBeobachter());
        setSize(300, 400);
        setLocationRelativeTo(null);
    }
}
