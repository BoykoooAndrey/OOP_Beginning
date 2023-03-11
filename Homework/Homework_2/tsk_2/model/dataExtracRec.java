package model;

import java.util.List;

public interface dataExtracRec {
    List<String> readAllLines();
    void saveAllNotes(List<Note> notes);
}
