class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            char a=columnTitle.charAt(i);
            int num = a - 'A' + 1;
            res=res*26+num;
        }
        return res;
    }
}