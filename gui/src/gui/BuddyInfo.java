package gui;

public class BuddyInfo {
	
	String Name = new String();
	String Address = new String();
	int Phoneno;
	
public BuddyInfo(String name,String add,int phoneno)
{
	this.Name = name;
	this.Address = add;
	this.Phoneno = phoneno;
}
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		this.Address = address;
	}


	public int getPhoneno() {
		return Phoneno;
	}


	public void setPhoneno(int phoneno) {
		this.Phoneno = phoneno;
	}

	public static void main(String[] args)
	{
		
	}

}
