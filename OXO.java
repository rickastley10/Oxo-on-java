import java.util.Scanner;

public class Main {
    public static void put(String text) {
        System.out.println(text);
    }
    
    public static String get() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
    public static void main(String[] args) {
        String a1 = "1";
        String a2 = "2";
        String a3 = "3";
        String a4 = "4";
        String a5 = "5";
        String a6 = "6";
        String a7 = "7";
        String a8 = "8";
        String a9 = "9";
        while (true) {
            
        
            put("\n\noxo\n");
            put(a1 + "|" + a2 + "|" + a3);
            put("-----");
            put(a4 + "|" + a5 + "|" + a6);
            put("-----");
            put(a7 + "|" + a8 + "|" + a9);
            put("where to place what?\nq to quit\n> ");
            String num = get();

            if (num.equals("1")) {
                put("what to place?\n x / o\n> ");
                a1 = get();
            }
            else if (num.equals("2")) {
                put("what to place?\n x / o\n> ");
                a2 = get();
            }
            else if (num.equals("3")) {
                put("what to place?\n x / o\n> ");
                a3 = get();
            }
            else if (num.equals("4")) {
                put("what to place?\n x / o\n> ");
                a4 = get();
            }
            else if (num.equals("5")) {
                put("what to place?\n x / o\n> ");
                a5 = get();
            }
            else if (num.equals("6")) {
                put("what to place?\n x / o\n> ");
                a6 = get();
            }
            else if (num.equals("7")) {
                put("what to place?\n x / o\n> ");
                a7 = get();
            }
            else if (num.equals("8")) {
                put("what to place?\n x / o\n> ");
                a8 = get();
            }
            else if (num.equals("9")) {
                put("what to place?\n x / o\n> ");
                a9 = get();
            }
            else if (num.equals("q")) {
                return;
            }
        }
    }
}
