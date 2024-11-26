package in.cdac.functionalinterface;

import java.util.function.Consumer;

public interface LambdaExpression {

	public static void main(String[] args) {
		// Define a consumer to print a string
				Consumer<String>printString = str -> System.out.println(str);
				
				// Use the Consumer to print a message
				printString.accept("Hi Welcome To Lambda Function");



	}
}


