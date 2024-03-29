package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ListenerAction extends BaseRenderer {

	public ListenerAction() {
		this.set("type", "listenerAction");
	}

	public ListenerAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public ListenerAction stopPropagation(Object value) {
		return (ListenerAction) this.set("stopPropagation", value);
	}
	
	/**
	    */
	public ListenerAction actionType(Object value) {
		return (ListenerAction) this.set("actionType", value);
	}
	
	/**
	    */
	public ListenerAction description(Object value) {
		return (ListenerAction) this.set("description", value);
	}
	
	/**
	    */
	public ListenerAction componentId(Object value) {
		return (ListenerAction) this.set("componentId", value);
	}
	
	/**
	    */
	public ListenerAction componentName(Object value) {
		return (ListenerAction) this.set("componentName", value);
	}
	
	/**
	    */
	public ListenerAction ignoreError(Object value) {
		return (ListenerAction) this.set("ignoreError", value);
	}
	
	/**
	    */
	public ListenerAction data(Object value) {
		return (ListenerAction) this.set("data", value);
	}
	
	/**
	    */
	public ListenerAction preventDefault(Object value) {
		return (ListenerAction) this.set("preventDefault", value);
	}
	
	/**
	    */
	public ListenerAction args(Object value) {
		return (ListenerAction) this.set("args", value);
	}
	
	/**
	    * 可选值: merge | override
    */
	public ListenerAction dataMergeMode(Object value) {
		return (ListenerAction) this.set("dataMergeMode", value);
	}
	
	/**
	    */
	public ListenerAction outputVar(Object value) {
		return (ListenerAction) this.set("outputVar", value);
	}
	
	/**
	    */
	public ListenerAction expression(Object value) {
		return (ListenerAction) this.set("expression", value);
	}
	
	/**
	    */
	public ListenerAction execOn(Object value) {
		return (ListenerAction) this.set("execOn", value);
	}
	}