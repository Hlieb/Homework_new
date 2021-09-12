package Lesson_6;

import java.util.Scanner;

public class Freight_transport extends Land_transport{
    double CarryingCapacity;


    @Override
    void Vyvod() {
        super.Vyvod();
        System.out.println("Carrying capacity: " + CarryingCapacity);
    }
    void loading(){
        System.out.println("Enter the weight of the cargo: ");
        Scanner scanner=new Scanner(System.in);
        int CargoWeight = scanner.nextInt();
        if(CarryingCapacity>=CargoWeight) {
            System.out.println("Cargo was loaded");
        }
        else {
            System.out.println("You need the bigger truck!");
        }
    }

    @Override
    void Power() {
        super.Power();
    }
}
