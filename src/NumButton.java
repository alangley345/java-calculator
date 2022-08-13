import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class NumButton {
	
	
	public void newButton(Composite composite, String label) {
	Button b = new Button(composite, SWT.PUSH);
    //b.setSize(buttonSize, buttonSize);
    b.setText(label);
	}

}
