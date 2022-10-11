public class ExceptionS extends Exception{
    public ExceptionS(String message){
        super(message);
    }
    public String outofBound(){
        return "NEGATIVE VARIABLE";
    }
    public String negativeIndex(){ 
        return "YOU INPUTTED AN INVALID INPUT.";
    }
}