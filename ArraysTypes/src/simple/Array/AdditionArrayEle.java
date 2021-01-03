package simple.Array;

public class AdditionArrayEle 
{
	
	static void additionOfArEle()
	{
		
		    int list[] = {1,2,4,5,6};
		    int sum = 0;
		
		
			for(int i=0;i<list.length;i++)
			{
				sum = sum + list[i];
			}
			System.out.println("Addition of Array's Element : "+ sum);
		
			
			System.out.println("");
			
			
			int num[] = {1,2,4,5,6};
			int r = 0;
			
			
			for(int n : num)
			{
				r = r + n;
			}
			System.out.println("Addition of Array's Element : "+ r);
			
	}
	
}
