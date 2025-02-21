import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine();

        while (testCase-- > 0) {

            String cryingSound = sc.nextLine();
            List<String> words = new ArrayList<>(Arrays.asList(cryingSound.split(" ")));

            Set<String> animalSounds = new HashSet<>();

            while (sc.hasNextLine()) {
                String sound = sc.nextLine();

                if (sound.equals("what does the fox say?")) {
                    break;
                }

                String[] goes = sound.split(" goes ");
                if (goes.length == 2) {
                    animalSounds.add(goes[1]);
                }
            }

            for (String word : words) {
                if (!animalSounds.contains(word)) {
                    System.out.print(word + " ");
                }
            }
            System.out.println();
        }
    }
}
