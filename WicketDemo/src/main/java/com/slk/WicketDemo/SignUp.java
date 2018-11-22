package com.slk.WicketDemo;

import java.util.ArrayList;
import java.util.List;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
//import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.model.PropertyModel;

import com.slk.WicketDemo.model.SignupModel;;

public class SignUp extends WebPage {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String>cityChoices=new ArrayList<String>();
	private List<String>genderChoices=new ArrayList<String>();
	private List<String>langChoices=new ArrayList<String>();
	
	public SignUp() throws Exception{
		cityChoices.add("Bangalore");
		cityChoices.add("Other city");
		genderChoices.add("male");
		genderChoices.add("female");
		langChoices.add("java");
		langChoices.add("C++");
		langChoices.add("C");
		langChoices.add(".net");
		langChoices.add("python");
		
		SignupModel s1=new SignupModel();
		Form<?> form2=new Form("form2");
		
		org.apache.wicket.markup.html.form.TextField<String> user=new org.apache.wicket.markup.html.form.TextField<>("user",new PropertyModel<>(s1,"user"));
		org.apache.wicket.markup.html.form.PasswordTextField pass=new org.apache.wicket.markup.html.form.PasswordTextField("pass",new PropertyModel<>(s1,"pass"));
		org.apache.wicket.markup.html.form.TextField<String> email=new org.apache.wicket.markup.html.form.TextField<>("email",new PropertyModel<>(s1,"email"));
		
		
		RadioChoice<String> radio=new RadioChoice<>("gender",new PropertyModel<>(s1, "gender"),genderChoices);
		
		CheckBoxMultipleChoice<String> lang1=new CheckBoxMultipleChoice<>("languages",new PropertyModel<>(s1, "languages"),langChoices);
		DropDownChoice<String> city=new DropDownChoice<>("city", new PropertyModel<>(s1, "city"),cityChoices);
		org.apache.wicket.markup.html.form.TextField<String> address=new org.apache.wicket.markup.html.form.TextField<>("address",new PropertyModel<>(s1,"address"));
	
		Button button=new Button("signup"){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit(){
				super.onSubmit();
				System.out.println(s1.getUser()+" has Signed up in successfully\n");
				System.out.println(s1);
			}
		};
		Button button2=new Button("reset");
		add(form2);
		form2.add(user);
		form2.add(pass);
		form2.add(email);
		form2.add(radio);
		form2.add(lang1);
		form2.add(city);
		form2.add(address);
		form2.add(button);
		form2.add(button2);
	

}
	

}
