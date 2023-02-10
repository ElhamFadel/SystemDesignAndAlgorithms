package mvc.good;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view, model);
		view.setController(controller);
		model.addListener(view);
		model.updateViews();
	}

}
