package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    public int width;
    public int height;
    public BufferedImage bufferedImage;

    public Image(int widtht , int heightt){
        this.width = widtht;
        this.height = heightt;
        bufferedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
        clear(0,0,0);
    }

    public int getWidth(){
         return this.width;
     }
    public int getHeight(){ 
        return this.height;
     }

    public void clear(int r, int g, int b){
        int rgb = (r << 16) | (g << 8) | b ;
        for (int x = 0 ; x < width ; x++){
            for (int y = 0 ; y < height ; y++){
                bufferedImage.setRGB(x, y, rgb);
            }
        }
    }

    @Override
    public void display(int x, int y){
        if(x >= 0 && x < width && y >= 0 && y < height)
            bufferedImage.setRGB(x, y, Color.WHITE.getRGB()); 
    }

    @Override
    public void displayLine(Point a, Point b){
        int x0 = a.x, y0 = a.y;
        int x1 = b.x, y1 = b.y;

        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;

        while(true){
            display(x0, y0);
            if(x0 == x1 && y0 == y1) break;
            int e2 = 2 * err;
            if(e2 > -dy){
                err -= dy;
                x0 += sx;
            }
            if(e2 < dx){
                err += dx;
                y0 += sy;
            }
        }
    }

    @Override
    public void save(String filename){
        try {
            File file = new File(filename);
            ImageIO.write(bufferedImage, "png" , file);
            System.out.println("image saved as : " + filename);
        } catch (Exception e) {
            System.err.println("failed to save image : " + e.getMessage());
        }
    }
}
