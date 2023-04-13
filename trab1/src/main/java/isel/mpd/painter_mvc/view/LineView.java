package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.Line;
import isel.mpd.painter_mvc.model.shapes.IShape;

import java.awt.*;

public class LineView implements ShapeView {
    private Line line;

    public LineView(IShape s) { line = (Line) s;}


    @Override
    public void drawOn(Graphics g) {
        Point p = line.getRef();

        g.setColor(line.getColor());
        g.drawLine(p.x, p.y, line.getEnd().x, line.getEnd().y);
    }
    public IShape getModel() { return line; }


}