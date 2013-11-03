package chapter1;
/**
 *  Reverse C-Style String
 *  C-Style String has a '\0' char at the end
 * @author LinyuDong
 *
 */
public class ReverseString {
    public void reverse(char[] str){
    	int length = str.length;
        int head = 0;
        int tail = length -2;
    	while(head < tail){
    		char tmp = str[head];
    		str[head] = str[tail];
    		str[tail] = tmp;
    		head++;
    		tail--;
    	}
    	
    }
}
