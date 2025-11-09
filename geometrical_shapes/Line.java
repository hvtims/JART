package geometrical_shapes;

import java.awt.Color;

public class Line extends Colored implements Drawable {
    Point a, b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(Point a, Point b, Color color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public static Line random(int maxWidth, int maxHeight) {
        double x1 = Math.random() * maxWidth;
        double y1 = Math.random() * maxHeight;
        double x2 = Math.random() * maxWidth;
        double y2 = Math.random() * maxHeight;

        Point randomPoint1 = new Point((int) x1, (int) y1);
        Point randomPoint2 = new Point((int) x2, (int) y2);
        return new Line(randomPoint1, randomPoint2);
    }

    public void draw(Displayable displayable) {
        float distX = b.x - a.x;
        float distY = b.y - a.y;

        float maxSteps = Math.max(Math.abs(distX), Math.abs(distY));

        float stepX = distX / maxSteps;
        float stepY = distY / maxSteps;

        for (int i = 0; i < maxSteps; i++) {
            int nextX = Math.round(a.x + stepX * i);
            int nextY = Math.round(a.y + stepY * i);
            displayable.display(nextX, nextY, getColor());
        }
    }

    public Color getColor() {
        return this.color;
    }

}
