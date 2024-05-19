package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class GridColumn extends BaseRenderer {

	public GridColumn() {
		this.set("type", "gridColumn");
	}

	/**
	 * 小屏时（>=768px）宽度占比
    */
	public GridColumn sm(Object value) {
		return (GridColumn) this.set("sm", value);
	}
	
	/**
	 * 垂直对齐方式
    * 可选值: top | middle | bottom | between
    */
	public GridColumn valign(Object value) {
		return (GridColumn) this.set("valign", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public GridColumn mode(Object value) {
		return (GridColumn) this.set("mode", value);
	}
	
	/**
	 * 列类名
    */
	public GridColumn columnClassName(Object value) {
		return (GridColumn) this.set("columnClassName", value);
	}
	
	/**
	 * 极小屏（<768px）时宽度占比
    */
	public GridColumn xs(Object value) {
		return (GridColumn) this.set("xs", value);
	}
	
	/**
	 * 中屏时(>=992px)宽度占比
    */
	public GridColumn md(Object value) {
		return (GridColumn) this.set("md", value);
	}
	
	/**
	 * 大屏时(>=1200px)宽度占比
    */
	public GridColumn lg(Object value) {
		return (GridColumn) this.set("lg", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public GridColumn horizontal(Object value) {
		return (GridColumn) this.set("horizontal", value);
	}
	
	/**
	    */
	public GridColumn body(Object value) {
		return (GridColumn) this.set("body", value);
	}
	
	/**
	 * 样式
    */
	public GridColumn style(Object value) {
		return (GridColumn) this.set("style", value);
	}
	}