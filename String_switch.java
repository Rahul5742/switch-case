import java.util.Scanner;
public class String_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.next();
        switch(name){
            case "Rahul":
                System.out.println("hello ,Rahul thnks a lot");
                break;
            case "Pintu":
                System.out.println("hello Pintu thanks a lot");
                break;
            default:
                System.out.println("invalid name");
                break;
        }

    }
}
