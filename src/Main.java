import Player.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // manually crated a media list
        // Audio audio1 = new Audio("bob", MultimediaType.AUDIO, 3, 55);
        // Audio audio2 = new Audio("charlie", MultimediaType.AUDIO, 2, 33);
        // Video video1 = new Video("foo", MultimediaType.VIDEO, 3, 100, 100);
        // Image image1 = new Image("baa", MultimediaType.IMAGE, 100);
        // Video video2 = new Video("alice", MultimediaType.VIDEO, 5, 58, 66);

        // Media[] list =  {audio1, audio2, video1, image1, video2};

        Media[] list;
        list = new Media[5];

        Scanner item = new Scanner(System.in);
        String name;
        String type;

        mediaCollector:
        while (true) {
            System.out.println("Follow the instructions to insert multimedia files");
            System.out.println("Availabale types are image, audio, video");
            System.out.println("audio and vides required duration of audio or video");
            System.out.println("--------------------------------------------");
            System.out.println("Insert type:");
            type = item.nextLine();
            System.out.println("Name:");
            name = item.nextLine();

            // handle image input
            if(type.equalsIgnoreCase("image") && name != null) {
                Image image = new Image(name, type);

                for (int i = 0; i < list.length; i++) {
                    if (list[i] == null) {
                        list[i] = image;
                        if (list[4] != null) {
                            break mediaCollector;
                        }
                        break;
                    }
                }

            // handle audio input
            } else if(type.equalsIgnoreCase("audio") && name != null) {
                System.out.println("duration :");
                String duration = item.nextLine();
                Audio audio = new Audio(name, type, Integer.parseInt(duration));

                for (int i = 0; i < list.length; i++) {
                    if (list[i] == null) {
                        list[i] = audio;
                        if (list[4] != null) {
                            break mediaCollector;
                        }
                        break;
                    }
                }

            // handle video input
            } else if(type.equalsIgnoreCase("video") && name != null) {
                System.out.println("duration :");
                String duration = item.nextLine();
                Video video = new Video(name, type, Integer.parseInt(duration));

                for (int i = 0; i < list.length; i++) {
                    if (list[i] == null) {
                        list[i] = video;
                        if (list[4] != null) {
                            break mediaCollector;
                        }
                        break;
                    }
                }
            }
        }

        // print current media list
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println(list[i].toString());
            }
        }

        // let user select track
        Scanner input = new Scanner(System.in);
        System.out.println("quale oggetto eseguire (leggendo un intero da 1 a 5 oppure o per finire)?");
        int source = input.nextInt();

        // based on user select print length times selected track
        if (source > 0) {
            System.out.println("Hai selezionato " + source);
            System.out.println("source " + source);

            for (int i = 0; i < list.length; i++) {
                if(i == source - 1) {
                    System.out.println("print this " + list[i]);
                    for (int j = 0; j < list[i].getLength(); j++) {
                        System.out.println(list[i]);
                    }
                    break;
                }
            }
        } else {
            System.out.println("user did not selected any!");
        }


        // System.out.println(audio2.play());
        // System.out.println(image1.show());

        // System.out.println("-------------------------------------------");
        // System.out.println(audio2.play());

        input.close();

    }
}