package Player;

import Player.Enum.MultimediaType;
import Player.Interfaces.Brightness;
import Player.Interfaces.Player;

import java.util.StringJoiner;

public class Video extends Media implements Player, Brightness {
    public int volume;
    public int brightness;

    public Video(String title, MultimediaType type, int length, int volume, int brightness) {
        super(String.valueOf(type), title, length);
        this.volume = volume;
        this.brightness = brightness;
    }
    public Video(String title, String type, int length) {
        super(type, title, length);
        this.volume = 100;
        this.brightness = 100;
    }

    // handle brightness
    @Override
    public int brightnessUp() {
        if (0 <= brightness && brightness <= 90) {
            brightness += 10;
        }
        return brightness;
    }

    @Override
    public int brightnessDown() {
        if (10 <= brightness && brightness <= 100) {
            brightness -= 10;
        }
        return brightness;
    }

    // handle volume
    @Override
    public int volumeUp() {
        if (0 <= volume && volume <= 90) {
            volume += 10;
        }
        return volume;
    }

    @Override
    public int volumeDown() {
        if (10 <= volume && volume <= 100) {
            volume -= 10;
        }
        return volume;
    }

    // handle play


    @Override
    public String play() {
        // short volume and brightness length to print
        int printVolume = volume / 10;
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String volumeStr = "!".repeat(Math.max(0, printVolume));
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Video.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .add("brightness=" + brightnessStr)
                .toString();
    }

    @Override
    public String toString() {
        // short volume and brightness length to print
        int printVolume = volume / 10;
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String volumeStr = "!".repeat(Math.max(0, printVolume));
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Video.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .add("brightness=" + brightnessStr)
                .toString();
    }
}
