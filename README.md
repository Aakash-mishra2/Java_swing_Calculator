# Java_swing_Calculator
This is a Java Swing Calculator based upon awt toolkit components and swing components.
Components: Java swing toolkit JFrame for overall calculator border and base.

JTextField for input component block of calculator.
JLabel for headings on the calculator layout.
Number panel of the calculator is created using JPanel componenet and buttons are added parsing a single string of numbers and operators.

Each button holds Action Event Listener triggered when the button is pressed. When pressed the title of the pressed button is parsed by getActionCommand() on Action Event object ae in line 72.

Parsed character used to decide which arithemetic operation to perform and the result is printed on the textField using textField.setText() function in line 113.
Once input is entered to store the first number before operand is pressed, Double.parseDouble is used.  
![c1](https://github.com/Aakash-mishra2/Java_swing_Calculator/assets/95024991/e314d9ee-1a08-4a29-b09c-30fe17112cdc)
