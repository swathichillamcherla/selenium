package mavendemo;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			
		// TODO Auto-generated method stub
			String s = "#############Testing!#!!$!!!$";
			String s1= "$$$$$$$$$$selenium!!!!!!!!!!";
			
			//Regular Expression:[^a-zA-Z0-9]
			
			s=s.replaceAll ("[^a-zA-Z0-9]"," ");
			System.out.println(s);
			
			s1=s1.replaceAll ("[^a-zA-Z0-9]"," ");
			System.out.println(s1);


	}

}
