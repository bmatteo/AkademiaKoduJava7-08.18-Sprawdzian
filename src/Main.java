import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Reader.readData();

        switch (Data.letter) {
            case 's':
                System.out.println(Utils.sumOfArray(Data.numbersList));
                break;
            case 'm':
                System.out.println(Utils.multiplicationOfArray(Data.numbersList));
                break;
            case 'f':
                System.out.println(Data.numbersList.get(0));
                break;
            case 'L':
                System.out.println(Data.numbersList.get(Data.numbersList.size()-1));
                break;

                default:
                    System.out.println(Data.numbersList.toString());
                    break;
        }
    }
}
