package isel.mpd.painter_mvc.app.commands;

import isel.mpd.painter_mvc.app.App;
import isel.mpd.painter_mvc.view.configdrawers.ConfigContext;

import java.util.Map;

public class CommandFactory {
    public static Command buildMap(App app, ConfigContext ctx, String name){
        Map<String, Command> configMap = Map.ofEntries(
          Map.entry(App.SHAPE_CMD_RECT, new AddRectCmd(app, ctx)),
          Map.entry(App.SHAPE_CMD_TRIANGLE, new AddTriCmd(app, ctx)),
          Map.entry(App.SHAPE_CMD_OVAL, new AddOvalCmd(app, ctx)),
          Map.entry(App.SHAPE_CMD_CIRCLE, new AddCircleCmd(app, ctx)),
          Map.entry(App.SHAPE_CMD_LINE, new AddLineCmd(app, ctx))
        );
        configMap.get(name).execute();
        return configMap.get(name);
    }
}
