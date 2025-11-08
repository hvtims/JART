    package geometrical_shapes;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

    public class Image{
        public int width ;
        public int height;
        public BufferedImage bufferedImage;
        public Image (int widtht , int heightt){
            this.width = widtht;
            this.height = heightt;
            bufferedImage = new BufferedImage(width , height , bufferedImage.TYPE_INT_RGB);
            clear(0,0,0);
        }
        public  int getWidth(){
            return this.width;
        }
        public int getHeight(){
            return this.height;
        }
        public void clear (int r ,int g ,int b){
            int rgb = (r << 16) | (g << 8) | b ;
            for (int x = 0 ; x < width ; x++){
                for (int y = 0 ; y < height ; y++){
                    bufferedImage.setRGB(x, y, rgb);
                }
            }
        }
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