public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Logger Object Created");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void Log(String str){
        System.out.println("Log: "+str);

    }
}
