import java.util.Scanner;

public class ParkingLot006{
    static final int TOTAL_LOT = 10;
    static int availableSlot =  TOTAL_LOT;
 
    public static void getParkingLotOccupancy(String input){
        switch(input){
            case "Park":
                 if(availableSlot > 0){
                     availableSlot--;
                     System.out.println("Car is parked successfully");
                 }
                 else{
                     System.out.println("Parking lot is full");  
                 }
                 break;
            case "Exit":
                 if((10-availableSlot) > 0){
                     availableSlot++;
                     System.out.println("Car is exited successfully");
                 }
                 else{
                     System.out.println("Parking lot is already empty");
                 }
                 break;
            case "Show Occupany":
                 System.out.println("Available parking slot : " + availableSlot);
                 System.out.println("Parked slot : " + (TOTAL_LOT - availableSlot));
                 break;
            default:
                 System.out.println("Enter valid Menu");
                 break;
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Welcome to Parking Lot Area ---");
        Scanner sc = new Scanner(System.in);
        while (true) {
            if(availableSlot == 0){
               System.out.println("Parking lot is full, System closing");
               break;
            }
            System.out.print("Enter the parking option (Park, Exit, Show Occupany, and stop to exits ) : ");
            String input = sc.nextLine();
            if (input.equals("exits")) {
                System.out.println("--- Thanks for Visiting to Parking Area ---");
                break;
            }
            
            getParkingLotOccupancy(input);            
        }
        sc.close();
    }
}