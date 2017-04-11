package compoment;

public class ConcreteComponent extends Component {

	@Override
	public void doJob() {
		System.out.println("I am from the Concrete Component -- I am closed for modification");
	}

}
