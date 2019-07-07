package _01_Custom_ArrayList;


@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	Object[] arr;
	
	public ArrayList() {
		arr = new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (T) arr[loc];
	}
	
	public int size() {
		return arr.length;
	}
	
	public void add(T val) {
		Object[] newArr = new Object[arr.length+1];
		newArr[newArr.length-1] = val;
		for(int j = 0; j < newArr.length-1; j++) {
			newArr[j] = arr[j];
		}
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object[] newArr = new Object[arr.length+1];
		newArr[loc] = val;
		for(int i = 0; i < loc; i++) {
			newArr[i] = arr[i];
		}
		for(int j = loc+1; j < newArr.length; j++) {
			newArr[j] = arr[j-1];
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object[] newArr = new Object[arr.length-1];
		for(int i = 0; i < loc; i++) {
			newArr[i] = arr[i];
		}
		for(int j = loc+1; j < newArr.length; j++) {
			newArr[j] = arr[j+1];
		}
	}
	
	public boolean contains(T val) {
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == val) {
				return true;
			}
		}
		
		return false;
	}
}