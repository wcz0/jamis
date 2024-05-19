package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Column extends BaseRenderer {

	public Column() {
		this.set("type", "column");
	}

	/**
	 * 内容居左、居中、居右
    */
	public Column align(Object value) {
		return (Column) this.set("align", value);
	}
	
	/**
	 * 单元格样式
    */
	public Column classNameExpr(Object value) {
		return (Column) this.set("classNameExpr", value);
	}
	
	/**
	 * 配置快速编辑功能
    */
	public Column quickEdit(Object value) {
		return (Column) this.set("quickEdit", value);
	}
	
	/**
	    */
	public Column width(Object value) {
		return (Column) this.set("width", value);
	}
	
	/**
	 * 可复制
    */
	public Column copyable(Object value) {
		return (Column) this.set("copyable", value);
	}
	
	/**
	 * 快速搜索
    */
	public Column searchable(Object value) {
		return (Column) this.set("searchable", value);
	}
	
	/**
	 * 快速排序
    */
	public Column sorter(Object value) {
		return (Column) this.set("sorter", value);
	}
	
	/**
	 * 兼容table快速排序
    */
	public Column sortable(Object value) {
		return (Column) this.set("sortable", value);
	}
	
	/**
	 * 指定列标题
    */
	public Column title(Object value) {
		return (Column) this.set("title", value);
	}
	
	/**
	 * 指定行合并表达式
    */
	public Column rowSpanExpr(Object value) {
		return (Column) this.set("rowSpanExpr", value);
	}
	
	/**
	 * 当前列是否展示
    */
	public Column toggled(Object value) {
		return (Column) this.set("toggled", value);
	}
	
	/**
	 * 列样式
    */
	public Column className(Object value) {
		return (Column) this.set("className", value);
	}
	
	/**
	 * 指定列内容渲染器
    */
	public Column type(Object value) {
		return (Column) this.set("type", value);
	}
	
	/**
	 * 表头分组
    */
	public Column children(Object value) {
		return (Column) this.set("children", value);
	}
	
	/**
	 * 兼容table列筛选
    */
	public Column filterable(Object value) {
		return (Column) this.set("filterable", value);
	}
	
	/**
	 * 是否固定在左侧/右侧
    */
	public Column fixed(Object value) {
		return (Column) this.set("fixed", value);
	}
	
	/**
	 * 表格列单元格是否可以获取父级数据域值，默认为true，该配置对当前列内单元格生效
    */
	public Column canAccessSuperData(Object value) {
		return (Column) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 指定列唯一标识
    */
	public Column name(Object value) {
		return (Column) this.set("name", value);
	}
	
	/**
	 * 指定列合并表达式
    */
	public Column colSpanExpr(Object value) {
		return (Column) this.set("colSpanExpr", value);
	}
	
	/**
	 * 列表头提示
    */
	public Column remark(Object value) {
		return (Column) this.set("remark", value);
	}
	
	/**
	 * 表头单元格样式
    */
	public Column titleClassName(Object value) {
		return (Column) this.set("titleClassName", value);
	}
	}