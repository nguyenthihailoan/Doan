/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsb;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author nguye
 */
public class LSBEncode {

    public void hiddenIInfo(String frameVideo, String infHidden, String frameVideoEmbbed) {
        try {
            hideTheMessage(Message2Bit(infHidden), readImageFile(frameVideo), frameVideoEmbbed);
        } catch (Exception ex) {
            Logger.getLogger(LSBEncode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * convert msg to binary
     *
     * @param msg
     * @return
     */
    private int[] Message2Bit(String msg) {
        int j = 0;
        int[] b_msg = new int[msg.length() * 8];
        for (int i = 0; i < msg.length(); i++) {
            int x = msg.charAt(i);
            String x_s = Integer.toBinaryString(x);
            while (x_s.length() != 8) {
                x_s = '0' + x_s;
            }
            System.out.println("dec value for " + x + " is " + x_s);
            for (int i1 = 0; i1 < 8; i1++) {
                b_msg[j] = Integer.parseInt(String.valueOf(x_s.charAt(i1)));
                j++;
            };
        }
        return b_msg;
    }

    private BufferedImage readImageFile(String frameVideo) {
        BufferedImage theImage = null;
        File p = new File(frameVideo);
        try {
            theImage = ImageIO.read(p);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return theImage;
    }

    public void hideTheMessage(int[] infHidden, BufferedImage theImage, String frameVideoEmbbed) throws Exception {
        File f = new File(frameVideoEmbbed);
        BufferedImage sten_img = null;
        int bit_l = infHidden.length / 8;
        int[] bl_msg = new int[8];
        System.out.println("bit lent " + bit_l);
        String bl_s = Integer.toBinaryString(bit_l);
        while (bl_s.length() != 8) {
            bl_s = '0' + bl_s;
            System.out.println("bit lent string " + bl_s);

        }
        for (int i1 = 0; i1 < 8; i1++) {
            bl_msg[i1] = Integer.parseInt(String.valueOf(bl_s.charAt(i1)));
        };
        int j = 0;
        int b = 0;
        int currentBitEntry = 8;

        for (int x = 0; x < theImage.getWidth(); x++) {
            for (int y = 0; y < theImage.getHeight(); y++) {
                if (x == 0 && y < 8) {
                    int currentPixel = theImage.getRGB(x, y);
                    int ori = currentPixel;
                    int red = currentPixel >> 16;
                    red = red & 255;
                    int green = currentPixel >> 8;
                    green = green & 255;
                    int blue = currentPixel;
                    blue = blue & 255;
                    String x_s = Integer.toBinaryString(blue);
                    String sten_s = x_s.substring(0, x_s.length() - 1);
                    sten_s = sten_s + Integer.toString(bl_msg[b]);

                    //j++;
                    int temp = Integer.parseInt(sten_s, 2);
                    int s_pixel = Integer.parseInt(sten_s, 2);
                    int a = 255;
                    int rgb = (a << 24) | (red << 16) | (green << 8) | s_pixel;
                    theImage.setRGB(x, y, rgb);
                    //System.out.println("original "+ori+" after "+theImage.getRGB(x, y));
                    ImageIO.write(theImage, "png", f);
                    b++;

                } else if (currentBitEntry < infHidden.length + 8) {

                    int currentPixel = theImage.getRGB(x, y);
                    int ori = currentPixel;
                    int red = currentPixel >> 16;
                    red = red & 255;
                    int green = currentPixel >> 8;
                    green = green & 255;
                    int blue = currentPixel;
                    blue = blue & 255;
                    String x_s = Integer.toBinaryString(blue);
                    String sten_s = x_s.substring(0, x_s.length() - 1);
                    sten_s = sten_s + Integer.toString(infHidden[j]);
                    j++;
                    int temp = Integer.parseInt(sten_s, 2);
                    int s_pixel = Integer.parseInt(sten_s, 2);

                    int a = 255;
                    int rgb = (a << 24) | (red << 16) | (green << 8) | s_pixel;
                    theImage.setRGB(x, y, rgb);
                    //System.out.println("original "+ori+" after "+theImage.getRGB(x, y));
                    ImageIO.write(theImage, "png", f);

                    currentBitEntry++;
                }
            }
        }
        System.out.println("curre " + currentBitEntry);

    }
}
