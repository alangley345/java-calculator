import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
	public OperatorButton(Composite composite, Text display, String buttonLabel, String storedValue){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	    	
	  	        display.setText(display.getText() + buttonLabel);  
	  	    }
	  	});
	}
	
	void buttonAction(String storedValue, String displayValue) {
		String temp = storedValue + displayValue;
		System.out.println(temp);
	}
}