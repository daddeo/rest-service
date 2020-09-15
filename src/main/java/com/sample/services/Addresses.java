package com.sample.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "list")
public class Addresses {
	private List<String> addresses;

	@XmlElement
	public String[] getList() {
	    String[] temp = new String[addresses.size()];
	    for(int i = 0; i < temp.length; i++){
	        temp[i] = addresses.get(i);
	    }
	    return temp;
	}

	public void setList(List<String> answers) {
	    if(this.addresses == null){
	        this.addresses = new ArrayList<>();
	    }
	    this.addresses.clear();
	    this.addresses.addAll(answers);
	}

	public void setList(String[] answers) {
	    if(this.addresses == null){
	        this.addresses = new ArrayList<>();
	    }
	    this.addresses.clear();
	    this.addresses.addAll(Arrays.asList(answers));
	}

	public int getUniqueCount() {
		Set<String> unique = new HashSet<String>();
		for (String address : addresses) {
			String test = address;
			String[] split = test.split("@");
			String username = split[0];
			String domain = split[1];
			split = username.split("\\+");
			username = split[0];
			username = username.replaceAll("\\.",  "");
			String combined = username + "@" + domain; 
			unique.add(combined);
		}
		return unique.size();
	}
}
