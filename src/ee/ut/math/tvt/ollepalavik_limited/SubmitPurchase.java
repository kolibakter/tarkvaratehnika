package ee.ut.math.tvt.ollepalavik_limited;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SubmitPurchase {
	JFrame submitWindow;
	JButton acceptButton;
	JButton cancelButton;
	JTextArea infoArea;
	
	public SubmitPurchase() {
		createWindow();
		addFields();
		addButtons();
		submitWindow.setVisible(true);
	}
	
	private void createWindow() {
		submitWindow = new JFrame();
		submitWindow.setTitle("Confirm order");
		submitWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		submitWindow.setSize(200, 200);
		submitWindow.setResizable(false);
	}
	
	private void addFields() {
		//Sum
		//Payment amount
		//Change amount
		String text = null;
		
		text = "TOTAL: " + "\n";
		
		infoArea = new JTextArea(text);
		submitWindow.getContentPane().add(infoArea, BorderLayout.CENTER);
		infoArea.setVisible(true);
		
	}
	
	private void addButtons() {
		acceptButton = new JButton();
		acceptButton.setText("Accept");
		
		cancelButton = new JButton();
		cancelButton.setText("Cancel");
		
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitWindow.dispose();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitWindow.dispose();
			}
		});
		
		submitWindow.getContentPane().add(acceptButton, BorderLayout.PAGE_END);
		submitWindow.getContentPane().add(cancelButton, BorderLayout.PAGE_END);
		
		acceptButton.setVisible(true);
		cancelButton.setVisible(true);
	}

	public SubmitPurchase(JFrame submitWindow, JButton acceptButton,
			JButton cancelButton, JTextArea infoArea) {
		super();
		this.submitWindow = submitWindow;
		this.acceptButton = acceptButton;
		this.cancelButton = cancelButton;
		this.infoArea = infoArea;
	}

	public void setSubmitWindow(JFrame submitWindow) {
		this.submitWindow = submitWindow;
	}

	public void setAcceptButton(JButton acceptButton) {
		this.acceptButton = acceptButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public void setInfoArea(JTextArea infoArea) {
		this.infoArea = infoArea;
	}
	
	
}

