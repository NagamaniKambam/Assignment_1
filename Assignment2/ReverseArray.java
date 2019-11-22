package Com.Omniwyse.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseList(List<Integer> list)
    {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	for (int i = list.size() - 1; i >= 0; i--) 
    	{
			array.add(list.get(i));
		}
		return array;
    	
    }
}
