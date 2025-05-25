package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; //합 누적
        int count = 0; //횟수 누적
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        //반복문 예제1
        while (true) {
            input = scanner.nextInt();

            if (input == -1) {
                break;
            }
            sum += input; //합계 누적 sum = sum + input
            count++; //횟수 1씩 누적
        }

        // 반복문 예제2
/*        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
*/

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
