
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,num=1;
        n=n%2==0?n-1:n;
        while(count<n){
            System.out.println(num);
            num+=2;
            count++;
        }
    }
}
