package Lesson_6;

import java.util.Scanner;

public class Civil extends Air_transport {
    int NumberOfPassengers;
    boolean BusinessClass;

    @Override
    void Vyvod() {
        super.Vyvod();
        System.out.println("Number of Passengers: " + NumberOfPassengers);
        System.out.println("Businees Class: " + BusinessClass);
    }
    void loading(){
        System.out.println("Enter the number of passengers: ");
        Scanner scanner=new Scanner(System.in);
        int passangers = scanner.nextInt();
        if(NumberOfPassengers>=passangers) {
            System.out.println("Everything is ok!");
        }
        else {
            System.out.println("You need the bigger plane!");
        }
    }

    @Override
    void Power() {
        super.Power();
    }
}
