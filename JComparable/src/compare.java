import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usernamecity u1 = new usernamecity("John","Chicago","IL");
		usernamecity u2 = new usernamecity("Abraham","Decatur","IL");
		usernamecity u3 = new usernamecity("David","Champaign","IL");
		usernamecity u4 = new usernamecity("Cooper","Urbana","IL");
		usernamecity u5 = new usernamecity("Ben","SpringField","IL");
		usernamecity u6 = new usernamecity("Tom","Charleston","WV");
		usernamecity u7 = new usernamecity("John","Darwin","IL");
		usernamecity u8 = new usernamecity("John","Elahi","IL");
		usernamecity u9 = new usernamecity("John","Delhi","IL");
		//List<usernamecity> unc = Arrays.asList(u1,u2,u3,u4,u5,u6);
		List<usernamecity> unc = new ArrayList<usernamecity>();
		unc.add(u1);unc.add(u2);unc.add(u3);unc.add(u4);unc.add(u5);unc.add(u6);unc.add(u7);unc.add(u8);unc.add(u9);
		System.out.println("---------Sorted Order by Comparable------------");
		Collections.sort(unc);
		List<usernamecity> filus = unc.stream().collect(Collectors.toList());      
	    filus.stream().map(s -> (s.getUser()+","+s.getCity()+","+s.getState())).forEach(System.out::println);
	    System.out.println("---------Sorted Order by Comparator by City------------");
	    CityCompare citycomp = new CityCompare();
	    Collections.sort(unc, citycomp);
	    unc.stream().collect(Collectors.toList()).stream().map(s -> (s.getUser()+","+s.getCity()+","+s.getState())).forEach(System.out::println);
	    unc.parallelStream().forEach(a->System.out.println(a.city));
	    
	    Contacts contact1=  new Contacts("John","318-234-2345");
	    Contacts contact2=  new Contacts("Darrek","318-235-2345");
	    Contacts contact3=  new Contacts("Abraham","318-236-2345");
	    Contacts contact4=  new Contacts("Rick","318-237-2345");
	    
	    List<Contacts> contact_old = new ArrayList<Contacts>();
	    contact_old.add(contact1);contact_old.add(contact2); contact_old.add(contact3);contact_old.add(contact4);
	    
	    Contacts contact5=  new Contacts("John","318-234-2345");
	    Contacts contact6=  new Contacts("Darrek","318-235-2345");
	    Contacts contact7=  new Contacts("Rick","318-237-2345");
	    
	    List<Contacts> contact_old1 = new ArrayList<Contacts>();
	    contact_old.add(contact5);contact_old.add(contact2); contact_old.add(contact3);contact_old.add(contact4);
    
	    

	}

}
