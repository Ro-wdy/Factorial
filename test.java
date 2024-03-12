public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        
        // Read the input from the user
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the program.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
