package geometrical_shapes;

import java.awt.Color;

public class Point extends Colored implements Drawable{
    public int x;
    public int y;

    public Point(int xx, int yy){
        this.x = xx;
        this.y = yy;
    }

    public static Point random(int maxWidth, int maxHeight) {
        double x = Math.random() * maxWidth;
        double y = Math.random() * maxHeight;
        return new Point((int) x, (int) y);
    }


    @Override
        public void draw(Displayable displayable) {
            displayable.display(this.x, this.y, getColor());
        }





     public Color getColor() {
        return this.color;
    }
}
    