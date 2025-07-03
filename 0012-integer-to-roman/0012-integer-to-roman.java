class Solution {
    public String intToRoman(int num) {
        
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"I");
        m.put(4,"IV");
        m.put(5,"V");
        m.put(9,"IX");
        m.put(10,"X");
        m.put(40,"XL");
        m.put(50,"L");
        m.put(90,"XC");
        m.put(100,"C");
        m.put(400,"CD");
        m.put(500,"D");
        m.put(900,"CM");
        m.put(1000,"M");
        String str=new String();
        int[] n={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<n.length;i++){
            if(num>=n[i]){
                int q=num/n[i];
                num = num%n[i];
                for(int j=0;j<q;j++){
                    str+= m.get (n[i]);

                }
            }
            }    return str;
        
    }
}

