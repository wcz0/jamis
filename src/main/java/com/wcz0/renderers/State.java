package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class State extends BaseRenderer {

	public State() {
		this.set("type", "state");
	}

	public State set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public State visible(Object value) {
		return (State) this.set("visible", value);
	}
	
	/**
	 * 显示条件
    */
	public State visibleOn(Object value) {
		return (State) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public State static_(Object value) {
		return (State) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public State staticPlaceholder(Object value) {
		return (State) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public State style(Object value) {
		return (State) this.set("style", value);
	}
	
	/**
	 * 是否隐藏
    */
	public State hidden(Object value) {
		return (State) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public State staticInputClassName(Object value) {
		return (State) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public State useMobileUI(Object value) {
		return (State) this.set("useMobileUI", value);
	}
	
	/**
	 * 状态标题
    */
	public State title(Object value) {
		return (State) this.set("title", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public State staticClassName(Object value) {
		return (State) this.set("staticClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public State disabledOn(Object value) {
		return (State) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public State hiddenOn(Object value) {
		return (State) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public State onEvent(Object value) {
		return (State) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public State staticLabelClassName(Object value) {
		return (State) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public State staticSchema(Object value) {
		return (State) this.set("staticSchema", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public State className(Object value) {
		return (State) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public State disabled(Object value) {
		return (State) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public State id(Object value) {
		return (State) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public State staticOn(Object value) {
		return (State) this.set("staticOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public State editorSetting(Object value) {
		return (State) this.set("editorSetting", value);
	}
	
	/**
	 * 内容
    */
	public State body(Object value) {
		return (State) this.set("body", value);
	}
	}