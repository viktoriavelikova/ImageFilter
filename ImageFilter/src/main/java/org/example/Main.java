package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Miroslav Kovachev
 * ${DATE}
 * Methodia Inc.
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Class<Main> mainClass = Main.class;
           final ClassLoader classLoader = mainClass.getClassLoader();
            //FileImageReader reader= new FileImageReader();
            //final BufferedImage bufferedImage= reader.read(classLoader,"download.jpg");
            Scanner scanner=new Scanner(System.in);
            final URL imageUrl = classLoader.getResource("download.jpg");
            final BufferedImage bufferedImage = ImageIO.read(imageUrl);
            final String oututPath = classLoader.getResource("").getPath();
            final File outputFIle = new File(oututPath + "/blurred.jpg");

            BluredImage bluredImage = new BluredImage();
            bluredImage.filter(bufferedImage);
            System.out.print("Insert color filter: ");
            String input=scanner.nextLine();
            ChangeImageColor imageColor =new ChangeImageColor();
            imageColor.setColorType(input);
            bluredImage.filter(bufferedImage);
            imageColor.filter(bufferedImage);

            FileImageWriter fileImageWriter = new FileImageWriter(outputFIle);
            fileImageWriter.write(bluredImage.filter(bufferedImage));


        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }
}

