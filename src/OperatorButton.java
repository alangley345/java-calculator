import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
	String storedValue    = "";
	String storedOperator = "";
	
	private void checkValues() {
		System.out.println(storedValue);
		System.out.println(storedOperator);
	}
	
	public void storeValue(Text display) {
		storedValue    = display.getText();
		display.setText("");
	}
	
	
	public OperatorButton(Composite composite, Text display, String buttonLabel){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	    	
	  	    	if (buttonLabel.equals("+") ) {
	  	    		if (display.getText().equals("")) {
	  	    			System.out.println("Display is blank");
	  	    		}
	  	    		else {
	  	    			storedOperator = "+";
	  	    			storedValue    = display.getText();
	  	    			display.setText("");
	  	    		}
		  	    	
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals("-")) {
	  	    		if (display.getText().equals("")) {
	  	    			System.out.println("Display is blank");
	  	    		}
	  	    		else {
	  	    			storedOperator = "-";
	  	    			storedValue    = display.getText();
	  	    			display.setText("");
	  	    		}
		  	    	
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals("x")) {
	  	    		if (display.getText().equals("")) {
	  	    			System.out.println("Display is blank");
	  	    		}
	  	    		else {
	  	    			storedOperator = "x";
	  	    		}
		  	    	
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals(Character.toString('\u00F7'))) {
	  	    		if (display.getText().equals("")) {
	  	    			System.out.println("Display is blank");
	  	    		}
	  	    		else {
	  	    			storedOperator = "/";
	  	    		}
		  	    	
	  	    	}
	  	    	
	  	    	
	  	    	if (buttonLabel.equals("=")) {
	  	    		if (storedValue.equals("")) {
	  	    			System.out.println("Display is blank");
	  	    		}
	  	    		else {
	  	    			float storedFloat  = Float.parseFloat(storedValue);
	  	    			float displayFloat = Float.parseFloat(display.getText());
	  	    		}
		  	    	
	  	    	}
	  	    	
	  	    	checkValues();
	  	    	
	  	    }
	  	});
	}
}