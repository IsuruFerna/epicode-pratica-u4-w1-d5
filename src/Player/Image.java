package Player;

import java.util.StringJoiner;

public class Image extends Media implements Brightness{
    public int brightness;

    public Image(String title, MultimediaType type, int brightness) {
        super(String.valueOf(type), title);
        this.brightness = brightness;
    }

    public String show() {
        // short volume and brightness length to print
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Image.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("brightness=" + brightnessStr)
                .toString();
    }

    @Override
    public String toString() {
        // short volume and brightness length to print
        int printBrightness = brightness / 10;

        // compacted for loop with intellij suggestions
        String brightnessStr = "*".repeat(Math.max(0, printBrightness));

        return new StringJoiner(", ", Image.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("brightness=" + brightnessStr)
                .toString();
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
}
