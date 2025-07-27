package SaiKetSystems_Internship.ToDoList;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {
    static Scanner input=new Scanner(System.in);
    public static ArrayList<Task> tasks=new ArrayList<>();
    public static void addTask()
    {
        System.out.println("Enter task Title");
        String title=input.nextLine();
        Task task=new Task(title);
        tasks.add(task);
        System.out.println("Task "+title+" is added successfully");
    }
    public static void markTaskCompleted()
    {
        displayTasks();
       System.out.println("Enter task number to mark it as completed");
       int index=input.nextInt();
       if(index>=1 && index<=tasks.size())
       {
           tasks.get(index-1).markAsCompleted();
           System.out.println("Task "+index+" marked as completed");
//           displayTasks();
       }
       else {
           System.out.println("Please enter valid task number");
       }
    }
    public static void displayTasks()
    {
        if(tasks.isEmpty())
        {
            System.out.println("No tasks to display");
            return;
        }
        System.out.println("===To-Do-List===");
        for(int i=0;i<tasks.size();i++)
        {
            System.out.println((i+1)+"."+tasks.get(i));
        }
    }
}
