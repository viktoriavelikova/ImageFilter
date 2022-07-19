package org.example;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ChangeImageColor implements ImageFilter{
    String colorType;

    public void setColorType(String color) {
        this.colorType = color;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage) {
        final int height = bufferedImage.getHeight();
        final int width = bufferedImage.getWidth();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = new Color(bufferedImage.getRGB(x, y));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int onlyRed = new Color(red, 0, 0).getRGB();
                int onlyGreen = new Color(0, green, 0).getRGB();
                int onlyBlue = new Color(0, 0, blue).getRGB();
                if (colorType.equals("red")) {
                    bufferedImage.setRGB(x, y, onlyRed);
                } else if (colorType.equals("green")) {
                    bufferedImage.setRGB(x, y, onlyGreen);
                } else if (colorType.equals("blue")) {
                    bufferedImage.setRGB(x, y, onlyBlue);
                }
            }
        }
        return bufferedImage;
    }
}
