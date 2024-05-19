package com.wcz0.renderers;
/**
 * Grid 格子布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/grid

 * @author wcz0
 * @version 6.2.2
 */
public class Grid extends BaseRenderer {

	public Grid() {
		this.set("type", "grid");
	}

	/**
	 * 容器 css 类名
    */
	public Grid className(Object value) {
		return (Grid) this.set("className", value);
	}
	
	/**
	 * 水平对齐方式
    * 可选值: left | right | between | center
    */
	public Grid align(Object value) {
		return (Grid) this.set("align", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Grid visibleOn(Object value) {
		return (Grid) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Grid static_(Object value) {
		return (Grid) this.set("static_", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Grid useMobileUI(Object value) {
		return (Grid) this.set("useMobileUI", value);
	}
	
	/**
	 * 列集合
    */
	public Grid columns(Object value) {
		return (Grid) this.set("columns", value);
	}
	
	/**
	 * 水平间距
    * 可选值: xs | sm | base | none | md | lg
    */
	public Grid gap(Object value) {
		return (Grid) this.set("gap", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Grid hiddenOn(Object value) {
		return (Grid) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Grid staticInputClassName(Object value) {
		return (Grid) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定为 Grid 格子布局渲染器。
    */
	public Grid type(Object value) {
		return (Grid) this.set("type", value);
	}
	
	/**
	 * 是否显示
    */
	public Grid visible(Object value) {
		return (Grid) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Grid onEvent(Object value) {
		return (Grid) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Grid staticClassName(Object value) {
		return (Grid) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Grid style(Object value) {
		return (Grid) this.set("style", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Grid hidden(Object value) {
		return (Grid) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Grid id(Object value) {
		return (Grid) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Grid staticOn(Object value) {
		return (Grid) this.set("staticOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public Grid disabled(Object value) {
		return (Grid) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Grid disabledOn(Object value) {
		return (Grid) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Grid editorSetting(Object value) {
		return (Grid) this.set("editorSetting", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Grid staticLabelClassName(Object value) {
		return (Grid) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Grid testIdBuilder(Object value) {
		return (Grid) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Grid testid(Object value) {
		return (Grid) this.set("testid", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Grid $$id(Object value) {
		return (Grid) this.set("$$id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Grid staticPlaceholder(Object value) {
		return (Grid) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Grid staticSchema(Object value) {
		return (Grid) this.set("staticSchema", value);
	}
	
	/**
	 * 垂直对齐方式
    * 可选值: top | middle | bottom | between
    */
	public Grid valign(Object value) {
		return (Grid) this.set("valign", value);
	}
	}