package com.viplav.form;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Login {
@NotNull
@Size(min=5,max=20)
private String fName;
@NotNull
@Size(min=5,max=10)
private String lName;
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}

}
