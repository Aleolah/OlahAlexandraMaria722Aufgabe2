import Console.Console;
import Controller.Controller;
import Model.Medikament;
import Model.Patienten;
import Repository.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Medikament> medikamentRepository = new Repository();
        Repository<Patienten> patientenRepository = new Repository();

        Controller controller = new Controller(medikamentRepository, patientenRepository);
        Console console = new Console(controller);
        console.run();
    }
}