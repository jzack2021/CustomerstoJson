

import java.io.FileNotFoundException;




public class App {

	public static void main(String[] args)  throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		setService atMyservice = new SetToJsonORService();
		viewer view = new viewer();
		ControllerOFCustomers controller = new ControllerOFCustomers(view, atMyservice);
		
		controller.run();
		//System.out.print("Customer?");
		
	}

}
