package isel.mpd.painter_mvc.view.configdrawers;

import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.model.shapes.Oval;
import isel.mpd.painter_mvc.model.shapes.Rect;

import java.awt.*;

public class OvalConfig implements ConfigDrawer{
    private ConfigContext ctx;

    @Override
    public void setContext(ConfigContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public IShape createShape() {
        return new Oval(ctx.getRef(), ctx.getWidth(), ctx.getHeight(), ctx.getColor());
    }

    @Override
    public void draw(Graphics2D gc) {
        if (ctx.getRef() == null) return;

        gc.setColor(ctx.getColor());
        gc.drawOval(ctx.getXs(), ctx.getYs(), ctx.getWidth(), ctx.getHeight());
    }

}
