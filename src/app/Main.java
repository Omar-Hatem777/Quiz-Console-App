package app;

import service.QuestionService;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.printQuestions();
        questionService.printScore();
    }
}