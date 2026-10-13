class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        String revere=new StringBuilder(s).reverse().toString();

        return s.equals(revere);
        
    }
}
