class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        int n = str.length();
        for(int i =0; i<n/2; i++){
            if(str.charAt(n-i-1) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
