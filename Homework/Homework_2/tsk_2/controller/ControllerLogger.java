package controller;

import java.util.List;

import logger.Loggable;
import model.Note;

public class ControllerLogger implements Control {
    private Control controller;
    private Loggable logger;

    public ControllerLogger(Control controller, Loggable logger) {
        this.controller = controller;
        this.logger = logger;
    }

    @Override
    public void saveNote(Note note) {
        controller.saveNote(note);
        logger.saveEvent("Note ID:" + note.getId() + " has been save");
    }

    @Override
    public List<Note> readAllNotes() {
        return controller.readAllNotes();
    }

    @Override
    public void updateNote(String ID, Note newNote) throws Exception {
        logger.saveEvent("Note ID:" + ID + " has been update");
        controller.updateNote(ID,newNote);

    }

    @Override
    public Note noteSearch(String noteId, List<Note> notes) throws Exception {
        return controller.noteSearch(noteId, notes);
    }

    @Override
    public void deleteNote(String iD) {
        controller.deleteNote(iD);
        logger.saveEvent("Note ID:" + iD + " has been deleted");   
    }
    
}
