package exception.ex1;

import exception.NetworkServiceV0;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessages(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상종료합니다.");

    }
}
