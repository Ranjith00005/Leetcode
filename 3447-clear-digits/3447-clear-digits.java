class Solution {
    public String clearDigits(String s) {
        StringBuilder sc = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isDigit(s.charAt(i))) {  
                if (sc.length() > 0) {
                    sc.deleteCharAt(sc.length() - 1); 
                }
            } else {
                sc.append(s.charAt(i));  
            }
        }
        
        return sc.toString();
    }
}
