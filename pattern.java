//IT IS A FILE WHERE U WILL FIND MANY PATTERN QUESTIONS WHICH U CAN UNCOMMENT ONE AFTER THE OTHER  AND SEE THEM RUN !
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

// // 4) Print the  pyramid pattern of numbers!


// public class pattern {
// public static void main(String[] args) {

//  int n=5;

//  for(int i=1;i<=n;i++){     
//   for(int j=1;j<=i;j++){
//    System.out.print(j+" ");
//   }                      
//   System.out.println();
//  }   
// }
// }

// 4) Print the  inverted pyramid pattern of numbers!


// public class pattern {
// public static void main(String[] args) {

//  int n=5;

//  for(int i=1 ;i<=n ;i++){     
//   for(int j=1; j<=n-i+1 ;j++){

//    System.out.print(j+" ");
//   }                      
//   System.out.println();
//  }   
// }
// }

 // 4) Print the  pattern of floyd's Triangle!



// public class pattern {
// public static void main(String[] args) {

//  int n=5,Sum=1;
 

//  for(int i=1 ;i<=n ;i++){     
//   for(int j=1; j<=i ;j++){
//    System.out.print(Sum + " ");
//    Sum++;
//   }                      
//   System.out.println();
//  }   
// }
// }


// 4) Print the  pattern of half pyramid using 0 and 1 *hint-->if even then 1 else 0



// public class pattern {
// public static void main(String[] args) {

//  int n=5;
 

//  for(int i=1 ;i<=n ;i++){     
//   for(int j=1; j<=i ;j++){
//     int sum=0;
//     sum=i+j;
//     if(sum%2==0){
//       System.out.print("1"+" ");
//     }else{
//       System.out.print("0"+" ");
//     }
//   }                      
//   System.out.println();
//  }   
// }
// }