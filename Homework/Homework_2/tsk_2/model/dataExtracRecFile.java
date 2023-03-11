package model;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dataExtracRecFile implements dataExtracRec {
    private String fileName;

    public dataExtracRecFile(String fileName) {
        this.fileName = fileName;
        // try (FileWriter writer = new FileWriter(fileName, true)) {
        // writer.flush();
        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());
        // }
    }

    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
                fr.close();
            }
        } catch (Exception e) {

        }
        return lines;
    }

    @Override
    public void saveAllNotes(List<Note> notes) {
        List<String> lines = fromArrayNotesToArrayStrings(notes);
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private List<String> fromArrayNotesToArrayStrings(List<Note> notes){
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(item.toString());
        }
        return lines;
    }

}