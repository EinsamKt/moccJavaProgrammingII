
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (parts[0].toLowerCase().equals("quit")) {
                break;
            }
            
            int value = Integer.valueOf(parts[1]);
            
            if (parts[0].toLowerCase().equals("add")) {
                if (container1+value <= 100 && value > 0 ) {
                    container1 = container1 + value;
                } else if (container1+value > 100) {
                    container1 = 100;
                    
                }
                continue;
            }
            
            if (parts[0].toLowerCase().equals("move")) {
                if (value > 0 && container1 - value >= 0) {
                    container2 = container2 + value;
                    container1 = container1 - value;
                    if (container2 > 100) {
                        container2 = 100;
                    }
                } else if (value > 0) {
                    container2 = container2 + container1;
                    container1 = 0;
                    if (container2 > 100) {
                        container2 = 100;
                    }
                }
                continue;
            }
            
            if (parts[0].toLowerCase().equals("remove")) {
                if (value > 0 && container2 - value < 0) {
                    container2 = 0;
                } else if (value > 0 && container2 - value > 0) {
                    container2 = container2 - value;
                }
            }
            
            
            
            
            

        }
    }

}
