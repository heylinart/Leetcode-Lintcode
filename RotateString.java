package lintcode;

/*
Q: Given a string and an offset, rotate string by offset.abstract.abstract
(rotate from left to right)
Example
Given "abcdefg".
offset=0 => "abcdefg"
offset=1 => "gabcdef"
offset=2 => "fgabcde"
offset=3 => "efgabcd"
*/
public class RotateString{
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
	public static void main(String[] args){
		char[] str = {'a','b','c','d','e','f','g'};
		int offset = 3;
		System.out.println(rotateString(str,offset));
		System.out.println(rotateString2(str,offset));
	}
	public static char[] rotateString(char[] str, int offset){
		//this is my first soultion for this question
		//create two char[], combination
		int length = str.length;
		char strrotate[] = new char[length];
		for(int i = 0;i<length;i++){
			if(length-offset+i < length){
				strrotate[i] = str[length-offset+i];
			}else{
				strrotate[i] = str[(length-offset+i)%(length)];
			}
		}
		return strrotate;
	}
	public static char[] rotateString2(char[] str, int offset){
		//this is my second solution, change the char[] to string type, then using substring to get the result
		String result = "";
		for(int i = 0;i<str.length;i++){
			result = result+str[i];
		}
		result = result.substring(str.length-offset, str.length)+result.substring(0, str.length-offset);
		char strrotate[] = new char[str.length];
		for(int i = 0;i<str.length;i++){
			strrotate[i] =result.charAt(i);
		}
		return strrotate;
		
	}
}