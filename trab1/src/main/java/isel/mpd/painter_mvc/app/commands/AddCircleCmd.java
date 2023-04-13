package isel.mpd.painter_mvc.app.commands;

import isel.mpd.painter_mvc.app.App;
import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.view.configdrawers.ConfigContext;

public class AddCircleCmd implements Command{

    private final App app;
    private final ConfigContext ctx;


    public AddCircleCmd(App app, ConfigContext ctx) {
        this.app = app;
        this.ctx = ctx;
    }

    @Override
    public void execute() {
        IShape ishape = ctx.getConfigurator().createShape();
        app.addShape(ishape);
        //app.addShape(new Oval(ctx.getRef(), ctx.getWidth(),ctx.getHeight(), ctx.getColor()));
    }

    @Override
    public void undo() {

    }
}
