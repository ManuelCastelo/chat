package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.model.shapes.Rect;

import java.awt.*;

public class RectView implements ShapeView  {
    private Rect rect;

    public RectView(IShape s) {
        rect = (Rect) s;
    }


    @Override
    public void drawOn(Graphics g) {
        Point p = rect.getRef();

        g.setColor(rect.getColor());
        g.fillRect(p.x, p.y, rect.getWidth(), rect.getHeight());
    }

    public IShape getModel() { return rect; }


}
