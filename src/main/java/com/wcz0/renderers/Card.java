package com.wcz0.renderers;
/**
 * Card 卡片渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card

 * @author wcz0
 * @version 6.2.2
 */
public class Card extends BaseRenderer {

	public Card() {
		this.set("type", "card");
	}

	/**
	 * 是否隐藏
    */
	public Card hidden(Object value) {
		return (Card) this.set("hidden", value);
	}
	
	/**
	 * 卡片内容区的表单项label是否使用Card内部的样式，默认为true
    */
	public Card useCardLabel(Object value) {
		return (Card) this.set("useCardLabel", value);
	}
	
	/**
	 * 底部按钮集合。
    */
	public Card actions(Object value) {
		return (Card) this.set("actions", value);
	}
	
	/**
	 * 是否显示
    */
	public Card visible(Object value) {
		return (Card) this.set("visible", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Card useMobileUI(Object value) {
		return (Card) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为 card 类型
    */
	public Card type(Object value) {
		return (Card) this.set("type", value);
	}
	
	/**
	 * 工具栏按钮
    */
	public Card toolbar(Object value) {
		return (Card) this.set("toolbar", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Card $$id(Object value) {
		return (Card) this.set("$$id", value);
	}
	
	/**
	 * 组件样式
    */
	public Card style(Object value) {
		return (Card) this.set("style", value);
	}
	
	/**
	 * 多媒体区域
    */
	public Card media(Object value) {
		return (Card) this.set("media", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Card staticClassName(Object value) {
		return (Card) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Card editorSetting(Object value) {
		return (Card) this.set("editorSetting", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Card disabledOn(Object value) {
		return (Card) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Card hiddenOn(Object value) {
		return (Card) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Card id(Object value) {
		return (Card) this.set("id", value);
	}
	
	/**
	    */
	public Card testid(Object value) {
		return (Card) this.set("testid", value);
	}
	
	/**
	 * 头部配置
    */
	public Card header(Object value) {
		return (Card) this.set("header", value);
	}
	
	/**
	 * 内容区域
    */
	public Card body(Object value) {
		return (Card) this.set("body", value);
	}
	
	/**
	 * 是否禁用
    */
	public Card disabled(Object value) {
		return (Card) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Card visibleOn(Object value) {
		return (Card) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Card staticInputClassName(Object value) {
		return (Card) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Card testIdBuilder(Object value) {
		return (Card) this.set("testIdBuilder", value);
	}
	
	/**
	 * 次要说明
    */
	public Card secondary(Object value) {
		return (Card) this.set("secondary", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Card onEvent(Object value) {
		return (Card) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Card staticOn(Object value) {
		return (Card) this.set("staticOn", value);
	}
	
	/**
	    */
	public Card staticSchema(Object value) {
		return (Card) this.set("staticSchema", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Card className(Object value) {
		return (Card) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Card staticPlaceholder(Object value) {
		return (Card) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Card static_(Object value) {
		return (Card) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Card staticLabelClassName(Object value) {
		return (Card) this.set("staticLabelClassName", value);
	}
	}