//Theo B 
// Digital Odometer


import java.util.*; // library import


public class Main { // starting main class

   
    public static void main(String[] args) {
        Odometer k1 = new Odometer(); // creating a new odometer
        Scanner n = new Scanner(System.in);//creating a new scanner that reads the user's input 
        System.out.println("Please insert the vehicle's mileage : ");//printing a message 
        float total = n.nextFloat(); // reads the total mileage 
        k1.SetTotal(total);//sets the total mileage 
        System.out.println("Please insert the fuel consumption of the vehicle : ");//printing message 
        float katanalosi = n.nextFloat();//reads the fuel consumption 
        k1.SetKatanalosi(katanalosi);//sets the vehicle's fuel consumption 
        System.out.println("Please insert the distance you covered: ");//printing a message 
        float taksidi = n.nextFloat();//reads the trip distance 
        k1.SetTrip(taksidi);//sets trip odometer
        System.out.println("Do you want to add another trip?? If so , press 1 else press 2 . if you want to zero the trip odometer press 3.");
        int apantisi = n.nextInt();//reads an answer
        while (apantisi == 1 || apantisi == 3) { // if the user wants to do  further actions
            System.out.println("Please insert the distance you travelled : ");
            if (apantisi == 1) { //if the user wants to add another trip
                taksidi = n.nextFloat();
                k1.SetTrip(taksidi);//setting the new trip distance
            }
            System.out.println("Do you want to add another trip?? If so , press 1 else press 2 . if you want to zero the trip odometer press 3.");
            apantisi = n.nextInt();
            if (apantisi == 3) {// Zeroing the trip odometer
                k1.Zero(); // 
                System.out.println("Do you want to add another trip?? If so , press 1 else press 2 . if you want to zero the trip odometer press 3.");
                apantisi = n.nextInt(); //reads next action

            }
        }
        //when the while loop is done ,the user doesnt want to do any further actions  then it prints the cost of the trips, the new trip odometer value  and the vehicle's new total mileage 
        System.out.println("Cost of total trip distance :  " + k1.Kostos() + " liters of fuel , Total Vehicle Mileage : " + k1.GetKM() + " Trip Odometer: "+k1.GetTrip()+" KM ");
    }

}
