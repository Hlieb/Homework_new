package com.company.Lesson_5;

import java.util.Random;
import java.util.Scanner;

//Обьявляем переменные
public class Computer {
    boolean CPU;
    boolean RAM;
    boolean HDD;
    boolean IsOn;
    public int CyklRaboty;

    // создаем конструктор класса
    public Computer(boolean CPU, boolean RAM, boolean HDD, boolean IsOn, int CyklRaboty) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.IsOn = IsOn;
        this.CyklRaboty = CyklRaboty;
    }

//метод вывода информации о физических характеристиках компьютера
    void vyvod() {
        System.out.println("CPU" + "-" + CPU);
        System.out.println("RAM" + "-" + RAM);
        System.out.println("HDD" + "-" + HDD);
      //  System.out.println("Computer" + "-" + IsOn);
        System.out.println("Ostalos cyklov: " + CyklRaboty);
    }

    // метод включения-выключения компьютера
    void rabotaKompa() {
        if (CPU != true || RAM != true || HDD != true||IsOn!=true) { //проверяем на работоспособность компьютер
            CyklRaboty=0;                                            // если не подходит хоть одно условие - цикл заканчивается, к
            IsOn=false;
            System.out.println("Computer is broken!" + "" + "Циклы работы = 0");
        } else {
            System.out.println("Для включение компьютера нажмите клавишу 0 или 1: ");
            Random random = new Random();                        //задаем случайную переменную
            Scanner scanner = new Scanner(System.in);            // переменная ввода с клавиатуры
            int vkluchenije = scanner.nextInt();
            int num = random.nextInt(2);
            if (vkluchenije != num) {                            //начинаем условия сравнения случайной переменной и введенной с клавиатуры
                CyklRaboty = 0;                                  // и выполняем условия
                System.out.println("Computer isn't working. " + "" + "Cyklov raboty " + "" + CyklRaboty);
            }
            if (vkluchenije == num) {
                System.out.println("Computer is on. ");
                System.out.println("Для выключения компьютера нажмите клавишу 0 или 1: "); //условия для выключения компьютера, так же как и для включения
                int a = scanner.nextInt();
                int b = random.nextInt(2);
                if (a != b) {
                    CyklRaboty = 0;
                    System.out.println("Computer isn't working. " + "" + "Cyklov raboty " + "" + CyklRaboty);
                }
                if (a == b) {
                    CyklRaboty--;
                    System.out.println("Computer is off. " + "" + "Cyklov raboty: " + "" + CyklRaboty);

                }
            }
            if (CyklRaboty == 0) {                                 // условие если цикл работы равен 0
                System.out.println("You can't work anymore!");
            }
        }
    }
}






