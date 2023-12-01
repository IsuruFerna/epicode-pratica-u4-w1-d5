package Player;

import java.util.StringJoiner;

public class Video extends Media{
    public int length;
    public int volume;
    public int brightness;

    public Video(String title, MultimediaType type, int length, int volume, int brightness) {
        super(type, title);
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        // short volume and brightness length to print
        int printVolume = volume / 10;
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String volumeStr = "!".repeat(Math.max(0, printVolume));
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Audio.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("length=" + length)
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .add("brightness=" + brightnessStr)
                .toString();
    }
}
