package Player;

import Player.Enum.MultimediaType;

public abstract class Media {
    // public Object length;
    MultimediaType type;
    String title;
    int length;

    public Media(String type, String title) {
        this.title = title;
        if(type.equalsIgnoreCase("image")) {
            this.type = MultimediaType.IMAGE;
        } else {
            System.err.println("Media should be Image");
        }
    }

    public Media(String type, String title, int length) {
        this.title = title;
        this.length = length;
        if (type.equalsIgnoreCase( "audio")) {
            this.type = MultimediaType.AUDIO;
        } else if (type.equalsIgnoreCase( "video")) {
            this.type = MultimediaType.VIDEO;
        } else {
            System.err.println("Media should be audio o video");
        }

    }

    public int getLength() {
        return length;
    }

}
