package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.model.shapes.Oval;
import isel.mpd.painter_mvc.model.shapes.Rect;

import java.awt.*;

public class OvalView implements ShapeView {
    private Oval oval;

    public OvalView(IShape s) {
        oval = (Oval) s;
    }


    @Override
    public void drawOn(Graphics g) {
        Point p = oval.getRef();

        g.setColor(oval.getColor());
        g.fillOval(p.x, p.y, oval.getWidth(), oval.getHeight());
    }
    public IShape getModel() { return oval; }


}
