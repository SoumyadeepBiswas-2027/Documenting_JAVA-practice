import java.util.*;
public class W01_P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
// Add the necessary code in the below space

     // Printing the upper part of the pattern

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();}

        
        // Printing the lower part of the pattern
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();}
        }}



