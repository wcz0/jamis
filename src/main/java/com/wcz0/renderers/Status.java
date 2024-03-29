package com.wcz0.renderers;
/**
 * 状态展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/status

 * @author wcz0
 * @version 6.2.2
 */
public class Status extends BaseRenderer {

	public Status() {
		this.set("type", "status");
	}

	public Status set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Status useMobileUI(Object value) {
		return (Status) this.set("useMobileUI", value);
	}
	
	/**
	 * 占位符
    */
	public Status placeholder(Object value) {
		return (Status) this.set("placeholder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Status className(Object value) {
		return (Status) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Status disabled(Object value) {
		return (Status) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public Status visible(Object value) {
		return (Status) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Status staticPlaceholder(Object value) {
		return (Status) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Status staticInputClassName(Object value) {
		return (Status) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Status hiddenOn(Object value) {
		return (Status) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Status static_(Object value) {
		return (Status) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Status staticClassName(Object value) {
		return (Status) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Status staticLabelClassName(Object value) {
		return (Status) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Status editorSetting(Object value) {
		return (Status) this.set("editorSetting", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Status hidden(Object value) {
		return (Status) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Status visibleOn(Object value) {
		return (Status) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Status id(Object value) {
		return (Status) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Status staticOn(Object value) {
		return (Status) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public Status style(Object value) {
		return (Status) this.set("style", value);
	}
	
	/**
	 * 新版配置映射源的字段 可以兼容新版icon并且配置颜色 2.8.0 新增
    */
	public Status source(Object value) {
		return (Status) this.set("source", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Status disabledOn(Object value) {
		return (Status) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Status onEvent(Object value) {
		return (Status) this.set("onEvent", value);
	}
	
	/**
	    */
	public Status staticSchema(Object value) {
		return (Status) this.set("staticSchema", value);
	}
	
	/**
	 * 指定为状态展示控件
    */
	public Status type(Object value) {
		return (Status) this.set("type", value);
	}
	
	/**
	 * 状态图标映射关系
    */
	public Status map(Object value) {
		return (Status) this.set("map", value);
	}
	
	/**
	 * 文字映射关系
    */
	public Status labelMap(Object value) {
		return (Status) this.set("labelMap", value);
	}
	}