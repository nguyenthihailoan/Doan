/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stega;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

/**
 *
 * @author VONG-OS
 */
public class VideoUtils {

    public static void extraAllFramVideo(String pathVideo, String pathOutFram) {
        VideoCapture cap = new VideoCapture();
        cap.open(pathVideo);
        int video_length = (int) cap.get(Videoio.CAP_PROP_FRAME_COUNT);
        int frames_per_second = (int) cap.get(Videoio.CAP_PROP_FPS);
        int frame_number = (int) cap.get(Videoio.CAP_PROP_POS_FRAMES);
        Mat frame = new Mat();
        if (cap.isOpened()) {
            System.out.println("Video is opened");
            System.out.println("Number of Frames: " + video_length);
            System.out.println(frames_per_second + " Frames per Second");
            System.out.println("Converting Video...");
            cap.read(frame);
            while (frame_number <= video_length) {
                Imgcodecs.imwrite(pathOutFram + "\\" + frame_number + ".jpg", frame);
                frame_number++;
            }
            cap.release();
            System.out.println(video_length + " Frames extracted");
        } else {
            System.out.println("Fail");
        }
    }
    
    public static void main(String[] args) {
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        extraAllFramVideo("E:\\Đồ Án _\\videoplayback.mp4","E:\\Đồ Án _\\Output");
    }
    
}
