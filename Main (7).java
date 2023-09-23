import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

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
		setTitle("Text Pad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 11, 385, 248);
		contentPane.add(textArea);
		
		JButton count = new JButton("Count");
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
				String words[] = text.split("\\s");
				JOptionPane.showMessageDialog(null, "Characters: "+text.length()+"\n Words: "+words.length);
			}
		});
		count.setBounds(23, 297, 111, 42);
		contentPane.add(count);
		
		JButton pad = new JButton("Pad Color");
		pad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(null, "Choose Color", Color.WHITE);
				textArea.setBackground(color);
			}
		});
		pad.setBounds(160, 297, 111, 42);
		contentPane.add(pad);
		
		JButton font = new JButton("Font Color");
		font.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(null, "Choose Color", Color.BLACK);
				textArea.setForeground(color);
			}
		});
		font.setBounds(297, 297, 111, 42);
		contentPane.add(font);
	}
}
