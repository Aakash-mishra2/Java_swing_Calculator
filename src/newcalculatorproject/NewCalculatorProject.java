
package newcalculatorproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class NewCalculatorProject implements ActionListener{
    JFrame frame = new JFrame ("Calculator");
    JTextField textField = new JTextField();
    
    JLabel label = new JLabel();
     JPanel panel_of_numbers = new JPanel();
    //all JBUTTONS
    
     static double num1 =0, num2= 0, result = 0;
     int operator = 1;
    NewCalculatorProject(){
        prepareGUI();
        addComponents();
    }
    public void prepareGUI(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(Color.black);
//       this.addWindowListener(new WindowAdapter(){
//           @Override
//           public void windowClosing(WindowEvent we){
//               System.out.println("Calculator Closed");
//               System.exit(0);
//           }
//       });
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.red);
        frame.add(label);
        
        textField.setBounds(10,40,270,40);
        //set fornt for textField
        
        textField.setEditable(false);
        textField.setColumns(20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
        
        panel_of_numbers.setLayout(new GridLayout(4,5));
        panel_of_numbers.setBounds(10,80,270,60);
        String numbers = "789*C456/%123-  0.+=";
        int x= 10, y = 230;
        for(int i=0; i<numbers.length(); i++){
            if(x>250){ x=10; y= y+60; }
            
            JButton b = new JButton(numbers.substring(i,i+1));
            b.setBounds(x,y,60,40);
            panel_of_numbers.add(b);
            
           b.addActionListener(this);
           x+= 70; 
        }
        frame.add(panel_of_numbers);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("1")) textField.setText(textField.getText().concat("1"));
        if(ae.getActionCommand().equals("2")) textField.setText(textField.getText().concat("2"));
        if(ae.getActionCommand().equals("3")) textField.setText(textField.getText().concat("3"));
        if(ae.getActionCommand().equals("4")) textField.setText(textField.getText().concat("4"));
        if(ae.getActionCommand().equals("5")) textField.setText(textField.getText().concat("5"));
        if(ae.getActionCommand().equals("6")) textField.setText(textField.getText().concat("6"));
        if(ae.getActionCommand().equals("7")) textField.setText(textField.getText().concat("7"));
        if(ae.getActionCommand().equals("8")) textField.setText(textField.getText().concat("8"));
        if(ae.getActionCommand().equals("9")) textField.setText(textField.getText().concat("9"));
        if(ae.getActionCommand().equals("0")) textField.setText(textField.getText().concat("0"));
        if(ae.getActionCommand().equals(".")) textField.setText(textField.getText().concat("."));
        //2343567890.
        if(ae.getActionCommand().equals("+")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 1;
        }
        if(ae.getActionCommand().equals("-")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 2;
        }
        if(ae.getActionCommand().equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 3;
        }
        if(ae.getActionCommand().equals("*")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 4;
        }
        // +-'/*
        if(ae.getActionCommand().equals("=")){
            num2 = Double.parseDouble(textField.getText());
            switch(operator){
                case 1: result = num1 + num2;
                case 2: result = num1 - num2;
                case 3: result = num1 / num2;
                case 4: result = num1 * num2;
            }
            textField.setText(""+result);
        }
        if(ae.getActionCommand().equals("C")){
            textField.setText(" ");
            num1 = 0;
            num2 = 0;
        }
        }
    
  public static void main(String[] args) {
        NewCalculatorProject ncp = new NewCalculatorProject();
    }
  
}
