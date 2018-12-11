/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcoppyvideo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class HashMD5 {
    public static String getMd5FromVideo(String pathVideo){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] hashInByte=checkSum(pathVideo, md);
            return bytesToHex(hashInByte);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashMD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private static byte[] checkSum(String pathVideo,MessageDigest md){
        try {
            DigestInputStream dis=new DigestInputStream(
                    new FileInputStream(pathVideo), md);
            int lenght=dis.read();
            while (lenght!=-1){
                md=dis.getMessageDigest();
                lenght=dis.read();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HashMD5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HashMD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        return md.digest();
    }
    
    private static String bytesToHex(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();

    }
}
