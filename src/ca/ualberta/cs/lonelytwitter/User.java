package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

// class created by right click new then class
// classes contains 2 things attributes, methods

// abstract means that the User can only create its lower classes inherited from User
// So abstract acts similar to the void

// by writing implements "interface name", the class can implements the interface
// A class can implement as many as interfaces you desire
// However, a class can only have one Super class
public abstract class User extends Object implements UserLike {
	// public is the access modifier, it tells this attribute, username, can be accessed
	// throughout the program
	// private however, is not accessible throughout the program.
	// protected means that the attribute can be only be accessed in this certain page?
	// ___, default modifier can be accessed in this package
	// we will be using private or public a lot.
	
	// Java language must have a type before the attribute
	protected String username;

	public String getUsername() {
		return username;
	}

	// This means all subclass to User will have this function but the user have to
	// decide which subclass it is calling this function
	public abstract void setUsername(String x) throws IOException;
		// this keyword lets you know the current object, this case it is object of
		// class user
		// Does Java knows the difference between object name and attribute name?
		// Java looks at the object first then attribute
		// this.username = username;
		// below code is equal to the above line, this is implied without writing
		// username = x;
	
		// this.username = x;
	
	// This is the constructor
	// Constructor will always have the same name as the class
	// In Java, we can have multiple constructors with the duplicate names
	
	// In Java, don't call destructor since they might never be called
	public User(String username) {
		// super class is created, it's good to put super for every constructor
		super();
		this.username = username;
	}
	
	public User(){
		super();
		this.username = "anonymous";
	}
	
	
}
