

public class Client {
    public static void main(String[] args) {
        // construct and print list
       // int[] data = {5, 19, 0, 2, 4, 0, 13, 85, -8, 0, 23};
    	  int[] data = {11,-7, 3, 42, 3, 0, 14, 3};
        ArrayIntList list = new ArrayIntList();
        for (int n : data) {
            list.add(n);
        }
        System.out.println("list = " + list);
        
        //calling replaceAll (Assignment 8)
        list.replaceAll(3, 999);
        
        
        // printing new list with replaced values
        System.out.println("new list= " +list);
        
        
        
        
        // obtain an iterator to find the product of the list, removing zeros
        //ArrayIntListIterator i = list.iterator();       
        //int product = 1;
       // while (i.hasNext()) {
          //int n = i.next();
            //if (n == 0) {
                //i.remove();
            //} else {
               // product *= n;
            //}
       // }
        //System.out.println("list now = " + list);
        //System.out.println("product = " + product);
    }
}




