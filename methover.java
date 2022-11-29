import java.util.*;
class methover {
    /*private static void display(int a, int b, int c){
        System.out.println("Arguments: " + (a+b+c));
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1, 6, 9);
        display(1, 4);
    }*/
	
	private static void display(int a){
		System.out.println("Is Integer");
	}
	
	private static void display(String b){
		System.out.println("Is String");
	}
	
	public static void main(String[] args) {
        display("hello");
        display(1);
    }
}