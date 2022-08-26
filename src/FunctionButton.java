import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class FunctionButton {

	public FunctionButton(Composite composite, Text display, String buttonLabel){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	    	if (buttonLabel.equals("%")) {
	  	    		float input = Float.parseFloat(display.getText());
	  	    		display.setText("");
	  	    		display.setText(String.valueOf(input/100));
	  	    	}
	  	    }
	  	});
	}
	
}