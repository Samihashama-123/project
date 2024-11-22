import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = n.nextInt();
        int i, sum=0;
        int multiplication=1, sub=0;
        float div=0;
        for(i=1; i<=num; i++){
            sum= sum+i;
             multiplication = sum*i;
             div = sum/i;
             sub = sum - i;
        }
        System.out.println("sum="+sum);
        System.out.println("mul:"+multiplication);
        System.out.println("Division:"+div);
        System.out.println("sub:"+sub);
    }
}
