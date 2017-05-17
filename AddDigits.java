package lintcode;
public class AddDigits {
    /**
     * @param num a non-negative integer
     * @return one digit
     */
	public static void main(String[] args){
		int num = 49458;
		System.out.println("result = " +addDigits(num));
	}
    public static int addDigits(int num) {
        // Write your code here
    	while(num >=10){
    		num = getNext(num);
    	}
    	return num;
    }
    public static int getNext(int num){
    	String cur = String.valueOf(num);
    	int sum = 0;
    	for(int i = 0;i<cur.length();i++){
    		System.out.println(cur.charAt(i));
    		sum += (int)(cur.charAt(i)-'0');
    		System.out.println("i= " + i+"sum=" + sum);
    	}
    	return sum;
    }
}
