package Lesson_6;

public abstract class Transport {
    int power;
    int maksSpeed;
    int weight;
    String carModel;
    void Vyvod(){                                       //Метод вывода параментров
        System.out.println("Car model: " + carModel);
        System.out.println("Power: " + power+"hp");
        System.out.println("MaksSpeed: " + maksSpeed +"km/h");
        System.out.println("Weight: " + weight+""+"kg");
    }
    void Power(){
        double power_kilowat=(double)power*0.7;                  //Метод расчета мощности в киловаттах
        System.out.println("Power in kilowatts: "+ power_kilowat);

    }
}
