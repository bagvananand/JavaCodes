import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class suplcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = new Supplier<String>()
		{

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Streaming Data";
			}
			
		};
		
		Consumer<String> consumer = new Consumer<String>()
		{

			@Override
			public void accept(String str) {
				System.out.println("Printing " + str);
			}
			
		};
		
		Stream<String> streamOfStrings = Stream.generate(supplier);
		streamOfStrings.forEach(consumer);

	}

}
