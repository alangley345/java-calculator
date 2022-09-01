import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class OperatorButton {
	
	float num1;
	float num2;
	
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
		    			case "+": num1 += Float.parseFloat(display.getText());
		    				display.setText("");
		    				break;
		    			case "=": num2 = Float.parseFloat(display.getText());
		    					  System.out.println(num1);
		    					  display.setText(String.valueOf(num1 + num2));
		    				break;
		    			//case Character.toString('\u00F7'):
		    			
		    		}
		    	}
		    	System.out.println(num1);
		    	System.out.println(num2); 
	  	    }
	  	});
	}
}