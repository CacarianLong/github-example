import javax.swing.JFrame;
import javax.swing.JLabel;
import ios;

public class HelloWorld extends JFrame{

	public static void main(String[] args) {
		new HelloWorld();
	}
	HelloWorld() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		add(jlbHelloWorld);
		this.setSize(400, 100);
		// pack();
		setVisible(true);
	}

}
