package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JButton jb1 = new JButton("Add Name");
	JButton jb2 = new JButton("View Names");
	JTextArea ja = new JTextArea(10, 20);
	ArrayList<String> list = new ArrayList<String>();

	public _02_GuestBook() {
		j.setVisible(true);
		j.add(jp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(ja);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		j.pack();
	}

	public static void main(String[] args) {
		_02_GuestBook g = new _02_GuestBook();
	}

	void viewNames() {

	}
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1) {
			String nombre = JOptionPane.showInputDialog("Enter name: ");
			list.add(nombre);
			System.out.println(list);
		}
		if (e.getSource() == jb2) {
			String allGuests = "";
			for (int i = 0; i < list.size(); i++) {
				String s = list.get(i);
				allGuests = allGuests + "Guest #" + i + " " + s + "\n";

				System.out.println("Guest # " + i + " " + s);
			}
			ja.setText(allGuests);
		}
	}

}
