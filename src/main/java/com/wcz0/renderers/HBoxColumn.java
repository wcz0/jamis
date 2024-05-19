package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class HBoxColumn extends BaseRenderer {

	public HBoxColumn() {
		this.set("type", "hBoxColumn");
	}

	/**
	 * 列上 CSS 类名
    */
	public HBoxColumn columnClassName(Object value) {
		return (HBoxColumn) this.set("columnClassName", value);
	}
	
	/**
	 * 其他样式
    */
	public HBoxColumn style(Object value) {
		return (HBoxColumn) this.set("style", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public HBoxColumn horizontal(Object value) {
		return (HBoxColumn) this.set("horizontal", value);
	}
	
	/**
	 * 是否显示
    */
	public HBoxColumn visible(Object value) {
		return (HBoxColumn) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public HBoxColumn visibleOn(Object value) {
		return (HBoxColumn) this.set("visibleOn", value);
	}
	
	/**
	 * 垂直对齐方式
    * 可选值: top | middle | bottom | between
    */
	public HBoxColumn valign(Object value) {
		return (HBoxColumn) this.set("valign", value);
	}
	
	/**
	 * 宽度
    */
	public HBoxColumn width(Object value) {
		return (HBoxColumn) this.set("width", value);
	}
	
	/**
	 * 高度
    */
	public HBoxColumn height(Object value) {
		return (HBoxColumn) this.set("height", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public HBoxColumn mode(Object value) {
		return (HBoxColumn) this.set("mode", value);
	}
	
	/**
	 * 内容区
    */
	public HBoxColumn body(Object value) {
		return (HBoxColumn) this.set("body", value);
	}
	}