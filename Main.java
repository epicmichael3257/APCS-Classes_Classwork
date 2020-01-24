
public class Main
{
    public static void main(String[] args){
        MessageBoard marquee = new MessageBoard(10);
        
        marquee.addMessage("Good Luck Science Bowl Team!");
        marquee.addMessage("Good Luck Debate Team!");
        marquee.addMessage("Good Luck Volleyball Girls!");
        marquee.addMessage("Good Luck MESA Team !");
        marquee.displayOne(1);
        marquee.displayAll();
        marquee.changeMessage(2,"Enjoy your summer.");
        marquee.clear();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
