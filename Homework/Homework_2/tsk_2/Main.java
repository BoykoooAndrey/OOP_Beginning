import controller.Controller;
import model.RepositoryFiles;
import model.dataExtracRecFile;
import views.ViewNote;



public class Main {
    public static void main(String[] args) {
        dataExtracRecFile extractorRecorder = new dataExtracRecFile("notes.txt");
        RepositoryFiles repository = new RepositoryFiles(extractorRecorder);
        Controller controller = new Controller(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
