// 1. static main, non-static run
// 2. Calculator 구조를 미리 짜 보기
//  1) 입력을 받는다. 식(expression) 형태는 숫자 + 연산자(operator) + 숫자(각 사이 공백 있음)
//  2) 입력받은 식을 처리한다.
//  3) 결과값을 출력한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("Input expression: ");
        String expression = scanner.nextLine();

        // 처리
        int result = compute(expression);

        // 출력
        System.out.println("Result: " + result);
    }

    public int compute(String expression) {
        return 0;
    }
}
