package com.wcz0.renderers;
/**
 * AnchorNav 锚点导航渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/anchor-nav

 * @author wcz0
 * @version 6.2.2
 */
public class AnchorNav extends BaseRenderer {

	public AnchorNav() {
		this.set("type", "anchorNav");
	}

	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public AnchorNav $$id(Object value) {
		return (AnchorNav) this.set("$$id", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public AnchorNav visibleOn(Object value) {
		return (AnchorNav) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public AnchorNav staticPlaceholder(Object value) {
		return (AnchorNav) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 指定为 AnchorNav 锚点导航渲染器
    */
	public AnchorNav type(Object value) {
		return (AnchorNav) this.set("type", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public AnchorNav staticLabelClassName(Object value) {
		return (AnchorNav) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public AnchorNav testIdBuilder(Object value) {
		return (AnchorNav) this.set("testIdBuilder", value);
	}
	
	/**
	 * 事件动作配置
    */
	public AnchorNav onEvent(Object value) {
		return (AnchorNav) this.set("onEvent", value);
	}
	
	/**
	    */
	public AnchorNav testid(Object value) {
		return (AnchorNav) this.set("testid", value);
	}
	
	/**
	 * 楼层集合
    */
	public AnchorNav links(Object value) {
		return (AnchorNav) this.set("links", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public AnchorNav id(Object value) {
		return (AnchorNav) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public AnchorNav staticClassName(Object value) {
		return (AnchorNav) this.set("staticClassName", value);
	}
	
	/**
	 * 被激活（定位）的楼层
    */
	public AnchorNav active(Object value) {
		return (AnchorNav) this.set("active", value);
	}
	
	/**
	 * 是否显示
    */
	public AnchorNav visible(Object value) {
		return (AnchorNav) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public AnchorNav staticOn(Object value) {
		return (AnchorNav) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public AnchorNav staticInputClassName(Object value) {
		return (AnchorNav) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public AnchorNav staticSchema(Object value) {
		return (AnchorNav) this.set("staticSchema", value);
	}
	
	/**
	 * 样式名
    */
	public AnchorNav className(Object value) {
		return (AnchorNav) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public AnchorNav static_(Object value) {
		return (AnchorNav) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public AnchorNav editorSetting(Object value) {
		return (AnchorNav) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public AnchorNav useMobileUI(Object value) {
		return (AnchorNav) this.set("useMobileUI", value);
	}
	
	/**
	 * 导航样式名
    */
	public AnchorNav linkClassName(Object value) {
		return (AnchorNav) this.set("linkClassName", value);
	}
	
	/**
	    * 可选值: vertical | horizontal
    */
	public AnchorNav direction(Object value) {
		return (AnchorNav) this.set("direction", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public AnchorNav disabledOn(Object value) {
		return (AnchorNav) this.set("disabledOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public AnchorNav disabled(Object value) {
		return (AnchorNav) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public AnchorNav hidden(Object value) {
		return (AnchorNav) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public AnchorNav hiddenOn(Object value) {
		return (AnchorNav) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件样式
    */
	public AnchorNav style(Object value) {
		return (AnchorNav) this.set("style", value);
	}
	
	/**
	 * 楼层样式名
    */
	public AnchorNav sectionClassName(Object value) {
		return (AnchorNav) this.set("sectionClassName", value);
	}
	}