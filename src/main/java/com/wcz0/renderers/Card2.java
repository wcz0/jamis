package com.wcz0.renderers;
/**
 * Card2 新卡片渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card2

 * @author wcz0
 * @version 6.2.2
 */
public class Card2 extends BaseRenderer {

	public Card2() {
		this.set("type", "card2");
	}

	/**
	 * 是否禁用表达式
    */
	public Card2 disabledOn(Object value) {
		return (Card2) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Card2 hiddenOn(Object value) {
		return (Card2) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Card2 visibleOn(Object value) {
		return (Card2) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Card2 static_(Object value) {
		return (Card2) this.set("static_", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Card2 staticOn(Object value) {
		return (Card2) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Card2 staticInputClassName(Object value) {
		return (Card2) this.set("staticInputClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Card2 className(Object value) {
		return (Card2) this.set("className", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Card2 editorSetting(Object value) {
		return (Card2) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Card2 testIdBuilder(Object value) {
		return (Card2) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否显示
    */
	public Card2 visible(Object value) {
		return (Card2) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Card2 onEvent(Object value) {
		return (Card2) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Card2 staticClassName(Object value) {
		return (Card2) this.set("staticClassName", value);
	}
	
	/**
	 * 指定为 card2 类型
    */
	public Card2 type(Object value) {
		return (Card2) this.set("type", value);
	}
	
	/**
	    */
	public Card2 testid(Object value) {
		return (Card2) this.set("testid", value);
	}
	
	/**
	 * 不配置href且cards容器下生效，点击整个卡片触发选中
    */
	public Card2 checkOnItemClick(Object value) {
		return (Card2) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 自定义样式
    */
	public Card2 style(Object value) {
		return (Card2) this.set("style", value);
	}
	
	/**
	 * 渲染标签
    */
	public Card2 wrapperComponent(Object value) {
		return (Card2) this.set("wrapperComponent", value);
	}
	
	/**
	    */
	public Card2 staticSchema(Object value) {
		return (Card2) this.set("staticSchema", value);
	}
	
	/**
	 * body 类名
    */
	public Card2 bodyClassName(Object value) {
		return (Card2) this.set("bodyClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Card2 $$id(Object value) {
		return (Card2) this.set("$$id", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Card2 id(Object value) {
		return (Card2) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Card2 staticPlaceholder(Object value) {
		return (Card2) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Card2 useMobileUI(Object value) {
		return (Card2) this.set("useMobileUI", value);
	}
	
	/**
	 * 内容
    */
	public Card2 body(Object value) {
		return (Card2) this.set("body", value);
	}
	
	/**
	 * 隐藏选框
    */
	public Card2 hideCheckToggler(Object value) {
		return (Card2) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 是否禁用
    */
	public Card2 disabled(Object value) {
		return (Card2) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Card2 hidden(Object value) {
		return (Card2) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Card2 staticLabelClassName(Object value) {
		return (Card2) this.set("staticLabelClassName", value);
	}
	}