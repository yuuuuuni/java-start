package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 12000;
        int age = 9;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if (true)
            System.out.println("if문 실행됨"); //이렇게 중괄호{} 없이 쓸 수 있음 단, 한 줄인 경우에만!

    }
}
