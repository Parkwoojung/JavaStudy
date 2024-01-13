import java.util.Scanner;

//(a+b)%c는 ((a%c) + (b%c))%c와 같을까? 프로그램
public class Java_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 클래스를 사용하기 위한 코드 new로 메모리에 올린다.
        //이 때 인스턴스 이름은 sc.

        int a = sc.nextInt(); //sc라는 인스턴스 안에 있는 nextInt라는 메소드를 사용한다.
        //정수를 읽어오는 역할이다.
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

    }
}
