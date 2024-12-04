import java.util.*; 

public class rev { 


    public static void main(String[] args) 
    { 

        List<String> mylist = new ArrayList<String>(); 


        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("learn"); 
        mylist.add("enjoy"); 


        System.out.println("Original List : " + mylist); 

        Collections.reverse(mylist); 

        // using reverse() method 
        System.out.println("Modified List: " + mylist); 
    } 