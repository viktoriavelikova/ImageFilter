package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class FileImageReader implements ImageReader {
    @Override
    public BufferedImage read( ClassLoader classLoader, String name) throws IOException {
        final URL imageUrl = classLoader.getResource(name);
        final BufferedImage bufferedImage = ImageIO.read(imageUrl);
        return bufferedImage;
    }
}
