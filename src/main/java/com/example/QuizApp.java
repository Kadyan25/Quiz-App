package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 1));
        questions.add(new Question("Which language runs in a web browser?",
                new String[]{"Java", "C", "Python", "JavaScript"}, 3));
        questions.add(new Question("What does JDBC stand for?",
                new String[]{"Java Digital Binary Converter", "Java Database Connectivity", "JQuery Data Binding", "None"}, 1));

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Quiz!");
        for (Question q : questions) {
            boolean isCorrect = q.askQuestion(scanner);
            if (isCorrect) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong answer.\n");
            }
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.size());
        scanner.close();
    }
}
