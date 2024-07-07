// LEETCODE PROBLEM NUMBER- 9
public class Palindrome {
//logic starts
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastdigit=x%10;
            rev=(rev*10)+lastdigit;
            x=x/10;
        }
        return (rev==temp);
    }
    //logic ends
    public static void main(String[] args) {        //not needed in solving a problem in leetcode.
        Palindrome obj=new Palindrome();
        System.out.println(obj.isPalindrome(11211));

}
}