package isel.mpd.painter_mvc.view;

import isel.mpd.painter_mvc.model.shapes.IShape;

import java.awt.*;

public interface ShapeView {
    void drawOn(Graphics g);
    IShape getModel();
}
