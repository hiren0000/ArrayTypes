package simple.Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String list[] = {"Hiren", "Rucha", "Devmurari"};
	
		//	int list[] = {1,2,4,5,6};
		
		// normal for loop we can also get the specific value in this
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	
		
		System.out.println("");
		
		
		int num[] = {1,2,4,5,6};
		
		//here we can only get the whole Array all the time we can not get any particular value
		for(int n : num)
		{
			System.out.println(n);
		}
		
		System.out.println("");
		
		System.out.println("below example shows the additon operation of Array's elelment");
		
		System.out.println("");
		
		AdditionArrayEle ad = new AdditionArrayEle();
		ad.additionOfArEle();
		
	}
	
	

}
