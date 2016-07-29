import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ArrList<Integer> arr = new ArrList<Integer>();
		for (int i = 0; i < 12; i++) {
			arr.add(i);
		}

		System.out.println(arr);
		
        arr.remove(11);
        
		System.out.println(arr);
		
		System.out.println(arr.contains(11));

	}
}
