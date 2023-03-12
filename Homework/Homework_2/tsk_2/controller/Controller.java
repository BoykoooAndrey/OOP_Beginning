package controller;

import java.util.ArrayList;
import java.util.List;

import logger.Loggable;
import model.Note;
import model.Repository;

public class Controller {
    private final Repository repository;
    private Loggable logger;
    
    public Controller(Repository repository, Loggable logger) {
        this.repository = repository;
        this.logger = logger;
    }

    public void saveNote(Note note) {
        logger.saveEvent("Added note. ID: " + note.getId());
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
        logger.saveEvent("Note ID:" + note.getId() + " has been update");
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

    public void deleteNote(String iD) {
        List <Note> notes = repository.getAllNotes();
        List <Note> resNotes = new ArrayList<>();
        for (Note note : notes) {
            if (!(note.getId() == Integer.parseInt(iD))) {
                resNotes.add(note);
            }
        }
        logger.saveEvent("Note ID:" + iD + " has been deleted");
        repository.saveAllNotes(resNotes);
    }

}
