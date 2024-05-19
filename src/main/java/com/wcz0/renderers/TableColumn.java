package com.wcz0.renderers;
/**
 * 表格列，不指定类型时默认为文本类型。

 * @author wcz0
 * @version 6.2.2
 */
public class TableColumn extends BaseRenderer {

	public TableColumn() {
		this.set("type", "tableColumn");
	}

	/**
	 * 配置点击复制功能
    */
	public TableColumn copyable(Object value) {
		return (TableColumn) this.set("copyable", value);
	}
	
	/**
	 * 配置是否可以排序
    */
	public TableColumn sortable(Object value) {
		return (TableColumn) this.set("sortable", value);
	}
	
	/**
	 * 列宽度
    */
	public TableColumn width(Object value) {
		return (TableColumn) this.set("width", value);
	}
	
	/**
	 * 列对齐方式
    * 可选值: left | right | center | justify
    */
	public TableColumn align(Object value) {
		return (TableColumn) this.set("align", value);
	}
	
	/**
	 * todo
    */
	public TableColumn filterable(Object value) {
		return (TableColumn) this.set("filterable", value);
	}
	
	/**
	 * 当一次性渲染太多列上有用，默认为 100，可以用来提升表格渲染性能
    */
	public TableColumn lazyRenderAfter(Object value) {
		return (TableColumn) this.set("lazyRenderAfter", value);
	}
	
	/**
	 * 配置查看详情功能
    */
	public TableColumn popOver(Object value) {
		return (TableColumn) this.set("popOver", value);
	}
	
	/**
	 * 作为表单项时，可以单独配置编辑时的快速编辑面板。
    */
	public TableColumn quickEditOnUpdate(Object value) {
		return (TableColumn) this.set("quickEditOnUpdate", value);
	}
	
	/**
	 * 是否可快速搜索
    */
	public TableColumn searchable(Object value) {
		return (TableColumn) this.set("searchable", value);
	}
	
	/**
	 * 默认值, 只有在 inputTable 里面才有用
    */
	public TableColumn value(Object value) {
		return (TableColumn) this.set("value", value);
	}
	
	/**
	 * 是否唯一, 只有在 inputTable 里面才有用
    */
	public TableColumn unique(Object value) {
		return (TableColumn) this.set("unique", value);
	}
	
	/**
	 * 表格列单元格是否可以获取父级数据域值，默认为true，该配置对当前列内单元格生效
    */
	public TableColumn canAccessSuperData(Object value) {
		return (TableColumn) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 单元格内部组件自定义样式 style作为单元格自定义样式的配置
    */
	public TableColumn innerStyle(Object value) {
		return (TableColumn) this.set("innerStyle", value);
	}
	
	/**
	 * 绑定字段名
    */
	public TableColumn name(Object value) {
		return (TableColumn) this.set("name", value);
	}
	
	/**
	 * 列样式表
    */
	public TableColumn className(Object value) {
		return (TableColumn) this.set("className", value);
	}
	
	/**
	 * 提示信息
    */
	public TableColumn remark(Object value) {
		return (TableColumn) this.set("remark", value);
	}
	
	/**
	 * 配置是否默认展示
    */
	public TableColumn toggled(Object value) {
		return (TableColumn) this.set("toggled", value);
	}
	
	/**
	 * 单元格样式表达式
    */
	public TableColumn classNameExpr(Object value) {
		return (TableColumn) this.set("classNameExpr", value);
	}
	
	/**
	 * 列头样式表
    */
	public TableColumn labelClassName(Object value) {
		return (TableColumn) this.set("labelClassName", value);
	}
	
	/**
	 * 结合表格的 footable 一起使用。 填写 *、xs、sm、md、lg指定 footable 的触发条件，可以填写多个用空格隔开
    * 可选值: * | xs | sm | md | lg
    */
	public TableColumn breakpoint(Object value) {
		return (TableColumn) this.set("breakpoint", value);
	}
	
	/**
	 * 列标题
    */
	public TableColumn label(Object value) {
		return (TableColumn) this.set("label", value);
	}
	
	/**
	 * 配置是否固定当前列
    * 可选值: left | right | none
    */
	public TableColumn fixed(Object value) {
		return (TableColumn) this.set("fixed", value);
	}
	
	/**
	 * 配置快速编辑功能
    */
	public TableColumn quickEdit(Object value) {
		return (TableColumn) this.set("quickEdit", value);
	}
	}