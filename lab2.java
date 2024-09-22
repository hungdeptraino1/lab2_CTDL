import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        while (true) {
            System.out.println("\nEnter your choice: \n1: Array initialization \n2: Modifying an array element" );
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter 5 int for array: ");
                for(int i = 0; i < num.length; i++){       
                    num[i] = sc.nextInt();
                }
                System.out.println("New array element: ");
                for(int i = 0; i < num.length; i++){
                    System.out.print(num[i] + " ");
                }
                break;
                case 2:
                System.out.println("Enter the index of the element you want to modify: ");
                int index = sc.nextInt();
                System.out.println("Enter the new value of the element: ");
                int newValue = sc.nextInt();
                if(index < num.length && index >= 0){
                    num[index] = newValue;
                    System.out.println("Modified array elements: ");
                    for(int i = 0; i < num.length; i++){
                        System.out.print(num[i] + " ");
                    }                  
                }
                break;
                default:
                System.out.println("Invalid choice(1, 2 only)");
                break;
            }
    
        }
        
    }
    
}
        
    
    

