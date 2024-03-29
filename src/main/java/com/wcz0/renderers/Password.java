package com.wcz0.renderers;
/**
 * Password

 * @author wcz0
 * @version 6.2.2
 */
public class Password extends BaseRenderer {

	public Password() {
		this.set("type", "password");
	}

	public Password set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 静态展示表单项Label类名
    */
	public Password staticLabelClassName(Object value) {
		return (Password) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Password staticInputClassName(Object value) {
		return (Password) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Password useMobileUI(Object value) {
		return (Password) this.set("useMobileUI", value);
	}
	
	/**
	 * 打码模式的文本
    */
	public Password mosaicText(Object value) {
		return (Password) this.set("mosaicText", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Password className(Object value) {
		return (Password) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public Password visible(Object value) {
		return (Password) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Password staticOn(Object value) {
		return (Password) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public Password style(Object value) {
		return (Password) this.set("style", value);
	}
	
	/**
	    */
	public Password type(Object value) {
		return (Password) this.set("type", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Password hidden(Object value) {
		return (Password) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Password onEvent(Object value) {
		return (Password) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Password staticClassName(Object value) {
		return (Password) this.set("staticClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Password id(Object value) {
		return (Password) this.set("id", value);
	}
	
	/**
	    */
	public Password staticSchema(Object value) {
		return (Password) this.set("staticSchema", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Password disabledOn(Object value) {
		return (Password) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Password visibleOn(Object value) {
		return (Password) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Password staticPlaceholder(Object value) {
		return (Password) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Password editorSetting(Object value) {
		return (Password) this.set("editorSetting", value);
	}
	
	/**
	 * 是否禁用
    */
	public Password disabled(Object value) {
		return (Password) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Password hiddenOn(Object value) {
		return (Password) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Password static_(Object value) {
		return (Password) this.set("static_", value);
	}
	}