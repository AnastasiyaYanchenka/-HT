import java.io.IOException;

public class ArrList<Type> {
	private Object[] arr;
	private int count;

	public ArrList() {
		count = 0;
		arr = new Object[10];
	}

	public void add(Type element) {
		if (count < arr.length) {
			arr[count] = element;
			count++;
		} else {
			Object[] arr1 = new Object[arr.length + 10];
			System.arraycopy(arr, 0, arr1, 0, arr.length);
			arr1[count] = (Object) element;
			arr = arr1;
			count++;
		}
	}

	/*
	 * public void remove(int index) throws IOException{ Object[] arr1=new
	 * Object[arr.length-1]; if(index<count){
	 * System.arraycopy(arr,0,arr1,0,index-1);
	 * System.arraycopy(arr,index,arr1,index-1,arr.length-index-1);
	 * 
	 * arr=arr1; count--; } else{ throw new IOException ("Excepthion"); }
	 * 
	 * }
	 */
	public void remove(Type obj) {
		Object[] arr1 = new Object[arr.length - 1];
		for (int i = 0; i < count; i++) {
			if (arr[i].equals(obj)) {
				System.out.println(arr[i].equals(obj));
				System.arraycopy(arr, 0, arr1, 0, i);
				if (i < count - 1) {
					System.arraycopy(arr, i + 1, arr1, i, count - i);
				}

			}
		}
		count--;
		arr = arr1;

	}

	public boolean contains(Type obj) {
		for (int i = 0; i < count; i++) {
			if (arr[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += arr[i];
		}
		return str;
	}

}
