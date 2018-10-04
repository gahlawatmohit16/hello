import java.util.*; 
class sets{
    
    public static void main(String[] args)
    {
        
        Set <Integer> s1 = new HashSet<Integer>();
        Set <Integer> s2 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(new Integer[] {1,3,5,7,9}));
        s2.addAll(Arrays.asList(new Integer[] {1,4,6,5,10}));
        Set <Integer> s3 = new HashSet<Integer>(s1);
        s3.retainAll(s2);
        System.out.println(s3);
        
    }
}