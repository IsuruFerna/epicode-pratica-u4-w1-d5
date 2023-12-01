import Player.Audio;
import Player.MultimediaType;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("bob", MultimediaType.AUDIO, 3, 100);

        System.out.println(audio1.toString());
    }
}