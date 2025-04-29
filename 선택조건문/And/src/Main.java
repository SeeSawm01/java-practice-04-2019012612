//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();


        if (x > 0 && x < 101 ) {
            System.out.println("1에서 100 사이의 값입니다");
        } else {
            System.out.println("1에서 100 사이의 값이 아닙니다");
        }




    }
}