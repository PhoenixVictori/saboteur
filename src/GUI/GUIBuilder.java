import javax.swing.*;
import java.io.IOException;


public class GUIBuilder{
	public static void main(String args[]){
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 520);
		try{
			JPanel background = new JPanelWithBackground("C:\\Users\\jemsc\\Desktop\\Coding\\Java\\BBProjects\\SabotageGame\\resources\\GUI\\TitleScreen.png");
			frame.getContentPane().add(background);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		frame.setVisible(true);	
	}
}