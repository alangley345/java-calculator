import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
  	String storedOperator = "";
	
	public OperatorButton(Composite composite, Text display, String buttonLabel){
		Button button = new Button(composite,SWT.PUSH);
		button.setText(buttonLabel);
		button.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {  
	  	    	if (display.getText().equals("")){
	  	    		System.out.println("Display is blank");
	  	    	}
	  	    	
	  	    	else {
	  	    		switch(button.getText()) {
	  	    			case "+": storedOperator = "+";
	  	    				break;
	  	    			case "-": storedOperator = "-";
	  	    				break;
	  	    			//case "x":  
	  	    			//case Character.toString('\u00F7'):
	  	    			
	  	    		}
	  	    	}
	  	    	
	  	    	Calculator.storeValue(display);
	    		display.setText("");
	  
		  	    	
	  	    }
	  	});
	}
}