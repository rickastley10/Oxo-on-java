import java.util.Scanner;

public class OXO {
    // Make the board variables static so they can be accessed by the static methods
    static String a1 = "1";
    static String a2 = "2";
    static String a3 = "3";
    static String a4 = "4";
    static String a5 = "5";
    static String a6 = "6";
    static String a7 = "7";
    static String a8 = "8";
    static String a9 = "9";
    
    // Create a single static scanner object to be used throughout the program
    static Scanner scanner = new Scanner(System.in);

    public static void board() {
        System.out.println("OXO");
        System.out.println(a1 + "|" + a2 + "|" + a3);
        System.out.println("-----");
        System.out.println(a4 + "|" + a5 + "|" + a6);
        System.out.println("-----");
        System.out.println(a7 + "|" + a8 + "|" + a9);
    }

    public static void choice() {
        System.out.println("where to place what?\nq to quit");
        System.out.print("> ");
        String num = scanner.nextLine();
        
        if (num.equalsIgnoreCase("q")) {
            System.out.println("Quitting game.");
            System.exit(0);
        }

        try {
            int cellNumber = Integer.parseInt(num);
            if (cellNumber >= 1 && cellNumber <= 9) {
                System.out.println("what to place?\nx / o");
                System.out.print("> ");
                String value = scanner.nextLine();
                // Basic validation for 'x' or 'o' can be added here for a more robust program

                switch (cellNumber) {
                    case 1:
                        a1 = value;
                        break;
                    case 2:
                        a2 = value;
                        break;
                    case 3:
                        a3 = value;
                        break;
                    case 4:
                        a4 = value;
                        break;
                    case 5:
                        a5 = value;
                        break;
                    case 6:
                        a6 = value;
                        break;
                    case 7:
                        a7 = value;
                        break;
                    case 8:
                        a8 = value;
                        break;
                    case 9:
                        a9 = value;
                        break;
                }
            } else {
                System.out.println("Invalid number entered. Please choose a number between 1 and 9.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number or 'q' to quit.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            board();
            choice();
            // In a full game, you would also check for a winner or a draw here
        }
    }
}
