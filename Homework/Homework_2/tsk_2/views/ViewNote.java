package views;

import java.util.Scanner;

import controller.Control;

import model.Note;

public class ViewNote {
    private Control controller;

    public ViewNote(Control controller) {
        this.controller = controller;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");

            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case LIST:
                        listNotes();
                        break;
                    case UPDATE:
                        listNotes();
                        updateNote();
                        break;
                    case DELETE:
                        listNotes();
                        deletNotes();
                        listNotes();
                        break;
                    case EXIT:
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deletNotes() {
        String ID = prompt("Введите ID: ");
        controller.deleteNote(ID);
    }

    private void createNote() throws Exception {
        String heading = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        controller.saveNote(new Note(heading, text));
    }

    private void updateNote() throws Exception {
        String ID = prompt("Введите ID: ");
        String heading = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        controller.updateNote(ID, new Note(heading, text));
    }

    private void listNotes() {
        for (Note note : controller.readAllNotes()) {
            System.out.println();
            System.out.println(note.toString());
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();

    }
}