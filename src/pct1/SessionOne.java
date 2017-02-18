package pct1;

import java.util.Scanner;

public class SessionOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            String[] names = input.split(" ");
            if (names.length == 3) {
                // if all three names are given
                System.out.println(names[2] + " " + names[0] + " " + names[1]);
            } else if (names.length == 1) {
                // if only the first name is given
                System.out.println(names[0]);
            } else {
                // there are two names are given
                //check the second name is M or not
                if (isSurName(names[1])) {
                    System.out.println(names[1] + " " + names[0]);
                } else {
                    System.out.println(names[0] + " " + names[1]);
                }
            }
        }

        scanner.close();
    }

    private static boolean isSurName(String name) {
        int len = name.length();
        char lastChar = name.charAt(len - 1);
        return containsEnding(lastChar);
    }

    private static boolean containsEnding(char ch) {
        char[] endings = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char ending : endings) {
            if (ch == ending) return true;
        }
        return false;
    }
}
