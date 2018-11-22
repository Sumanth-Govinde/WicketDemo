package com.slk.WicketDemo;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
/*import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;*/
import org.apache.wicket.markup.html.form.TextArea;

import org.apache.wicket.model.PropertyModel;

import com.slk.WicketDemo.model.UserModel;

public class WelcomePage extends WebPage{

	
	/**
	 * Serial number
	 */
	private static final long serialVersionUID = 1L;
	//Code starts from here
	
	
	private List<String>genderChoices=new ArrayList<String>();
	public WelcomePage(){
		//add(new Label("lbl",new Model<String>("This is wicked")));
		genderChoices.add("Male");
		genderChoices.add("Female");
		
		UserModel userModel=new UserModel();
		
		Form<?> form=new Form("form");
		
		org.apache.wicket.markup.html.form.TextField<String> text=new org.apache.wicket.markup.html.form.TextField<>("text",new PropertyModel<>(userModel,"name"));
		text.setOutputMarkupId(true);
		
		DropDownChoice<String> gender=new DropDownChoice<>("gender", new PropertyModel<>(userModel, "gender"),genderChoices);
		gender.setOutputMarkupId(true);
		/*Button button=new Button("submit"){
			*//**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;
			//Ignore above
			
			@Override
			public void onSubmit(){
				super.onSubmit();
				System.out.println("Name: "+userModel.getName()+"\nGender: "+userModel.getGender());
			}
		};*/
		
		AjaxButton button=new AjaxButton("submit") {
			/**
			 * The below 1st line is not mandatory 
			 */
			/*1st line*/private static final long serialVersionUID = 1L;

			protected void onSubmit(AjaxRequestTarget target,Form<?> form){
				super.onSubmit(target, form);
				
				
					if(text.isEnabled()==true)
					{
						text.setEnabled(false);
						gender.setEnabled(false);
					}
					else
					{
						text.setEnabled(true);
						gender.setEnabled(true);
					}
						
				
				
				
				
				target.add(text);
				target.add(gender);
			}
		};
		
		add(form);
		
		form.add(text);
		form.add(gender);
		form.add(button);
	}

}
