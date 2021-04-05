package basic_practiceCH5.Exercise5_13;

import java.util.Scanner;

public class Exercise5_13 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++){
            char[] question = words[i].toCharArray(); //String을 char[]로 변환

            for(int j=0;j<question.length;j++){
                int k = (int)(Math.random()* question.length);
                char temp = question[j];
                question[j] = question[k];
                question[k] = temp;
            }

            System.out.println("Q"+i+1+"."+new String(question)+"의 정답을 입력하세요.>");

            String answer = scanner.nextLine();

            if(words[i].equals(answer.trim()))
                System.out.println("맞았습니다.\n\n");
            else
                System.out.println("틀렸습니다.\n\n");
        }
    }
}
