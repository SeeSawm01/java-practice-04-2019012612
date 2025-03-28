//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 주어진 값들
        double startValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력

        System.out.println( "1.byte = " + (byte)startValue ); //byte는 정수형이기 때문에 뒤에 소수점을 버린다
        System.out.println( "2.short = " + (short)startValue ); //short는 정수형이기 때문에 뒤에 소수점을 버린다
        System.out.println( "3. int = " + (int)startValue );// int는 정수형이기 때문에 뒤에 소수점을 버린다
        System.out.println( "4. long = " + (long)startValue ); //long은 정수형이기 때문에 뒤에 소수점을 버린다
        System.out.println( "5. float = " + (float)startValue ); // float은 실수형이기 때문에 뒤에 소수점을 표현한다.




    }
}