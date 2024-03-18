package Project.Crime_Management;
import java.util.*;
import Project.Crime_Management.Dao.CrimeDao;

import Project.Crime_Management.Dao.CrimeStationDao;
import Project.Crime_Management.Dao.CriminalDao;

public class Main {
    	private static final Scanner scanner = new Scanner(System.in);
        private static final CriminalDao criminalDAO = new CriminalDao();
        private static final CrimeStationDao crimeStationDAO = new CrimeStationDao();

        public static void main(String[] args) {
            int choice;

            do {
                System.out.println("Crime Management System Menu:");
                System.out.println("1. Add Crime");
                System.out.println("2. Add Criminal");
                System.out.println("3. Add CrimeStation");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addCrime();
                        break;
                    case 2:
                        addCriminal();
                        break;
                    case 3:
                        addCrimeStation();
                        break;
                    case 4:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }

        private static void addCrime() {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Date and Place of the Crime:");
            String dateAndPlace = scanner.nextLine();
            System.out.println("Enter Description of the Crime:");
            String description = scanner.nextLine();
            System.out.println("Enter Victims:");
            String victims = scanner.nextLine();
            System.out.println("Enter Detail description of the Crime:");
            String crimeDetails = scanner.nextLine();
            System.out.println("Enter Main Suspects:");
            String mainSuspects = scanner.nextLine();

            // Create new Crime object
            Crime crime = new Crime();
            crime.setDateAndPlace(dateAndPlace);
            crime.setDescription(description);
            crime.setVictims(victims);
            crime.setCrimeDetails(crimeDetails);
            crime.setMainSuspects(mainSuspects);

            crimeStationDAO.addCrime(crime);
            System.out.println("Crime added successfully.");
        }

        private static void addCriminal() {
            scanner.nextLine(); 
            System.out.println("Enter Name of the Criminal:");
            String name = scanner.nextLine();
            System.out.println("Enter Age of the Criminal:");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter Gender of the Criminal:");
            String gender = scanner.nextLine();
            System.out.println("Enter Address of the Criminal:");
            String address = scanner.nextLine();
            System.out.println("Enter Identifying Mark in the face:");
            String identifyingMark = scanner.nextLine();
            System.out.println("Enter Area of the crime from where the criminal was first arrested:");
            String areaOfArrest = scanner.nextLine();
            System.out.println("Enter Attached Crime:");
            String attachedCrime = scanner.nextLine();

            Criminal criminal = new Criminal();
            criminal.setName(name);
            criminal.setAge(age);
            criminal.setGender(gender);
            criminal.setAddress(address);
            criminal.setIdentifyingMark(identifyingMark);
            criminal.setAreaOfArrest(areaOfArrest);
            criminal.setCrimeAttached(attachedCrime);

            criminalDAO.addCriminal(criminal);
            System.out.println("Criminal added successfully.");
        }

        private static void addCrimeStation() {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Name of the Crime Station:");
            String name = scanner.nextLine();
            System.out.println("Enter Location of the Crime Station:");
            String location = scanner.nextLine();

            CrimeStation station = new CrimeStation();
            station.setName(name);
            station.setLocation(location);

            crimeStationDAO.addCrimeStation(station);
            System.out.println("Crime Station added successfully.");
    }
}
