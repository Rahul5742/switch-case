import java.util.Scanner;
public class simple_calculater {
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
        switch(sum){
            case 1:
                System.out.println("sum = "+(a+b));
                break;
            case 2:
                System.out.println("sum = "+(a-b));
                break;
            case 3:Ð
                System.out.println("sum = "+(a*b));
                break;
            case 4:
                System.out.println("sum = "+(a/b));
                break;
        }
    }
}