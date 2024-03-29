package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Calendar extends BaseRenderer {

	public Calendar() {
		this.set("type", "calendar");
	}

	public Calendar set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 容器 css 类名
    */
	public Calendar className(Object value) {
		return (Calendar) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Calendar id(Object value) {
		return (Calendar) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Calendar static_(Object value) {
		return (Calendar) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Calendar staticInputClassName(Object value) {
		return (Calendar) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Calendar staticSchema(Object value) {
		return (Calendar) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public Calendar style(Object value) {
		return (Calendar) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Calendar editorSetting(Object value) {
		return (Calendar) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为日历选择控件
    */
	public Calendar type(Object value) {
		return (Calendar) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public Calendar disabled(Object value) {
		return (Calendar) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Calendar disabledOn(Object value) {
		return (Calendar) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Calendar visible(Object value) {
		return (Calendar) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Calendar onEvent(Object value) {
		return (Calendar) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Calendar staticOn(Object value) {
		return (Calendar) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Calendar staticClassName(Object value) {
		return (Calendar) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Calendar staticLabelClassName(Object value) {
		return (Calendar) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 日程
    */
	public Calendar schedules(Object value) {
		return (Calendar) this.set("schedules", value);
	}
	
	/**
	 * 日程点击展示
    */
	public Calendar scheduleAction(Object value) {
		return (Calendar) this.set("scheduleAction", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Calendar hidden(Object value) {
		return (Calendar) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Calendar hiddenOn(Object value) {
		return (Calendar) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Calendar visibleOn(Object value) {
		return (Calendar) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Calendar useMobileUI(Object value) {
		return (Calendar) this.set("useMobileUI", value);
	}
	
	/**
	 * 今日激活时的自定义样式
    */
	public Calendar todayActiveStyle(Object value) {
		return (Calendar) this.set("todayActiveStyle", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Calendar staticPlaceholder(Object value) {
		return (Calendar) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 日程显示颜色自定义
    */
	public Calendar scheduleClassNames(Object value) {
		return (Calendar) this.set("scheduleClassNames", value);
	}
	
	/**
	 * 是否开启放大模式
    */
	public Calendar largeMode(Object value) {
		return (Calendar) this.set("largeMode", value);
	}
	}