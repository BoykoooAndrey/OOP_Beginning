package controller;

import java.util.List;
import model.Note;

public interface Control {
    public void saveNote(Note note);
    public List<Note> readAllNotes();
    public void updateNote(String ID, Note newNote) throws Exception;
    public Note noteSearch (String noteId, List<Note> notes) throws Exception;
    public void deleteNote(String iD);
}
