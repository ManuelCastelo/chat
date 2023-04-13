package isel.mpd.painter_mvc.model.shapes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

    public class Tri implements IShape  {
        private Point start;
        private int[] Xs;
        private int[] Ys;

        private int w;

        private int h;
        private Color color;



        public Tri(Point start, int[] Xs, int[] Ys, int w, int h, Color color) {
            this.start = start;
            this.color = color;
            this.w = w;
            this.h = h;
            this.Xs = Xs;
            this.Ys = Ys;
        }

        protected Point copy(Point p) {
            return new Point(p.x, p.y);
        }

        @Override
        public boolean intersects(IShape other) {
            return getBounds().intersects(other.getBounds());
        }

        @Override
        public boolean contains(Point p) {
            return getBounds().contains(p);
        }

        @Override
        public boolean contains(IShape other) {
            return getBounds().contains(other.getBounds());
        }

        @Override
        public void translate(int dx, int dy) {
            start.translate(dx, dy);
        }

        @Override
        public Rectangle getBounds() {
            return null;
        }

        @Override
        public Color getColor() {
            return color;
        }

        @Override
        public Point getRef() { return copy(start); }

        public int getWidth() { return w; }

        public int getHeight() { return h; }

        public int[] getXs() { return Xs; }

        public int[] getYs() { return Ys; }
    }