package contactListPhoneDirectory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class contactList {
	public static void main(String[] args)
	{
		Contacts c1 = new Contacts("A1","2323232323");
		Contacts c2 = new Contacts("A2","2323232324");
		Contacts c3 = new Contacts("A3","2323232325");
		Contacts c4 = new Contacts("A4","2323232326");
		List<Contacts> contactList = new ArrayList<>();
		contactList.add(c1);contactList.add(c2);contactList.add(c3);contactList.add(c4);
		
		Contacts c5 = new Contacts("A1","2323232323");
		Contacts c6 = new Contacts("A2","2323232324");
		List<Contacts> refContactList = new ArrayList<>();
		refContactList.add(c5);refContactList.add(c6);
		
		List<Contacts> diffList = contactList.stream().filter(x-> !refContactList.stream().anyMatch(y->y.name.equals(x.name) && y.phone.equals(x.phone))).collect(Collectors.toList());

		diffList.stream().map(x->x.name+" - "+x.phone).forEach(System.out::println);
	
	}

}
