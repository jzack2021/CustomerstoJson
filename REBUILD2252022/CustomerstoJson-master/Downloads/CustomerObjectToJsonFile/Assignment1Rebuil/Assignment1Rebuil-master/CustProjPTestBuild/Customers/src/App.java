
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		setService atMyservice = new SetToJsonORService();
		viewer view = new viewer();
		ControllerOFCustomers controller = new ControllerOFCustomers(view, atMyservice);
		
		controller.run();
		
		
		
	}

}
