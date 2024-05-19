package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class SparkLine extends BaseRenderer {

	public SparkLine() {
		this.set("type", "sparkLine");
	}

	/**
	 * 是否隐藏
    */
	public SparkLine hidden(Object value) {
		return (SparkLine) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SparkLine hiddenOn(Object value) {
		return (SparkLine) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public SparkLine staticSchema(Object value) {
		return (SparkLine) this.set("staticSchema", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SparkLine static_(Object value) {
		return (SparkLine) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SparkLine staticLabelClassName(Object value) {
		return (SparkLine) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 关联数据变量。
    */
	public SparkLine name(Object value) {
		return (SparkLine) this.set("name", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SparkLine visibleOn(Object value) {
		return (SparkLine) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SparkLine id(Object value) {
		return (SparkLine) this.set("id", value);
	}
	
	/**
	    */
	public SparkLine testid(Object value) {
		return (SparkLine) this.set("testid", value);
	}
	
	/**
	 * 宽度
    */
	public SparkLine width(Object value) {
		return (SparkLine) this.set("width", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SparkLine editorSetting(Object value) {
		return (SparkLine) this.set("editorSetting", value);
	}
	
	/**
	    */
	public SparkLine value(Object value) {
		return (SparkLine) this.set("value", value);
	}
	
	/**
	 * 是否禁用
    */
	public SparkLine disabled(Object value) {
		return (SparkLine) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public SparkLine visible(Object value) {
		return (SparkLine) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SparkLine onEvent(Object value) {
		return (SparkLine) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SparkLine staticClassName(Object value) {
		return (SparkLine) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SparkLine staticInputClassName(Object value) {
		return (SparkLine) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SparkLine staticOn(Object value) {
		return (SparkLine) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SparkLine staticPlaceholder(Object value) {
		return (SparkLine) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public SparkLine style(Object value) {
		return (SparkLine) this.set("style", value);
	}
	
	/**
	 * 空数据时显示的内容
    */
	public SparkLine placeholder(Object value) {
		return (SparkLine) this.set("placeholder", value);
	}
	
	/**
	 * css 类名
    */
	public SparkLine className(Object value) {
		return (SparkLine) this.set("className", value);
	}
	
	/**
	    */
	public SparkLine testIdBuilder(Object value) {
		return (SparkLine) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public SparkLine type(Object value) {
		return (SparkLine) this.set("type", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public SparkLine $$id(Object value) {
		return (SparkLine) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SparkLine disabledOn(Object value) {
		return (SparkLine) this.set("disabledOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SparkLine useMobileUI(Object value) {
		return (SparkLine) this.set("useMobileUI", value);
	}
	
	/**
	 * 高度
    */
	public SparkLine height(Object value) {
		return (SparkLine) this.set("height", value);
	}
	
	/**
	 * 点击行为
    */
	public SparkLine clickAction(Object value) {
		return (SparkLine) this.set("clickAction", value);
	}
	}