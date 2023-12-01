import Player.Audio;
import Player.Image;
import Player.MultimediaType;
import Player.Video;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("bob", MultimediaType.AUDIO, 3, 100);
        Video video1 = new Video("foo", MultimediaType.VIDEO, 3, 100, 100);
        Image image1 = new Image("baa", MultimediaType.IMAGE, 100);

        System.out.println(audio1.toString());
        System.out.println(video1.toString());
        System.out.println(image1.toString());
    }
}