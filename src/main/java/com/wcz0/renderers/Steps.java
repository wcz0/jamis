package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Steps extends BaseRenderer {

	public Steps() {
		this.set("type", "steps");
	}

	public Steps set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public Steps disabled(Object value) {
		return (Steps) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Steps visibleOn(Object value) {
		return (Steps) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Steps staticInputClassName(Object value) {
		return (Steps) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Steps staticSchema(Object value) {
		return (Steps) this.set("staticSchema", value);
	}
	
	/**
	 * API 或 数据映射
    */
	public Steps source(Object value) {
		return (Steps) this.set("source", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Steps hidden(Object value) {
		return (Steps) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Steps id(Object value) {
		return (Steps) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Steps static_(Object value) {
		return (Steps) this.set("static_", value);
	}
	
	/**
	 * 步骤
    */
	public Steps steps(Object value) {
		return (Steps) this.set("steps", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Steps className(Object value) {
		return (Steps) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Steps staticPlaceholder(Object value) {
		return (Steps) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 展示模式
    * 可选值: horizontal | vertical
    */
	public Steps mode(Object value) {
		return (Steps) this.set("mode", value);
	}
	
	/**
	 * 点状步骤条
    */
	public Steps progressDot(Object value) {
		return (Steps) this.set("progressDot", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Steps onEvent(Object value) {
		return (Steps) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Steps staticLabelClassName(Object value) {
		return (Steps) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Steps editorSetting(Object value) {
		return (Steps) this.set("editorSetting", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Steps hiddenOn(Object value) {
		return (Steps) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Steps visible(Object value) {
		return (Steps) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Steps staticClassName(Object value) {
		return (Steps) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Steps style(Object value) {
		return (Steps) this.set("style", value);
	}
	
	/**
	 * 指定为 Steps 步骤条渲染器
    */
	public Steps type(Object value) {
		return (Steps) this.set("type", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Steps useMobileUI(Object value) {
		return (Steps) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Steps disabledOn(Object value) {
		return (Steps) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Steps staticOn(Object value) {
		return (Steps) this.set("staticOn", value);
	}
	
	/**
	 * 指定当前步骤
    */
	public Steps value(Object value) {
		return (Steps) this.set("value", value);
	}
	
	/**
	 * 变量映射
    */
	public Steps name(Object value) {
		return (Steps) this.set("name", value);
	}
	
	/**
	    */
	public Steps status(Object value) {
		return (Steps) this.set("status", value);
	}
	
	/**
	 * 标签放置位置
    * 可选值: horizontal | vertical
    */
	public Steps labelPlacement(Object value) {
		return (Steps) this.set("labelPlacement", value);
	}
	}