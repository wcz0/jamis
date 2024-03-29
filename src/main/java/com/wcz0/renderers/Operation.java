package com.wcz0.renderers;
/**
 * 操作栏渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/operation

 * @author wcz0
 * @version 6.2.2
 */
public class Operation extends BaseRenderer {

	public Operation() {
		this.set("type", "operation");
	}

	public Operation set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Operation editorSetting(Object value) {
		return (Operation) this.set("editorSetting", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Operation id(Object value) {
		return (Operation) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Operation staticClassName(Object value) {
		return (Operation) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Operation style(Object value) {
		return (Operation) this.set("style", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Operation visibleOn(Object value) {
		return (Operation) this.set("visibleOn", value);
	}
	
	/**
	    */
	public Operation buttons(Object value) {
		return (Operation) this.set("buttons", value);
	}
	
	/**
	 * 设置label
    */
	public Operation label(Object value) {
		return (Operation) this.set("label", value);
	}
	
	/**
	 * 是否显示
    */
	public Operation visible(Object value) {
		return (Operation) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Operation static_(Object value) {
		return (Operation) this.set("static_", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Operation staticOn(Object value) {
		return (Operation) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Operation staticPlaceholder(Object value) {
		return (Operation) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Operation staticLabelClassName(Object value) {
		return (Operation) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Operation className(Object value) {
		return (Operation) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Operation disabledOn(Object value) {
		return (Operation) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Operation hiddenOn(Object value) {
		return (Operation) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Operation onEvent(Object value) {
		return (Operation) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Operation staticInputClassName(Object value) {
		return (Operation) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Operation staticSchema(Object value) {
		return (Operation) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Operation useMobileUI(Object value) {
		return (Operation) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为操作栏
    */
	public Operation type(Object value) {
		return (Operation) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public Operation disabled(Object value) {
		return (Operation) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Operation hidden(Object value) {
		return (Operation) this.set("hidden", value);
	}
	
	/**
	 * 占位符
    */
	public Operation placeholder(Object value) {
		return (Operation) this.set("placeholder", value);
	}
	}