package isel.mpd.painter_mvc.model.shapes;

import java.awt.Color;
import java.awt.Point;
import java.awt.*;



public class Circle implements IShape{
    private Point start;
    private int r;
    private Color color;

    private Oval bounds;

    public Circle(Point start, int r, Color color) {
        this.start = start;
        this.color = color;
        this.r = r;
    }

    protected Point copy(Point p){ return new Point(p.x, p.y); }
    @Override
    public Point getRef() {
        return copy(start);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public boolean intersects(IShape other) {
        return getBounds().intersects(other.getBounds());
    }

    @Override
    public boolean contains(Point p) {
        return getBounds().contains(p);
    }

    @Override
    public boolean contains(IShape other) {
        return getBounds().contains(other.getBounds());
    }

    @Override
    public void translate(int dx, int dy) {
        start.translate(dx, dy);
        bounds = null;
    }



    @Override
    public Rectangle getBounds() {return  null;}

    public int getRadius() {
        return r;
    }



}
