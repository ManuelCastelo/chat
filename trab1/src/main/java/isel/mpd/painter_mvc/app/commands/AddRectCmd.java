package isel.mpd.painter_mvc.app.commands;

import isel.mpd.painter_mvc.app.App;
import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.view.configdrawers.ConfigContext;

public class AddRectCmd implements Command{
    private final App app;
    private final ConfigContext ctx;


    public AddRectCmd(App app, ConfigContext ctx) {
        this.app = app;
        this.ctx = ctx;
    }

    @Override
    public void execute() {

        //app.addShape(new Rect(ctx.getRef(),ctx.getWidth(), ctx.getHeight(), ctx.getColor()));
        IShape ishape = ctx.getConfigurator().createShape();
        app.addShape(ishape);
    }

    @Override
    public void undo() {

    }

}
