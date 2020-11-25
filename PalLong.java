import java.util.Scanner;
class PalLong{
	public static void main(String[] args) {
		String str = "wpwasdfgasdfghgfdsagfdsaojd";
		String pal = "";
		String pal1 = "";
		String longPal ="";
		String longPal1 ="";
		int nxt;
		int max = 0;
		
		for(int i =0 ; i < str.length()-2; i++){  /// odd palindrome
			nxt= i+2;
			pal1= "" +str.charAt(i+1);
			pal1 = isPalindrome1(str, i, nxt, pal1);
			if(max<=pal1.length()){
				max = pal1.length();
				longPal1 = pal1;
			}
			//System.out.println(longPal);
			pal1 = "";
		} 
	longPal	=longPal.length()>longPal1.length()?longPal:longPal1;
	System.out.println(longPal);
	    
	}

	/// Even Palindrome
	public static String isPalindrome(String str, int start, int end, String pal){
    	if(start == 0 || end == str.length())
    	    return str.charAt(start) + "" + pal + str.charAt(end);
    	else if (str.charAt(start) == str.charAt(end)) {
    		pal = str.charAt(start) + "" + pal + str.charAt(end);
    		return isPalindrome(str, start-1, end+1, pal);
    	}
     	 else return pal;
	}
	/// Odd Palindrome
	public static String isPalindrome1(String str, int start, int end, String pal){
    	if(start == 0 || end == str.length())
    	    return str.charAt(start) + "" + pal + str.charAt(end);
    	else if (str.charAt(start) == str.charAt(end)) {
    		pal = str.charAt(start) + "" + pal + str.charAt(end);
    		return isPalindrome(str, start-1, end+1, pal);
    	}
     	 else return pal;
	}

}
