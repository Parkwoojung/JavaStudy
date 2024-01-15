import java.util.Scanner;

public class Java_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 변수 1 입력
        int b = sc.nextInt(); // 변수 2 입력

        // String 타입의 배열 arr를 생성한다
        // int 형인 b를 String.valueOf() 함수로 String 타입으로 바꾸고,
        // String을 다룰 수 있는 함수 중 split을 공백없이("") 잘라 넣어준다.
        String arr[] = String.valueOf(b).split(""); // ***

        // 아까 입력받은 변수 1인 a와 arr에 잘려 들어간 숫자 하나씩 곱한다.
        // arr는 String 타입이니까 Integer.parseInt() 함수안에 하나씩 넣어
        // int로 형 변환 후 출력해준다.
        System.out.println(a * Integer.parseInt(arr[2])); // *****
        System.out.println(a * Integer.parseInt(arr[1]));
        System.out.println(a * Integer.parseInt(arr[0]));
        System.out.println(a * b);

        // Integer.parseInt("문자열 변수"); int to String
        // String.valueOf("숫자형 변수");String to int
    }
}
