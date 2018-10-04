import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
       
        HashMap <String,Integer> m = new HashMap<String,Integer>(n);
       
        m.put("a", 95); 
        m.put("b", 123); 
        m.put("c", 34); 
        m.put("d", 54);
        
        Set<Map.Entry<String , Integer> e = m.entrySet();
        for(Map.Entry<String , Integer> ee : e)
        {
            System.out.println(ee.getKey() + "=" + ee.getValue());
        }
        
    }
}
