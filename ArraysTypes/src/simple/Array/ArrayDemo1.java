package simple.Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String list[] = {"Hiren", "Rucha", "Devmurari"};
      
		// normal for loop we can also get the specific value in this
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	
		System.out.println("");
        
		
		int num[] = {2,4,5,4};
		
		//here we can only get the whole Array all the time we can not get any particular value
		for(int n : num)
		{
			System.out.println(n);
		}
	}
	
	

}
