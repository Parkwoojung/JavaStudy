import java.util.Scanner;

public class Java_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 엔터로 입력 구분
        int b = sc.nextInt();

        if (b < 45) { //45분 보다 입력된 분이 작을 때만 시가 줄어든다.
            if (a == 0) { // 시간이 자정일 때, 23시로 표시 -> 24시에서 45분 빨라짐
                a = 23;
            } else {
                a -= 1; // a = a -1랑 같은 뜻 , 45보다 작으면 1시간이 적어짐
            }
            b -= 45; // b = b - 45랑 같은 뜻, 분에서 45분을 뺀다.
            b += 60; // 마이너스 되어있는 분에 + 60을 한다.

        }  else {
            b = b-45; // 45보다 크면 분에서 45를 빼면 된다. 왜냐면? 45분 일찍 일어나야하니까.
        }
        System.out.println(a + " " + b);
    }
}
