package Lesson_6;

public abstract class Land_transport extends Transport {
    int NumberOfWheels;
    double FuelConsumption;

    @Override
    void Vyvod() {
        super.Vyvod();
        System.out.println("Number of wheels: " + NumberOfWheels);
        System.out.println("Fuel consumption: " + FuelConsumption);
    }

    @Override
    void Power() {
        super.Power();
    }
}
