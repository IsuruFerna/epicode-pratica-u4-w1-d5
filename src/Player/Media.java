package Player;

import java.util.StringJoiner;

public abstract class Media {
    // public Object length;
    MultimediaType type;
    String title;
    int length;

    public Media(MultimediaType type, String title) {
        this.type = type;
        this.title = title;
    }

    public Media(MultimediaType type, String title, int length) {
        this.type = type;
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
