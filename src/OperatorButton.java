import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
	private String storeValue(Text display, String storedValue) {
		return storedValue = temp;
	}
	
	String temp;
	
	public OperatorButton(Composite composite, Text display, String buttonLabel, String storedValue){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
	  	button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	       temp = display.getText();
	  	       display.setText("");
	  	       storeValue(display, storedValue);
	  	       System.out.println(storedValue);
	  	    }
	  	    
	  	    
	  	});
	}
}
