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
        if(func.equals("add")){
            System.out.println("Result is " + (arg1+arg2));
        }
        else if(func.equals("subtract")){
            System.out.println("Result is " + (arg1-arg2));
        }
        else if(func.equals("multiply")){
            System.out.println("Result is " + (arg1*arg2));
        }
        else if(func.equals("divide")){
            System.out.println("Result is " + (arg1/(float)arg2));
        }
        else{
            System.out.println("function not supported");
        }
    }
}
