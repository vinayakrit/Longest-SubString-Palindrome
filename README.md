# Longest-SubString-Palindrome

This algorithm take __*nlogn*__ _time-complexity_

There are multiple algorithm available for calculating _longest_ _SubString_ _Palindrome_. _Manacher's_ Algorithm is known fastest one which takes __*n*__ _time-complexity_, However practically above _PalLong.java_ faster if we check comparison based

  
  >For string _wpwasdfgasdfghgfdsagfdsaojd_ :

> _Manacher's_ Algorithm takes _165_ operational process and takes _33290826ns_ 

> While _PalLong_ Algorithm which written by me takes _60_ operational process and takes _68423368ns_ 

## PalLong Alogorithm Working : 

Logic behind the Algorithm is to check palindrome string for given position 

 ```java 
for(int i =0 ; i < str.length()-2; i++){  
		pal1= "" +str.charAt(i+1);
		pal1 = isPalindrome(str, i, nxt, pal1, cnt);
		if(max<=pal1.length()){
			max = pal1.length();
			longPal1 = pal1;
		}
		pal1 = "";
	} 
	```
   

Recursively checking longest possible palindrome for given string

```java
    public static String isPalindrome(String str, int start, int end, String pal){
    	 if(start == 0 || end == str.length())
    	    return str.charAt(start) + "" + pal + str.charAt(end);
    	else if (str.charAt(start) == str.charAt(end)) {
    		pal = str.charAt(start) + "" + pal + str.charAt(end);
    		return isPalindrome(str, start-1, end+1, pal);
    	}
     	 else return pal;
	}
	```
