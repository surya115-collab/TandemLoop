
import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    private static void countOfNumber(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=9;i++){
            map.put(i,0);
            for(int j=0;j<a.length;j++){
                if(a[j]%i==0)
                    map.put(i,map.get(i)+1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //int[] ar=new int[n];
        int[] a={1,2,8,9,12,46,76,82,15,20,30};
        countOfNumber(a);
        // for(int i=0;i<n;i++){
        //     ar[i]=sc.nextInt();
        // }
        // countOfNumber(ar);

    }
}
