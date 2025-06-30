// 1) solve the pattern:Hollow Rectangle

// *****
// *   *
// *   *
// *****

// public class pattern {
// public static void main(String[] args) {

//  int n=4,m=5;


//  for(int i=1;i<=n;i++){
//   for(int j=1;j<=m;j++){

//     if(i==1||j==1||i==n||j==m){
//       System.out.print("*");
//     }else{
//       System.out.print(" ");
//     }
//   }
//   System.out.println();
//  }   

// }
// }

// 2) Print the Half pyramid pattern!



// public class pattern {
// public static void main(String[] args) {

//  int n=4;


//  for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//    System.out.print("*");
//   }
//   System.out.println();
//  }   

// }
// }

// 3) Print the inverted Half pyramid pattern!

// public class pattern {
// public static void main(String[] args) {

//  int n=4;


//  for(int i=n;i>=1;i--){
//   for(int j=1;j<=i;j++){
//    System.out.print("*");
//   }
//   System.out.println();
//  }   

// }
// }

// 3) Print the Rotated pyramid pattern!

// public class pattern {
// public static void main(String[] args) {

//  int n=4;

//  for(int i=1;i<=n;i++){     below is the loop for space
//   for(int j=1;j<=n-i;j++){
//    System.out.print(" ");
//   }                         below is loop for stars
//   for(int j=1;j<=i;j++){
//   System.out.print("*");
//   }
//   System.out.println();
//  }   
// }
// }

// 4) Print the  pyramid pattern of numbers!


public class pattern {
public static void main(String[] args) {

 int n=5;

 for(int i=1;i<=n;i++){     
  for(int j=1;j<=i;j++){
   System.out.print(j+" ");
  }                      
  System.out.println();
 }   
}
}