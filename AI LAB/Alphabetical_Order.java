import java.util.Scanner;
import java.io.*;

class Alphabetical_Order {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        int n = sc.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for (int i = 0; i < n; i++) {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.print(names[n - 1]);
    }
}