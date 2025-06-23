//This Java program reads input lines from the user until the end of the input (EOF). For each line it reads, it prints the line number followed by the content of that line.

import java.util.*;

public class EnumerateLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; ; i++) {
            try {
                String line = sc.nextLine();
                System.out.println(i + " " + line);
            } catch (NoSuchElementException e) {
                break; // EOF reached
            }
        }

        sc.close();
    }
}

