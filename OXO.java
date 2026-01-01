import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
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
            
        
            System.out.println("\n\noxo\n");
            System.out.println(a1 + "|" + a2 + "|" + a3);
            System.out.println("-----");
            System.out.println(a4 + "|" + a5 + "|" + a6);
            System.out.println("-----");
            System.out.println(a7 + "|" + a8 + "|" + a9);
            System.out.println("where to place what?\nq to quit\n> ");
            String num = scanner.nextLine();

            if (num.equals("1")) {
                System.out.println("what to place?\n x / o\n> ");
                a1 = scanner.nextLine();
            }
            else if (num.equals("2")) {
                System.out.println("what to place?\n x / o\n> ");
                a2 = scanner.nextLine();
            }
            else if (num.equals("3")) {
                System.out.println("what to place?\n x / o\n> ");
                a3 = scanner.nextLine();
            }
            else if (num.equals("4")) {
                System.out.println("what to place?\n x / o\n> ");
                a4 = scanner.nextLine();
            }
            else if (num.equals("5")) {
                System.out.println("what to place?\n x / o\n> ");
                a5 = scanner.nextLine();
            }
            else if (num.equals("6")) {
                System.out.println("what to place?\n x / o\n> ");
                a6 = scanner.nextLine();
            }
            else if (num.equals("7")) {
                System.out.println("what to place?\n x / o\n> ");
                a7 = scanner.nextLine();
            }
            else if (num.equals("8")) {
                System.out.println("what to place?\n x / o\n> ");
                a8 = scanner.nextLine();
            }
            else if (num.equals("9")) {
                System.out.println("what to place?\n x / o\n> ");
                a9 = scanner.nextLine();
            }
            else if (num.equals("q")) {
                return;
            }
        }
    }
  }
