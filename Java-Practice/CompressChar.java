import java.util.Scanner;

public class CompressChar {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string:");
    String str = sc.nextLine();

    String result = "";
    int count=0;

    for (int i = 0; i < str.length(); i++) {
      count++;
      if(i == str.length()-1 || str.charAt(i) != str.charAt(i+1)){
        result = result + str.charAt(i);
        if(count>1){
          result = result + count;
        }
        count=0;
      }
    }
    System.out.println("Result is:"+result);

  }
}