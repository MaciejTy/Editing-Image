import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageManagement {
    private BufferedImage image;
    private int height, width;

    public void readImage(String path) throws IOException {
        File imageFile = new File(path);
        image = ImageIO.read(imageFile);
        height = image.getHeight();
        width = image.getWidth();
    }
    public void writeImage(String path) throws IOException {
        File imageFile = new File(path);
        ImageIO.write(image, "png", imageFile);
    }
    public void increaseBrightness(int value) {
        int width = image.getWidth();
        int height = image.getHeight();
        for(int y = 0; y < height; ++y) {
            for(int x = 0; x < width; ++x) {
                Color color = new Color(image.getRGB(x, y));
                int red = color.getRed() + value;
                int green = color.getGreen() + value;
                int blue = color.getBlue() + value;

                red = Math.max(0, Math.min(255, red));
                green = Math.max(0, Math.min(255, green));
                blue = Math.max(0, Math.min(255, blue));
                Color newColor = new Color(red, green, blue);
                image.setRGB(x, y, newColor.getRGB());
            }
        }
        System.out.println("Jasność obrazu zwiększona o " + value);
    }
}
