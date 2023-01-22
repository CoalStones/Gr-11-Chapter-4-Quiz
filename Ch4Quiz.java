package ch4.quiz;
import java.util.Scanner;

public class Ch4Quiz {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,p,r,t;
        
        System.out.println("Enter an amount");
           a=input.nextDouble();
        System.out.println("Enter the principal");
            p=input.nextDouble();
        System.out.println("Enter an interest rate (in decimal)");
            r=input.nextDouble();
        
        t=((a/p-1)/r);
        System.out.format("The time period is %.1f",t);
    }
    
}
