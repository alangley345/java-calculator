import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

public class Calculator {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell     = new Shell(display);
		shell.setText("Java Calculator");
		shell.setSize(400,500);
		
		
		final Button Button7 = new Button(shell,SWT.PUSH);
		Button7.setText("7");
		Button7.pack();
		
		final Button Button8 = new Button(shell,SWT.PUSH);
		Button8.setText("8");
		Button8.pack();
		
		final Button Button9 = new Button(shell,SWT.PUSH);
		Button9.setText("9");
		Button9.pack();
		/*...
		final Button Button1 = new Button(shell,SWT.PUSH);
		Button1.setText("7");
		Button1.pack();
		
		final Button Button1 = new Button(shell,SWT.PUSH);
		Button1.setText("7");
		Button1.pack();
		
		final Button Button1 = new Button(shell,SWT.PUSH);
		Button1.setText("7");
		Button1.pack();
		
		final Button Button1 = new Button(shell,SWT.PUSH);
		Button1.setText("7");
		Button1.pack();
		...*/
		
		shell.open();
		while(!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();

	}

}
