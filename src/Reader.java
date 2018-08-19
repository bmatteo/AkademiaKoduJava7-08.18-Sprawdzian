import java.util.Scanner;

public class Reader {
    public static void readData() {
        while (true) {
            System.out.println("Podaj liczbę:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(Utils.isNumeric(input)) {
                Data.numbersList.add(Integer.parseInt(input));
            } else {
                Data.letter = input.charAt(0);
                break;
            }
        }
    }
}
