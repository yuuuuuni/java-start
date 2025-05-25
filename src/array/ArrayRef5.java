package array;

public class ArrayRef5 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //배열 변수 선언 후 초기화를 하면 알아서 배열 생성(new int[] 생략 버전)

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
