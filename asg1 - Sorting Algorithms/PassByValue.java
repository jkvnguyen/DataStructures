import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

	/**
	   This utility class contains three methods that add.

	   @author cbc
	*/
	public class PassByValue	{
	    /*
	      This private default constructor has been added so that
	      the public default constructor does not show up in the API.
	    */
	    private PassByValue() {}

	    /**
	       Increments an integer.  This specification has been left
	       vague on purpose.

	       @param a An integer.
	    */
	    public static void add(int a)
	    {
		a = a + 1;
	    }

	    /**
	       Adds a string.  This specification has been left
	       vague on purpose.

	       @param b A set of strings.
	    */
	    public static void add(Set<String> b)
	    {
	    	//b = new HashSet<String>();
	    	b.add("ABC");
	    	
	    	//System.out.println(b.toString());
	    }
		
	    /**
	       Adds an integer.  This specification has been left
	       vague on purpose.

	       @param c A list of integers.
	    */
	    public static void add(List<Integer> c)
	    {
		c.add(new Integer(1));
	   
	    }
	    
	    
	    
	    public static void main(String[] args){
	 
	    PrintStream output = System.out;
	    
	    int d = 1;
	    PassByValue.add(d);
	    output.println(d);
	    
	    Set<String> e = new HashSet<String>();
	    PassByValue.add(e);
	    output.println(e.toString());
	    
	    List<Integer> f = new ArrayList<Integer>();
	    PassByValue.add(f);
	    output.println(f.toString());
	    
	 
	   }
	    
	  }

	