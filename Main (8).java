import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Cursor;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBackground(SystemColor.textHighlight);
		setTitle("Copy and Paste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Before:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 31, 61, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField.setBorder(new LineBorder(Color.BLACK));
		textField.setBackground(Color.WHITE);
		textField.setDisabledTextColor(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(10, 56, 215, 279);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("After: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(235, 31, 61, 21);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(235, 56, 215, 279);
		contentPane.add(lblNewLabel_2);
		
		final JButton btnNewButton_1 = new JButton("Font Color");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				if(e.getSource()==btnNewButton_1){
					JColorChooser c = new JColorChooser();
					Color color = JColorChooser.showDialog(null, "Font Color", Color.black);
					lblNewLabel_2.setForeground(color);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(193, 362, 103, 45);
		contentPane.add(btnNewButton_1);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Bold");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(307, 361, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Italic");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		chckbxNewCheckBox_1.setBounds(307, 384, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("Paste");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				
				if(chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected()) {
					lblNewLabel_2.setText(text);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD+Font.ITALIC, 12));
				}else if (chckbxNewCheckBox.isSelected()) {
					lblNewLabel_2.setText(text);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				}else if (chckbxNewCheckBox_1.isSelected()) {
					lblNewLabel_2.setText(text);
					lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
				}else lblNewLabel_2.setText(text);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(332, 414, 118, 36);
		contentPane.add(btnNewButton);
		
	}
}
