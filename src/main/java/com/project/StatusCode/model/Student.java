package com.project.StatusCode.model;

public class Student {

	private int Id;
	
	private String Name;
	
	private String Adress;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Adress=" + Adress + "]";
	}
	
	
}
