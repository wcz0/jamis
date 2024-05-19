package com.wcz0.renderers;
/**
 * tpl 渲染器

 * @author wcz0
 * @version 6.2.2
 */
public class Tpl extends BaseRenderer {

	public Tpl() {
		this.set("type", "tpl");
	}

	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Tpl editorSetting(Object value) {
		return (Tpl) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Tpl html(Object value) {
		return (Tpl) this.set("html", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Tpl className(Object value) {
		return (Tpl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Tpl disabled(Object value) {
		return (Tpl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Tpl staticPlaceholder(Object value) {
		return (Tpl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Tpl useMobileUI(Object value) {
		return (Tpl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Tpl testIdBuilder(Object value) {
		return (Tpl) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Tpl testid(Object value) {
		return (Tpl) this.set("testid", value);
	}
	
	/**
	    */
	public Tpl tpl(Object value) {
		return (Tpl) this.set("tpl", value);
	}
	
	/**
	 * 标签类型
    */
	public Tpl wrapperComponent(Object value) {
		return (Tpl) this.set("wrapperComponent", value);
	}
	
	/**
	 * 角标
    */
	public Tpl badge(Object value) {
		return (Tpl) this.set("badge", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Tpl hidden(Object value) {
		return (Tpl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public Tpl visible(Object value) {
		return (Tpl) this.set("visible", value);
	}
	
	/**
	 * 指定为模板渲染器。文档：https://aisuda.bce.baidu.com/amis/zh-CN/docs/concepts/template
    * 可选值: tpl | html
    */
	public Tpl type(Object value) {
		return (Tpl) this.set("type", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Tpl staticClassName(Object value) {
		return (Tpl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Tpl staticInputClassName(Object value) {
		return (Tpl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 自定义样式
    */
	public Tpl style(Object value) {
		return (Tpl) this.set("style", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Tpl $$id(Object value) {
		return (Tpl) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Tpl disabledOn(Object value) {
		return (Tpl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Tpl static_(Object value) {
		return (Tpl) this.set("static_", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Tpl staticOn(Object value) {
		return (Tpl) this.set("staticOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Tpl visibleOn(Object value) {
		return (Tpl) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Tpl id(Object value) {
		return (Tpl) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Tpl onEvent(Object value) {
		return (Tpl) this.set("onEvent", value);
	}
	
	/**
	    */
	public Tpl text(Object value) {
		return (Tpl) this.set("text", value);
	}
	
	/**
	 * 是否内联显示？
    */
	public Tpl inline(Object value) {
		return (Tpl) this.set("inline", value);
	}
	
	/**
	    */
	public Tpl testidBuilder(Object value) {
		return (Tpl) this.set("testidBuilder", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Tpl hiddenOn(Object value) {
		return (Tpl) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Tpl staticLabelClassName(Object value) {
		return (Tpl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Tpl staticSchema(Object value) {
		return (Tpl) this.set("staticSchema", value);
	}
	
	/**
	    */
	public Tpl raw(Object value) {
		return (Tpl) this.set("raw", value);
	}
	}