package head_first_java;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerButton {
JButton button;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerButton gui = new InnerButton();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("A");
		
		button.addActionListener(new ButtonListener());
		if (button.getText().equals("A") ) {
			button.setText("B");
		} else {
			button.setText("A");
			
		}
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}

}