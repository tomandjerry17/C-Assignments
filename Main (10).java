import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Main extends JFrame {

	private JPanel contentPane;
	private JCheckBox hoodie,shirt,pants;
	private JRadioButton s,m,l,xl,one,two,three;
	private JTextPane summary;
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
		setBackground(Color.DARK_GRAY);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setForeground(Color.BLACK);
		setTitle("Tammy Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 398);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Order Menu", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBounds(10, 22, 464, 220);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tam-Tam Sports Apparel");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 0, 353, 59);
		menu.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Items: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 57, 59, 24);
		menu.add(lblNewLabel_1);
		
		hoodie = new JCheckBox("Hoodie ($20)");
		hoodie.setBounds(21, 88, 117, 28);
		menu.add(hoodie);
		
		shirt = new JCheckBox("Shirt ($10)");
		shirt.setBounds(21, 119, 117, 28);
		menu.add(shirt);
		
		pants = new JCheckBox("Jogger Pants ($30)");
		pants.setBounds(21, 150, 169, 28);
		menu.add(pants);
		
		JLabel lblNewLabel_2 = new JLabel("Size: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(194, 67, 46, 14);
		menu.add(lblNewLabel_2);
		
		s = new JRadioButton("small");
		buttonGroup.add(s);
		s.setBounds(204, 91, 109, 23);
		menu.add(s);
		
		m = new JRadioButton("medium");
		buttonGroup.add(m);
		m.setBounds(204, 117, 109, 23);
		menu.add(m);
		
		l = new JRadioButton("large");
		buttonGroup.add(l);
		l.setBounds(204, 143, 109, 23);
		menu.add(l);
		
		xl = new JRadioButton("xL");
		buttonGroup.add(xl);
		xl.setBounds(204, 169, 109, 23);
		menu.add(xl);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(312, 67, 71, 14);
		menu.add(lblNewLabel_3);
		
		one = new JRadioButton("x1");
		buttonGroup_1.add(one);
		one.setBounds(332, 88, 71, 28);
		menu.add(one);
		
		two = new JRadioButton("x2");
		buttonGroup_1.add(two);
		two.setBounds(332, 116, 71, 24);
		menu.add(two);
		
		three = new JRadioButton("x3");
		buttonGroup_1.add(three);
		three.setBounds(332, 143, 81, 23);
		menu.add(three);
		
		JPanel SUM = new JPanel();
		SUM.setBounds(10, 249, 305, 99);
		contentPane.add(SUM);
		SUM.setLayout(null);
		
		summary = new JTextPane();
		summary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		summary.setBounds(0, 0, 305, 99);
		SUM.add(summary);
		
		JButton order = new JButton("Place Order");
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//small-x1
				if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10+30)+("\n\nItem(s):\n one small Hoodie\n one small Shirt\n one small Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10)+("\n\nItem(s):\n one small Hoodie\n one small Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+30)+("\n\nItem(s):\n one small Hoodie\n one small Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10+30)+("\n\nItem(s):\n one small Shirt\n one small Jogger Pants"));
				}else if (hoodie.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20)+("\n\nItem(s):\n one small Hoodie"));
				}else if (shirt.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10)+("\n\nItem(s):\n one small Shirt"));
				}else if (pants.isSelected()&&s.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(30)+("\n\nItem(s):\n one small Jogger Pants"));
				}//small-x2
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*2)+("\n\nItem(s):\n two small Hoodie\n two small Shirt\n two small Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*2)+("\n\nItem(s):\n two small Hoodie\n two small Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*2)+("\n\nItem(s):\n two small Hoodie\n two small Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*2)+("\n\nItem(s):\n two small Shirt\n two small Jogger Pants"));
				}else if (hoodie.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*2)+("\n\nItem(s):\n two small Hoodie"));
				}else if (shirt.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*2)+("\n\nItem(s):\n two small Shirt"));
				}else if (pants.isSelected()&&s.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*2)+("\n\nItem(s):\n two small Jogger Pants"));
				}//small-x3
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*3)+("\n\nItem(s):\n three small Hoodie\n three small Shirt\n three small Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*3)+("\n\nItem(s):\n three small Hoodie\n three small Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*3)+("\n\nItem(s):\n three small Hoodie\n three small Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*3)+("\n\nItem(s):\n three small Shirt\n three small Jogger Pants"));
				}else if (hoodie.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*3)+("\n\nItem(s):\n three small Hoodie"));
				}else if (shirt.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*3)+("\n\nItem(s):\n three small Shirt"));
				}else if (pants.isSelected()&&s.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*3)+("\n\nItem(s):\n three small Jogger Pants"));
				}
				//medium-x1
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10+30)+("\n\nItem(s):\n one medium Hoodie\n one medium Shirt\n one medium Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10)+("\n\nItem(s):\n one medium Hoodie\n one medium Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+30)+("\n\nItem(s):\n one medium Hoodie\n one medium Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10+30)+("\n\nItem(s):\n one medium Shirt\n one medium Jogger Pants"));
				}else if (hoodie.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20)+("\n\nItem(s):\n one medium Hoodie"));
				}else if (shirt.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10)+("\n\nItem(s):\n one medium Shirt"));
				}else if (pants.isSelected()&&m.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(30)+("\n\nItem(s):\n one medium Jogger Pants"));
				}//medium-x2
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*2)+("\n\nItem(s):\n two medium Hoodie\n two medium Shirt\n two medium Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*2)+("\n\nItem(s):\n two medium Hoodie\n two medium Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*2)+("\n\nItem(s):\n two medium Hoodie\n two medium Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*2)+("\n\nItem(s):\n two medium Shirt\n two medium Jogger Pants"));
				}else if (hoodie.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*2)+("\n\nItem(s):\n two medium Hoodie"));
				}else if (shirt.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*2)+("\n\nItem(s):\n two medium Shirt"));
				}else if (pants.isSelected()&&m.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*2)+("\n\nItem(s):\n two medium Jogger Pants"));
				}//medium-x3
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*3)+("\n\nItem(s):\n three medium Hoodie\n three medium Shirt\n three medium Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*3)+("\n\nItem(s):\n three medium Hoodie\n three medium Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*3)+("\n\nItem(s):\n three medium Hoodie\n three medium Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*3)+("\n\nItem(s):\n three medium Shirt\n three medium Jogger Pants"));
				}else if (hoodie.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*3)+("\n\nItem(s):\n three medium Hoodie"));
				}else if (shirt.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*3)+("\n\nItem(s):\n three medium Shirt"));
				}else if (pants.isSelected()&&m.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*3)+("\n\nItem(s):\n three medium Jogger Pants"));
				}
				//large-x1
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10+30)+("\n\nItem(s):\n one large Hoodie\n one large Shirt\n one large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10)+("\n\nItem(s):\n one large Hoodie\n one large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+30)+("\n\nItem(s):\n one large Hoodie\n one large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10+30)+("\n\nItem(s):\n one large Shirt\n one large Jogger Pants"));
				}else if (hoodie.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20)+("\n\nItem(s):\n one large Hoodie"));
				}else if (shirt.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10)+("\n\nItem(s):\n one large Shirt"));
				}else if (pants.isSelected()&&l.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(30)+("\n\nItem(s):\n one large Jogger Pants"));
				}//large-x2
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*2)+("\n\nItem(s):\n two large Hoodie\n two large Shirt\n two large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*2)+("\n\nItem(s):\n two large Hoodie\n two large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*2)+("\n\nItem(s):\n two large Hoodie\n two large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*2)+("\n\nItem(s):\n two large Shirt\n two large Jogger Pants"));
				}else if (hoodie.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*2)+("\n\nItem(s):\n two large Hoodie"));
				}else if (shirt.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*2)+("\n\nItem(s):\n two large Shirt"));
				}else if (pants.isSelected()&&l.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*2)+("\n\nItem(s):\n two large Jogger Pants"));
				}//large-x3
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*3)+("\n\nItem(s):\n three large Hoodie\n three large Shirt\n three large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*3)+("\n\nItem(s):\n three large Hoodie\n three large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*3)+("\n\nItem(s):\n three large Hoodie\n three large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*3)+("\n\nItem(s):\n three large Shirt\n three large Jogger Pants"));
				}else if (hoodie.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*3)+("\n\nItem(s):\n three large Hoodie"));
				}else if (shirt.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*3)+("\n\nItem(s):\n three large Shirt"));
				}else if (pants.isSelected()&&l.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*3)+("\n\nItem(s):\n three large Jogger Pants"));
				}
				//extra large-x1
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10+30)+("\n\nItem(s):\n one extra large Hoodie\n one extra large Shirt\n one extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+10)+("\n\nItem(s):\n one extra large Hoodie\n one extra large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20+30)+("\n\nItem(s):\n one extra large Hoodie\n one extra large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10+30)+("\n\nItem(s):\n one extra large Shirt\n one extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(20)+("\n\nItem(s):\n one extra large Hoodie"));
				}else if (shirt.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(10)+("\n\nItem(s):\n one extra large Shirt"));
				}else if (pants.isSelected()&&xl.isSelected()&&one.isSelected()) {
					summary.setText("Your Total Bill is $"+(30)+("\n\nItem(s):\n one extra large Jogger Pants"));
				}//extra large-x2
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*2)+("\n\nItem(s):\n two extra large Hoodie\n two extra large Shirt\n two extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*2)+("\n\nItem(s):\n two extra large Hoodie\n two extra large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*2)+("\n\nItem(s):\n two extra large Hoodie\n two extra large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*2)+("\n\nItem(s):\n two extra large Shirt\n two extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*2)+("\n\nItem(s):\n two extra large Hoodie"));
				}else if (shirt.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*2)+("\n\nItem(s):\n two extra large Shirt"));
				}else if (pants.isSelected()&&xl.isSelected()&&two.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*2)+("\n\nItem(s):\n two extra large Jogger Pants"));
				}//extra large-x3
				else if (hoodie.isSelected()&&shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10+30)*3)+("\n\nItem(s):\n three extra large Hoodie\n three extra large Shirt\n three extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&shirt.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+10)*3)+("\n\nItem(s):\n three extra large Hoodie\n three extra large Shirt"));
				}else if (hoodie.isSelected()&&pants.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20+30)*3)+("\n\nItem(s):\n three extra large Hoodie\n three extra large Jogger Pants"));
				}else if (shirt.isSelected()&&pants.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10+30)*3)+("\n\nItem(s):\n three extra large Shirt\n three extra large Jogger Pants"));
				}else if (hoodie.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((20)*3)+("\n\nItem(s):\n three extra large Hoodie"));
				}else if (shirt.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((10)*3)+("\n\nItem(s):\n three extra large Shirt"));
				}else if (pants.isSelected()&&xl.isSelected()&&three.isSelected()) {
					summary.setText("Your Total Bill is $"+((30)*3)+("\n\nItem(s):\n three extra large Jogger Pants"));
				}
				else summary.setText("Kindly check your order properly.\n:)");
			}
		});
		order.setBounds(350, 277, 106, 37);
		contentPane.add(order);
		
		JButton out = new JButton("Check Out");
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out();
				JOptionPane.showMessageDialog(null, "The items has been paid :)\nThank You for purchasing and God Bless!!");
			}
		});
		out.setBounds(360, 325, 96, 23);
		contentPane.add(out);
		
	}
	private void out() {
		hoodie.setSelected(false);
		shirt.setSelected(false);
		pants.setSelected(false);
		buttonGroup.setSelected(null, false);
		buttonGroup_1.setSelected(null, false);
		summary.setText("");
	}
}
