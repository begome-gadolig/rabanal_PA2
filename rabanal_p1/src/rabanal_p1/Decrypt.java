package rabanal_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number to decrypt:");
		String data = in.nextLine();
		in.close();
		int[] digits = new int[data.length()];
		
		for (int i = 0; i < digits.length; i++) {
			digits[i] = Integer.parseInt(Character.toString(data.charAt(i)));
			digits[i] = (digits[i] + 3) % 10;
		}
		
		for (int i = 0; i < digits.length - 2; i++) {
			int temp = digits[i];
			digits[i] = digits[i + 2];
			digits[i + 2] = temp;
		}
		
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
		System.out.println();
	}

}
