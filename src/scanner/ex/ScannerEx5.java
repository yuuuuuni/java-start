package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();

        //num1이 num2보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2) {
            int temp = num1; //num1의 값
            num1 = num2; //num2의 값
            num2 = temp; //num1의 값
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
