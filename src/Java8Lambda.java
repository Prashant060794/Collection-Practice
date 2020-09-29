
public class Java8Lambda {

	public static void main(String[]args){
		MathOperation add= (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		
		System.out.println(add.operation(4, 6));
		
		
	}
	
}
interface MathOperation{
	public int operation(int a,int b );
}
