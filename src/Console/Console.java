package Console;

import Controller.Controller;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class provides a console-based user interface to interact with the application's controller.
 * The user can perform various operations based on the provided menu options.
 */
public class Console {
    public Controller controller;

    /**
     * Constructor that initializes the `Console` with the provided `Controller` instance.
     *
     * @param controller The controller that handles the business logic for the application.
     */
    public Console(Controller controller) {
        this.controller = controller;
    }

    /**
     * Displays the available menu options for the user. The menu lists the available operations that can be performed
     * on the entities managed by the application.
     */
    public void meniu() {
        System.out.println("Meniu");
        System.out.println("1.add ");
        System.out.println("2.delete ");
        System.out.println("3.update ");
        System.out.println("4.view all ");
        System.out.println("5.add ");
        System.out.println("6.delete ");
        System.out.println("7.update ");
        System.out.println("8.view all ");
        System.out.println("9.");
        System.out.println("10.");
        System.out.println("11.");
        System.out.println("12.Exit");
    }

    /**
     * Runs the console application, displaying the menu and processing user input for the various operations.
     * The user can interact with the application to perform the available actions.
     */
    public void run() {
        Scanner sc = new Scanner(System.in);
        Boolean continueloop = true;
        while (continueloop) {
            meniu();
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Please enter ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Invalid option");
            }


        }
    }
}
