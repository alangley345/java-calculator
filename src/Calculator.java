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
	
	private static Shell makeShell(String title, int width, int height) {
		//build window and place for buttons
		Display display = new Display();
		Shell shell     = new Shell(display);
		shell.setText(title);
		shell.setSize(width,height);
		shell.setLayout(new GridLayout());
		
		shell.open();
		while(!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();
		
		return shell;
	}
	
	private static Composite makeComposite(Shell shell) {
		
		final Composite composite = new Composite(shell, SWT.NONE);
		GridLayout grid = new GridLayout();
	  	grid.numColumns = 3;
		composite.setLayout(grid);
		
		return composite;
	}
	
    private static void button1(Composite composite, Text window) {
    	Button one = new Button(composite,SWT.PUSH);
	  	one.setText("1");
	  	
	  	one.addListener(SWT.Selection, (Listener) new Listener()
	  	{
	  	    public void handleEvent(Event event)
	  	    {
	  	        window.setText("1");
	  	    }
	  	});
    }
	
    private static Text makeDisplay(Shell shell) {
    	//display
        GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
        gridData.horizontalSpan = 2;
        Text disWindow = new Text(shell, 0);
        disWindow.setLayoutData(gridData);
        disWindow.setText("Hello");
        
        return disWindow;
    }
    
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
		Shell shell         = makeShell("Java Calculator", 400, 500);
		Composite composite = makeComposite(shell);
		Text display        = makeDisplay(shell);

	}

}
