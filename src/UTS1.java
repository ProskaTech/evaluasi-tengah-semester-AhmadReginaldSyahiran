/*
 * Created by 21343039_Ahmad Reginald Syahiran
 */
public class UTS1 {
    public static void main(String[] args) {
        int i, j;
        System.out.print(" ");
        for (j = 2; j <= 3; j++) {
            System.out.print(j);
        }
        System.out.print("   ");
        for (j = 4; j <= 5; j++) {
            System.out.print(j);
        }
        System.out.println();
        for (j = 1; j <= 4; j++) {
            System.out.print(j);
        }
        System.out.print(" ");
        for (j = 5; j <= 8; j++) {
            System.out.print(j);
        }
        System.out.println();



        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j < 10 - i - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}