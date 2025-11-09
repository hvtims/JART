package geometrical_shapes;

import java.awt.Color;

public class Triangle extends Colored implements Drawable {
    
    public Point point1;
    public Point point2;
    public Point point3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
    }

    @Override
    public void draw(Displayable displayable) {
        new Line(point1, point2, getColor()).draw(displayable);
        new Line(point2, point3, getColor()).draw(displayable);
        new Line(point3, point1, getColor()).draw(displayable);
    }

    @Override
     public Color getColor() {
        return this.color;
    }
	

}
