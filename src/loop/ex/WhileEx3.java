package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 3;

        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;  // 1 + 2 + 3
            i++; // 3
        }
        System.out.println(sum);
    }
}
