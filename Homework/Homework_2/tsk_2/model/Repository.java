package model;

import java.util.List;

public interface Repository {
    Object saveAllNotes = null;
    Object extractorRecorder = null;
    List<Note> getAllNotes();
    void CreateNote(Note note);
    void saveAllNotes(List<Note> notes);
    
}