package org.example;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageReader {
    BufferedImage read(ClassLoader classLoader, String name) throws IOException;
}
