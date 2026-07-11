public class LogEntry {

    private String datum;
    private String time;
    private String level;
    private String message;


    public LogEntry(String datum,String time, String level,String message){
        this.datum=datum;
        this.time=time;
        this.level=level;
        this.message=message;
    }

    public String getLevel(){
        return level;
    }
}
