import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class CharacterButton {

	public CharacterButton(Composite composite, Text display, String buttonLabel){
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
}
