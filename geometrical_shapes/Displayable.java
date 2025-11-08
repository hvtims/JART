package geometrical_shapes;

public interface Displayable {
    void display(int x, int y);          
    void displayLine(Point a, Point b);  
    void save(String filename);          
}
