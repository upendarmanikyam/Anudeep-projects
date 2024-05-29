package javafullstack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  String a="java";
	        String rev="";
	        for(int i=a.length()-1;i>=0;i--)
	        {
	            rev=rev+a.charAt(i);
	        }
	        System.out.print("reverse of string:"+rev);
	}

}
