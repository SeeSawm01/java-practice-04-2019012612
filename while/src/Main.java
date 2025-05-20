//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");

            if (!scanner.hasNextInt()) {
                System.out.println("정수를 입력해주세요.");
                scanner.next();
                continue;
            }
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            }
            sum += score;
            count++;
        }
        if (count == 0) {
            System.out.println("입력된 점수가 없습니다.");
        } else {
            System.out.println("점수의 총합은 : "  + sum);
        }
        scanner.close();
    }
}
        
        


