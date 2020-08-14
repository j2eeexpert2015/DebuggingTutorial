package org.debugtutorial.demo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DebugRemote {
	public static void main(String args[]) throws InterruptedException 
	{
		final JFrame frame = new JFrame("Remote Debug Demo");
		JPanel panel = new JPanel();
		final JButton btn = new JButton("On");
		btn.setBackground(new Color(50, 200, 100));
		frame.getContentPane().add(panel);
		panel.add(btn);
		frame.setVisible(true);
		frame.pack();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ("On".equals(btn.getText())) {
					btn.setText("Off");
					System.out.println("Button state changed to OFF");
					btn.setBackground(Color.RED);
				} else {
					btn.setText("On");
					System.out.println("Button state changed to ON");
					btn.setBackground(Color.GREEN);
				}
			}
		});
	}
}