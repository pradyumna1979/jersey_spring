package com.att.owb.model;


import javax.xml.bind.annotation.XmlRootElement;


import com.fasterxml.jackson.annotation.JsonProperty;


@XmlRootElement
public class User {

Integer id;

private String name;
@JsonProperty("First_name")
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

}
