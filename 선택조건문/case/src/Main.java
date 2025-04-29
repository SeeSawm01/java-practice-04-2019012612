//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료를 선택하세요 : 1-아메리카노(3000원)  2-카페라떼(4000원)  3-카푸치노(4500원)");

        int drink = sc.nextInt();
        int drinkp = sc.nextInt();
        String drinkname = "";

        switch (drink) {
            case 1:
                drinkname = "아메리카노";
                drinkp = 3000;
                System.out.println("아메리카노은(는)" + drinkp + "원 입니다.");

                break;
            case 2:
                drinkname = "카페라떼";
                drinkp = 4000;
                System.out.println("카페라떼은(는)" + drinkp + "원 입니다.");

                break;
            case 3:
                drinkname = "카푸치노";
                drinkp = 4500;
                System.out.println("카푸치노은(는)" + drinkp + "원 입니다.");

                break;

            default:
                System.out.println("음료 번호 선택 오류");
                System.exit(0);
        }

        System.out.println("크기를 선택하세요 : 1-Small(0원)  2-Medium(500원)  3-Large(1000원)");

        int size = sc.nextInt();
        int sizep = sc.nextInt();
        String sizename = "";

        switch (size) {
            case 1:
                sizename = "Small";
                System.out.println("Small은(는) 추가비용이 없습니다" );
                break;

            case 2:
                sizep = 500;
                sizename = "Medium";
                System.out.println("Medium은(는) 추가비용" + sizep + "원 입니다." );
                break;

            case 3:
                sizep = 1000;
                sizename = "Large";
                System.out.println("Large은(는) 추가비용" + sizep + "원 입니다." );
                break;

            default:
                System.out.println("크기 번호 선택 오류");
                System.exit(0);
        }

        System.out.println("옵션을 선택하세요 : 1-샷 추가(500원)  2-시럽 추가(300원)  3-둘 다(800원)");
        System.out.println("샷 추가하시겠습니까? 1-Yes(500원) 2-No(0원)");


        int shot = sc.nextInt();
        int shotp = 0;

        switch (shot) {
            case 1:
                shotp = 500;
                break;

            case 2:
                shotp = 0;
                break;

            case 3:
                shotp = 800;
                break;


            default:
                System.out.println("옵션 번호 선택 오류");
                System.exit(0);
        }

        System.out.println("시럽 추가하시겠습니까? 1-Yes(300원) 2-No(0원)");

        int syrup = sc.nextInt();
        int syrupp = 0;


        switch (syrup) {
            case 1:
                syrupp = 300;
                break;

            case 2:
                syrupp = 0;
                break;

            default:
                System.out.println("옵션 번호 선택 오류");
                System.exit(0);
        }


        int totalprice = drinkp + sizep + shotp + syrupp;

        System.out.println("총 가격은" + totalprice + "입니다.");
    }
}