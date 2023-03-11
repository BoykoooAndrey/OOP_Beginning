package controller;

import java.util.ArrayList;
import java.util.List;

import model.Note;
import model.Repository;

public class Controller {
    private final Repository repository;
    
    public Controller(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        repository.CreateNote(note);
    }

    public List<Note> readAllNotes() {
        return repository.getAllNotes();
    }

    public void updateNote(String ID, Note newNote) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(ID, notes);
        note.setHeading(newNote.getHeading());
        note.setText(newNote.getText());
        note.setCreateDate();
        repository.saveAllNotes(notes);

    }
    
    public Note noteSearch (String noteId, List<Note> notes) throws Exception{
        for (Note note : notes) {
            if (note.getId() == Integer.parseInt(noteId) ) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public void deleteUser(String iD) {
        List <Note> notes = repository.getAllNotes();
        List <Note> resNotes = new ArrayList<>();
        for (Note note : notes) {
            if (!(note.getId() == Integer.parseInt(iD))) {
                resNotes.add(note);
            }
        }
        repository.saveAllNotes(resNotes);
    }

}
