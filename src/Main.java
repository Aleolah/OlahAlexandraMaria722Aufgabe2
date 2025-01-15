import Console.Console;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Console console = new Console(controller);
        console.run();
    }
}