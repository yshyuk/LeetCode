class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
		 
	     String reverse = "";
	    
	     for(int i=num.length()-1;i>=0;i--) {
	    	 reverse = reverse+num.charAt(i);
	     }
	     
	     if(num.equals(reverse)) {
	    	 return true;
	     }
	     else return false;
    }
    
}