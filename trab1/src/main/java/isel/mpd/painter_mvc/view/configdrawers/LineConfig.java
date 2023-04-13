package isel.mpd.painter_mvc.view.configdrawers;

import isel.mpd.painter_mvc.model.shapes.Line;
import isel.mpd.painter_mvc.model.shapes.IShape;

import java.awt.*;

public class LineConfig implements ConfigDrawer{
    private ConfigContext ctx;

    @Override
    public void setContext(ConfigContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public IShape createShape() {
        return new Line(ctx.getRef(), ctx.getCurr(), ctx.getColor());
    }

    @Override
    public void draw(Graphics2D gc) {
        if (ctx.getRef() == null) return;

        gc.setColor(ctx.getColor());
        gc.drawLine(ctx.getXs(), ctx.getYs() , ctx.getXc(), ctx.getYc());
    }

}
