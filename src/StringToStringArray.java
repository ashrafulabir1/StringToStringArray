
public class StringToStringArray {

	public static void main(String[] args) {
		String name = "A,B,C";
		String nameArray[] = name.split(",");
		System.out.println("Array Size="+nameArray.length);
		if(name.contains("B")) {
			System.out.println("B is available");
			}
	}

}
