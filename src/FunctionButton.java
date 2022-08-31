import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.internal.Callback;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class FunctionButton {
	
	String m1     = "";
	boolean m1Set = false;
    String m2     = "";
    boolean m2Set = false;

	public FunctionButton(Composite composite, Text display, String buttonLabel){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	    	if (buttonLabel.equals("%")) {
	  	    		try {
	  	    		float input = Float.parseFloat(display.getText());
	  	    		display.setText("");
	  	    		display.setText(String.valueOf(input/100));
	  	    		}
	  	    		catch (java.lang.NumberFormatException n) {
	  	    			System.out.println("Incorrect number format");
	  	    		}
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals("M1")) {
	  	    		if (m1Set == false) {
	  	    			m1 = display.getText();
	  	    			System.out.println(m1);
	  	    			m1Set = true;
	  	    			display.setText("");
	  	    		}
	  	    		else {
	  	    			display.setText(m1); 
	  	    			m1 = "";
	  	    			m1Set = false;
	  	    		}
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals("M2")) { 
	  	    		if (m1Set == false) {
	  	    			m1 = display.getText();
	  	    			System.out.println(m1);
	  	    			m1Set = true;
	  	    			display.setText("");
	  	    		}
	  	    		else {
	  	    			display.setText(m1);
	  	    			m1Set = false;
	  	    			m1 = "";
	  	    		}
	  	    	}
	  	    	
	  	    	if (buttonLabel.equals("C")) {
	  	    		display.setText("");
	  	    	}
	  	    }
	  	});
	}
	
}