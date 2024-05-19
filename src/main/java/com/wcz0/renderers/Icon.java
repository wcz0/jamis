package com.wcz0.renderers;
/**
 * Icon 图标渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/icon

 * @author wcz0
 * @version 6.2.2
 */
public class Icon extends BaseRenderer {

	public Icon() {
		this.set("type", "icon");
	}

	/**
	 * 是否静态展示表达式
    */
	public Icon staticOn(Object value) {
		return (Icon) this.set("staticOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Icon className(Object value) {
		return (Icon) this.set("className", value);
	}
	
	/**
	    */
	public Icon staticSchema(Object value) {
		return (Icon) this.set("staticSchema", value);
	}
	
	/**
	    * 可选值: iconfont | fa | 
    */
	public Icon vendor(Object value) {
		return (Icon) this.set("vendor", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Icon disabledOn(Object value) {
		return (Icon) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Icon staticLabelClassName(Object value) {
		return (Icon) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Icon hiddenOn(Object value) {
		return (Icon) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Icon id(Object value) {
		return (Icon) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Icon onEvent(Object value) {
		return (Icon) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Icon staticPlaceholder(Object value) {
		return (Icon) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Icon useMobileUI(Object value) {
		return (Icon) this.set("useMobileUI", value);
	}
	
	/**
	 * 按钮类型
    */
	public Icon icon(Object value) {
		return (Icon) this.set("icon", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Icon visibleOn(Object value) {
		return (Icon) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Icon staticClassName(Object value) {
		return (Icon) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Icon type(Object value) {
		return (Icon) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public Icon disabled(Object value) {
		return (Icon) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public Icon visible(Object value) {
		return (Icon) this.set("visible", value);
	}
	
	/**
	 * 组件样式
    */
	public Icon style(Object value) {
		return (Icon) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Icon editorSetting(Object value) {
		return (Icon) this.set("editorSetting", value);
	}
	
	/**
	 * 角标
    */
	public Icon badge(Object value) {
		return (Icon) this.set("badge", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Icon $$id(Object value) {
		return (Icon) this.set("$$id", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Icon hidden(Object value) {
		return (Icon) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Icon static_(Object value) {
		return (Icon) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Icon staticInputClassName(Object value) {
		return (Icon) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Icon testIdBuilder(Object value) {
		return (Icon) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Icon testid(Object value) {
		return (Icon) this.set("testid", value);
	}
	}