import Player.*;

import java.util.Arrays;
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
        System.out.println("insert ");
        mediaCollector:
        while (true) {
            System.out.println("Follow the instructions to insert multimedia");
            System.out.println("Availabale types are image, audio, video");
            System.out.println("audio and vides required duration of audio or video");
            type = item.nextLine();
            name = item.nextLine();

            // handle image input
            if(type.equalsIgnoreCase("image") && type != null) {
                Image image = new Image(name, type);

                if (list != null) {
                    for (int i = 0; i < list.length; i++) {
                        if (list[i] == null) {
                            list[i] = image;
                            if (list.length == 5 && list[4] != null) {
                                break mediaCollector;
                            }
                            break;
                        }
                    }
                } else {
                    list[0] = image;
                }
                // break;
            }
        }



        // print current media list
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println(list[i].toString());
            }
        }
        System.out.println(Arrays.toString(list));

        /*
        // let user select track
        Scanner input = new Scanner(System.in);
        System.out.println("quale oggetto eseguire (leggendo un intero da 1 a 5 oppure o per finire)?");
        int source = input.nextInt();

        // based on user select print length times selected track
        if (source > 0) {
            System.out.println("Hai selezionato " + source);
            source -= source;

            for (int i = 0; i < list.length; i++) {
                if(i == source) {
                    for (int j = 0; j < list[i + 1].getLength(); j++) {
                        System.out.println(list[i + 1]);
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


         */

    }
}