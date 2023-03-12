package repository;

import java.util.List;

import model.Note;

public interface Repository {
    List<Note> getAllNotes();
    void CreateNote(Note note);
    void saveAllNotes(List<Note> notes);
    
}