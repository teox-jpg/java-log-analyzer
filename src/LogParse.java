import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class LogParse {

    public List<LogEntry> parseFile(String filePath)throws IOException {

        List<LogEntry> log = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while((line = reader.readLine()) != null){

            String [] parts = line.split(" ");

            String message = "";
            for(int i = 3;i<parts.length;i++){

                message= message + parts[i] + " ";
            }
            LogEntry entry = new LogEntry(parts[0],parts[1],parts[2],message);
            log.add(entry);

        }



        return log;
    }
}
