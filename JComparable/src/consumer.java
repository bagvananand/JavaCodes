import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class consumer {
	static {
		System.out.println("I will do my work, what ever happens");
	}
	public static void main(String[] args)
	{
		Map<Integer, String> nCity=new HashMap<Integer, String>();
		nCity.put(1, "Chicago");
		nCity.put(2, "Seattle");
		nCity.put(3, "New Orleans");
		nCity.put(4, "Dallas");
		nCity.put(4, "Houston");
		
		//nCity.entrySet().stream().map(x->x.getValue()).forEach(System.out::println);
		//nCity.keySet().stream().map(x->x).forEach(System.out::println);
		

		Consumer<String> caps = (name) -> System.out.println(name.toUpperCase());	
		
		//nCity.keySet().stream().map(x -> x.intValue()).forEach(System.out::println);
		
		//nCity.values().stream().map(x -> x.toLowerCase()).forEach(System.out::println);
		
		
		//List<String> sCities = nCity.entrySet().stream().map(a->a.getValue()).collect(Collectors.toList());
		nCity.entrySet().stream().map(a->a.getValue()).collect(Collectors.toList());
		nCity.entrySet().stream().map(a->a.getValue()).sorted().forEach(caps);
		//sCities.stream().forEach(caps);
		//sCities.stream().sorted().forEach(System.out::println);
		
		/*Integer sumResult = Stream.of(3,4,5,6).reduce(1,(a,b)->(a+b));
		System.out.println(sumResult);
		
		List<Integer> intValues = Arrays.asList(34,5,63,23,65,34,87);
		System.out.println(intValues.stream().reduce(Integer::min).get());
		
		System.out.println(intValues.stream().reduce((a,b)->a<b?a:b).get());
		
		System.out.println(nCity.entrySet().stream().map(a->a.getValue()).reduce((a,b)->a.length()>b.length()?a:b).get());
		
		
		Map<Integer, String> nCity1 = new HashMap<Integer, String>();
		nCity1 = nCity;
		
		for (String s:nCity1.values())
		{
			System.out.println(s);
		}
		
		nCity.put(5, "Irving");
		for (String s:nCity1.values())
		{
			System.out.println(s);
		}
		
		int a = 16;
		int b = a >> 2;
		System.out.println(b);*/
		
	}
	
	static {
		System.out.println("so what, I will do my work, what ever happens");
	}

}
