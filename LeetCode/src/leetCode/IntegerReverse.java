package leetCode;

public class IntegerReverse {
    public static int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x==0) return 0;
        int re = 0;
 
        if (x>0){
            while(x!=0){
                re = x%10+re*10;
                x = x/10;
            }
            if(re < 0) throw new IllegalArgumentException("Overflow"); 
        }
        else if(x<0){
            while(x!=0){
                re = x%10+re*10;
                x = x/10;
            }
            if(re > 0) throw new IllegalArgumentException("Overflow"); 
        }
        return re;
    }
    
}