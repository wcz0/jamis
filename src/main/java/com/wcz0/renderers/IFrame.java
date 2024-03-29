package com.wcz0.renderers;
/**
 * IFrame 渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/iframe

 * @author wcz0
 * @version 6.2.2
 */
public class IFrame extends BaseRenderer {

	public IFrame() {
		this.set("type", "iFrame");
	}

	public IFrame set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 组件样式
    */
	public IFrame style(Object value) {
		return (IFrame) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public IFrame useMobileUI(Object value) {
		return (IFrame) this.set("useMobileUI", value);
	}
	
	/**
	 * 事件相应，配置后当 iframe 通过 postMessage 发送事件时，可以触发 AMIS 内部的动作。
    */
	public IFrame events(Object value) {
		return (IFrame) this.set("events", value);
	}
	
	/**
	 * 事件动作配置
    */
	public IFrame onEvent(Object value) {
		return (IFrame) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public IFrame static_(Object value) {
		return (IFrame) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public IFrame staticInputClassName(Object value) {
		return (IFrame) this.set("staticInputClassName", value);
	}
	
	/**
	 * 页面地址
    */
	public IFrame src(Object value) {
		return (IFrame) this.set("src", value);
	}
	
	/**
	    * 可选值: no-referrer | no-referrer-when-downgrade | origin | origin-when-cross-origin | same-origin | strict-origin | strict-origin-when-cross-origin | unsafe-url
    */
	public IFrame referrerpolicy(Object value) {
		return (IFrame) this.set("referrerpolicy", value);
	}
	
	/**
	    */
	public IFrame sandbox(Object value) {
		return (IFrame) this.set("sandbox", value);
	}
	
	/**
	 * 是否禁用
    */
	public IFrame disabled(Object value) {
		return (IFrame) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public IFrame hidden(Object value) {
		return (IFrame) this.set("hidden", value);
	}
	
	/**
	    */
	public IFrame type(Object value) {
		return (IFrame) this.set("type", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public IFrame visibleOn(Object value) {
		return (IFrame) this.set("visibleOn", value);
	}
	
	/**
	    */
	public IFrame name(Object value) {
		return (IFrame) this.set("name", value);
	}
	
	/**
	    */
	public IFrame staticSchema(Object value) {
		return (IFrame) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public IFrame editorSetting(Object value) {
		return (IFrame) this.set("editorSetting", value);
	}
	
	/**
	    */
	public IFrame allow(Object value) {
		return (IFrame) this.set("allow", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public IFrame disabledOn(Object value) {
		return (IFrame) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public IFrame staticOn(Object value) {
		return (IFrame) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public IFrame staticPlaceholder(Object value) {
		return (IFrame) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public IFrame hiddenOn(Object value) {
		return (IFrame) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public IFrame id(Object value) {
		return (IFrame) this.set("id", value);
	}
	
	/**
	 * 是否显示
    */
	public IFrame visible(Object value) {
		return (IFrame) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public IFrame staticLabelClassName(Object value) {
		return (IFrame) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public IFrame width(Object value) {
		return (IFrame) this.set("width", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public IFrame staticClassName(Object value) {
		return (IFrame) this.set("staticClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public IFrame className(Object value) {
		return (IFrame) this.set("className", value);
	}
	
	/**
	    */
	public IFrame height(Object value) {
		return (IFrame) this.set("height", value);
	}
	}