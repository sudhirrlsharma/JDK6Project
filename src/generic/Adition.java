package generic;

import static enume.TestEnum.Grades.B;
import annotation.CopyWrite;
import enume.TestEnum.Grades;

@CopyWrite(someValue="Hi this is copy write")
public class Adition {
	public Number sum(Number a, Number b){
		Grades g = B;
		int xyz = new Integer(2);
		
		return (a.intValue() + b.intValue());
		
	}
	
	public Integer sum(int a, int b){
		return (a + b);
		
	}
	
	public Number sum(float a, float b){
		return a + b;
		
	}
	
	
	
	public static void main(String[] args) {
		Adition adition = new Adition();
		adition.sum(2.3, new Integer(3));
	}
	public void someMethod(Integer a){
		int b =0;
		int c= a+b;
		String someValue = "20.3";
		System.out.printf("The current value is   " +someValue);
		
	}

}
