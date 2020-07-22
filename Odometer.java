//Theo B 
//Digital Odometer

public class Odometer {// Odometer Class
private float total; //Total mileage
private float trip; //Trip mileage 
private float lpkm; // Vehicle's fuel consumption 


       public float Kostos() { // Returns the fuel consumption
        return (trip/100)*lpkm;
       }
       public void Zero(){ // Zeroing the odometer
           System.out.println("Trip Odometer set to 0!");
           trip=0;
       }
       
       //accessors
        public void SetTotal(float xiliometra){ // Function that saves the vehicle's total mileage . 
          total=xiliometra;
          }
       public void SetTrip(float nea_diadromi){ // sinartisi pou apothikevei posa xiliometra eginan stin diadromi . Ta xiliometra afta ta prosthetei kai sta sinolika xiliometra tou oximatos
          trip+=nea_diadromi; // adds the new trip's mileage to the trip odometer
          total+=nea_diadromi;//adds the new trip's mileage to the total mileage . 
          }
       public void SetKatanalosi(float katanalosi){ //sets the fuel consumption of the vehicle 
          lpkm=katanalosi;
          }
       public float GetKM() // returns the total mileage of the vehicle 
       {
           return total;
       };
       public float GetTrip() // returns the total trip mileage . 
               {
                   return trip;
               }


       
       
       


    
}
