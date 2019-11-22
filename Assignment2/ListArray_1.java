package Com.Omniwyse.Assignment2;

/**
 * . Write a program to create a list data structure with the following functions.
    a. void insert(list, int val)
    b. int find(list lst, int val)  //return -1 if val is not present in the list
    c. void delete(list lst, int val)
    d. int size(list lst)
    e. bool isempty(list lst)
    f. void displayList(list lst)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArray_1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);

		list.add(2, 75);
		int status = find(list, 33);
		if (status != -1) {
			System.out.println("Value found");
		} else {
			System.out.println("Value Not found");
		}

		delete(list, 3);
		int size = size(list);
		System.out.println("List size : " + size);
		if (isempty(list)) {
			System.out.println("List is empty ");
		} else
			System.out.println("List is not empty ");
		displayList(list);
	}

	static void insert(int positiion, int value) {
		System.out.println();
	}

	static int find(List<Integer> list, int val) {

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals(Integer.valueOf(val))) {
				return 1;
			}
		}
		return -1;
	}

	static void delete(List<Integer> list, int val) {

		if (list.size() > val) {
			Object value = list.remove(val);
			System.out.println("Deleted Element is :" + value);
			if (value != null) {
				System.out.println("list removed");
			} else {
				System.out.println("List not found to remove");
			}
		}
//else {
// System.out.println("Index value must be equal or less than list size");
//}
	}

	static int size(List<Integer> list) {
		int size = list.size();
		return size;
	}

	static boolean isempty(List<Integer> list) {

		int size = list.size();
		if (size != -1)
			return true;
		else
			return false;
	}

	static void displayList(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("List of the elements is : " +itr.next());
		}
	}
}