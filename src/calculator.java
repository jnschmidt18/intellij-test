import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter argument one: ");
        int arg1 = Scan.nextInt();
        System.out.println("Enter argument two: ");
        int arg2 = Scan.nextInt();
        System.out.println("Enter function: ");
        String func = Scan.next();
        runCalc(arg1, arg2, func);
    }

    static void runCalc(int arg1, int arg2, String func){
        switch (func) {
            case "add":
                System.out.println("Result is " + (arg1 + arg2));
                break;
            case "subtract":
                System.out.println("Result is " + (arg1 - arg2));
                break;
            case "multiply":
                System.out.println("Result is " + (arg1 * arg2));
                break;
            case "divide":
                System.out.print("Result is " + (arg1 / (float) arg2));
                break;
            default:
                System.out.print("function not supported");
                break;
        }
    }
}
