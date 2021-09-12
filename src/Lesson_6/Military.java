package Lesson_6;

public class Military extends Air_transport {
    boolean EjectionSystems;
    int NumberOfMissiles;

    @Override
    void Vyvod() {
        super.Vyvod();
        if (EjectionSystems){
        System.out.println("Ejection Systems: yes ");
        }
        System.out.println("Number of Missiles: " + NumberOfMissiles);
    }
    void shot() {
        if (NumberOfMissiles != 0) {
            System.out.println("Missile fired!");}
        else{
            System.out.println("No ammunition!");
        }
    }
    void ejection(){
        if (EjectionSystems){
            System.out.println("Bailout Successful");}
        else {
            System.out.println("You don't have this system");
        }
    }

    @Override
    void Power() {
        super.Power();
    }
}
