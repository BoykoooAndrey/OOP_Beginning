import controller.Controller;
import logger.FileLogger;
import logger.Loggable;
import model.RepositoryFiles;
import model.dataExtracRecFile;
import views.ViewNote;



public class Main {
    public static void main(String[] args) {
        dataExtracRecFile extractorRecorder = new dataExtracRecFile("notes.txt");
        RepositoryFiles repository = new RepositoryFiles(extractorRecorder);
        Loggable logger = new FileLogger("logger.txt");
        Controller controller = new Controller(repository, logger);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
