package Player;

import java.util.StringJoiner;

public class Image extends Media{
    public int brightness;

    public Image(String title, MultimediaType type, int brightness) {
        super(type, title);
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        // short volume and brightness length to print
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Audio.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("brightness=" + brightnessStr)
                .toString();
    }
}
