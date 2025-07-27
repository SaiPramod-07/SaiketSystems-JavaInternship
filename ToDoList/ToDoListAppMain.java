package SaiKetSystems_Internship.ToDoList;
import java.util.Scanner;
public class ToDoListAppMain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        boolean isValid=true;
        while (isValid)
        {
            System.out.println("===To-Do-List Application===");
            System.out.println("1.Add Task");
            System.out.println("2.Mark Task as Completed");
            System.out.println("3.Display Tasks");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            int choice=obj.nextInt();
            obj.nextLine();
            switch (choice)
            {
                case 1:
                {
                    ToDoListApp.addTask();
                    break;
                }
                case 2:
                {
                    ToDoListApp.markTaskCompleted();
                    break;
                }
                case 3:
                {
                    ToDoListApp.displayTasks();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting......ThankYou!");
                    isValid=false;
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice........Please Try Again!");
                }
            }
            System.out.println();
        }
    }
}
