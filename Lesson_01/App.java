public class Main {
	public static void main(String[] agrs) {
		System.out.print(isGoodApartment(91, "Queens Street")); // => false
    	System.out.print(isGoodApartment(78, "Queens Street")); // => false
    	System.out.print(isGoodApartment(70, "Main Street")); // => false

    	System.out.print(isGoodApartment(120, "Queens Street")); // => true
    	System.out.print(isGoodApartment(120, "Main Street")); // => true
    	System.out.print(isGoodApartment(80, "Main Street")); // => true  
 	}

	public static boolean isGoodApartment(String area, String street) {
		return area >= 100 || (area >= 80 && "Main Street".equals(street));
	}
}
