import java.util.Scanner;

//****************************************************************
// Question.java Author: Lewis/Loftus
//
// Represents a question (and its answer).
//****************************************************************
public class Question implements Complexity {
    private String question, answer;
    private int complexityLevel;
    
    //--------------------------------------------------------------
    // Sets up the question with a default complexity.
    //--------------------------------------------------------------
    public Question (String query, String result) {
        question = query;
        answer = result;
        complexityLevel = 1;
    }
    //--------------------------------------------------------------
    // Sets the complexity level for this question.
    //--------------------------------------------------------------
    public void setComplexity (int level) {
        complexityLevel = level;
    }
    //--------------------------------------------------------------
    // Returns the complexity level for this question.
    //--------------------------------------------------------------
    public int getComplexity() {
        return complexityLevel;
    }
    //--------------------------------------------------------------
    // Returns the question.
    //--------------------------------------------------------------
    public String getQuestion() {
        return question;
    }
    //--------------------------------------------------------------
    // Returns the answer to this question.
    //--------------------------------------------------------------
    public String getAnswer() {
        return answer;
    }
    //--------------------------------------------------------------
    // Returns true if the candidate answer matches the answer.
    //--------------------------------------------------------------
    public boolean answerCorrect (String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }
    //--------------------------------------------------------------
    // Returns this question (and its answer) as a string.
    //--------------------------------------------------------------
    public String toString() {
        return question + "\n" + answer;
    }
    
    //asks the question and checks whether the answer is right or wrong
    public void askQuestion(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print (question);
        
        System.out.println (" (Level: " + complexityLevel + ")");
        
        
        if (answer.equals(scan.nextLine()))
            System.out.println ("Correct");
        else
            System.out.println ("No, the answer is \"" + answer + "\"");
            System.out.println();
        
    
    }
}