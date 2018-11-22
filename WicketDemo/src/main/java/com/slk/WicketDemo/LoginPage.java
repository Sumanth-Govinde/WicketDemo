package com.slk.WicketDemo;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.PropertyModel;

import com.slk.WicketDemo.model.Login;

public class LoginPage extends WebPage{

	public LoginPage(){
		
		Login l1=new Login();
		
		Form<?> form1=new Form("form1");
		org.apache.wicket.markup.html.form.TextField<String> user=new org.apache.wicket.markup.html.form.TextField<>("user",new PropertyModel<>(l1,"user"));
		org.apache.wicket.markup.html.form.PasswordTextField pass=new org.apache.wicket.markup.html.form.PasswordTextField("pass",new PropertyModel<>(l1,"pass"));
		
		Button button=new Button("login"){
			@Override
			public void onSubmit(){
				super.onSubmit();
				System.out.println(l1.getUser()+" has logged in successfully\n");
			}
		};
		add(form1);
		form1.add(user);
		form1.add(pass);
		form1.add(button);
	
	}

}
