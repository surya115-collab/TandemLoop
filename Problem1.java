
import java.util.Scanner;

public class Problem1 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        String str=sc.next();
        switch(str){
            case "+" -> {
                System.out.println(n1+n2);;
            }
            case "-" -> {
                System.out.println(n1-n2);;
            }
            case "*" -> {
                System.out.println(n1*n2);;
            }
            case "/" -> System.out.println(n1/n2);
            default -> System.out.println("Invalid operator");
        }

    }
}
