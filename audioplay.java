import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("C:\\Users\\ragib\\Downloads\\Owl City - Fireflies (Official Music Video).wav");

        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);

        String response="";

        while(true)
        {
            System.out.println("Enter P to play OR S to stop OR R reset OR Q quit");


            response = scanner.next();
            response = response.toUpperCase();

            switch (response)
            {
                case "P":
                    clip.start();
                    break;

                case "R":
                    clip.setMicrosecondPosition(0);
                    break;

                case "S":
                    clip.stop();
                    break;

                case "Q":
                    clip.stop();
                    clip.close();
                    System.out.println("Closed");
                    return;
                default:System.out.println("Not a valid key");

            }


        }



    }
}
