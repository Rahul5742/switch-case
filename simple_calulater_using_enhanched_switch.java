import java.util.Scanner;
public class simple_calulater_using_enhanched_switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your option:");
        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = *");
        System.out.println("4 = /");
        System.out.print("Enter your sum optio=");
        byte sum=sc.nextByte();
        System.out.print("Enter your num = ");
        float a=sc.nextFloat();
        System.out.print("Enter your num = ");
        float b=sc.nextFloat();
        switch (sum) {
            case 1 -> System.out.println("sum = " + (a + b));
            case 2 -> System.out.println("sum = " + (a - b));
            case 3 -> System.out.println("sum = " + (a * b));
            case 4 -> System.out.println("sum = " + (a / b));
            default -> System.out.println("invalid option:");
        }
    }
}
