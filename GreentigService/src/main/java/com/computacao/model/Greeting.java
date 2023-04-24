package com.computacao.model;

public class Greeting {

	private final long id;
	private final String Content;
	
	public Greeting(long id, String content) {
		this.id = id;
		Content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return Content;
	}	
}
