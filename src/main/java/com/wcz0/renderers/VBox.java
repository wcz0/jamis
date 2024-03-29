package com.wcz0.renderers;
/**
 * 垂直布局控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/vbox

 * @author wcz0
 * @version 6.2.2
 */
public class VBox extends BaseRenderer {

	public VBox() {
		this.set("type", "vBox");
	}

	public VBox set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public VBox visible(Object value) {
		return (VBox) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public VBox visibleOn(Object value) {
		return (VBox) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public VBox id(Object value) {
		return (VBox) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public VBox editorSetting(Object value) {
		return (VBox) this.set("editorSetting", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public VBox className(Object value) {
		return (VBox) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public VBox staticLabelClassName(Object value) {
		return (VBox) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public VBox staticInputClassName(Object value) {
		return (VBox) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public VBox style(Object value) {
		return (VBox) this.set("style", value);
	}
	
	/**
	 * 行集合
    */
	public VBox rows(Object value) {
		return (VBox) this.set("rows", value);
	}
	
	/**
	 * 是否禁用
    */
	public VBox disabled(Object value) {
		return (VBox) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public VBox hidden(Object value) {
		return (VBox) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public VBox hiddenOn(Object value) {
		return (VBox) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public VBox staticOn(Object value) {
		return (VBox) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public VBox staticPlaceholder(Object value) {
		return (VBox) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public VBox staticSchema(Object value) {
		return (VBox) this.set("staticSchema", value);
	}
	
	/**
	    */
	public VBox type(Object value) {
		return (VBox) this.set("type", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public VBox disabledOn(Object value) {
		return (VBox) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public VBox onEvent(Object value) {
		return (VBox) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public VBox static_(Object value) {
		return (VBox) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public VBox staticClassName(Object value) {
		return (VBox) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public VBox useMobileUI(Object value) {
		return (VBox) this.set("useMobileUI", value);
	}
	}