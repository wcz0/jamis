package com.wcz0.renderers;
/**
 * Table 表格渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/table

 * @author wcz0
 * @version 6.2.2
 */
public class Table extends BaseRenderer {

	public Table() {
		this.set("type", "table");
	}

	public Table set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 底部总结行
    */
	public Table affixRow(Object value) {
		return (Table) this.set("affixRow", value);
	}
	
	/**
	 * 是否可调整列宽
    */
	public Table resizable(Object value) {
		return (Table) this.set("resizable", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Table staticLabelClassName(Object value) {
		return (Table) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Table useMobileUI(Object value) {
		return (Table) this.set("useMobileUI", value);
	}
	
	/**
	 * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
    */
	public Table columnsTogglable(Object value) {
		return (Table) this.set("columnsTogglable", value);
	}
	
	/**
	 * 占位符
    */
	public Table placeholder(Object value) {
		return (Table) this.set("placeholder", value);
	}
	
	/**
	 * 数据源：绑定当前环境变量
    */
	public Table source(Object value) {
		return (Table) this.set("source", value);
	}
	
	/**
	 * 标题
    */
	public Table title(Object value) {
		return (Table) this.set("title", value);
	}
	
	/**
	 * 行样式表表达式
    */
	public Table rowClassNameExpr(Object value) {
		return (Table) this.set("rowClassNameExpr", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Table className(Object value) {
		return (Table) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Table hidden(Object value) {
		return (Table) this.set("hidden", value);
	}
	
	/**
	 * 表格的列信息
    */
	public Table columns(Object value) {
		return (Table) this.set("columns", value);
	}
	
	/**
	 * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
    */
	public Table combineNum(Object value) {
		return (Table) this.set("combineNum", value);
	}
	
	/**
	 * 设置数据
    */
	public Table data(Object value) {
		return (Table) this.set("data", value);
	}
	
	/**
	 * 是否禁用
    */
	public Table disabled(Object value) {
		return (Table) this.set("disabled", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Table editorSetting(Object value) {
		return (Table) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为表格渲染器。
    * 可选值: table | static-table
    */
	public Table type(Object value) {
		return (Table) this.set("type", value);
	}
	
	/**
	 * 是否显示底部
    */
	public Table showFooter(Object value) {
		return (Table) this.set("showFooter", value);
	}
	
	/**
	 * 是否显示头部
    */
	public Table showHeader(Object value) {
		return (Table) this.set("showHeader", value);
	}
	
	/**
	 * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
    */
	public Table autoGenerateFilter(Object value) {
		return (Table) this.set("autoGenerateFilter", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Table staticInputClassName(Object value) {
		return (Table) this.set("staticInputClassName", value);
	}
	
	/**
	 * 合并单元格配置，配置从第几列开始合并。
    */
	public Table combineFromIndex(Object value) {
		return (Table) this.set("combineFromIndex", value);
	}
	
	/**
	 * 行角标
    */
	public Table itemBadge(Object value) {
		return (Table) this.set("itemBadge", value);
	}
	
	/**
	 * 表格自动计算高度
    */
	public Table autoFillHeight(Object value) {
		return (Table) this.set("autoFillHeight", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Table visibleOn(Object value) {
		return (Table) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Table staticPlaceholder(Object value) {
		return (Table) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 顶部外层 CSS 类名
    */
	public Table headerClassName(Object value) {
		return (Table) this.set("headerClassName", value);
	}
	
	/**
	 * 懒加载 API，当行数据中用 defer: true 标记了，则其孩子节点将会用这个 API 来拉取数据。
    */
	public Table deferApi(Object value) {
		return (Table) this.set("deferApi", value);
	}
	
	/**
	 * 表格 CSS 类名
    */
	public Table tableClassName(Object value) {
		return (Table) this.set("tableClassName", value);
	}
	
	/**
	 * 顶部总结行
    */
	public Table prefixRow(Object value) {
		return (Table) this.set("prefixRow", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Table hiddenOn(Object value) {
		return (Table) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Table staticOn(Object value) {
		return (Table) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Table staticClassName(Object value) {
		return (Table) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Table staticSchema(Object value) {
		return (Table) this.set("staticSchema", value);
	}
	
	/**
	 * 是否固底
    */
	public Table affixFooter(Object value) {
		return (Table) this.set("affixFooter", value);
	}
	
	/**
	 * 底部外层 CSS 类名
    */
	public Table footerClassName(Object value) {
		return (Table) this.set("footerClassName", value);
	}
	
	/**
	 * table layout
    * 可选值: fixed | auto
    */
	public Table tableLayout(Object value) {
		return (Table) this.set("tableLayout", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Table disabledOn(Object value) {
		return (Table) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Table id(Object value) {
		return (Table) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Table onEvent(Object value) {
		return (Table) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Table static_(Object value) {
		return (Table) this.set("static_", value);
	}
	
	/**
	 * 组件样式
    */
	public Table style(Object value) {
		return (Table) this.set("style", value);
	}
	
	/**
	 * 是否固定表头
    */
	public Table affixHeader(Object value) {
		return (Table) this.set("affixHeader", value);
	}
	
	/**
	 * 是否显示
    */
	public Table visible(Object value) {
		return (Table) this.set("visible", value);
	}
	
	/**
	 * 是否开启底部展示功能，适合移动端展示
    */
	public Table footable(Object value) {
		return (Table) this.set("footable", value);
	}
	
	/**
	 * 工具栏 CSS 类名
    */
	public Table toolbarClassName(Object value) {
		return (Table) this.set("toolbarClassName", value);
	}
	
	/**
	 * 表格是否可以获取父级数据域值，默认为false
    */
	public Table canAccessSuperData(Object value) {
		return (Table) this.set("canAccessSuperData", value);
	}
	}