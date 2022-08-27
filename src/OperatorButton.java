import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
	String storedValue="";
	
	public void ReturnValue() {
		System.out.println(internalValue);
	}
	
	public OperatorButton(Composite composite, Text display, String buttonLabel){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	    	if (buttonLabel.equals("+")) {
	  	    		if (storedValue.equals("")) {
	  	    			storedValue = display.getText();
	  	    		}
	  	    		else {
	  	    			float storedFloat  = Float.parseFloat(storedValue);
	  	    			float displayFloat = Float.parseFloat(display.getText());
	  	    			float newValue     = 
	  	    		}
		  	    	
	  	    	}
	  	    	ReturnValue();
	  	    	
	  	    }
	  	});
	}
		
	
	
	void buttonAction(String storedValue, String displayValue) {
		String temp = storedValue + displayValue;
		System.out.println(temp);
	}
}