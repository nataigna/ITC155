
public class ListClient2 {

	//test of isSort method 
	public static void main(String[] args) {
		LinkedIntList2 list=new LinkedIntList2();
		list.add(18);
		list.add(27);
		list.add(42);
		list.add(3);
		list.add(-1);
		System.out.println(list);
		System.out.println("Is this list sorted? "+ list.isSorted());
		
		
		LinkedIntList2 list1=new LinkedIntList2();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(12);
		System.out.println(list1);
		System.out.println("Is this list sorted? "+ list1.isSorted());
		
		
		LinkedIntList2 list2=new LinkedIntList2();
		System.out.println(list2);
		System.out.println("Is this list sorted? "+ list2.isSorted());
		
		
		
		
		//System.out.println(list);
		//System.out.println("Size "+ list.size());
		//System.out.println("Get "+ list.get(2));
		//list.add(7,77);
		//System.out.println(list);
		
		//list.remove(1);
		
		//System.out.println(list);
		//System.out.println("Size "+ list.size());
		//System.out.println("Get "+ list.get(2));
		
		
	}

}
