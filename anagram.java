import java.util.Scanner;

public class anagram {

    public void check() {

        // Anagram strings are those strings that have the same characters,
        // only the order of characters may be different

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string1");
        String string1 = scan.nextLine();
        System.out.println("Enter String2 ");
        String string2 = scan.nextLine();
        String temp = "";
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                char s1 = string1.charAt(i);

                for (int j = 0; j < string2.length(); j++) {
                    char s2 = string2.charAt(j);
                    if (s1 == s2) {

                        temp = temp + String.valueOf(s2);
                        break;
                    } else {

                        continue;
                    }
                }
            }
            if (temp.equals(string1)) {
                System.out.println(string1 + "  is a Anagram");

            } else {
                System.out.println(string1 + " is not a Anagram");
            }
        } else {
            System.out.println(string1 + " is not a Anagram");
        }

    }

    public static void main(String[] args) {
        anagram anagram = new anagram();
        anagram.check();
    }
}
