package head_first_java;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import head_first_java.InnerButton;

//JButton b2 = ButtonListener.button;
public class ButtonListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		AbstractButton button = null;
		if (button.getText().equals("A") ) {
			button.setText("B");
		} else {
			button.setText("A");
			
		}
	}

}