package com.ps.KafkaSwingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SpringBootApplication
public class KafkaSwingAppApplication {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Kafka Swing App");
		JTextField textField = new JTextField();
		JButton sendButton = new JButton("Send");

		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = textField.getText();
				// Code to send message to Kafka using REST endpoint
				// E.g., using HttpClient library to make an HTTP POST request
			}
		});

		frame.setLayout(new javax.swing.BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(textField);
		frame.add(sendButton);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
