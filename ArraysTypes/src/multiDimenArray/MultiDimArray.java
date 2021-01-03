package multiDimenArray;

public class MultiDimArray {

	public static void main(String[] args) {
	
/*		int x[] = {1,2,3,4,5};
		int y[] = {5,6,8,9,7};
		int z[] = {6,8,9,4,7}; */

//instead of creating separate arrays we can create multiDimensional array
		int xyz[][] = { 
				         {1,2,3,4,5},
						 {5,6,8,9,7},
						 {6,8,9,4,7}		
				
		              };
		
   // this is the use of normal for loop 		
		
		for(int i=0;i<xyz.length;i++) // here i stands for rows or for separate array
		{
			for(int j=0;j<5;j++) // j stand for column
			{
			   System.out.print(xyz[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
   
	// We can also use the Enhanced for loop
		
		for(int k[] : xyz)
		{
			for(int j : k)
			{
			    System.out.print(j + " ");
			}
			System.out.println("");
		}
		
	}

}
