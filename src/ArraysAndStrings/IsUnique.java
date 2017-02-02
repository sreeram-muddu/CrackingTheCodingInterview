package ArraysAndStrings;

import java.util.HashSet;

public class IsUnique {

	
	public static boolean isUnique(String  s)
	{
		boolean[] characters = new boolean[256];
		int len = s.length();
		int i,val;
		for(i=0;i<len;i++)
		{
			val = s.charAt(i);
			if(characters[val])
				return false;
			characters[val]= true;
		}
		
		return true;
	}
	
	public static boolean isUnique2(String s)
	{
		
		HashSet<Character> set = new HashSet();
	    int i=0,len=s.length();
	    for(;i<len;i++)
	    {
	    	if(set.contains(s.charAt(i)))
	    	{
	    		return false;
	    	}
	    	
	    	set.add(s.charAt(i));
	    	
	    }
	    return true;
	    
	}
	
	
	
	public static void main(String args[])
	{
		
		String s = "sreeam";
		System.out.println(" The string "+s+" is unique? "+isUnique(s));
		System.out.println(" The string "+s+" is unique? "+isUnique2(s));

	}
}
