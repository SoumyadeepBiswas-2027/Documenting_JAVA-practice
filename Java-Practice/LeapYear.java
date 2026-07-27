import java.util.*;
class LeapYear{
    static boolean checkYear(int n) {
        // code here
        if(n % 400 == 0 || (n % 4 == 0 && n % 100 !=0 )){
            return true;
        }else 
           return false;
         }

 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year:");
        int n = sc.nextInt();
        checkYear(n);
    }
}