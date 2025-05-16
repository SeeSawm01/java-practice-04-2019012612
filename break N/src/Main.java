//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int N = sc.nextInt(); // 0<= N <= 100
        //루프10번
    for (int i = 1; i <= 10; i++ ) {


        //N이 0< N < 100사이일시 종료
        if (0<= N && N <= 100){
            break;
        }
        System.out.println(i + "번째 루프입니다");

      }

    }
}
