package Controller;


import Model.Medikament;
import Model.Patienten;
import Repository.Repository;

import java.util.ArrayList;
import java.util.Optional;

/**
 * The `Controller` class is the central component of the application's logic.
 * It is responsible for handling and processing the user's input from the console,
 * coordinating with other parts of the system to perform actions such as adding,
 * removing, and updating entities, and displaying information.
 */
public class Controller {
    Repository<Medikament> medikamentRepository;
    Repository<Patienten> patientenRepository;

    public Controller(Repository<Medikament> medikamentRepository, Repository<Patienten> patientenRepository) {
        this.medikamentRepository = medikamentRepository;
        this.patientenRepository = patientenRepository;
    }

    /**
     * Adds a new item.
     */
    public void addMedikament(String name, int preis, String krankheit){
        Medikament med = new Medikament(name, preis, krankheit);
        medikamentRepository.addItem(med);

    }

    /**
     * Deletes a
     */
    public void deleteMedikament(String name){
        medikamentRepository.deleteItem(medikament -> medikament.getName().equals(name));
    }

    /**
     * Updates a
     */
    public void updateMedikament(String oldname, String name, int preis, String krankheit){
    medikamentRepository.updateItem(medikament -> medikament.getName().equals(oldname),new Medikament(name, preis, krankheit));
    }

    /**
     * Displays all
     */
    public void displayMedikaments(){
    medikamentRepository.getAllItems();
    }
    /**
     * Adds a new item.
     */
    public void addPatient(int id, String name, int age, String diagnose, ArrayList<Medikament> medikament){
        patientenRepository.addItem(new Patienten(id,name,age,diagnose,medikament));

    }

    /**
     * Deletes a
     */
    public void deletePatient(int id){
        patientenRepository.deleteItem(patienten -> patienten.getId() == id);
    }

    /**
     * Updates a
     */
    public void updatePatient(int oldId, int id, String name, int age, String diagnose, ArrayList<Medikament> medikament){
        patientenRepository.updateItem(patienten -> patienten.getId() == oldId,new Patienten(id,name,age,diagnose,medikament));
    }

    /**
     * Displays all
     */
    public void displayPatienten(){
        patientenRepository.getAllItems();
    }

    public Optional<Medikament> getMedByName(String name){
       return medikamentRepository.findItem(medikament -> medikament.getName().equals(name));
    }
    public void filterPatientsDiagnosis(String diagnose){
        patientenRepository.getAllItems().stream().filter(item -> item.getDiagnose().equals(diagnose)).distinct().forEach(System.out::println);
    }

}
