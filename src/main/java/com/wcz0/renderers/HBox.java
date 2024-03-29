package com.wcz0.renderers;
/**
 * Hbox 水平布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/hbox

 * @author wcz0
 * @version 6.2.2
 */
public class HBox extends BaseRenderer {

	public HBox() {
		this.set("type", "hBox");
	}

	public HBox set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public HBox onEvent(Object value) {
		return (HBox) this.set("onEvent", value);
	}
	
	/**
	    */
	public HBox staticSchema(Object value) {
		return (HBox) this.set("staticSchema", value);
	}
	
	/**
	 * 指定为each展示类型
    */
	public HBox type(Object value) {
		return (HBox) this.set("type", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public HBox subFormHorizontal(Object value) {
		return (HBox) this.set("subFormHorizontal", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public HBox className(Object value) {
		return (HBox) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public HBox staticLabelClassName(Object value) {
		return (HBox) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public HBox style(Object value) {
		return (HBox) this.set("style", value);
	}
	
	/**
	 * 是否禁用
    */
	public HBox disabled(Object value) {
		return (HBox) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public HBox disabledOn(Object value) {
		return (HBox) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public HBox staticOn(Object value) {
		return (HBox) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public HBox staticClassName(Object value) {
		return (HBox) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public HBox staticInputClassName(Object value) {
		return (HBox) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public HBox useMobileUI(Object value) {
		return (HBox) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public HBox columns(Object value) {
		return (HBox) this.set("columns", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public HBox hiddenOn(Object value) {
		return (HBox) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public HBox id(Object value) {
		return (HBox) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public HBox static_(Object value) {
		return (HBox) this.set("static_", value);
	}
	
	/**
	 * 是否隐藏
    */
	public HBox hidden(Object value) {
		return (HBox) this.set("hidden", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public HBox staticPlaceholder(Object value) {
		return (HBox) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 垂直对齐方式
    * 可选值: top | middle | bottom | between
    */
	public HBox valign(Object value) {
		return (HBox) this.set("valign", value);
	}
	
	/**
	 * 是否显示
    */
	public HBox visible(Object value) {
		return (HBox) this.set("visible", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public HBox subFormMode(Object value) {
		return (HBox) this.set("subFormMode", value);
	}
	
	/**
	 * 水平间距
    * 可选值: xs | sm | base | none | md | lg
    */
	public HBox gap(Object value) {
		return (HBox) this.set("gap", value);
	}
	
	/**
	 * 水平对齐方式
    * 可选值: left | right | between | center
    */
	public HBox align(Object value) {
		return (HBox) this.set("align", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public HBox visibleOn(Object value) {
		return (HBox) this.set("visibleOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public HBox editorSetting(Object value) {
		return (HBox) this.set("editorSetting", value);
	}
	}