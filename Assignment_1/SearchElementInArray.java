package Com.Omniwyse.Assignment_1;

public class SearchElementInArray {
	public static boolean searchArray(int element)
	{
	int i;
	int array[] = {7,3,9,13,2,5};
	for(i=0; i<array.length; i++)
	{
	  if (array[i] == element)
	  {
	  return true;
	  }
	}
	return false;
	}
}
