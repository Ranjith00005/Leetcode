class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        int n=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                n=((s.charAt(i-2)-'0')*10)+(s.charAt(i-1)-'0');
                i-=2;
            }
            else{
                n=(s.charAt(i)-'0');
            }
                res.append((char)(n+96));
            }
            return res.reverse().toString();

        }
    }
