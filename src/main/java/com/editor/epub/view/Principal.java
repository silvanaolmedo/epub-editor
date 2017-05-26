package com.editor.epub.view;

import com.editor.epub.controllers.PrincipalController;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame
{
	private JPanel panel;
	private JFileChooser file;
	private JButton btn;
	private PrincipalController principalController;
	
	public Principal(PrincipalController p) 
	{
		super("Epub Editor 1.0");
		setBounds(500, 300, 200, 250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principalController = p;
	}
}
