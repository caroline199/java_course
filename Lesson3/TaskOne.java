package Lesson3;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = Integer.parseInt(in.nextLine());
        switch(n){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный день недели");
                break;
        }
    }
}
