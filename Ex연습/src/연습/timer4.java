package 연습;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class timer4 {
	private static final int QUIZ_DURATION_SECONDS = 5;
    private static boolean quizEnded = false;

	public static void main(String[] args) {
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                endQuiz();
            }
        }, QUIZ_DURATION_SECONDS * 1000);

        startQuiz();

		 
	}
	
	private static void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("환영합니다! 이번에는 한 개의 퀴즈만 출제됩니다.");
        System.out.println(QUIZ_DURATION_SECONDS + "초 동안 정답을 입력하세요.");

        String question = "서울의 공식 이름은 무엇인가요?";
        String correctAnswer = "서울특별시";

        System.out.println("\n" + question);
        System.out.print("정답을 입력하세요: ");

        while (!quizEnded) {
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("정답입니다!");
                endQuiz();
            } else {
                System.out.println("틀렸습니다. 다시 시도하세요.");
            }
        }
    }

    private static void endQuiz() {
        quizEnded = true;
        System.out.println("\n퀴즈가 종료되었습니다.");
        System.exit(0);
    }
	
	
	

}
