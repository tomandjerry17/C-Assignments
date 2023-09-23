
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox pizza,burger,softdrinks;
	private JRadioButton small,medium,large,one,two,three;
	private JLabel summary;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				  Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Menu Ordering Program");
		setBackground(SystemColor.windowBorder);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Input Option", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 228, 353);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel userName = new JLabel("Name: ");
		userName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		userName.setBounds(10, 35, 46, 14);
		panel.add(userName);
		
		textField = new JTextField();
		textField.setBounds(46, 33, 172, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel menu = new JLabel("Menu");
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("Tahoma", Font.BOLD, 12));
		menu.setBounds(86, 65, 46, 14);
		panel.add(menu);
		
		JLabel food = new JLabel("Food");
		food.setBounds(10, 100, 46, 14);
		panel.add(food);
		
		pizza = new JCheckBox("Pizza");
		pizza.setBounds(10, 125, 97, 23);
		panel.add(pizza);
		
		burger = new JCheckBox("Burger");
		burger.setBounds(10, 151, 97, 23);
		panel.add(burger);
		
		JLabel drinks = new JLabel("Beverage");
		drinks.setBounds(110, 100, 57, 14);
		panel.add(drinks);
		
		softdrinks = new JCheckBox("Softdrinks");
		softdrinks.setBounds(121, 125, 97, 23);
		panel.add(softdrinks);
		
		JLabel size = new JLabel("Size");
		size.setFont(new Font("Tahoma", Font.BOLD, 11));
		size.setHorizontalAlignment(SwingConstants.CENTER);
		size.setBounds(86, 217, 46, 14);
		panel.add(size);
		
		small = new JRadioButton("Small");
		buttonGroup.add(small);
		small.setBounds(10, 238, 67, 23);
		panel.add(small);
		
		medium = new JRadioButton("Medium");
		buttonGroup.add(medium);
		medium.setBounds(79, 238, 70, 23);
		panel.add(medium);
		
		large = new JRadioButton("Large");
		buttonGroup.add(large);
		large.setBounds(151, 238, 67, 23);
		panel.add(large);
		
		JLabel quantity = new JLabel("Quantity");
		quantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		quantity.setHorizontalAlignment(SwingConstants.CENTER);
		quantity.setBounds(83, 279, 63, 14);
		panel.add(quantity);
		
		one = new JRadioButton("x1");
		buttonGroup_1.add(one);
		one.setBounds(23, 310, 46, 23);
		panel.add(one);
		
		two = new JRadioButton("x2");
		buttonGroup_1.add(two);
		two.setBounds(86, 310, 46, 23);
		panel.add(two);
		
		three = new JRadioButton("x3");
		buttonGroup_1.add(three);
		three.setBounds(149, 310, 46, 23);
		panel.add(three);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Summary of Order", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(248, 11, 228, 353);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane MenuPrice = new JTextPane();
		MenuPrice.setText("Menu Price\r\n\r\nFood\r\nPizza($5)  Burger($3)\r\nBeverage\r\nSoftdrinks($1)\r\n\r\nNote:\r\n add $1 for size medium\r\n add $2 for size large");
		MenuPrice.setBounds(10, 24, 208, 170);
		panel_1.add(MenuPrice);
		
		summary = new JLabel("");
		summary.setVerticalAlignment(SwingConstants.TOP);
		summary.setHorizontalAlignment(SwingConstants.LEFT);
		summary.setBounds(10, 235, 208, 107);
		panel_1.add(summary);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				//small
				if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(5+3+1));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(5+1));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(3+1));
				}else if (pizza.isSelected()&&burger.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(5+3));
				}else if (pizza.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +5);
				}else if (burger.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +3);
				}else if (softdrinks.isSelected()&&small.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +1);
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3+1)*2));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+1)*2));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3+1)*2));
				}else if (pizza.isSelected()&&burger.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3)*2));
				}else if (pizza.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5)*2));
				}else if (burger.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3)*2));
				}else if (softdrinks.isSelected()&&small.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((1)*2));
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3+1)*3));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+1)*3));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3+1)*3));
				}else if (pizza.isSelected()&&burger.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3)*3));
				}else if (pizza.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5)*3));
				}else if (burger.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3)*3));
				}else if (softdrinks.isSelected()&&small.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((1)*3));
				}
				//medium
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(6+4+2));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(6+2));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(4+2));
				}else if (pizza.isSelected()&&burger.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(6+4));
				}else if (pizza.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +6);
				}else if (burger.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +4);
				}else if (softdrinks.isSelected()&&medium.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +2);
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+4+2)*2));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+2)*2));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((4+2)*2));
				}else if (pizza.isSelected()&&burger.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+4)*2));
				}else if (pizza.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6)*2));
				}else if (burger.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((4)*2));
				}else if (softdrinks.isSelected()&&medium.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((2)*2));
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+4+2)*3));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+2)*3));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((4+2)*3));
				}else if (pizza.isSelected()&&burger.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6+4)*3));
				}else if (pizza.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((6)*3));
				}else if (burger.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((4)*3));
				}else if (softdrinks.isSelected()&&medium.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((2)*3));
				}
				//large
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(7+5+3));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(7+3));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(5+3));
				}else if (pizza.isSelected()&&burger.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +(7+5));
				}else if (pizza.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +7);
				}else if (burger.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +5);
				}else if (softdrinks.isSelected()&&large.isSelected()&&one.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +3);
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+5+3)*2));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+3)*2));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3)*2));
				}else if (pizza.isSelected()&&burger.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+5)*2));
				}else if (pizza.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7)*2));
				}else if (burger.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5)*2));
				}else if (softdrinks.isSelected()&&large.isSelected()&&two.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3)*2));
				}
				else if (pizza.isSelected()&&burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+5+3)*3));
				}else if (pizza.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+3)*3));
				}else if (burger.isSelected()&&softdrinks.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5+3)*3));
				}else if (pizza.isSelected()&&burger.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7+5)*3));
				}else if (pizza.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((7)*3));
				}else if (burger.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((5)*3));
				}else if (softdrinks.isSelected()&&large.isSelected()&&three.isSelected()) {
					summary.setText("Hi "+text+" your total bill is $" +((3)*3));
				}
				else summary.setText("hi "+text+" check your order.");
			}
		});
		calculate.setBackground(SystemColor.activeCaption);
		calculate.setFont(new Font("Tahoma", Font.BOLD, 13));
		calculate.setBounds(139, 385, 99, 25);
		contentPane.add(calculate);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		clear.setBackground(SystemColor.activeCaption);
		clear.setFont(new Font("Tahoma", Font.BOLD, 13));
		clear.setBounds(248, 385, 99, 25);
		contentPane.add(clear);
	}

	private void reset() {
		textField.setText("");
		pizza.setSelected(false);
		burger.setSelected(false);
		softdrinks.setSelected(false);
		small.setSelected(false);
		medium.setSelected(false);
		large.setSelected(false);
		one.setSelected(false);
		two.setSelected(false);
		three.setSelected(false);
		summary.setText("");
	}
}
