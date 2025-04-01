import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;


        System.out.println("계산기입니다 : ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        String cal = sc.next();


        System.out.println(num1 + " + " + num2 + " + " + num3  + " = " + (num1+num2+num3) );
        System.out.println(num1 + " - " + num2 + " - " + num3  + " = " + (num1-num2-num3) );
        System.out.println(num1 + " * " + num2 + " * " + num3  + " = " + (num1*num2*num3) );
        System.out.println(num1 + " / " + num2 + " / " + num3  + " = " + (num1/num2/num3) );

    }
}