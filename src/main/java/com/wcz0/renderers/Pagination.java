package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Pagination extends BaseRenderer {

	public Pagination() {
		this.set("type", "pagination");
	}

	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Pagination $$id(Object value) {
		return (Pagination) this.set("$$id", value);
	}
	
	/**
	    */
	public Pagination testIdBuilder(Object value) {
		return (Pagination) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Pagination type(Object value) {
		return (Pagination) this.set("type", value);
	}
	
	/**
	 * 模式，默认normal，如果只想简单显示可以配置成 `simple`。
    */
	public Pagination mode(Object value) {
		return (Pagination) this.set("mode", value);
	}
	
	/**
	 * 当前页数
    */
	public Pagination activePage(Object value) {
		return (Pagination) this.set("activePage", value);
	}
	
	/**
	 * 是否展示分页切换，也同时受layout控制
    */
	public Pagination showPerPage(Object value) {
		return (Pagination) this.set("showPerPage", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Pagination className(Object value) {
		return (Pagination) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Pagination disabledOn(Object value) {
		return (Pagination) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Pagination staticPlaceholder(Object value) {
		return (Pagination) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Pagination staticClassName(Object value) {
		return (Pagination) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Pagination staticLabelClassName(Object value) {
		return (Pagination) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Pagination style(Object value) {
		return (Pagination) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Pagination editorSetting(Object value) {
		return (Pagination) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Pagination useMobileUI(Object value) {
		return (Pagination) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Pagination visibleOn(Object value) {
		return (Pagination) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Pagination static_(Object value) {
		return (Pagination) this.set("static_", value);
	}
	
	/**
	    */
	public Pagination testid(Object value) {
		return (Pagination) this.set("testid", value);
	}
	
	/**
	 * 最多显示多少个分页按钮。
    */
	public Pagination maxButtons(Object value) {
		return (Pagination) this.set("maxButtons", value);
	}
	
	/**
	 * 指定每页可以显示多少条
    */
	public Pagination perPageAvailable(Object value) {
		return (Pagination) this.set("perPageAvailable", value);
	}
	
	/**
	    */
	public Pagination hasNext(Object value) {
		return (Pagination) this.set("hasNext", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Pagination id(Object value) {
		return (Pagination) this.set("id", value);
	}
	
	/**
	 * 每页显示条数
    */
	public Pagination perPage(Object value) {
		return (Pagination) this.set("perPage", value);
	}
	
	/**
	 * 是否显示
    */
	public Pagination visible(Object value) {
		return (Pagination) this.set("visible", value);
	}
	
	/**
	    */
	public Pagination staticSchema(Object value) {
		return (Pagination) this.set("staticSchema", value);
	}
	
	/**
	 * 是否禁用
    */
	public Pagination disabled(Object value) {
		return (Pagination) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Pagination hidden(Object value) {
		return (Pagination) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Pagination hiddenOn(Object value) {
		return (Pagination) this.set("hiddenOn", value);
	}
	
	/**
	 * 总条数
    */
	public Pagination total(Object value) {
		return (Pagination) this.set("total", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Pagination onEvent(Object value) {
		return (Pagination) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Pagination staticOn(Object value) {
		return (Pagination) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Pagination staticInputClassName(Object value) {
		return (Pagination) this.set("staticInputClassName", value);
	}
	
	/**
	 * 通过控制layout属性的顺序，调整分页结构 total,perPage,pager,go
    */
	public Pagination layout(Object value) {
		return (Pagination) this.set("layout", value);
	}
	
	/**
	 * 是否显示快速跳转输入框
    */
	public Pagination showPageInput(Object value) {
		return (Pagination) this.set("showPageInput", value);
	}
	
	/**
	 * 弹层挂载节点
    */
	public Pagination popOverContainerSelector(Object value) {
		return (Pagination) this.set("popOverContainerSelector", value);
	}
	}