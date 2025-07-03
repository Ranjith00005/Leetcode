bool isPalindrome(int x) {
    int rem,check,temp;
    temp=x;
    check=0;
    if(x<0 || x!=0 && x%10 ==0 ) return false;
    while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
    return (x==check || x==check/10);

}
