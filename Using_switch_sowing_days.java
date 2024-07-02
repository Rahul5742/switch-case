import java.util.Scanner;
public class Using_switch_sowing_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 = sunday");
        System.out.println("2 = mondaay");
        System.out.println("3 = tuesday");
        System.out.println("4 = wednesday");
        System.out.println("5 = thrusday");
        System.out.println("6 = friday");
        System.out.println("7 = saturday");
        System.out.print("Enter your num=");
                byte day=sc.nextByte();
                switch(day){
                    case 1:
                        System.out.println("sunday:");
                        break;
                    case 2:
                        System.out.println("monday:");
                        break;
                    case 3:
                        System.out.println("tuesday:");
                        break;
                    case 4:
                        System.out.println("wednesday:");
                        break;
                    case 5:
                        System.out.println("thrusday:");
                        break;
                    case 6:
                        System.out.println("friday:");
                        break;
                    case 7:
                        System.out.println("saturday");
                        break;
                    default:
                        System.out.println("invalid number;");
                        break
                }
    }
}
