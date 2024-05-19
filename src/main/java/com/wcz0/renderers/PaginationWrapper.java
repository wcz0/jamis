package com.wcz0.renderers;
/**
 * 分页容器功能性渲染器。详情请见：https://aisuda.bce.baidu.com/amis/zh-CN/components/pagination-wrapper

 * @author wcz0
 * @version 6.2.2
 */
public class PaginationWrapper extends BaseRenderer {

	public PaginationWrapper() {
		this.set("type", "paginationWrapper");
	}

	/**
	 * 分页显示位置，如果配置为 none 则需要自己在内容区域配置 pagination 组件，否则不显示。
    * 可选值: top | bottom | none
    */
	public PaginationWrapper position(Object value) {
		return (PaginationWrapper) this.set("position", value);
	}
	
	/**
	 * 内容区域
    */
	public PaginationWrapper body(Object value) {
		return (PaginationWrapper) this.set("body", value);
	}
	
	/**
	 * 是否隐藏
    */
	public PaginationWrapper hidden(Object value) {
		return (PaginationWrapper) this.set("hidden", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public PaginationWrapper editorSetting(Object value) {
		return (PaginationWrapper) this.set("editorSetting", value);
	}
	
	/**
	    */
	public PaginationWrapper testIdBuilder(Object value) {
		return (PaginationWrapper) this.set("testIdBuilder", value);
	}
	
	/**
	 * 最多显示多少个分页按钮。
    */
	public PaginationWrapper maxButtons(Object value) {
		return (PaginationWrapper) this.set("maxButtons", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public PaginationWrapper $$id(Object value) {
		return (PaginationWrapper) this.set("$$id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public PaginationWrapper static_(Object value) {
		return (PaginationWrapper) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public PaginationWrapper staticInputClassName(Object value) {
		return (PaginationWrapper) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public PaginationWrapper staticSchema(Object value) {
		return (PaginationWrapper) this.set("staticSchema", value);
	}
	
	/**
	    */
	public PaginationWrapper testid(Object value) {
		return (PaginationWrapper) this.set("testid", value);
	}
	
	/**
	 * 是否禁用
    */
	public PaginationWrapper disabled(Object value) {
		return (PaginationWrapper) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public PaginationWrapper visible(Object value) {
		return (PaginationWrapper) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public PaginationWrapper onEvent(Object value) {
		return (PaginationWrapper) this.set("onEvent", value);
	}
	
	/**
	 * 输入字段名
    */
	public PaginationWrapper inputName(Object value) {
		return (PaginationWrapper) this.set("inputName", value);
	}
	
	/**
	 * 每页显示多条数据。
    */
	public PaginationWrapper perPage(Object value) {
		return (PaginationWrapper) this.set("perPage", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public PaginationWrapper visibleOn(Object value) {
		return (PaginationWrapper) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public PaginationWrapper staticClassName(Object value) {
		return (PaginationWrapper) this.set("staticClassName", value);
	}
	
	/**
	 * 指定为分页容器功能性渲染器
    */
	public PaginationWrapper type(Object value) {
		return (PaginationWrapper) this.set("type", value);
	}
	
	/**
	 * 是否显示快速跳转输入框
    */
	public PaginationWrapper showPageInput(Object value) {
		return (PaginationWrapper) this.set("showPageInput", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public PaginationWrapper staticOn(Object value) {
		return (PaginationWrapper) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public PaginationWrapper staticPlaceholder(Object value) {
		return (PaginationWrapper) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public PaginationWrapper disabledOn(Object value) {
		return (PaginationWrapper) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public PaginationWrapper staticLabelClassName(Object value) {
		return (PaginationWrapper) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public PaginationWrapper useMobileUI(Object value) {
		return (PaginationWrapper) this.set("useMobileUI", value);
	}
	
	/**
	 * 输出字段名
    */
	public PaginationWrapper outputName(Object value) {
		return (PaginationWrapper) this.set("outputName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public PaginationWrapper className(Object value) {
		return (PaginationWrapper) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public PaginationWrapper hiddenOn(Object value) {
		return (PaginationWrapper) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public PaginationWrapper id(Object value) {
		return (PaginationWrapper) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public PaginationWrapper style(Object value) {
		return (PaginationWrapper) this.set("style", value);
	}
	}