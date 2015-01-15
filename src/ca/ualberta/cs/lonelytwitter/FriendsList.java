package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class FriendsList extends Object implements FriendsLike {
	protected String FriendsNumber;
	protected String FriendName;
	protected ArrayList<FriendsList> array = new ArrayList<FriendsList>();
	
	// getfriend function will tell us in true or false if we have the input name in
	// our list or not
	public boolean getFriend(String FriendName) {
		boolean isFriend=false;
		try {
			
			if ( array.contains(FriendName)) {
				//this.FriendName = FriendName;
				isFriend=true;
				}
			} catch (RuntimeException e) {
			
		}
		return isFriend;
	}
	

	public abstract void setFriend(String x) throws IOException;
}
