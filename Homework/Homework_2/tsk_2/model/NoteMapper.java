package model;

public class NoteMapper {
    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note(lines[0], lines[1], lines[2], lines[3]);

    }
}
