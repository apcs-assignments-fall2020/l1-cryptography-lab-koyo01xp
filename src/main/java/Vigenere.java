import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String store = "";
        for (int i = 0;i < message.length();i++){
            char ch = message.charAt(i);
             if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
                 for (int a = 0; a < message.length(); i++){
                     char sh = 
                 }
                ch = (char) (ch - key);
                if ((ch > 'z') || (ch > 'Z' && ch < 'a')) {
                    ch = (char) (ch - 26);
                }
            }
    }
        return store;
        
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptVigenere(String message, String key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
