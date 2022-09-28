
import java.util.ArrayList;
import java.util.Scanner;

public class TMLArraylist {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        
        ArrayList <Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(4);
        numberArrayList.add(3);
        numberArrayList.add(2);
        numberArrayList.add(5);
        char choice;
        
        System.out.println("Given numbers in ArrayList implementation:" + numberArrayList);
        System.out.println("Choose from below:");
        System.out.print("\n1. Add");
        System.out.print("\n2. Remove");
        System.out.print("\n3. Display");
        System.out.print("\n4. Exit");
        
	System.out.print("\nSelected option: ");
        choice = input.next().charAt(0);
           
        switch (choice) {
                 
                case '1':
                    System.out.println("\n***** You are now going to ADD a NUMBER *****");
                        int number = 0;
                        System.out.print("\nInput a number: ");
                        number = in.nextInt();
          //---------- CONDITION ADDED ---------------
                    if (number >= 0){
                        numberArrayList.add(number);
                        System.out.println("The added number is:" + numberArrayList.get(5));
                        System.out.println(numberArrayList);
                    }else{
                        System.out.print("\nPlease input a POSITIVE NUMBER\n");
                    }
        //--------------------------------------------
                    break;
                case '2':
                    System.out.println("\n***** You are now going to REMOVE a NUMBER *****");
                    System.out.print("\nInput the index you want to remove: ");
                    int number2 = in.nextInt();
                    numberArrayList.remove(number2);
                    System.out.println("The removed index number is:" + number2);
                    System.out.println("The latest ArrayList:" + numberArrayList);
                    break;
                case '3':
                    System.out.print("\nInput a number: ");               
                    number = in.nextInt();
                    numberArrayList.add(number);
                    System.out.println("The added number is:" + numberArrayList.get(5));
                    System.out.println(numberArrayList);
                    break;
                case '4':
                    System.out.println("\n******* THANK YOU FOR USING THIS SIMPLE PROGRAM. ADIOS! *******");   
                    break;
                default:
                    System.out.println("\nJust Pick fron the options given above. Please try Again. ");
                    break;
            }
            
    }
    
}
