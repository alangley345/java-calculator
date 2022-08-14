import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Calculator {    
    //adding buttons
    //int buttonX    = 10;
    //int buttonY    = 10;
    //int buttonSize = 25;
    //for (int i=9; i>=0; i--) {
    //  Button b = new Button(composite, SWT.PUSH);
    //  b.setSize(buttonSize, buttonSize);
    //  b.setText(String.valueOf(i));
    //  
    //}
  	
	public static void main(String[] args) {
		String title        = "Java Calculator";
		int    width        = 400;
		int    height       = 500;
		float  valueHolder  = 0;
		
		Display display = new Display();
		Shell shell     = new Shell(display);
		shell.setText(title);
		shell.setSize(width,height);
		shell.setLayout(new GridLayout());
		
        GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
        gridData.horizontalSpan = 2;
        Text disWindow = new Text(shell, 0);
        disWindow.setLayoutData(gridData);
        disWindow.setText("");
		
		//composite for buttons
		final Composite composite = new Composite(shell, SWT.NONE);
		GridLayout grid = new GridLayout();
	  	grid.numColumns = 3;
		composite.setLayout(grid);
		
		NumberButton button9 = new NumberButton(composite, disWindow, "9");
		NumberButton button8 = new NumberButton(composite, disWindow, "8");
		NumberButton button7 = new NumberButton(composite, disWindow, "7");
		NumberButton button6 = new NumberButton(composite, disWindow, "6");
		NumberButton button5 = new NumberButton(composite, disWindow, "5");
		NumberButton button4 = new NumberButton(composite, disWindow, "4");
		NumberButton button3 = new NumberButton(composite, disWindow, "3");
		NumberButton button2 = new NumberButton(composite, disWindow, "2");
		NumberButton button1 = new NumberButton(composite, disWindow, "1");
		NumberButton button0 = new NumberButton(composite, disWindow, "0");
		
		Button plus = new Button(composite,SWT.PUSH);
		plus.setText("+");
	  	plus.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  		float tempValue;
	  	    public final void handleEvent(Event event)
	  	    {
	  	    	if (disWindow.getText() != "") {
	  	    		tempValue = Float.parseFloat(disWindow.getText());
	  	    		disWindow.setText("");
	  	    		float valueHolder = tempValue;
	  		  	    String s = String.valueOf(valueHolder);  
	  		  	    System.out.println(s);
		  	    }
	  	    }
	  	});
		
		shell.open();
		while(!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();
	}

}
