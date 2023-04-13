package isel.mpd.painter_mvc.view.configdrawers;

import isel.mpd.painter_mvc.model.shapes.IShape;

import java.awt.*;

public interface ConfigDrawer {
    void setContext(ConfigContext ctx);
    void draw(Graphics2D gc);

    IShape createShape();
}
