import java.util.Comparator;

public class usernamecity implements Comparable<usernamecity> {
	String user;			
	String city;
	String state;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public usernamecity(String user, String city, String state) {
		super();
		this.user = user;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public int compareTo(usernamecity u1) {
		// TODO Auto-generated method stub
		return this.user.compareTo(u1.user);
		//return 1;
	}
}

class CityCompare implements Comparator<usernamecity>
{
    public int compare(usernamecity m1, usernamecity m2)
    {
        return m1.getUser().compareTo(m2.getUser());
    }
}
