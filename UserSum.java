import java.util.Scanner;
public class UserSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = s.nextInt();
        System.out.println("Enter number 2:");
        int num2 = s.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        float div = num1/num2;
        System.out.println("summation:"+sum);
        System.out.println("Substraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Division:"+div);
    }
}
