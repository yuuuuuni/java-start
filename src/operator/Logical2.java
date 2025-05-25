package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        //boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        boolean result = 10 < a && a < 20; //이렇게 쓰면 좀 더 가독성이 좋음
        System.out.println("result = " + result);
    }
}
