package Creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypeEverydayDemo {

	public static void main(String args[]) {

		String sql = "select * from movies where title = ?";

		List<String> parameters = new ArrayList<>(
				Arrays.asList("The Shawshank Redemption")
		);

		Statement firstStatement = new Statement(sql, parameters);
		System.out.println(firstStatement);

		Statement secondStatement = firstStatement.clone();
		System.out.println(secondStatement);

	}
}