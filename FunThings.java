import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunThings {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<String> hobbyList = new ArrayList <String>();
    
            Hobby<String> hobby1 = new Hobby<String>();
            hobby1.setHobby("VolleyBall");
            hobby1.setResources("Ball");
            hobbyList.add(hobby1.getHobby() +  " \nNeeded resources would be: " + hobby1.getResources());

            Hobby<String> hobby2 = new Hobby<String>();
            hobby2.setHobby("Badminton");
            hobby2.setResources("Racket and Shuttlecock");
            hobbyList.add(hobby2.getHobby() +  " \nNeeded resources would be: " + hobby2.getResources());

            Hobby<String> hobby3 = new Hobby<String>();
            hobby3.setHobby("Archery");
            hobby3.setResources("Bow and Arrow");
            hobbyList.add(hobby3.getHobby() +  " \nNeeded resources would be: " + hobby3.getResources());

            Hobby<String> hobby4 = new Hobby<String>();
            hobby4.setHobby("Table Tennis");
            hobby4.setResources("Tennis Racket and Serving ball");
            hobbyList.add(hobby4.getHobby() +  " \nNeeded resources would be: " + hobby4.getResources());
           
    
            System.out.print("Enter the index you want [0,1,2,3]2: ");
            int input=scan.nextInt();
    
            try{
                if(input < 0){
                    scan.close();
                    throw new ForExcept("Warning: Please input a positive index!");
                }
                if(input > 5){
                    scan.close();
                    throw new ForExcept("Oh no! Input exceeds the size of array. Try Again.");
                }
    
                System.out.println("Index number: " + input);
                System.out.println(human.get(input));
    
            }
            catch(ForExcept e){
                System.out.println(e.getMessage());
            }
    
            scan.close();
    
        }

    }