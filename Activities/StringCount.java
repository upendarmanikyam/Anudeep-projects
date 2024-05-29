package javafullstack;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String input = "THALA FOR A REASON"; 
		        int[] count = new int[111]; 

		        for (char ch : input.toCharArray()) {
		            count[ch]++;
		        }

		        System.out.println("Character occurrences:");
		        for (char ch = 0; ch < count.length; ch++) {
		            if (count[ch] > 0) {
		                System.out.println(ch + " appears " + count[ch] + " times");
		            }
		        }
		    }
		

	}


