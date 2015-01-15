package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

// this has been created from right click new then class then browsed to existing class
// User then finish, so User is the super class and Author is inherited from it
// So Author inherits all the attributes from User
// All Java classes have default super class called object
// so User itself is inherited from the object, super class 
public class Author extends User {
	
	@Override
	// throws IOException tells the program to be ready when there is an error
	public void setUsername(String x) throws IOException {
		// we check if the size of name is too long
		if (x.length() > 8) {
			// to use exception, Java uses throw, same as raise in Python
			throw new IOException("Name too long!");
		}
		this.username = x;
	}
	
}

// There are many exceptions in Java such as RuntimeException and Exception, IOException