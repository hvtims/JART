package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    Point a, b;

    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public void draw(Displayable displayable) {
        displayable.display(a.x, a.y);
        displayable.display(b.x, b.y);
        System.out.println("--points:");
        System.out.println(a.x + " " + a.y);
        System.out.println(b.x + " " + b.y);

        int distX = a.x - b.x;
        int distY = a.y - b.y;
        int maxSteps = Math.max(Math.abs(distX), Math.abs(distY));

        int stepX = -distX / maxSteps;
        int stepY = -distY / maxSteps;

        for (int i = 0; i < maxSteps; i++) {
            int nextX = a.x + stepX * i;
            int nextY = a.y + stepY * i;

            System.out.println("nextY: " + nextX + " nextY: " + nextY);
            displayable.display(nextX, nextY);
        }
    }

    public Color getColor() {
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

}
