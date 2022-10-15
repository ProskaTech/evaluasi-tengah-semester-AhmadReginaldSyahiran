/**
 *
 * Created by 21343039_Ahmad Reginald Syahiran
 */
import javax.swing.JOptionPane;

public class UTS3 {
    public static void main(String[] args){
        String bil = "", msg = "";
        int angka;

        bil = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(bil);

        if(angka >= 0) {
            msg = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            msg = angka + " merupakan bilangan NEGATIF";
        }
        else{
            msg = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, msg);
        System.out.println(msg);
    }
}

