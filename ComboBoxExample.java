
package MembuatInterface;
//import java.awt.Frame;
import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args){
//        inisialisasi class objek
JFrame jframe1 = new JFrame("Latihan Mmebuat ");
String cities[] ={
    "Solo", "Jogja", "Inggris", "Bantul", "Rembang"
} ;
JComboBox  cb = new JComboBox(cities);
cb.setBounds(50, 50, 90, 20);
jframe1.add(cb);
jframe1.setLayout(null);
jframe1.setSize(400, 500);
jframe1.setVisible(true);
//JFrame  frrame1 - new JFrame("Latihan ComboBox");
    }
}
