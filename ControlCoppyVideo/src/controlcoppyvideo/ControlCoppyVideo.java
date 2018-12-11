/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcoppyvideo;

import java.io.File;
import lsb.LSBDecode;
import lsb.LSBEncode;
import lsb.Steganograph;
import org.apache.commons.imaging.formats.jpeg.decoder.Dct;

/**
 *
 * @author nguye
 */
public class ControlCoppyVideo {

    public static String PATHVIDEO = "C:\\Users\\nguye\\OneDrive\\Desktop\\DoAn_GiauTim\\videoplayback.mp4";
    public static String PATHVIDEOEMBBED = "C:\\Users\\nguye\\OneDrive\\Desktop\\DoAn_GiauTim\\embbed.mp4";
    public static String MESSAGE = "C:\\Users\\nguye\\OneDrive\\Desktop\\DoAn_GiauTim\\messenge.txt";
    public static String PATHIMG = "C:\\Users\\nguye\\OneDrive\\Desktop\\DoAn_GiauTim\\test.jpg";
    public static String PATHIMGLSB = "C:\\Users\\nguye\\OneDrive\\Desktop\\DoAn_GiauTim\\imgtestlsb.png";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean check = Steganograph.embedFile(new File(PATHIMG), new File(PATHIMGLSB), new File(MESSAGE), 0, "nguyenthihailoan");
        System.out.println(check + "");
    }
}
