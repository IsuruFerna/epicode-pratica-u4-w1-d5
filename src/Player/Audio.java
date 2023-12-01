package Player;

import java.util.StringJoiner;

public class Audio extends Media{
    public int length;
    public int volume;

    public Audio(String title, MultimediaType type, int length, int volume) {
        super(type, title);
        this.length = length;
        this.volume = volume;
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
                .add("length=" + length)
                .add("volume=" + volumeStr)
                .toString();
    }
}
