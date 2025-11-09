import geometrical_shapes.Circle;
import geometrical_shapes.Image;
import geometrical_shapes.Point;
import geometrical_shapes.Rectangle;
import geometrical_shapes.Triangle;
import geometrical_shapes.Cube;
import geometrical_shapes.Line;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900),
        new Point(100, 900));
        triangle.draw(image);

        Cube cube = new Cube(new Point(600, 200), 150, 50);
        cube.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

         Line line = Line.random(image.getWidth(), image.getHeight());
         line.draw(image);

         for (int i = 0; i < 200; i++) {
             Point point = Point.random(image.getWidth(), image.getHeight());
             point.draw(image);
         }

        image.save("image.png");
    }
}
