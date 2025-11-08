package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    public Point topleft;
    public Point bottomright;
    public Point topright;
    public Point bottomleft;

    public Rectangle(Point x, Point y) {
        this.topleft = x;
        this.bottomright = y;
        fixpoints(this.topleft, this.bottomright);
    }

    public void fixpoints(Point x, Point y) {
        this.topright = new Point(y.x, x.y);
        this.bottomleft = new Point(x.x, y.y);
    }

    @Override
    public void draw(Displayable displayable) {
        new Line(topleft, topright).draw(displayable);
        new Line(topright, bottomright).draw(displayable);
        new Line(bottomright, bottomleft).draw(displayable);
        new Line(bottomleft, topleft).draw(displayable);
    }

    @Override
    public Color getColor() {
        return null; // ba9i mkhdmt biha
    }
}
