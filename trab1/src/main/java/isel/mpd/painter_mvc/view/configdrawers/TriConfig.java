package isel.mpd.painter_mvc.view.configdrawers;

import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.model.shapes.Rect;
import isel.mpd.painter_mvc.model.shapes.Tri;

import java.awt.*;

public class TriConfig implements ConfigDrawer {
    private ConfigContext ctx;

    @Override
    public void setContext(ConfigContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public IShape createShape() {
        int[] x = new int[] {ctx.getXs(), (ctx.getRef().x + ctx.getCurr().x)/2 , ctx.getCurr().x };
        int[] y = new int[] {ctx.getYs(), ctx.getCurr().y, ctx.getRef().y};
        return new Tri(ctx.getRef(), x, y, ctx.getWidth(), ctx.getHeight(), ctx.getColor());
    }

    @Override
    public void draw(Graphics2D gc) {
        if (ctx.getRef() == null) return;
        if (ctx.getWidth() < 0 || ctx.getHeight() < 0) return;

        int[] w = new int[] {ctx.getXs(), (ctx.getRef().x + ctx.getCurr().x)/2 , ctx.getCurr().x };
        int[] h = new int[] {ctx.getYs(), ctx.getCurr().y, ctx.getRef().y};
        gc.setColor(ctx.getColor());
        gc.drawPolygon(w,h, 3);
    }
}
