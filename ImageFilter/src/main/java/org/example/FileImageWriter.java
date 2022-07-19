package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileImageWriter implements ImageWriter{
    public File file;

    public FileImageWriter(File file) {
        this.file = file;
    }

    @Override
    public void write(BufferedImage bufferedImage) throws IOException {
        final FileOutputStream blurredImageOutputStream = new FileOutputStream(file);
         ImageIO.write(bufferedImage, "jpg", blurredImageOutputStream);
    }
}
