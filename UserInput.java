

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer number:");
        int Int = input.nextInt();
        System.out.print("Enter floating number:");
        float f = input.nextFloat();
        Scanner p = new Scanner(System.in);
        System.out.print("Enter name :");
        String name = p.nextLine();
        System.out.print("Enter Nickname first letter:");
        char c = p.next().charAt(0);
        System.out.println("integer"+Int);
        System.out.println("Decimal value"+f);
        System.out.println("My name is:"+name);
        System.out.println("My nickname first letter is:"+c);
        System.out.println("you are successfully complete your code so congratulations prema");

    }
}
