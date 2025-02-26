import java.util.*;
import java.awt.*;
import java.awt.ActiveEvent;
// import java.awt.ActionListener;



public class gui {
    public static void main(String[] args) {
        Frame frame = new Frame("hello sir");
        frame.setSize(300, 300);
        
        Button button = new Button("click me");
        button.setBounds(100, 100, 150, 150);
        button.setBackground(null);
        frame.add(button);

        frame.setVisible(true);
        
        
    }
    
}
