package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Colored {
    Color color = Colored.getRandomColor();

    static Color getRandomColor() {
        Random rnd = new Random();
        return new Color(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
    }
}
