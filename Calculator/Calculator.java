package SaiKetSystems_Internship.Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("===Basic Calculator Application===");
        while (true)
        {
            System.out.println("\nChoose an Option (1 to 5):");
            System.out.println("1.Addition(+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division(/)");
            System.out.println("5.Exit");
            int choice=input.nextInt();
            if(choice==5)
            {
                System.out.println("Exiting Calculator");
                break;
            }
            try {
                System.out.println("Enter first number");
                double num1=input.nextDouble();
                System.out.println("Enter second number");
                double num2=input.nextDouble();
                double result;
                switch (choice)
                {
                    case 1:
                    {
                        result=add(num1,num2);
                        System.out.println("Result:"+result);
                        break;
                    }
                    case 2:
                    {
                        result=subtract(num1,num2);
                        System.out.println("Result:"+result);
                        break;
                    }
                    case 3:
                    {
                        result=multiply(num1,num2);
                        System.out.println("Result:"+result);
                        break;
                    }
                    case 4:
                    {
                        result=division(num1,num2);
                        System.out.println("Result:"+result);
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid choice 🤷‍♂️! Please try again..");
                    }
                }
            }
            catch (ArithmeticException e)
            {
                System.out.println("Error:"+e.getMessage());
            }
        }
        input.close();
    }
    public static double add(double a,double b)
    {
       return a+b;
    }
    public static double subtract(double a,double b)
    {
        return a-b;
    }
    public static double multiply(double a,double b)
    {
        return a*b;
    }
    public static double division(double a,double b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("0 Can't divide any number");
        }
        return a/b;
    }
}
