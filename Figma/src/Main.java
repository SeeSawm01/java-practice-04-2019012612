//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        //국어,영어,수학,과학 변수선언
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sci = 0;

        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();
        sci = sc.nextInt();



        //총점
        int sum = kor + eng + mat + sci;
        int intAvg = sum / 4;
        double doubleAvg = (double)sum / 4;

        boolean BoolRslt = false;

        if (intAvg == doubleAvg) {
            BoolRslt = true;

        }


        System.out.println("총점 :" + sum);
        System.out.println("정수평균 :" + intAvg);
        System.out.println("실수평균 :" + doubleAvg);
        System.out.println("Bool 확인 :" + BoolRslt);




    }
}