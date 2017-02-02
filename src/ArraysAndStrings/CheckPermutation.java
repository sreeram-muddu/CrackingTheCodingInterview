package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

	
	
	
	public static boolean checkpermutation(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		char[] sc1 = s1.toCharArray();
		char[] sc2 = s2.toCharArray();
		Arrays.sort(sc1);
		Arrays.sort(sc2);
		
		if(new String(sc1).equals(new String(sc2)))
			return true;
		
		return false;
	}
	
	public static boolean checkpermutation2(String s1, String s2)
	{
		
		if(s1.length() !=s2.length())
			return false;
		int[] letters = new int[256];
		int i,len = s1.length(),val;
		for(i=0;i<len;i++)
		{
			val = s1.charAt(i);
			letters[val]++;
		}
		for(i=0;i<len;i++)
		{
			val = s2.charAt(i);
			letters[val]--;
			if(letters[val]<0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc",s2="bca";
		System.out.println(" CHeck permutation of "+s1+" and "+s2+" is "+checkpermutation2(s1,s2));
		
	}

}
