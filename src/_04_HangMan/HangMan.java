package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	String guessedWord = "";
	String word2guess = Utilities.readRandomLineFromFile("dictionary.txt");

	public HangMan() {
		j.add(jp);
		jp.add(jl);
		jl.addKeyListener(this);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < word2guess.length(); i++) {
			guessedWord += "_";

		}
		System.out.println(word2guess);
		System.out.println(guessedWord);
		j.pack();
	}

	public static void main(String[] args) {
		new HangMan();
		String ques = JOptionPane.showInputDialog(null,
				"Let's play some Hangman! How many words do you want to guess?");
		System.out.println(ques);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		char eu = e.getKeyChar();
		for (int i = 0; i < word2guess.length(); i++) {
			if (word2guess.charAt(i) == e.getKeyChar()) {
			
			}
		}
		jl.setText(guessedWord);
		j.pack();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
