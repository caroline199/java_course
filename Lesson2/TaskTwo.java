package Lesson2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        double w;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину: ");
        w = Double.parseDouble(in.nextLine());
        System.out.print("Введите высоту: ");
        h = Double.parseDouble(in.nextLine());
        System.out.println("Периметр прямоугольника равен " + (w + h) * 2);
        System.out.println("Площадь прямоугольника равна " + w * h);
    }
}
