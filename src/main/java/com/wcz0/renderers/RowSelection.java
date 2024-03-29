package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class RowSelection extends BaseRenderer {

	public RowSelection() {
		this.set("type", "rowSelection");
	}

	public RowSelection set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 行是否禁用表达式
    */
	public RowSelection disableOn(Object value) {
		return (RowSelection) this.set("disableOn", value);
	}
	
	/**
	 * 自定义选择菜单
    */
	public RowSelection selections(Object value) {
		return (RowSelection) this.set("selections", value);
	}
	
	/**
	 * 已选择的key值
    */
	public RowSelection selectedRowKeys(Object value) {
		return (RowSelection) this.set("selectedRowKeys", value);
	}
	
	/**
	 * 已选择的key值表达式
    */
	public RowSelection selectedRowKeysExpr(Object value) {
		return (RowSelection) this.set("selectedRowKeysExpr", value);
	}
	
	/**
	 * 已选择的key值表达式
    */
	public RowSelection columnWidth(Object value) {
		return (RowSelection) this.set("columnWidth", value);
	}
	
	/**
	 * 是否点击行触发选中或取消选中
    */
	public RowSelection rowClick(Object value) {
		return (RowSelection) this.set("rowClick", value);
	}
	
	/**
	 * 选择类型 单选/多选
    */
	public RowSelection type(Object value) {
		return (RowSelection) this.set("type", value);
	}
	
	/**
	 * 对应数据源的key值
    */
	public RowSelection keyField(Object value) {
		return (RowSelection) this.set("keyField", value);
	}
	}