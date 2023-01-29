package assignments;

public class DoWhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row,column;
		
		
		
		System.out.println("*********************Multiplication Table *****************");
		
		row =1;
		do {
			column=1;
			
			do {
				int mul = row*column;
				System.out.print(mul+"\t");
				
				column=column+1;
			}while(column<=10);
			
			System.out.println();
			row=row+1;
		}while(row<=10);

	}

}
