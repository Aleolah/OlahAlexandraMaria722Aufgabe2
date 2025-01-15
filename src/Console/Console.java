package Console;

import Controller.Controller;
import Model.Medikament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
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
        System.out.println("1.add Medikament");
        System.out.println("2.delete Medikament");
        System.out.println("3.update Medikament");
        System.out.println("4.view all Medikaments");
        System.out.println("5.add Patient");
        System.out.println("6.delete Patient");
        System.out.println("7.update Patient");
        System.out.println("8.view all Patients");
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
                    System.out.println("Geben sie ein Name:");
                    String name = sc.next();
                    System.out.println("Geben sie ein Preis:");
                    int preis = sc.nextInt();
                    System.out.println("Geben sie ein Krankheit:");
                    String krankheit = sc.next();
                    controller.addMedikament(name, preis,krankheit);
                    break;
                case 2:
                    System.out.println("Geben sie ein Name:");
                    controller.deleteMedikament(sc.next());
                    break;
                case 3:
                    System.out.println("Geben sie ein Name:");
                    String oldName = sc.next();
                    System.out.println("Geben sie ein Name:");
                    String name1 = sc.next();
                    System.out.println("Geben sie ein Preis:");
                    int preis1 = sc.nextInt();
                    System.out.println("Geben sie ein Krankheit:");
                    String krankheit1 = sc.next();
                    controller.updateMedikament(oldName,name1,preis1,krankheit1);
                    break;
                case 4:
                    controller.displayMedikaments();
                    break;
                case 5:
                    System.out.println("Geben sie ein id:");
                    int id2 = sc.nextInt();
                    System.out.println("Geben sie ein Namen:");
                    String name2 = sc.next();
                    System.out.println("Geben sie ein Alter:");
                    int alter = sc.nextInt();
                    System.out.println("Geben sie ein Diagnose:");
                    String diagnose2 = sc.next();

                    ArrayList<Medikament> medikaments = new ArrayList<>();
                    System.out.println("Geben sie eine Liste von Medikament namen");
                    while(true){
                        String medikament = sc.nextLine();
                        if (medikament.isEmpty()) {
                            break;
                        }
                        Optional<Medikament> optionalMed = controller.getMedByName(medikament);
                        optionalMed.ifPresent(medikaments::add);

                    }
                    controller.addPatient(id2,name2,alter,diagnose2,medikaments);

                    break;
                case 6:
                    System.out.println("Geben sie ein id:");
                    controller.deleteMedikament(sc.next());
                    break;
                case 7:
                    System.out.println("Geben sie ein old id:");
                    int oldId = sc.nextInt();
                    System.out.println("Geben sie ein id:");
                    int id3 = sc.nextInt();
                    System.out.println("Geben sie ein Namen:");
                    String name3 = sc.next();
                    System.out.println("Geben sie ein Alter:");
                    int age3 = sc.nextInt();
                    System.out.println("Geben sie ein Diagnose:");
                    String diagnose3 = sc.next();


                    ArrayList<Medikament> medikaments3 = new ArrayList<>();
                    while(true){
                        String medikament = sc.nextLine();
                        if (medikament.isEmpty()) {
                            break;
                        }
                        Optional<Medikament> optionalMed = controller.getMedByName(medikament);
                        optionalMed.ifPresent(medikaments3::add);

                    }
                    controller.updatePatient(oldId,id3,name3,age3,diagnose3,medikaments3);

                    break;
                case 8:
                    controller.displayMedikaments();
                    break;
                case 9:
                    System.out.println("Gib Diagnosis");
                    String diagnois9 = sc.next();
                    controller.filterPatientsDiagnosis(diagnois9);
                    break;
                case 10:

                    break;
                default:
                    System.out.println("Invalid option");
            }


        }
    }
}
