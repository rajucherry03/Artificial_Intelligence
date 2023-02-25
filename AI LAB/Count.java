import java.util.Scanner;

class Count {
    public static void main(String args[]) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, specialCharacters = 0, words = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A'
                    || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
                vowels++;
            } else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
                consonants++;
            } else if (str[i] >= '0' && str[i] <= '9') {
                digits++;
            } else if (str[i] == ' ') {
                spaces++;
                words++;
            } else {
                specialCharacters++;a
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("White spaces = " + spaces);
        System.out.println("Special characters = " + specialCharacters);
        System.out.println("Words =" + (words + 1));
    }
}