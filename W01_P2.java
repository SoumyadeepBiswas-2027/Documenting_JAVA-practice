import java.util.Scanner;

public class W01_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double volume = 3.14*r*r*h;    
        //System.out.println("Volume = " + volume);
        System.out.printf("Volume is: %.2f", volume);
        sc.close();
      }}