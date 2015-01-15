package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Friends extends FriendsList {
	public void setFriend(String x) throws IOException {
		if (x.length() > 16) {
			throw new IOException("Name too long!");
		}
		this.FriendName = x;
	}
}
