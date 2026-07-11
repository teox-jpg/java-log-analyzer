
import java.io.IOException;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws IOException {
        System.out.println("Log Analyzer gestartet");


            LogParse parser = new LogParse();
            List<LogEntry> logs = parser.parseFile("src/logs.txt");

            LogAnalyzer analyzer = new LogAnalyzer();
            int errors = analyzer.countByLevel(logs,"ERROR");
            int information = analyzer.countByLevel(logs, "INFO");
            int warning = analyzer.countByLevel(logs,"WARNING");
            int trace = analyzer.countByLevel(logs, "TRACE");

            System.out.println("Anzahl der Logeinträge: " + logs.size());
            System.out.println("Anzahl ERROR: " + errors);
            System.out.println("Anzahl INFO: " + information);
            System.out.println("Anzahl WARNING " + warning);
            System.out.println("Anzahl TRACE " + trace);


    }
}
