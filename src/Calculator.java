import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Calculator {

	public static void main(String[] args) {
		//build window and place for buttons
		Display display = new Display();
		Shell shell     = new Shell(display);
		shell.setText("Java Calculator");
		shell.setSize(400,500);
		
		//composite for buttons
		shell.setLayout(new GridLayout());
	    final Composite composite = new Composite(shell, SWT.NONE);
	    GridLayout grid = new GridLayout();
	    grid.numColumns = 3;
	    composite.setLayout(grid);
	    
	    Text disWindow = new Text(composite, 0);
	    GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
	    gridData.horizontalSpan = 3;
	    disWindow.setLayoutData(gridData);

	 
	    
	    //adding buttons
	    int buttonX    = 10;
	    int buttonY    = 10;
	    int buttonSize = 25;
	    for (int i=9; i>=0; i--) {
	      Button b = new Button(composite, SWT.PUSH);
	      b.setSize(buttonSize, buttonSize);
	      b.setText(String.valueOf(i));
	    }
		
	    
	    
		shell.open();
		while(!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();

	}

}
