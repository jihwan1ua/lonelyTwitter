package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import android.test.ViewAsserts;
// we are importing R.java from lonelytwitter to use textview 
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTests extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTests() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSendText()
	{
		String text = "Hello world!";
		IntentReaderActivity activity = startWithText(text,IntentReaderActivity.NORMAL);
		assertEquals("got the text?", text, activity.getText());
	}
	
	public void testDoubleText()
	{
		String text = "Hello world!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double text?", text+text, activity.getText());
	}
	
	// reverse mode test
	public void testReverseText()
	{
		String text = "Hello";
		String reversed_text = "olleH";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("They are not equal", reversed_text, activity.getText());
	}
	
	public void testDisplayText()
	{
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		// we find R.id from R.java in lonelytwitter
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("correct text?", text, view.getText());
	}
	
	// default message test
	public void testDefaultMessage()
	{
		String message = "No message";
		IntentReaderActivity activity = startWithText(null, IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("The returned messages are not equal", message, view.getText());
	}
	
	// textview visibility test
	public void testVisibleTextView()
	{
		// use assertOnScreen to see if textview is on the screen
		String text = "Hello World";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), view);
	}
	
	private IntentReaderActivity startWithText(String text, int mode)
	{
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}
