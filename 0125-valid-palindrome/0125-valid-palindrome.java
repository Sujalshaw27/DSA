class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int i =0;
        int n = s.length();
        int j = s.length()-1;
        
        for(i = 0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
            
        }
        return true;     
    }
}