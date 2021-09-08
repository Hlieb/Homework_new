package com.company.Lesson_5;

import com.company.Lesson_5.Computer;

//Создать класс компьютер.
//isOn boolean
//- процессор Boolean
//- оперативкаBoolean
//- жесткий диск Boolean
//- ресурс полных циклов работы (включений/выключений) int
//Методы:
//- метод описание(вывод всех полей) void Opisanie()
//вывод: [“есть”, “есть”, “есть”, 18 циклов]
//- метод включить, при включении может произойти сбой, при вызове метода
//рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
//угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
//включить нужно выдать сообщение что ему конец
//- выключить (аналогично включению)
//- при превышении лимита ресурса комп сгорает
public class Main {

    public static void main(String[] args) {
        System.out.println("Test raboty Lenovo: ");
        Computer lenovo = new Computer(true, true, true, true, 15);
        lenovo.vyvod();
        lenovo.rabotaKompa();

    }

}
