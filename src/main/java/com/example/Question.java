package com.example;

public class Question {
    String questionText;
    String[] options;
    int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption; // options are zero-indexed
    }

    public boolean askQuestion(java.util.Scanner scanner) {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Your answer (enter option number): ");
        int answer = scanner.nextInt();
        return (answer - 1) == correctOption;
    }
}
