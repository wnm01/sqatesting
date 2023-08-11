package login;

import java.util.Scanner;

public class NextPalindrome {
	  public static boolean isPalindrome(String str) {
	        int length = str.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static String getNextPalindrome(String input) {
	        long num = Long.parseLong(input);
	        
	        while (true) {
	            num++;
	            String strNum = Long.toString(num);
	            if (isPalindrome(strNum)) {
	                return strNum;
	            }
	        }
	    }

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();
        
        if (input.matches("-?\\d+")) { // Check if the input is a number
            String nextPalindrome = getNextPalindrome(input);
            System.out.println("Next palindrome number: " + nextPalindrome);
        } else {
            String nextPalindrome = getNextPalindrome(input);
            System.out.println("Next palindrome string: " + nextPalindrome);
        }
        
        scanner.close();
    }

	}


