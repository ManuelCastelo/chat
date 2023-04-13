package isel.mpd.painter_mvc.app;

import isel.mpd.painter_mvc.model.Picture;
import isel.mpd.painter_mvc.model.PictureChangedListener;
import isel.mpd.painter_mvc.model.shapes.IShape;
import isel.mpd.painter_mvc.view.PainterFrame;

public class App {
    // Command names
    public static final String SHAPE_CMD_RECT = "Rect";
    public static final String SHAPE_CMD_TRIANGLE = "Triangle";
    public static final String SHAPE_CMD_OVAL = "Oval";
    public static final String SHAPE_CMD_CIRCLE = "Circle";
    public static final String SHAPE_CMD_LINE= "Line";
    public static final String SHAPE_CMD_GROUP = "Group";
    public static final String CMD_UNDO = "Undo";


    private Picture picture;

    private PictureChangedListener listener;

    private App() {
        picture = new Picture();
    }

    private void fireAddShape(IShape s) {
        if (listener != null)
            listener.newShape(s);
    }


    public void setListener(PictureChangedListener listener) {
        this.listener = listener;
    }

    public void addShape(IShape s) {
        picture.add(s);
        fireAddShape(s);
    }

    public Iterable<IShape> getShapes() {
        return picture;
    }

    public static void main(String[] args) {
        App app = new App();

        PainterFrame painter = new PainterFrame(app);

        painter.setVisible(true);
    }
}
