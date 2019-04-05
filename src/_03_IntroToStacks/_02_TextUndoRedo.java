package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame j = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();

	public _02_TextUndoRedo() {
		j.add(jp);
		jp.add(jl);
		j.pack();
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setVisible(true);
		j.addKeyListener(this);

	}

	public static void main(String[] args) {
	new _02_TextUndoRedo();	
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		jl.setText(e.getKeyChar()+"");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Create a JFrame with a JPanel and a JLabel Every time a key is pressed, add
	 * that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

}
