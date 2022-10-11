import java.util.Scanner;
import java.util.ArrayList; 

public class FunThings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Hobby> hobbyname = new ArrayList<Hobby>();
            System.out.print("Number of hobbies you want to add: ");
            int numObj = sc.nextInt();
            sc.nextLine();
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::\n");
                try{
                        if(numObj > 0 ){
                            for(int i = 0;i<numObj; i++){
                                System.out.print("Hobby name for index " + i + ": ");
                                String name = sc.next();
                                System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
                                hobbyname.add(new Hobby(name));
                                
                                
                            }
                            System.out.println("HOBBY LISTED " +" ==========================================");
                            
                            for(int j = 0;j<numObj; j++){
                                
                                System.out.println("\t\t    " + hobbyname.get(j).getName());
                            }
                        }else if(numObj == 0){
                            sc.close();
                            throw new ExceptionS("You entered an INVALID number. Try to run the program again.");
                        }else{
                            sc.close();
                            throw new ExceptionS("You entered a NEGATIVE number. Try to run the program again.");
                        }
                }catch(ExceptionS e){
                    System.out.println(e.getMessage());
                }
        
    } 
}
