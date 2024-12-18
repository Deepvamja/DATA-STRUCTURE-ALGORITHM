import java.util.*; 
import java.io.*; 
public class InputStreamReaderDemo { 
  
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the file path: "); 
        String filename = s.nextLine(); 
        
        // Creating a File object 
        File file = new File(filename); 
        try { 
            // Creating an InputStream object 
            InputStream is = new FileInputStream(file); 
            
            // creating an InputStreamReader object 
            InputStreamReader isr = new InputStreamReader(is); 
            
            // Creating a character array 
            char charArray[] = new char[(int)file.length()]; 
            
            // Reading the contents of the reader 
            isr.read(charArray); 
            
            // Converting character array to a String 
            String contents = new String(charArray); 
            System.out.println(contents); 
        } 
        catch (IOException e) { 
            System.out.println(e); 
        } 
    } 
}