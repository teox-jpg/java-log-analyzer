import java.util.List;

public class LogAnalyzer {

        public int countByLevel(List<LogEntry> logs,String level) {

            int counter = 0;


            for (LogEntry entry : logs) {

                if (entry.getLevel().equals(level)) {
                    counter++;
                }


            }

            return counter;

        }



}
