package Lesson4;

public class TaskFour {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            int j = 1;
            while(j <= 10) {
                int result = i * j;
                System.out.println(i + "x" + j + "=" + result);
                j++;
            }
            i++;
        }
    }
}
