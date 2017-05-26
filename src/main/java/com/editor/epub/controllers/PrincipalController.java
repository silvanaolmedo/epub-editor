package com.editor.epub.controllers;
import  com.editor.epub.view.Principal;

public class PrincipalController 
{
	private Principal principalView;
	
	public PrincipalController()
	{
		principalView = new Principal(this);
		setVisible();
		
	}
	
	public void setVisible()
	{
		principalView.setVisible(true);
	}
}
