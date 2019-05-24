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
	JLabel jl2 = new JLabel();
	char[] guessedWord;
	String word2guess;
	int lives;
	static int track;
	boolean match = false;
	static String ques;

	void restart() {
		word2guess = Utilities.readRandomLineFromFile("dictionary.txt");
		guessedWord = new char[word2guess.length()];
		for (int i = 0; i < word2guess.length(); i++) {
			guessedWord[i] = '_';
		}
		System.out.println(word2guess);
		System.out.println(guessedWord);
		jl.setText(new String(guessedWord));
		lives = 10;
	}

	public HangMan() {
		j.add(jp);
		jp.add(jl);
		jp.add(jl2);
		j.addKeyListener(this);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		restart();

		j.pack();

	}

	public static void main(String[] args) {
		ques = JOptionPane.showInputDialog(null, "Let's play some Hangman! How many words do you want to guess?");
		System.out.println(ques);
		track = Integer.parseInt(ques);
		new HangMan();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * else { lives --; } make sure to add this outside of the for loop
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key press");
		char eu = e.getKeyChar();
		match = false;
		for (int i = 0; i < word2guess.length(); i++) {
			if (word2guess.charAt(i) == e.getKeyChar()) {
				guessedWord[i] = e.getKeyChar();
				match = true;

			}
		}
		if (!match) {
			lives--;
			System.out.println(lives);
			jl2.setText("" + lives);
			j.pack();
		}
		jl.setText(new String(guessedWord));
		System.out.println(lives);
		if (lives == 0) {
			System.exit(0);
		}
		if (new String(guessedWord).equals(word2guess)) {
			JOptionPane.showMessageDialog(null, "YOU WON!");
			track--;
			System.out.println(track);
			restart();
		}
		if (track <= 0) {
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
