import java.util.*;

class Symbol{
  public static void main(String[] args){
    System.out.println("Enter String:");
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    int star=0;
    int hash=0;
    for (int i=0;i < str.length();i++){
      if(str.charAt(i) == '*'){
        star++;
      }else if(str.charAt(i) == '#'){
        hash++;
      }else{
        System.out.println("Invalid Input,only * and # allowed");
      } return; 
    }
    if(star > hash){
        System.out.println("Posetive input");
      }else if(hash > star){
        System.out.println("Negetive input");
      }if(star == hash){
        System.out.println(0);
      }
  }
}