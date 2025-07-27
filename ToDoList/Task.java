package SaiKetSystems_Internship.ToDoList;

public class Task {
    String title;
    boolean isCompleted;
    public Task(String title)
    {
        this.title=title;
        this.isCompleted=false;
    }
    public void markAsCompleted()
    {
        this.isCompleted=true;
    }
    @Override
    public String toString()
    {
        if(isCompleted)
        {
            return "[✔]"+ title;
        }
        return "[ ]"+title;
    }
}