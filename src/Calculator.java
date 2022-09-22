import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
 

public class Calculator {     	
	
	public static String num1 = "0";
	public static String num2 = "0";
	public static String operator = "";

	public static void main(String[] args) {
		//display variables
		String title        = "Java Calculator";
		int    width        = 300;
		int    height       = 300;
		
		//button UTF codes
		char divisorSymbol  = '\u00F7';
		
		Display display = new Display();
		Shell shell     = new Shell(display);
		shell.setText(title);
		shell.setSize(width,height);
		shell.setLayout(new GridLayout());
		
        GridData displayGrid = new GridData(SWT.FILL, SWT.CENTER, true, false);
        Text disWindow = new Text(shell, 0);
        disWindow.setLayoutData(displayGrid);
        disWindow.setEditable(false);
        disWindow.setText("");
        
		//composite for buttons
		final Composite composite = new Composite(shell, SWT.NONE);
		GridLayout grid = new GridLayout();
	  	grid.numColumns = 5;
		composite.setLayout(grid);
		
		CharacterButton button9         = new CharacterButton(composite, disWindow, "9");
		CharacterButton button8         = new CharacterButton(composite, disWindow, "8");
		CharacterButton button7         = new CharacterButton(composite, disWindow, "7");
		
		//divisor button
		Button divideButton     = new Button(composite,SWT.PUSH);
		divideButton.setText(Character.toString(divisorSymbol));
		divideButton.addListener(SWT.Selection, (Listener) new Listener()
		{
			public void handleEvent(Event event)
			{
				num1 = disWindow.getText();
				disWindow.setText("");
				operator = "/";
			}  	    
		});
	
		FunctionButton buttonC          = new FunctionButton(composite, disWindow, "C");
		CharacterButton button6         = new CharacterButton(composite, disWindow, "6");
		CharacterButton button5         = new CharacterButton(composite, disWindow, "5");
		CharacterButton button4         = new CharacterButton(composite, disWindow, "4");
		
		//multiply button
		Button multiplyButton     = new Button(composite,SWT.PUSH);
		multiplyButton.setText("x");
		multiplyButton.addListener(SWT.Selection, (Listener) new Listener()
		{
			public void handleEvent(Event event)
			{
				num1 = disWindow.getText();
				disWindow.setText("");
				operator = "*";
			}
					  	    
		});
		
		FunctionButton buttonM1         = new FunctionButton(composite, disWindow, "M1");
		CharacterButton button3         = new CharacterButton(composite, disWindow, "3");
		CharacterButton button2         = new CharacterButton(composite, disWindow, "2");
		CharacterButton button1         = new CharacterButton(composite, disWindow, "1");
		
		//minus button
		Button minusButton              = new Button(composite,SWT.PUSH);
		minusButton.setText("-");
		minusButton.addListener(SWT.Selection, (Listener) new Listener()
		{
			public void handleEvent(Event event)
			{
				num1 = disWindow.getText();
				disWindow.setText("");
				operator = "-";
			}				  	    
		});
		
		FunctionButton buttonM2         = new FunctionButton(composite, disWindow, "M2");
		CharacterButton button0         = new CharacterButton(composite, disWindow, "0");
		CharacterButton buttonPeriod    = new CharacterButton(composite, disWindow, ".");
		FunctionButton buttonPercent    = new FunctionButton(composite, disWindow, "%");
		
		//addition button
		Button addButton     = new Button(composite,SWT.PUSH);
		addButton.setText("+");
		addButton.addListener(SWT.Selection, (Listener) new Listener()
		{
			public void handleEvent(Event event)
			{
				num1 = disWindow.getText();
				disWindow.setText("");
				operator = "+";
			}
		});
		
		//equals button
		Button buttonEquals             = new Button(composite,SWT.PUSH);
		buttonEquals.setText("=");
		buttonEquals.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {	
	  	    	if (disWindow.getText().equals("")) {
	  	    	}
	  	    	else{
	  	    		num2 = disWindow.getText();
	  	    		
	  	    		//test logging
	  	    		System.out.println(operator);
  	    			System.out.println(num1);
  	    			System.out.println(num2);
  	    			
	  	    		if (operator.equals("/")){
	  	    			disWindow.setText(String.valueOf(Float.parseFloat(num1)/Float.parseFloat(num2)));
	  	    		}
	  	    		
	  	    		if (operator.equals("*")){
	  	    			disWindow.setText(String.valueOf(Float.parseFloat(num1)*Float.parseFloat(num2)));
	  	    		}
	  	    		
	  	    		if (operator.equals("+")){
	  	    			disWindow.setText(String.valueOf(Float.parseFloat(num1)+Float.parseFloat(num2)));
	  	    		}
	  	    		
	  	    		if (operator.equals("-")){
	  	    			disWindow.setText(String.valueOf(Float.parseFloat(num1)-Float.parseFloat(num2)));
	  	    		}
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
