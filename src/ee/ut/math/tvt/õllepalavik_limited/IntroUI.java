package ee.ut.math.tvt.õllepalavik_limited;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class IntroUI {
	JFrame introWindow;
	JButton okButton;
	JTextArea infoArea;
	JLabel teamLogo;
	

	public IntroUI() {
		createWindow();
		addLogo();
		addText();
		addButton();
		//introWindow.pack();
		introWindow.setVisible(true);
	}
	
	private void createWindow() {
		introWindow = new JFrame();
		introWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		introWindow.setTitle("hi");
		introWindow.setSize(380, 270);
		introWindow.setResizable(false);
	}
	
	private void addLogo() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("logo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		teamLogo = new JLabel(new ImageIcon(img));
		introWindow.getContentPane().add(teamLogo, BorderLayout.PAGE_START);
		teamLogo.setVisible(true);
		
	}
	
	private void addText() {
		Properties application = new Properties();
		Properties version = new Properties();
		String data = null;
		
		try {
			application.load(new FileInputStream("application.properties"));
			version.load(new FileInputStream("version.properties"));
			data = 	"Team name:\t\t" + application.getProperty("team.name") + "\n" +
					"Team leader:\t\t" + application.getProperty("team.leader") + "\n" +
					"Team leader e-mail:\t" + application.getProperty("team.leader.email") + "\n" +
					"Team members:\t" + application.getProperty("team.members") + "\n" +
					"Version:\t\t" + version.getProperty("build.number") + "\n";
		} catch (IOException e) {
			System.out.println("IO ERROR: Couldn't open file.");
			e.printStackTrace();
		}
		
		infoArea = new JTextArea(data);
		infoArea.setEditable(false);
		introWindow.getContentPane().add(infoArea, BorderLayout.CENTER);
		infoArea.setVisible(true);
	}
	
	private void addButton() {
		okButton = new JButton();
		okButton.setText("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				introWindow.dispose();
			}
		});
		
		introWindow.getContentPane().add(okButton, BorderLayout.PAGE_END);
		okButton.setVisible(true);
	}
	
	
}
