package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Spinner extends BaseRenderer {

	public Spinner() {
		this.set("type", "spinner");
	}

	public Spinner set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示表达式
    */
	public Spinner visibleOn(Object value) {
		return (Spinner) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Spinner staticClassName(Object value) {
		return (Spinner) this.set("staticClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Spinner disabledOn(Object value) {
		return (Spinner) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Spinner hidden(Object value) {
		return (Spinner) this.set("hidden", value);
	}
	
	/**
	 * spin图标位置包裹元素的自定义class
    */
	public Spinner spinnerClassName(Object value) {
		return (Spinner) this.set("spinnerClassName", value);
	}
	
	/**
	 * 作为容器使用时内容
    */
	public Spinner body(Object value) {
		return (Spinner) this.set("body", value);
	}
	
	/**
	 * spinner文案位置
    * 可选值: top | right | bottom | left
    */
	public Spinner tipPlacement(Object value) {
		return (Spinner) this.set("tipPlacement", value);
	}
	
	/**
	 * 是否显示遮罩层
    */
	public Spinner overlay(Object value) {
		return (Spinner) this.set("overlay", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Spinner hiddenOn(Object value) {
		return (Spinner) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Spinner id(Object value) {
		return (Spinner) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Spinner staticInputClassName(Object value) {
		return (Spinner) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Spinner useMobileUI(Object value) {
		return (Spinner) this.set("useMobileUI", value);
	}
	
	/**
	 * spinner Icon 大小
    * 可选值: sm | lg | 
    */
	public Spinner size(Object value) {
		return (Spinner) this.set("size", value);
	}
	
	/**
	 * 自定义icon
    */
	public Spinner icon(Object value) {
		return (Spinner) this.set("icon", value);
	}
	
	/**
	 * 自定义spinner的class
    */
	public Spinner className(Object value) {
		return (Spinner) this.set("className", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Spinner onEvent(Object value) {
		return (Spinner) this.set("onEvent", value);
	}
	
	/**
	 * spinner文案
    */
	public Spinner tip(Object value) {
		return (Spinner) this.set("tip", value);
	}
	
	/**
	    */
	public Spinner loadingConfig(Object value) {
		return (Spinner) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Spinner staticOn(Object value) {
		return (Spinner) this.set("staticOn", value);
	}
	
	/**
	    */
	public Spinner staticSchema(Object value) {
		return (Spinner) this.set("staticSchema", value);
	}
	
	/**
	 * 组件类型
    */
	public Spinner type(Object value) {
		return (Spinner) this.set("type", value);
	}
	
	/**
	 * 作为容器使用时最外层元素的class
    */
	public Spinner spinnerWrapClassName(Object value) {
		return (Spinner) this.set("spinnerWrapClassName", value);
	}
	
	/**
	 * 延迟显示
    */
	public Spinner delay(Object value) {
		return (Spinner) this.set("delay", value);
	}
	
	/**
	 * 是否禁用
    */
	public Spinner disabled(Object value) {
		return (Spinner) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Spinner static_(Object value) {
		return (Spinner) this.set("static_", value);
	}
	
	/**
	 * 控制Spinner显示与隐藏
    */
	public Spinner show(Object value) {
		return (Spinner) this.set("show", value);
	}
	
	/**
	 * 组件样式
    */
	public Spinner style(Object value) {
		return (Spinner) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Spinner editorSetting(Object value) {
		return (Spinner) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Spinner mode(Object value) {
		return (Spinner) this.set("mode", value);
	}
	
	/**
	 * 是否显示
    */
	public Spinner visible(Object value) {
		return (Spinner) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Spinner staticPlaceholder(Object value) {
		return (Spinner) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Spinner staticLabelClassName(Object value) {
		return (Spinner) this.set("staticLabelClassName", value);
	}
	}