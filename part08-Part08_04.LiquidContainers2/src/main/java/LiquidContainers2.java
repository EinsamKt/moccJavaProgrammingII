
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            
            if (parts[0].toLowerCase().equals("quit")) {
                break;
            }
            
            int inputAmount = Integer.valueOf(parts[1]); 
            
            if (parts[0].toLowerCase().equals("add")) {
                first.add(inputAmount);
                continue;
            }
            
            if (parts[0].toLowerCase().equals("remove")) {
                second.remove(inputAmount);
                continue;
            }
            
            if (parts[0].toLowerCase().equals("move")) {
                if (first.contains() >= inputAmount) {
                    first.remove(inputAmount);
                    second.add(inputAmount);
                } else {
                    second.add(first.contains());
                    first.remove(inputAmount);                    
                }
            }

        }
    }

}
