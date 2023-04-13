package isel.mpd.painter_mvc.model;

import isel.mpd.painter_mvc.model.shapes.IShape;
public interface PictureChangedListener {
    void newShape(IShape s);
}