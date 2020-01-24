

public class Question
{
    private String questionText;
    private String mcA, mcB, mcC, mcD;
    private String answer;
    
    public Question(){
        questionText = "None";
        mcA = "None";
        mcB = "None";
        mcC = "None";
        mcD = "None";
        answer = "None";
    }
    public Question(String q, String a,String b, String c, String d,String ans){
        this();
        questionText = q;
        mcA = a;
        mcB = b;
        mcC = c;
        mcD = d;
        answer = ans;
        
        
    }
}
