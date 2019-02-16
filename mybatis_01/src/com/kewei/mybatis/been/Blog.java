package com.kewei.mybatis.been;

import java.util.List;

public class Blog {
	
	private int id;
	private String title;
	private int author_id;
	private String state;
	private String style;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author_id=" + author_id + ", state=" + state + ", style="
				+ style + "]";
	}
	
	
	
	
	

}
