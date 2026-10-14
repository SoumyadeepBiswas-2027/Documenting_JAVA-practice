import java.util.Scanner;
public class HCFnLCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st value:");
    int a = sc.nextInt();
    System.out.println("enter 2nd value:");
    int b = sc.nextInt();

    int lcm=1;
    int hcf=1;

    //for hcf
    for(int i=1;i<=a;i++){
      if(a%i==0 && b%i==0){
        hcf=i;
      }
    }

    //for lcm
    for(int i=1;i<=a*b;i++){
      if(i%a==0 && i%b==0){
        lcm=i;
        break;
      }
    }
    System.out.println("hcf is:"+hcf);
     System.out.println("lcm is:"+lcm);
  }
}
