package Lesson2;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args){
        double n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = Double.parseDouble(in.nextLine());
        double x = n % 1;
        if (x > 0) {
            System.out.println("Есть вещественная часть");
        } else {
            System.out.println("Целое число");
        }
    }
}
