package com.wcz0.renderers;
/**
 * Color 显示渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/color

 * @author wcz0
 * @version 6.2.2
 */
public class Color extends BaseRenderer {

	public Color() {
		this.set("type", "color");
	}

	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Color editorSetting(Object value) {
		return (Color) this.set("editorSetting", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Color $$id(Object value) {
		return (Color) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用
    */
	public Color disabled(Object value) {
		return (Color) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Color hidden(Object value) {
		return (Color) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Color id(Object value) {
		return (Color) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Color staticLabelClassName(Object value) {
		return (Color) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Color staticInputClassName(Object value) {
		return (Color) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Color staticSchema(Object value) {
		return (Color) this.set("staticSchema", value);
	}
	
	/**
	 * 默认颜色
    */
	public Color defaultColor(Object value) {
		return (Color) this.set("defaultColor", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Color staticClassName(Object value) {
		return (Color) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Color useMobileUI(Object value) {
		return (Color) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Color testid(Object value) {
		return (Color) this.set("testid", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Color className(Object value) {
		return (Color) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Color disabledOn(Object value) {
		return (Color) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Color visibleOn(Object value) {
		return (Color) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Color staticOn(Object value) {
		return (Color) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Color staticPlaceholder(Object value) {
		return (Color) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否用文字显示值。
    */
	public Color showValue(Object value) {
		return (Color) this.set("showValue", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Color hiddenOn(Object value) {
		return (Color) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Color visible(Object value) {
		return (Color) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Color onEvent(Object value) {
		return (Color) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Color static_(Object value) {
		return (Color) this.set("static_", value);
	}
	
	/**
	 * 组件样式
    */
	public Color style(Object value) {
		return (Color) this.set("style", value);
	}
	
	/**
	    */
	public Color testIdBuilder(Object value) {
		return (Color) this.set("testIdBuilder", value);
	}
	
	/**
	 * 指定为颜色显示控件
    */
	public Color type(Object value) {
		return (Color) this.set("type", value);
	}
	}