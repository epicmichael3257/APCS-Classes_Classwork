
import java.util.ArrayList;
public class Quiz
{
    private String quizName;
    private int totalPoints;
    private boolean active;
    private static ArrayList<Question> questions = new ArrayList<Question>();
    public Quiz(){
        quizName = "None";
        totalPoints = 0;
        active = false;
        questions = null;
        
        
    }
    public Quiz(String qN, int p, boolean a, ArrayList q){
        this();
        quizName = qN;
        totalPoints = p;
        active = a;
        questions = q;
        

    }
    public static void addQuestion(Question a){
        questions.add(a);
    }
    
}
