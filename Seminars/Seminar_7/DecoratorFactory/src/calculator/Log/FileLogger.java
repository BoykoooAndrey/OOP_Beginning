package calculator.Log;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class FileLogger implements Loggable {

    String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void saveToJornal(String event) {
        try {
            FileWriter wr = new FileWriter(fileName, true);
            LocalDateTime eventTime = LocalDateTime.now();
            wr.write(String.format("%s --- %s\n", eventTime.toString(), event) );
            wr.flush();
            wr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}