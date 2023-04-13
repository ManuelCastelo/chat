package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.model.shapes.Rect;
import isel.mpd.painter_mvc.model.shapes.Tri;

import java.awt.*;

public class TriView implements ShapeView{

    private Tri tri;

    public TriView(IShape s){tri = (Tri) s;}
    @Override
    public void drawOn(Graphics g) {
        if (tri.getWidth() < 0 || tri.getHeight() < 0) return;
        Point p = tri.getRef();

        g.setColor(tri.getColor());
        g.fillPolygon(tri.getXs(),tri.getYs(),3);
    }

    @Override
    public IShape getModel() {
        return tri;
    }
}
