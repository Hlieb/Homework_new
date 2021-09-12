package Lesson_6;

import java.util.Scanner;

public class Light_vehicle extends Land_transport{
    String TypeOfBody;
    int NumberOfSeats;
    private int travel;
    private double a;
    private int time;


    @Override
    void Vyvod() {
        super.Vyvod();
        System.out.println("Type of body: " + TypeOfBody);
        System.out.println("Number of seats: " + NumberOfSeats);
    }
    private void rashod(){
         a =travel/FuelConsumption;
    }
    void Dvizhenije(){
        System.out.println("Enter travel time: ");
        Scanner scanner = new Scanner(System.in);
        time=scanner.nextInt();
        travel=time*maksSpeed;
        rashod();
        System.out.println("During the time "+time+" "+"h "+" "+ "car "+" "+ carModel+" " + "moving with the maximum speed " +" "+maksSpeed+"km/h "+" "+
                "will travel "+" "+travel + "km "+""+"and consume "+" "+ a +" " + " liters of fuel" );
    }

    @Override
    void Power() {
        super.Power();
    }
}
