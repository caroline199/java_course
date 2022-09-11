package Lesson2;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        n = Integer.parseInt(in.nextLine());
        int x = n / 100;
        int z = n % 10;
        int y = n / 10 % 10;
        int sum = x + y + z;
        System.out.print("Сумма цифр числа " + n + " равна " + sum);
    }
}
