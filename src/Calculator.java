import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	//Declare variables for parts of the calculator
	private JFrame calculator_frame;
	private JTextField calculator_screen;
	private JButton digit_three;
	private JButton digit_six;
	private JButton digit_four;
	private JButton digit_five;
	private JButton digit_seven;
	private JButton digit_nine;
	private JButton digit_eight;
	private JButton digit_zero;
	private JButton clear_all;
	private JButton plus_operator;
	private JButton minus_operator;
	private JButton division_operator;
	private JButton equal_to;
	private JButton multiplication_operator;
	
	//Declare variables for computing user input
	private Double temporaryAnswer;
	private Double finalAnswer;
	private Double numberForRepeatedEquals;
	private Boolean answered = false;
	private String operator = "";
	
	//Start the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.calculator_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Initialize upon object creation
	public Calculator() {
		initialize();
	}

	//Handle logic and initialize frame components
	private void initialize() {
		
		calculator_frame = new JFrame();
		calculator_frame.setResizable(false);
		calculator_frame.setTitle("Calculator");
		calculator_frame.setBounds(100, 100, 281, 231);
		calculator_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator_frame.getContentPane().setLayout(null);
		
		calculator_screen = new JTextField();
		calculator_screen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		calculator_screen.setBounds(10, 11, 121, 31);
		calculator_frame.getContentPane().add(calculator_screen);
		calculator_screen.setColumns(10);
		
		JButton digit_one = new JButton("1");
		digit_one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
				    || operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
				    || operator == "-" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_one.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_one.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_one.getText());
				}
				
			}
		});
		digit_one.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_one.setBounds(10, 116, 58, 30);
		calculator_frame.getContentPane().add(digit_one);
		
		JButton digit_two = new JButton("2");
		digit_two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_two.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_two.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_two.getText());
				}
				
			}
		});
		digit_two.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_two.setBounds(72, 116, 58, 30);
		calculator_frame.getContentPane().add(digit_two);
		
		digit_three = new JButton("3");
		digit_three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_three.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_three.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_three.getText());
				}
				
			}
		});
		digit_three.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_three.setBounds(134, 116, 58, 30);
		calculator_frame.getContentPane().add(digit_three);
		
		digit_six = new JButton("6");
		digit_six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_six.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_six.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_six.getText());
				}
				
			}
		});
		digit_six.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_six.setBounds(134, 81, 58, 30);
		calculator_frame.getContentPane().add(digit_six);
		
		digit_four = new JButton("4");
		digit_four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_four.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_four.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_four.getText());
				}
				
			}
		});
		digit_four.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_four.setBounds(10, 81, 58, 30);
		calculator_frame.getContentPane().add(digit_four);
		
		digit_five = new JButton("5");
		digit_five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_five.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_five.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_five.getText());
				}
				
			}
		});
		digit_five.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_five.setBounds(72, 81, 58, 30);
		calculator_frame.getContentPane().add(digit_five);
		
		digit_seven = new JButton("7");
		digit_seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_seven.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_seven.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_seven.getText());
				}
				
			}
		});
		digit_seven.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_seven.setBounds(10, 46, 58, 30);
		calculator_frame.getContentPane().add(digit_seven);
		
		digit_nine = new JButton("9");
		digit_nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_nine.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
						calculator_screen.setText(digit_nine.getText());
						answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_nine.getText());
				}
				
			}
		});
		digit_nine.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_nine.setBounds(134, 46, 58, 30);
		calculator_frame.getContentPane().add(digit_nine);
		
		digit_eight = new JButton("8");
		digit_eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
					|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
					calculator_screen.setText(calculator_screen.getText() + digit_eight.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_eight.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_eight.getText());
				}
				
			}
		});
		digit_eight.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_eight.setBounds(72, 46, 58, 30);
		calculator_frame.getContentPane().add(digit_eight);
		
		digit_zero = new JButton("0");
		digit_zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by either a positive or a negative number
				if (operator == "*" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))
						|| operator == "/" && (calculator_screen.getText().contains("+") || calculator_screen.getText().contains("-"))) {
						calculator_screen.setText(calculator_screen.getText() + digit_zero.getText());
				}
				
				//Reset calculator screen after computing or after having pressed an operator
				else if (calculator_screen.getText().contains(plus_operator.getText())
						|| calculator_screen.getText().contains(minus_operator.getText())
						|| calculator_screen.getText().contains(division_operator.getText())
						|| calculator_screen.getText().contains(multiplication_operator.getText())
						|| (answered && !calculator_screen.getText().contains("."))) {
					calculator_screen.setText(digit_zero.getText());
					answered = false;
				}
				
				//Concatenate digits
				else {
					calculator_screen.setText(calculator_screen.getText() + digit_zero.getText());
				}
				
			}
		});
		digit_zero.setFont(new Font("Dialog", Font.BOLD, 18));
		digit_zero.setBounds(72, 151, 58, 30);
		calculator_frame.getContentPane().add(digit_zero);
		
		clear_all = new JButton("C");
		clear_all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Clear the text box along with all variables
				calculator_screen.setText("");
				temporaryAnswer = null;
				finalAnswer = null;
				numberForRepeatedEquals = null;
				answered = false;
				operator = "";
			}
		});
		clear_all.setFont(new Font("Dialog", Font.BOLD, 18));
		clear_all.setBounds(10, 151, 58, 30);
		calculator_frame.getContentPane().add(clear_all);
		
		plus_operator = new JButton("+");
		plus_operator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//If the number is negative, keep it negative
					if (calculator_screen.getText().startsWith("-")) {
						calculator_screen.setText("-");
						operator = "-";
					}
					
					//If the number is positive, keep it positive
					if (calculator_screen.getText().startsWith("+")) {
						calculator_screen.setText("+");
						operator = "+";
					}
					
					//Needed to be able to multiply/divide by a positive whole number
					else if (calculator_screen.getText().startsWith("×") || calculator_screen.getText().startsWith("÷")) {
						calculator_screen.setText("+");
					}
					
					//Needed to be able to divide by a positive fraction
					else if (calculator_screen.getText().contains(".")) {
						calculator_screen.setText("+" + calculator_screen.getText());
					}
					
					//Set the variables for addition
					else {
						temporaryAnswer = Double.parseDouble(calculator_screen.getText());
						calculator_screen.setText("+");
						operator = "+";
					}
				}
				
				//Do nothing when a mathematical syntax error is thrown
				catch (NumberFormatException numFormatExc) {
					calculator_screen.setText("");
				}
			}
		});
		plus_operator.setFont(new Font("Dialog", Font.BOLD, 18));
		plus_operator.setBounds(196, 11, 58, 30);
		calculator_frame.getContentPane().add(plus_operator);
		
		minus_operator = new JButton("-");
		minus_operator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				try {
					
					//If the number is already negative, make it positive
					if (calculator_screen.getText().startsWith("-")) {
						calculator_screen.setText("+");
						operator = "+";
					}
					
					//If the number is positive, make it negative
					else if (calculator_screen.getText().startsWith("+")) {
						calculator_screen.setText("-");
						operator = "-";
					}
					
					//Needed to be able to multiply/divide by a negative whole number
					else if (calculator_screen.getText().startsWith("×") || calculator_screen.getText().startsWith("÷")) {
						calculator_screen.setText("-");
					}
					
					//Needed to be able to divide by a negative fraction
					else if (calculator_screen.getText().contains(".")) {
						calculator_screen.setText("-" + calculator_screen.getText());
					}
					
					//Set the variables for subtraction
					else {
						temporaryAnswer = Double.parseDouble(calculator_screen.getText());
						calculator_screen.setText("-");
						operator = "-";
					}
				}
				
				//Do nothing when a mathematical syntax error is thrown
				catch (NumberFormatException numFormatExc) {
					calculator_screen.setText("");
				}
			}
		});
		minus_operator.setFont(new Font("Dialog", Font.BOLD, 18));
		minus_operator.setBounds(196, 46, 58, 30);
		calculator_frame.getContentPane().add(minus_operator);
		
		division_operator = new JButton("÷");
		division_operator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Set the variables for division
				try {
					temporaryAnswer = calculator_screen.getText().length() > 0 ? Double.parseDouble(calculator_screen.getText()) : 0;
					calculator_screen.setText(division_operator.getText());
					operator = "/";
				}
				
				//Do nothing when a mathematical syntax error is thrown
				catch (NumberFormatException numFormatExc) {
					calculator_screen.setText(calculator_screen.getText());
				}
			}
		});
		division_operator.setFont(new Font("Dialog", Font.BOLD, 18));
		division_operator.setBounds(196, 116, 58, 30);
		calculator_frame.getContentPane().add(division_operator);
		
		equal_to = new JButton("=");
		equal_to.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Do nothing if values are uninitialized
				if (temporaryAnswer == null && calculator_screen.getText().length() == 0) {
					calculator_screen.setText("");
				}
				
				//Show negative numbers while values are uninitialized
				else if (temporaryAnswer == null && operator == "-") {
					calculator_screen.setText(String.valueOf(-Double.parseDouble(calculator_screen.getText())));
				}
				
				//Handle arithmetic
				else {
					
					try {
						
						try {
							switch(operator) {
							
							//Handle addition
							case "+":
								finalAnswer = temporaryAnswer + Double.parseDouble(calculator_screen.getText());
								calculator_screen.setText(String.valueOf(finalAnswer));
								answered = true;
								operator = "";
								break;
								
							//Handle subtraction
							case "-":
								finalAnswer = temporaryAnswer - Double.parseDouble(calculator_screen.getText());
								calculator_screen.setText(String.valueOf(finalAnswer));
								answered = true;
								operator = "";
								break;
								
							//Handle division
							case "/":
								finalAnswer = temporaryAnswer / Double.parseDouble(calculator_screen.getText());
								calculator_screen.setText(String.valueOf(finalAnswer));
								answered = true;
								operator = "";
								break;
								
							//Handle multiplication
							case "*":
								finalAnswer = temporaryAnswer * Double.parseDouble(calculator_screen.getText());
								calculator_screen.setText(String.valueOf(finalAnswer));
								answered = true;
								operator = "";
								break;
							}
						}
						
						//Do nothing when a mathematical error is thrown
						catch (NullPointerException nullPtrExc) {
							calculator_screen.setText(calculator_screen.getText());
						}
					}
					
					//Do nothing when a mathematical syntax error is thrown
					catch (NumberFormatException numFormatExc) {
						calculator_screen.setText(String.valueOf(temporaryAnswer));
					}
				}
			}
		});
		equal_to.setFont(new Font("Dialog", Font.BOLD, 18));
		equal_to.setBounds(134, 151, 58, 30);
		calculator_frame.getContentPane().add(equal_to);
		
		multiplication_operator = new JButton("×");
		multiplication_operator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Set the variables for multiplication
				try {
					temporaryAnswer = Double.parseDouble(calculator_screen.getText());
					calculator_screen.setText(multiplication_operator.getText());
					operator = "*";
				}
				
				//Do nothing when a mathematical syntax error is thrown
				catch (NumberFormatException numFormatExc) {
					calculator_screen.setText(calculator_screen.getText());
				}
			}
		});
		multiplication_operator.setFont(new Font("Dialog", Font.BOLD, 18));
		multiplication_operator.setBounds(196, 81, 58, 30);
		calculator_frame.getContentPane().add(multiplication_operator);
		
		JButton decimal_point = new JButton(".");
		decimal_point.setVerticalAlignment(SwingConstants.BOTTOM);
		decimal_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Needed to be able to multiply/divide by a positive/negative fraction
				if (calculator_screen.getText().startsWith("-") && (operator == "/" || operator == "*")
					|| calculator_screen.getText().startsWith("+") && (operator == "/" || operator == "*")) {
					calculator_screen.setText(calculator_screen.getText() + decimal_point.getText());
				}
				
				//Reset calculator screen after having pressed an operator or a decimal point
				else if(calculator_screen.getText().contains("-")
					|| calculator_screen.getText().contains("+")
					|| calculator_screen.getText().contains("×")
					|| calculator_screen.getText().contains("÷")
					|| calculator_screen.getText().contains(".")) {
					calculator_screen.setText(decimal_point.getText());
				}
				
				//Concatenate decimal point to digit
				else {
					calculator_screen.setText(calculator_screen.getText() + decimal_point.getText());
				}
			}
		});
		decimal_point.setFont(new Font("Dialog", Font.BOLD, 26));
		decimal_point.setBounds(196, 151, 58, 30);
		calculator_frame.getContentPane().add(decimal_point);
		
		JButton delete_one_character = new JButton("←");
		delete_one_character.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//If all values are uninitialized, keep it that way
				if (calculator_screen.getText().length() >= 1 && operator != "") {
					calculator_screen.setText("");
					temporaryAnswer = null;
					finalAnswer = null;
					numberForRepeatedEquals = null;
					answered = false;
					operator = "";
				}
				
				//Remove one character from the calculator screen
				else if (calculator_screen.getText().length() >= 1) {
					calculator_screen.setText(calculator_screen.getText().substring(0, calculator_screen.getText().length()-1));
				}
			}
		});
		delete_one_character.setFont(new Font("Dialog", Font.BOLD, 24));
		delete_one_character.setBounds(134, 11, 58, 30);
		calculator_frame.getContentPane().add(delete_one_character);
	}
}
