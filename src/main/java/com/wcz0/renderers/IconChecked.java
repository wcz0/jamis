package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class IconChecked extends BaseRenderer {

	public IconChecked() {
		this.set("type", "iconChecked");
	}

	public IconChecked set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public IconChecked id(Object value) {
		return (IconChecked) this.set("id", value);
	}
	
	/**
	    */
	public IconChecked name(Object value) {
		return (IconChecked) this.set("name", value);
	}
	
	/**
	    */
	public IconChecked svg(Object value) {
		return (IconChecked) this.set("svg", value);
	}
	}