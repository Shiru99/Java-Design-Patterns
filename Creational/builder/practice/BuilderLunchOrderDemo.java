package Creational.builder.practice;

public class BuilderLunchOrderDemo {

	public static void main(String args[]) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder
			.bread("Wheat")
			.dressing("Mayo")
			.meat("Turkey");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder);	
	}
}
