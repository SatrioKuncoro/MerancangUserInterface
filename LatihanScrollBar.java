
package MembuatInterface;
import javax.swing.*;

public class LatihanScrollBar {
    public static void main(String[] args){
        
        JFrame frame =  new JFrame("ScrollBar ");
       JScrollBar scrollBar = new JScrollBar();
       
       scrollBar.setBounds(190, 100, 50, 100);
       frame.add(scrollBar);
       
       frame.setLayout(null);
       
       frame.setVisible(true);
    }
}
