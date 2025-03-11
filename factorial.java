//This is a java-code to get factorial of a number,by taking input from user//
import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num= value.nextInt();
    int fact =1;
    for(int i=1;i<=num;i++){
     fact=fact*i;
    }
    System.out.println("The factorial of" +" "+ +num+ " "+  "is" +" "+  +fact);
  }
}
