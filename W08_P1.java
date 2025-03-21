import java.util.Scanner;
public class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: " );
        String c = scanner.nextLine();
        String result = c.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}