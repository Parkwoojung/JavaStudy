import java.util.Scanner;

// 사분면 구하기
public class Java_15 { // && a,b 조건 둘 다 만족해야함
                       // || a나 b 조건 중 하나만 만족해도 됨
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) { // x, y 둘 다 양수
            System.out.println(1);
        } else if (x < 0 && y > 0) { // x 음수, y 양수
            System.out.println(2);
        } else if (x < 0 && y < 0) { // x, y 둘 다 음수
            System.out.println(3);
        } else {
            System.out.println(4); // 나머지 4분면
        }
    }
}
