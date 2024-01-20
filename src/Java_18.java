import java.util.Scanner;
public class Java_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int plusSi = (b + c) / 60; // 추가될 시
        int namuge = (b + c) % 60; // 추가될 분 (만약 40분이 입력되고 추가해야할 시간이 150분이면 총합이 190이니까 60으로 나누면 10이 나머지임
        // 그럼 그냥 10분임

        if (plusSi > 0) {// 몫이 0보다 이상이면
            a += plusSi; // 기존 시에 몫만큼 추가
            if (a >= 24) { // 만약 더해진 시가 24시이거나 24시 이상이면 -24로 하면 됨 예를 들어 25시이면 01시, 27시이면 03시
                a -= 24;
            }
            b = namuge; // 분은 그냥 나머지로 설정
        } else {
            b = namuge; // 몫이 0이면 = 합이 60이 안넘으면 그냥 나머지만 설정
        }
        System.out.println(a + " " + b);
    }
}
/* 망한 코드 */
//import java.util.Scanner;
//
//public class Java_18 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = b + c;
//
//        if (d < 60) {
//            if (a < 23) {
//                d = b + c;
//
//            }
//            } else if (d > 60) {
//                a += 2;
//                d = 0;
//
//            }
//            else if (a == 23) {
//            a = 0;
//            d -= 60;
//        }
//        System.out.println(a);
//    }
//}