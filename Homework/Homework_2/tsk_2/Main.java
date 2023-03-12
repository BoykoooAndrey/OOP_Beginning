import controller.Control;
import controller.Controller;
import controller.ControllerLogger;
import logger.FileLogger;
import logger.Loggable;
import model.dataExtracRecFile;
import repository.RepositoryFiles;
import views.ViewNote;



public class Main {
    public static void main(String[] args) {
        dataExtracRecFile extractorRecorder = new dataExtracRecFile("notes.txt");
        RepositoryFiles repository = new RepositoryFiles(extractorRecorder);
        Loggable logger = new FileLogger("logger.txt");
        Control controller = new Controller(repository);
        Control controllerLogger = new ControllerLogger(controller, logger);
        ViewNote view = new ViewNote(controllerLogger);
        view.run();
    }
}
