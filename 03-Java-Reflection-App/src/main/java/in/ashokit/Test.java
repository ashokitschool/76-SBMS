package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("in.ashokit.User");

		Object obj = clz.getDeclaredConstructor().newInstance();
		
		User u = (User) obj;
		
		u.printAge(); // before setting age value
		
		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		field.set(u, 20);
		
		u.printAge();// after setting age value

	}

}
