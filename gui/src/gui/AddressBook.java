package gui;
import java.util.ArrayList;
import java.util.List;
public class AddressBook {
	 
	 


		private ArrayList<BuddyInfo> a;
		public AddressBook()
		{
		 a = new ArrayList<BuddyInfo>(); 
		}
		
		public void addBuddy(BuddyInfo aBuddy)
		{
			if(aBuddy !=null)
			{
				a.add(aBuddy);
			}
		}
		
		public void removeBuddy(int index)
		{
			if(index >=0 && index < a.size())
			{
				a.remove(index);
			}
		}

		
		public static void main(String[] args)
		{
		System.out.println("Address Book!!! alright");
	    BuddyInfo buddy = new BuddyInfo("Tom", "Carleton",613);
	    AddressBook addressBook = new AddressBook();
	    addressBook.addBuddy(buddy);
	    addressBook.removeBuddy(0);
		}

	}


