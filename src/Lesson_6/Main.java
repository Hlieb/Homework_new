package Lesson_6;

public class Main {

    public static void main(String[] args) {
        Civil AN=new Civil();
        AN.BusinessClass=false;
        AN.NumberOfPassengers=20;
        AN.maksSpeed=700;
        AN.MinLength=250;
        AN.power=1000;
        AN.WingSpan=50;
        AN.Vyvod();
        AN.Power();
        AN.loading();
        Military MIG= new Military();
        MIG.maksSpeed=600;
        MIG.MinLength=200;
        MIG.power=1500;
        MIG.EjectionSystems=true;
        MIG.NumberOfMissiles=10;
        MIG.Vyvod();
        MIG.Power();
        MIG.ejection();
        MIG.shot();
        Light_vehicle BMW=new Light_vehicle();
        BMW.NumberOfSeats=4;
        BMW.weight=13000;
        BMW.maksSpeed=250;
        BMW.NumberOfWheels=4;
        BMW.carModel=new String("BMW");
        BMW.power=550;
        BMW.FuelConsumption=20;
        BMW.Vyvod();
        BMW.Power();
        BMW.Dvizhenije();
        Freight_transport Scania=new Freight_transport();
        Scania.maksSpeed=100;
        Scania.FuelConsumption=20;
        Scania.carModel=new String("Scania");
        Scania.power=600;
        Scania.NumberOfWheels=16;
        Scania.CarryingCapacity=20;
        Scania.Vyvod();
        Scania.Power();
        Scania.loading();

    }
}
