package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame j = new JFrame("Log Search");
	JPanel jp = new JPanel();
	JButton jb = new JButton("Add Entry");
	JButton jb2 = new JButton("Search by ID");
	JButton jb3 = new JButton("View List");
	Integer ID;
	HashMap<Integer, String> crate = new HashMap<Integer, String>();

	public _02_LogSearch() {
		j.add(jp);
		jp.add(jb);
		jp.add(jb2);
		jp.add(jb3);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.pack();
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}

	public static void main(String[] args) {
		new _02_LogSearch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			String ID  = JOptionPane.showInputDialog("Enter an ID number below:");
			String name = JOptionPane.showInputDialog("Enter a name below:");
			crate.put(Integer.parseInt(ID), name);
		}
		if (e.getSource() == jb2) {
			JOptionPane.showInputDialog("Search for an existing ID number");
			
		}
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

}
