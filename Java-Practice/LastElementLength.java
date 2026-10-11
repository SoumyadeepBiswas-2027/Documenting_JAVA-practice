import java.util.Scanner;

public class LastElementLength {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string:");
    String str = sc.nextLine();

     String lastElement = "";
     
     for(int i=str.length()-1; i>=0; i--){
         if(str.charAt(i)==' '){
             break;
         }
        lastElement=str.charAt(i)+lastElement;
        //lastElement=str.charAt(i);
     }
     
        int count=0;
         for(int i=0; i<lastElement.length(); i++){
         count++;
         }
        System.out.println("Last element:"+count);
}
}



// ANOTHER SIMPLE LOGIC


// String str = sc.nextLine().trim(); // .trim() removes any trailing spaces
// int count = 0;

// for (int i = str.length() - 1; i >= 0; i--) {
//     if (str.charAt(i) == ' ') {
//         break; // Stop when you hit the space
//     }
//     count++; // Just count the letter instantly
// }

// System.out.println("Last element length: " + count);