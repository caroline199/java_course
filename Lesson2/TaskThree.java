package Lesson2;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args){
        double r;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        r = Double.parseDouble(in.nextLine());
        System.out.println("Площади окружности для круга равна " + Math.PI * Math.pow(r, 2));
        System.out.println("Длина окружности для круга равна " + 2 * Math.PI * r);
    }
}
