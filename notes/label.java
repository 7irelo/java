package example;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main
{

	public static void main(String[] args)
	{
		ImageIcon image = new ImageIcon("naruto-6383641_200.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);

		JLabel label = new JLabel();
		label.setText("WHAT'S A KING TO A GOD");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0, 120, 120));
		label.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		label.setIconTextGap(40);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		// label.setBounds(0, 0, 300, 300);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(700, 700);
		// frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}
}