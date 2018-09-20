import javax.swing.JFrame;
import java.io;
import javax.swing.JLabel;
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
