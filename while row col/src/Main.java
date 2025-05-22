//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 좌석 배열 크기 설정
        System.out.print("좌석의 행 수를 입력하세요: ");
        int rows = scanner.nextInt();

        System.out.print("좌석의 열 수를 입력하세요: ");
        int cols = scanner.nextInt();

        int[][] seats = new int[rows][cols]; // 0: 비어있음, 1: 예약됨

        // 2. 예약 루프
        while (true) {
            System.out.println("\n좌석 예약을 진행하세요. (종료하려면 0 0 입력)");

            System.out.print("예약할 좌석의 행 번호 입력 (1~" + rows + "): ");
            int r = scanner.nextInt();
            System.out.print("예약할 좌석의 열 번호 입력 (1~" + cols + "): ");
            int c = scanner.nextInt();

            // 종료 조건
            if (r == 0 && c == 0) {
                break;
            }

            // 유효성 검사 전체 행,열보다 크거나, 1보다 작거나
            if (r < 1 || r > rows || c < 1 || c > cols) {
                System.out.println("⚠️ 잘못된 좌석 번호입니다. 다시 입력하세요.");
                continue;
            }

            // 인덱스 변환 컴퓨터 숫자는 0부터 시작하니 1을 뺴줘야함. 좌석은 1부터 시작해서 추가한 부분
            int rowIndex = r - 1;
            int colIndex = c - 1;

            // 이미 예약된 좌석인지 확인
            if (seats[rowIndex][colIndex] == 1) {
                System.out.println("❌ 이미 예약된 좌석입니다!");
            } else {
                seats[rowIndex][colIndex] = 1;
                System.out.println("✅ 좌석 예약이 완료되었습니다.");
            }
        }

        // 3. 좌석 현황 출력
        System.out.println("\n--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}