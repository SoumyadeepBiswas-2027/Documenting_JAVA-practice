//import java.util.Arrays;
import java.util.Scanner;

class maxUsingMethod {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Therefore,Max number is:");
        System.out.println(Math.max(Math.max(num1,num2),Math.max(num3,num4)));    

    } 
}