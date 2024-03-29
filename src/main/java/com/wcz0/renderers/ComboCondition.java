package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ComboCondition extends BaseRenderer {

	public ComboCondition() {
		this.set("type", "comboCondition");
	}

	public ComboCondition set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public ComboCondition test(Object value) {
		return (ComboCondition) this.set("test", value);
	}
	
	/**
	    */
	public ComboCondition items(Object value) {
		return (ComboCondition) this.set("items", value);
	}
	
	/**
	    */
	public ComboCondition label(Object value) {
		return (ComboCondition) this.set("label", value);
	}
	
	/**
	    */
	public ComboCondition scaffold(Object value) {
		return (ComboCondition) this.set("scaffold", value);
	}
	
	/**
	    */
	public ComboCondition mode(Object value) {
		return (ComboCondition) this.set("mode", value);
	}
	}