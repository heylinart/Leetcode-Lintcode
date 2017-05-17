package lintcode;

public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
    int width;
    int height;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
     public Rectangle(int width, int height){
       this.width = width;
       this.height = height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return width * height;
    }
    public static void main(String[] arsg){
    	Rectangle rec = new Rectangle(3, 4);
    	int result = rec.getArea(); // should get 12
    	System.out.println(result);
    }
}