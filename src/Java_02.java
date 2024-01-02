import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 연산자 이름: sc, new로 scanner함수의 연산자를 만든다!
        int a = sc.nextInt();
        int b = sc.nextInt();
        Java_02 ja = new Java_02();
        int square = ja.square(a, b);


        System.out.print("값은?: " + square);
    }

    public int square(int a, int b) {


        return a*b;
    }
}
