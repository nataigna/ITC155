
public class Assignment5 {

	public static void main(String[] args) {
		
   //test method
		
    writeNums(5);
    System.out.println();

    writeNums(12);
    System.out.println();
    
    writeNums(-1);
    System.out.println();
	}
	
	
    public static void writeNums (int x) {
    	//base case
    	if (x==1) {
    	System.out.print(1);
    	//recursive case
    	} else if (x>1) {
    		writeNums (x-1);
    		
    		System.out.print(", "+ x);
    		
    	} else if (x<1) {
    		
    		throw new IllegalArgumentException("illegal argument");
    	}
    	
    }
}
