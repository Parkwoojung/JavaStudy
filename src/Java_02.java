import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 이름: sc, new로 scanner 클래스의 객체를 만든다!
        int a = sc.nextInt(); // int a라는 변수에 sc 연산자
        int b = sc.nextInt();
        Java_02 ja = new Java_02();
        int square = ja.square(a, b);


        System.out.print("값은?: " + square);
    }

    public int square(int a, int b) { // a는 파라미터(인수)


        return a*b;
    }
}
