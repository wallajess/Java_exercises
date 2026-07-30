package ea_6_3;

import java.awt.*;

public class SimpleView extends Canvas {
    private SimpleModel model;

    public SimpleView(SimpleModel model) {
        this.model = model;
        setPreferredSize(new Dimension(200, 100));
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(String.valueOf(model.getValue()), 100, 50);
    }
}