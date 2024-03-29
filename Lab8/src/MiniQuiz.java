//*****************************************************************
// MiniQuiz.java Author: Lewis/Loftus
//
// Demonstrates the use of a class that implements an interface.
//*****************************************************************
import java.util.Scanner;
public class MiniQuiz {
    //--------------------------------------------------------------
    // Presents a short quiz.
    //--------------------------------------------------------------
    public static void main (String[] args) {
        Question q1, q2;
        String possible;
        Scanner scan = new Scanner(System.in);
        
        q1 = new Question ("What is the capital of Jamaica?",
        "Kingston");
        q1.setComplexity (4);
        
        q2 = new Question ("Which is worse, ignorance or apathy?",
        "I don't know and I don't care");
        q2.setComplexity (10);
        
        q1.askQuestion();
        q2.askQuestion();
    }
}