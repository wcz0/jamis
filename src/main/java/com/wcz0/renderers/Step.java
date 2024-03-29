package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Step extends BaseRenderer {

	public Step() {
		this.set("type", "step");
	}

	public Step set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public Step disabled(Object value) {
		return (Step) this.set("disabled", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Step onEvent(Object value) {
		return (Step) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Step staticPlaceholder(Object value) {
		return (Step) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Step staticLabelClassName(Object value) {
		return (Step) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Step useMobileUI(Object value) {
		return (Step) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述
    */
	public Step description(Object value) {
		return (Step) this.set("description", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Step className(Object value) {
		return (Step) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Step disabledOn(Object value) {
		return (Step) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Step visible(Object value) {
		return (Step) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Step static_(Object value) {
		return (Step) this.set("static_", value);
	}
	
	/**
	 * 组件样式
    */
	public Step style(Object value) {
		return (Step) this.set("style", value);
	}
	
	/**
	 * 子标题
    */
	public Step subTitle(Object value) {
		return (Step) this.set("subTitle", value);
	}
	
	/**
	 * 图标
    */
	public Step icon(Object value) {
		return (Step) this.set("icon", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Step hiddenOn(Object value) {
		return (Step) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Step staticOn(Object value) {
		return (Step) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Step staticClassName(Object value) {
		return (Step) this.set("staticClassName", value);
	}
	
	/**
	 * 标题
    */
	public Step title(Object value) {
		return (Step) this.set("title", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Step hidden(Object value) {
		return (Step) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Step visibleOn(Object value) {
		return (Step) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Step id(Object value) {
		return (Step) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Step staticInputClassName(Object value) {
		return (Step) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Step staticSchema(Object value) {
		return (Step) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Step editorSetting(Object value) {
		return (Step) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Step value(Object value) {
		return (Step) this.set("value", value);
	}
	}