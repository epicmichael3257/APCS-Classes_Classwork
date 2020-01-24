

public class MessageBoard
{
    private  int max;
    private  int total;
    private String[] messages;
    
    public MessageBoard(int length){
        
        messages = new String[length];
        max = length;
        
        
        
        
        
    }
    public void changeMessage(int n, String m){
           messages[n] = m;
           
    }
    public boolean addMessage(String m){
        if(m.length()<15 || m.length()>100){
        if(messages[max]==null){
            
            messages[max] = m;
            total++;
            return true;
        }
        }
        return false;
        
        
    }
    public void clear(){
        for(int i=0; i<messages.length;i++){
            messages[i]="";
            
            
        }
        
    }
    public void displayAll(){
        for(int i=0;i<messages.length;i++){
            
            System.out.println(messages[i]);
            
            
        }
    }
    public void displayOne(int n){
        if(n<total){
            System.out.println(messages[n]);
        }
        
    }
    public void getMessageLength(int n){
        System.out.println(messages[n].length());
        
    }
    public  int getCount(){
        return total;
    }
    
}
