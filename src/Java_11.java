import java.util.Scanner;
// 꼬마정민 a+b+c 구하기
public class Java_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String [] arr = a.split(" ");

        long b = Long.parseLong(arr[0]); // Int와 Long 은 크기가 2배가 차이난다.
        long c = Long.parseLong(arr[1]);
        long d = Long.parseLong(arr[2]);

        System.out.println(b+c+d);
        // String타입의 a,b,c를 int변환 함수 사용해서 형 변환해서 더하기
        // String to int == Integer.parseInt
        // int to String = String.valueOf()
    }
}
