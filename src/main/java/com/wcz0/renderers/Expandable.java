package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Expandable extends BaseRenderer {

	public Expandable() {
		this.set("type", "expandable");
	}

	public Expandable set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 对应渲染器类型
    */
	public Expandable type(Object value) {
		return (Expandable) this.set("type", value);
	}
	
	/**
	 * 对应数据源的key值
    */
	public Expandable keyField(Object value) {
		return (Expandable) this.set("keyField", value);
	}
	
	/**
	 * 行是否可展开表达式
    */
	public Expandable expandableOn(Object value) {
		return (Expandable) this.set("expandableOn", value);
	}
	
	/**
	 * 展开行自定义样式表达式
    */
	public Expandable expandedRowClassNameExpr(Object value) {
		return (Expandable) this.set("expandedRowClassNameExpr", value);
	}
	
	/**
	 * 已展开的key值
    */
	public Expandable expandedRowKeys(Object value) {
		return (Expandable) this.set("expandedRowKeys", value);
	}
	
	/**
	 * 已展开的key值表达式
    */
	public Expandable expandedRowKeysExpr(Object value) {
		return (Expandable) this.set("expandedRowKeysExpr", value);
	}
	}