package Player;

import java.util.StringJoiner;

public class Audio extends Media implements Player {
    public int volume;

    public Audio(String title, MultimediaType type, int length, int volume) {
        super(String.valueOf(type), title, length);
        this.volume = volume;
    }

    public Audio(String title, String type, int length) {
        super(type, title, length);
        this.volume = 100;
    }

    @Override
    public String toString() {
        // short volume length to print
        int printVolume = volume / 10;

        // compacted for loop with intellij suggestions
        String volumeStr = "!".repeat(Math.max(0, printVolume));

        return new StringJoiner(", ", Audio.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .toString();
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
        // short volume length to print
        int printVolume = volume / 10;

        // compacted for loop with intellij suggestions
        String volumeStr = "!".repeat(Math.max(0, printVolume));

        return new StringJoiner(", ", Audio.class.getSimpleName() + "[", "]")
                .add("title=" + title)
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .toString();
    }


}
