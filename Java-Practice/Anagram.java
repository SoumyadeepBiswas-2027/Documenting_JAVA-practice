import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter string1:");
    String str = sc.nextLine();
    System.out.println("Enter string2:");
    String str2 = sc.nextLine();
    
    if(str.length() != str2.length()){
    System.out.println("Not an anagram");
    }
    String arr[] = str.split("");
    String arr2[] = str2.split("");
     
    Arrays.sort(arr);
    Arrays.sort(arr2);

    if(Arrays.equals(arr,arr2)){
    System.out.println("Its an anagram");
    } else {
    System.out.println("Not an anagram");
    }
}
}