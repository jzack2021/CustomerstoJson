import java.io.FileNotFoundException;

//filenotfoundexce[tion

public class App {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		setService atMyservice = new SetToJsonORService();
		setService atMyservice2 = new SetToJsonORService();
		viewer view = new viewer();
		ControllerOFCustomers controller = new ControllerOFCustomers(view, atMyservice);
		
		controller.run();
		
		
		
	}

}