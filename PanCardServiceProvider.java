package cyber.demos.functionalProgramming;
@FunctionalInterface
public interface PanCardServiceProvider {
	
	//ABCDE2345Q
	//public boolean validatePanNumber(String panNumber);
	//int add(int a, int b);
	void show1();
	default void show() {
		
	}

}
