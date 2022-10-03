package Lesson4;

public class TaskThree {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0 + "\n" + n1);
        int i = 3;
        while(i <= 10){
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
            i++;
        }
    }
}
