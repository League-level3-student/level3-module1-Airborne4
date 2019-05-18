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
	char[] guessedWord;
	String word2guess = Utilities.readRandomLineFromFile("dictionary.txt");
	int lives= 5;

	public HangMan() {
		j.add(jp);
		jp.add(jl);
		j.addKeyListener(this);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guessedWord = new char[word2guess.length()];
		for (int i = 0; i < word2guess.length(); i++) {
			guessedWord[i] = '_';

		}
		System.out.println(word2guess);
		System.out.println(guessedWord);
		jl.setText(new String(guessedWord));
		j.pack();
	}

	public static void main(String[] args) {
		String ques = JOptionPane.showInputDialog(null,
				"Let's play some Hangman! How many words do you want to guess?");
		System.out.println(ques);
		new HangMan();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
/*
 * 	else {
				lives --;
			}
			make sure to add this outside of the for loop
 */
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key press");
		char eu = e.getKeyChar();
		for (int i = 0; i < word2guess.length(); i++) {
			if (word2guess.charAt(i) == e.getKeyChar()) {
				guessedWord[i] = e.getKeyChar();
				if (new String(guessedWord).equals(word2guess)) {
					JOptionPane.showMessageDialog(null, "YOU WON!");
				}
			}
		}
		jl.setText(new String(guessedWord));
		System.out.println(lives);
		

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
