
/**
 *
 * Created by 21343039_Ahmad Reginald Syahiran
 */
import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int baris, i, j, k;

        System.out.print("Masukkan Jumlah Baris : ");
        baris = in.nextInt();

        for (i = 0; i < baris; i++) {

            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < baris - i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (i = baris; i > 0; i--) {

            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= baris; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}