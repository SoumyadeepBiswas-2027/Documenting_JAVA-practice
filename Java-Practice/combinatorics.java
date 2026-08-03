import java.util.*;

public class combinatorics {

  public static int fact(int f) {
      int factorial=1;
      for(int i=1; i<=f; i++){
        // factorial = factorial*i;
        factorial *= i;
      } 
      return factorial;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    System.out.println("Enter value of r:");
    int r = sc.nextInt();

    // int nfact =1;
    // for(int i = 1 ; i<=n; i++){
    //   nfact *= i;
    // }

    // int rfact =1;
    // for(int i = 1 ; i<=r; i++){
    //   rfact *= i;
    // }

    // int nMrfact =1;
    // for(int i = 1 ; i<=n-r; i++){
    //   nMrfact *= i;
    // }

    // int nCr = nfact/(rfact*nMrfact);
    
    int nCr = fact(n)/(fact(r)*fact(n-r));
    int nPr = fact(n)/fact(n-r);
    System.out.println("The Combination is:" +nCr);
    System.out.println("The Permutation is:" +nPr);
  }
}
