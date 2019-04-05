package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import org.junit.runners.parameterized.ParametersRunnerFactory;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> dubs = new Stack<Double>();
		Random ran = new Random();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
	    for (int i = 0; i < 101; i++) {
			dubs.add(ran.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String num1 = JOptionPane.showInputDialog("Please enter a number between 0 to 100");
		String num2 = JOptionPane.showInputDialog("Please enter a bigger number between " + num1 + " to 100");
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		Double number1 = Double.parseDouble(num1);
		Double number2 = Double.parseDouble(num2);
		System.out.println("NUM 1: " + number1);
		System.out.println("NUM 2: " + number2);
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		while(!dubs.isEmpty()) {
			Double d = dubs.pop();
			if (d>number1 && d<number2) {
				System.out.println(d);
			}
		}
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
