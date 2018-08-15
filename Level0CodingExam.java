package leve1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level0CodingExam implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton BUTTON = new JButton();
	JButton Button = new JButton();
	JButton bUTTON = new JButton();
	public static void main(String[] args) {
	Level0CodingExam l = new Level0CodingExam();
}
Level0CodingExam(){
	frame.setVisible(true);
	frame.add(panel);
	button.setBackground(Color.YELLOW);
	button.setOpaque(true);
	button.addActionListener(this);
	panel.add(button);
	BUTTON.setBackground(Color.BLUE);
	BUTTON.setOpaque(true);
	BUTTON.addActionListener(this);
	panel.add(BUTTON);
	Button.setBackground(Color.RED);
	Button.setOpaque(true);
	Button.addActionListener(this);
	panel.add(Button);
	bUTTON.setBackground(Color.GREEN);
	bUTTON.setOpaque(true);
	bUTTON.addActionListener(this);
	panel.add(bUTTON);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
JButton buttonPressed = (JButton) arg0.getSource();
if (buttonPressed == button) {
	JOptionPane.showMessageDialog(null, "Yellow");
}
if (buttonPressed == BUTTON) {
	JOptionPane.showMessageDialog(null, "Blue");
}
if (buttonPressed == Button) {
	JOptionPane.showMessageDialog(null, "Red");
}
if (buttonPressed == bUTTON) {
	JOptionPane.showMessageDialog(null, "Green");
}
}
}
