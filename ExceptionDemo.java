package assignments;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lang = {"C","C++","JAVA","PYTHON","PERL"};
		
		try {
			
			for(int i =0;i<=5;i++) {
				System.out.println(lang[i]);
			}
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
