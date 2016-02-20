package opencode.java8features.lambdas;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import javax.swing.JButton;

public class LambdaTest {

	public static void main(String[] args) {
		
		//interface with only one method
		Bank bank = (b) ->   b * 1.11;
		
		System.out.println(bank.convertAmountFromEuroToDollar(10));
		
		//Call backs 
		JButton button = new JButton();
		button.addActionListener(
				
				(e) -> {System.out.println("Action performed");
				
				 });
		
		
		//Streams
		List<String> cars = Arrays.asList("Mercedes","Volvo","Volswagen","Audi","Peugeot");
		cars.stream().
		filter(c -> c.startsWith("V"))
		.forEach(c -> System.out.println(c));
		
		//Passing methods as arguments 
		BiFunction<String, String, Boolean> checkAnagram = (e1, e2) -> {	
		e1.toLowerCase(); e2.toLowerCase();
		char[] e1Chars = e1.toCharArray(); char[] e2Chars = e2.toCharArray(); 
		Arrays.sort(e1Chars);
		Arrays.sort(e2Chars);
		return String.valueOf(e1Chars).equals(String.valueOf(e2Chars));};
		
		Function<String, Boolean> checkPalindrome = (p) -> { 
			char[] toChar = p.toCharArray();
			CharBuffer buffer = CharBuffer.allocate(toChar.length);
			for(int i = toChar.length - 1; i >= 0; i--)
				 buffer.put(toChar[i]);
			
		    return p.equals(String.valueOf(buffer.array()));	
		};
		
		System.out.println(checkAnagram.apply("test", "estt"));
		System.out.println(checkPalindrome.apply("rotator"));
		
	}
	
	
	public interface Bank {
		double convertAmountFromEuroToDollar(double amount);
	}
	

}
