package SuDungToanTu;
import java.util.Scanner;

public class SuDungToanTu {
    public static void main (String[] args) {
        float width;
        float height;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = keyboard.nextFloat();

        System.out.println("Enter height: ");
        height = keyboard.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}
