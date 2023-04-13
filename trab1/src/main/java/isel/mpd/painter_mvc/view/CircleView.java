package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.Circle;
import isel.mpd.painter_mvc.model.shapes.IShape;

import java.awt.*;

public class CircleView implements ShapeView {
    private Circle circle;

    public CircleView(IShape s) { circle = (Circle) s;}


    @Override
    public void drawOn(Graphics g) {
        Point p = circle.getRef();

        g.setColor(circle.getColor());
        g.fillOval(p.x, p.y, circle.getRadius(), circle.getRadius());
    }
    public IShape getModel() { return circle; }


}
