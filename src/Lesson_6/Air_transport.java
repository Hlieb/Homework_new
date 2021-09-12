package Lesson_6;


 public  abstract class Air_transport extends Transport {
    int WingSpan;
    int MinLength;

    @Override
    void Vyvod() {
        super.Vyvod();
        System.out.println("Wing span: " + WingSpan+"m");
        System.out.println("Minimum runway length for take-off: " + MinLength+"m");
    }

    @Override
    void Power() {
        super.Power();
    }
}
