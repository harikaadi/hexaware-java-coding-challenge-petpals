package main;
import java.sql.*;
import dao.*;
import entity.model.*;
import exception.*;
import dao.CashDonation;
//import entity.model.*;
import util.DBConnUtil;
import util.DBPropertyUtil;
import java.util.Scanner;

public class MainModule {
    private static final String DB_URL = "jdbc:mysql://localhost:3308/petpals";
    private static final String DB_USER = "root";
   private static final String DB_PASSWORD = "Harika@0908";
   
    private Scanner scanner;
    PetShelter ps=new PetShelter();
    AdoptionEvent ae=new AdoptionEvent();
    CashDonation cd=new CashDonation();
    public MainModule() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("===== Pet Adoption Platform Menu =====");
        System.out.println("1. Display Pet Listings");
        System.out.println("2. Record Cash Donation");
        System.out.println("3. Manage Adoption Events");
        System.out.println("4.Display Avaliable Pets");
        System.out.println("5.Add Pets");
        System.out.println("6.Remove Pets");
        System.out.println("7.Host Event");
        System.out.println("8.Register Participant");
        System.out.println("9. Exit");
        System.out.println("=======================================");
        System.out.print("Enter your choice: ");
    }
    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ps.displayPetListings();
                    break;
                case 2:
                    cd.recordDonation();
                    break;
                case 3:
                    ae.manageAdoptionEvents();
                    break;
                case 4:
                	
                	ps.listAvailablePets();
                    
                    break;
                case 5:
                	
                	ps.addPet();
       
                	break;
               case 6:
                	
                	ps.removePet();
       
                	break;
               case 7:
               	
               ae.hostEvent();
      
               	break;
               case 8:
            	   IAdoptEventImpl refe=new IAdoptEventImpl();
            	   Scanner sc= new Scanner(System.in);
           		System.out.println("Participant ID");
           		int participantID = sc.nextInt();
           		System.out.println("Participant  Name");
           	    String participantName=sc.next();
           		System.out.println("Participant Type");
           	    String participantType=sc.next();
           		System.out.println("Event ID");
           		int EventID = sc.nextInt();
           		System.out.println("pet ID");
           		int petID = sc.nextInt();
           		Participants participant=new Participants(participantID,participantName,participantType,EventID,petID);
           		//new Participants(22,"tt","ADOPTER",1,1);
           		refe.registerParticipant(participant);
                  // ae.registerParticipant();
          
                   	break;
                case 9:
                	System.out.println("Exiting...");
       
                	break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }

    // Other methods remain unchanged...

    public static void main(String[] args) {
    	
        MainModule mainModule = new MainModule();
        mainModule.run();
        
    }
}
