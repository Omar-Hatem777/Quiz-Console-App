package service;

import entity.Question;

import java.util.Scanner;

public class QuestionService {

    Question [] question = new Question[3];
    String [] userAnswer = new String[3] ;

    public QuestionService(){
        question[0] = new Question();
        question[0].setId(1);
        question[0].setQuestion("What is 2*2?");
        question[0].setCorrectAnswer("4");
        String [] answers1 = {"1","2","3","4"};
        question[0].setOptions(answers1);

        question[1] = new Question();
        question[1].setId(2);
        question[1].setQuestion("What is 3*2?");
        question[1].setCorrectAnswer("6");
        String [] answers2 = {"6","2","3","4"};
        question[1].setOptions(answers2);

        question[2] = new Question();
        question[2].setId(3);
        question[2].setQuestion("What is 2/2?");
        question[2].setCorrectAnswer("1");
        String [] answers3 = {"1","2","3","4"};
        question[2].setOptions(answers3);
    }

    public void printQuestions(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i].getId() +": "+ question[i].getQuestion());
            for (String option : question[i].getOptions()){
                System.out.println(option);
            }
            String ans = scanner.next();
            userAnswer[i] = ans;
        }
    }

    public void printScore(){
        int score = 0;
        for (int i = 0; i < userAnswer.length; i++) {
            if (userAnswer[i].equals(question[i].getCorrectAnswer())){
                score++;
            }
        }
        System.out.println("Your score is: " +score+ " out of "+ question.length);
    }


}
