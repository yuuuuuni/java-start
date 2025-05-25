package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 2;
        int count = 1; //반복횟수 변수 지정

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;

        }
    }
}
