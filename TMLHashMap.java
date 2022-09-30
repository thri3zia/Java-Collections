import java.util.HashMap;
import java.util.Scanner;
public class TMLHashMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        HashMap<Integer, Integer> numberHashmap = new HashMap<>();
        numberHashmap.put(0, 10);
        numberHashmap.put(1, 20);
        numberHashmap.put(2, 30);
        numberHashmap.put(3, 40);
        numberHashmap.put(4, 50);
        numberHashmap.put(5, 60);
        
        char choice;
        int number = 0;
   
        do{
            System.out.println("\n===================================================================");
            System.out.println("Given numbers in HashMap Collection:" + numberHashmap);
            System.out.println("Choose from below:");
            System.out.print("1. Add");
            System.out.print("\n2. Remove");
            System.out.print("\n3. Display");
            System.out.print("\n4. Clear");
            System.out.print("\n5. Exit");

            System.out.print("\nSelected option: ");
            choice = input.next().charAt(0);
            System.out.println("\n===================================================================");
            
           switch (choice) {
                 
                case '1':
                    System.out.println("\n***** You are now going to ADD a NUMBER *****\n");
                    System.out.println("Note: Only enter composite numbers.");
                    System.out.print("Enter VALUE you want to add: ");
                    int add = in.nextInt();
                    int j = add/2;
                    int isPrime = 0;
                        if(add == 0 || add == 1){
                            System.out.print("Enter KEY for the number you want to add: ");
                            number = in.nextInt();
                            numberHashmap.put(number, add);
                            System.out.println(number + " = " + add + " is successfully added to the HashMap!");
                            System.out.print("********************************************************************\n");
                        }
                    else{
                        for(int i = 2; i <= j; i++){
                            if(add%i == 0){
                                System.out.print("Enter KEY for the number you want to add: ");
                                number = in.nextInt();
                                numberHashmap.put(number, add);
                                System.out.println(number + " = " + add + " is successfully added to the HashMap!");
                                System.out.print("********************************************************************\n");
                                isPrime = 1;
                                break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("The number you enter is a prime number. It is not added in the HashMap.Please Try Again.");
                            System.out.print("********************************************************************\n");
                        }
                    }

                    break;
                    
                case '2':
                    System.out.println("***** You are now going to REMOVE a NUMBER *****");
                    System.out.print("\nInput the KEY you want to remove: ");
                    int number2 = in.nextInt();
                    if(numberHashmap.containsKey(number2)){
                        System.out.println("\n" + number2 + " = " + numberHashmap.get(number2) + " is successfully removed!");
                        numberHashmap.remove(number2);
                    }
                    System.out.println("The latest HashMap Collection:" + numberHashmap);
                    System.out.print("********************************************************************\n");
                    break;

                case '3':
                    System.out.println("***** Displaying numbers in HashMap *****");

                    numberHashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + "= " + entry.getValue());
                    });
                    System.out.print("********************************************************************\n");

                    break;
                    
                case '4':
                    System.out.print("********************************************************************\n"); 
                    numberHashmap.clear();  
                    System.out.println("\n\t\tCLEARED HashMap Collection:" + numberHashmap);
                    System.out.print("\n********************************************************************\n"); 
                    break;
                case '5':
                    System.out.print("====================================================================\n"); 
                    System.out.println("\n******* THANK YOU FOR USING THIS SIMPLE PROGRAM. ADIOS! *******");  
                    System.out.print("\n====================================================================\n\n"); 
                   break;
                
                default:
                    System.out.println("\nJust Pick fron the options given above. Please try Again. ");
                    break;
            }
        }while (choice != '5');
    }
    
}