
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int num=1;
        while(count<n){
            System.out.println(num);
            num+=2;
            count++;
        }
    }
    
}
