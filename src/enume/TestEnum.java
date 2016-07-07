package enume;

import java.util.ArrayList;

public class TestEnum {
	public enum Grades {
		A(1) {
			@Override
			public void doSomthing(Object ob) {
//				action="Average";
				
			}
		}, B(2) {
			@Override
			public void doSomthing(Object ob) {
//				action="Average";
				
			}
		}, C(2) {
			@Override
			public void doSomthing(Object ob) {
//				assessment="Good";
				
			}
		}, D(3) {
			@Override
			public void doSomthing(Object ob) {
//				assessment="Not bad!";
				
			}
			@Override
			public void doSomthing2(Object ob) {
				// TODO Auto-generated method stub
				super.doSomthing2(ob);
			}
		}, F(3) {
			@Override
			public void doSomthing(Object ob) {
//				assessment="Excellent!";
				
			}
		}; // integer values are passed to
										// constructor

		private  int assessment;
		public int getAssessment() {
			return assessment;
		}
		private String action;
		

		Grades(int value) {
			this.assessment= value;
		}
			
//		}
		public  abstract void doSomthing(Object ob);
		
		public   void doSomthing2(Object ob){
			
		};
		public static Grades getGread(int value){
			Grades grade=null;
			Grades[] grads =Grades.values();
			for(Grades g :grads ){
				if(g.getAssessment()==value)
					grade=g;
				
			}
			return grade;
		}
		
		
	}
	
private void mail() {
	
	Grades grades = Grades.getGread(2);
	grades.doSomthing(null);

	
}

}
