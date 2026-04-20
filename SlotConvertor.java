package hidharun;
import java.util.Scanner;

public class SlotConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();

        if (slot < 1 || slot > 9) {
            System.out.print("Invalid");
            return;
        }

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.print(row + " " + col);
    }
}