package com.wcz0.renderers;
/**
 * Words

 * @author wcz0
 * @version 6.2.2
 */
public class Words extends BaseRenderer {

	public Words() {
		this.set("type", "words");
	}

	/**
	 * 静态展示空值占位
    */
	public Words staticPlaceholder(Object value) {
		return (Words) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Words staticClassName(Object value) {
		return (Words) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Words staticLabelClassName(Object value) {
		return (Words) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Words style(Object value) {
		return (Words) this.set("style", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Words hiddenOn(Object value) {
		return (Words) this.set("hiddenOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Words editorSetting(Object value) {
		return (Words) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Words testIdBuilder(Object value) {
		return (Words) this.set("testIdBuilder", value);
	}
	
	/**
	 * tags数据
    */
	public Words words(Object value) {
		return (Words) this.set("words", value);
	}
	
	/**
	 * 分割符
    */
	public Words delimiter(Object value) {
		return (Words) this.set("delimiter", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Words onEvent(Object value) {
		return (Words) this.set("onEvent", value);
	}
	
	/**
	    */
	public Words staticSchema(Object value) {
		return (Words) this.set("staticSchema", value);
	}
	
	/**
	 * 展示限制, 为0时也无限制
    */
	public Words limit(Object value) {
		return (Words) this.set("limit", value);
	}
	
	/**
	 * 展示文字
    */
	public Words collapseButton(Object value) {
		return (Words) this.set("collapseButton", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Words className(Object value) {
		return (Words) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Words static_(Object value) {
		return (Words) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Words staticInputClassName(Object value) {
		return (Words) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Words useMobileUI(Object value) {
		return (Words) this.set("useMobileUI", value);
	}
	
	/**
	 * 展示文字
    */
	public Words expendButtonText(Object value) {
		return (Words) this.set("expendButtonText", value);
	}
	
	/**
	 * useTag 当数据是数组时，是否使用tag的方式展示
    */
	public Words inTag(Object value) {
		return (Words) this.set("inTag", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Words hidden(Object value) {
		return (Words) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Words id(Object value) {
		return (Words) this.set("id", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Words $$id(Object value) {
		return (Words) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用
    */
	public Words disabled(Object value) {
		return (Words) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public Words visible(Object value) {
		return (Words) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Words visibleOn(Object value) {
		return (Words) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Words staticOn(Object value) {
		return (Words) this.set("staticOn", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Words disabledOn(Object value) {
		return (Words) this.set("disabledOn", value);
	}
	
	/**
	    */
	public Words type(Object value) {
		return (Words) this.set("type", value);
	}
	
	/**
	    */
	public Words testid(Object value) {
		return (Words) this.set("testid", value);
	}
	
	/**
	 * 展示文字
    */
	public Words expendButton(Object value) {
		return (Words) this.set("expendButton", value);
	}
	
	/**
	 * 收起文字
    */
	public Words collapseButtonText(Object value) {
		return (Words) this.set("collapseButtonText", value);
	}
	}