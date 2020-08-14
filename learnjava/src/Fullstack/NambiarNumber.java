package Fullstack;

public class NambiarNumber {

		static String nambiarNumber(String str, int i) 
	    { 
	  
	        if (i >= str.length()) 
	            return ""; 
	  
	   
	        int firstDigit = (str.charAt(i) - '0'); 
	  
	 
	        int digitParity = firstDigit % 2; 
	  
	       
	        int sumDigits = 0; 
	  
	        
	        while (i < str.length()) { 
	  
	         
	            sumDigits += (str.charAt(i) - '0'); 
	            int sumParity = sumDigits % 2; 
	  
	          
	            if (digitParity != sumParity) { 
	                break; 
	            } 
	            i++; 
	        } 
	  
	        
	        return ("" + sumDigits + nambiarNumber(str, i + 1)); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String str = "8816051619"; 
	        System.out.println(nambiarNumber(str, 0)); 
	    } 
	} 
	

