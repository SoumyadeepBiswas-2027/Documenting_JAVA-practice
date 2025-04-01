import java.util.Scanner;

public class W01_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
            
        }
       sc.close();
    }}

    // 10*1=10
    // 10*2=20