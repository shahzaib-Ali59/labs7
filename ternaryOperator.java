import java.util.Scanner;
public class ternaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("welcome to number checker");
        System.out.println("plz enter your number ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        if (num1==num2) {
            System.out.println( num1+" absolute value is "+num2);
        }else{
            System.out.println(num1 + " is not absolute value of  " + num2);
        }
        //System.out.println(num + " here is the minimum num ");
    }   

}