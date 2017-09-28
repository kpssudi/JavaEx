package const_test;

public class apples {

	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		tuna tunaObject1 = new tuna(11);
		tuna tunaObject2 = new tuna(11, 35);
		tuna tunaObject3 = new tuna(11, 35, 40);
		
		System.out.printf("%s\n", tunaObject.toMilitary());
		System.out.printf("%s\n", tunaObject1.toMilitary());
		System.out.printf("%s\n", tunaObject2.toMilitary());
		System.out.printf("%s\n", tunaObject3.toMilitary());

	}

}
