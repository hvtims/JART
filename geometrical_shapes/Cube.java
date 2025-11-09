package geometrical_shapes;

import java.awt.Color;

public class Cube extends Colored implements Drawable {

    public Point center;
    public int size;
    public int depth;  

    public Cube(Point center, int size, int depth) {
        this.center = center;
        this.size = size;
        this.depth = depth;
    }

    @Override
    public void draw(Displayable displayable) {
        int half = size / 2;

       
        Point A = new Point(center.x - half, center.y - half);
        Point B = new Point(center.x + half, center.y - half);
        Point C = new Point(center.x + half, center.y + half);
        Point D = new Point(center.x - half, center.y + half);

         
        Point A2 = new Point(A.x + depth, A.y - depth);
        Point B2 = new Point(B.x + depth, B.y - depth);
        Point C2 = new Point(C.x + depth, C.y - depth);
        Point D2 = new Point(D.x + depth, D.y - depth);

         
        new Line(A, B, getColor()).draw(displayable);
        new Line(B, C, getColor()).draw(displayable);
        new Line(C, D, getColor()).draw(displayable);
        new Line(D, A, getColor()).draw(displayable);

        
        new Line(A2, B2, getColor()).draw(displayable);
        new Line(B2, C2, getColor()).draw(displayable);
        new Line(C2, D2, getColor()).draw(displayable);
        new Line(D2, A2, getColor()).draw(displayable);

 
        new Line(A, A2, getColor()).draw(displayable);
        new Line(B, B2, getColor()).draw(displayable);
        new Line(C, C2, getColor()).draw(displayable);
        new Line(D, D2, getColor()).draw(displayable);
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
