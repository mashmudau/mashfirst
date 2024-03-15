import java.util.Scanner;

public class subs{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENTER YOUR FIRST NUMBER");
        int a = scan.nextInt();
        System.out.println("ENTER YOUR SECOND NUMBER");
        int b = scan.nextInt();
        int c = a-b;
        System.out.println("your answer is:--"+c);
    }
}