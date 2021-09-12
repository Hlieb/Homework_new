package com.company.Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Computer_new {


        boolean CPU;
        boolean RAM;
        boolean HDD;
        boolean IsOn;
        public int CyklRaboty;

        public Computer_new(boolean CPU, boolean RAM, boolean HDD, boolean IsOn, int CyklRaboty) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HDD = HDD;
            this.IsOn = IsOn;
            this.CyklRaboty = CyklRaboty;
        }

        void vyvod() {
            System.out.println("CPU-" + this.CPU);
            System.out.println("RAM-" + this.RAM);
            System.out.println("HDD-" + this.HDD);
            System.out.println("Ostalos cyklov: " + this.CyklRaboty);
        }

        void rabotaKompa() {
            if (this.CPU && this.RAM && this.HDD && this.IsOn) {
                System.out.println("Для включение компьютера нажмите клавишу 0 или 1: ");
                Random random = new Random();
                Scanner scanner = new Scanner(System.in);
                int vkluchenije = scanner.nextInt();
                int num = random.nextInt(2);
                if (vkluchenije != num) {
                    this.CyklRaboty = 0;
                    System.out.println("Computer isn't working. Cyklov raboty " + this.CyklRaboty);
                }

                if (vkluchenije == num) {
                    System.out.println("Computer is on. ");
                    System.out.println("Для выключения компьютера нажмите клавишу 0 или 1: ");
                    int a = scanner.nextInt();
                    int b = random.nextInt(2);
                    if (a != b) {
                        this.CyklRaboty = 0;
                        System.out.println("Computer isn't working. Cyklov raboty " + this.CyklRaboty);
                    }

                    if (a == b) {
                        --this.CyklRaboty;
                        System.out.println("Computer is off. Cyklov raboty: " + this.CyklRaboty);
                    }
                }

                if (this.CyklRaboty == 0) {
                    System.out.println("You can't work anymore!");
                }
            } else {
                this.CyklRaboty = 0;
                this.IsOn = false;
                System.out.println("Computer is broken!Циклы работы = 0");
            }

        }
    }


