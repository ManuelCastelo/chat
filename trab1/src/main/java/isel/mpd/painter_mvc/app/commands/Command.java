package isel.mpd.painter_mvc.app.commands;

public interface Command {
    void execute();
    void undo();
}
