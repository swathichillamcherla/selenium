package mavendemo;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
		
	}public Constructor(int s) {
		// TODO Auto-generated constructor stub
		
	}
	public Constructor(int a,String s) {
		// TODO Auto-generated constructor stub
		System.out.println("overland constr2, two para constructor"+a +s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj  = new Constructor();//default constructor
		Constructor obj1 = new Constructor(3);
		Constructor obj2 = new Constructor(3,"Agama");
		//lets comment 2 and 3rd constructor.you will get warning for line 18 in 19 but not for 17
		
		

	}

}
