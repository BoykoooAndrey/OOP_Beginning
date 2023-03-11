package model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFiles implements Repository {

    private NoteMapper mapper = new NoteMapper();
    private dataExtracRec extractorRecorder;

    public RepositoryFiles(dataExtracRec extractorRecorder) {
        this.extractorRecorder = extractorRecorder;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = extractorRecorder.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
            
        }
        return notes;
    }

    @Override
    public void CreateNote(Note note) {
        List<Note> notes = getAllNotes();
        note.setId(findlastIdInRep(notes));
        notes.add(note);
        extractorRecorder.saveAllNotes(notes);
        

    }

    private int findlastIdInRep(List<Note> notes){
        int max = 0;
        for (Note note : notes) {
            int id = note.getId();
            if (max < id){
                max = id;
            }
        }
        return max + 1;
    }

    @Override
    public void saveAllNotes(List<Note> notes) {
        extractorRecorder.saveAllNotes(notes);
    }


}
