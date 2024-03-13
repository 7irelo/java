package example;

public class Main
{

	public static void main(String[] args)
	{
		new MyFrame();
	}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener
{
    JButton button;

    MyFrame()
    {
        ImageIcon icon = new ImageIcon("naruto-6383641_con.png");

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("Eric"));
        button.setText("BUTTON");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Bahnschrift", Font.BOLD , 15));
        button.setIconTextGap(0);
        button.setForeground(new Color(0, 120, 120));
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            System.out.println("Eric");
            button.setEnabled(false);
        }
    }
}