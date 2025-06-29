public class Task {
    int taskId;
    String taskName;
    String status;
    public Task(int taskId,String taskName,String status){
        this.taskId=taskId;
        this.taskName=taskName;
        this.status=status;
    }
    public void displayTask(){
        System.out.println("Task Id: "+taskId+"/nTask Name: "+taskName+"/nStatus: "+status);
    }
}
