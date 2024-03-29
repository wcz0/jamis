package com.wcz0.renderers;
/**
 * Wrapper 容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/wrapper

 * @author wcz0
 * @version 6.2.2
 */
public class Wrapper extends BaseRenderer {

	public Wrapper() {
		this.set("type", "wrapper");
	}

	public Wrapper set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public Wrapper disabled(Object value) {
		return (Wrapper) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public Wrapper visible(Object value) {
		return (Wrapper) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Wrapper onEvent(Object value) {
		return (Wrapper) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Wrapper staticOn(Object value) {
		return (Wrapper) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Wrapper staticPlaceholder(Object value) {
		return (Wrapper) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Wrapper staticSchema(Object value) {
		return (Wrapper) this.set("staticSchema", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Wrapper className(Object value) {
		return (Wrapper) this.set("className", value);
	}
	
	/**
	 * 自定义样式
    */
	public Wrapper style(Object value) {
		return (Wrapper) this.set("style", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Wrapper static_(Object value) {
		return (Wrapper) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Wrapper editorSetting(Object value) {
		return (Wrapper) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Wrapper wrap(Object value) {
		return (Wrapper) this.set("wrap", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Wrapper hiddenOn(Object value) {
		return (Wrapper) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Wrapper id(Object value) {
		return (Wrapper) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Wrapper staticClassName(Object value) {
		return (Wrapper) this.set("staticClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Wrapper disabledOn(Object value) {
		return (Wrapper) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Wrapper visibleOn(Object value) {
		return (Wrapper) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Wrapper staticInputClassName(Object value) {
		return (Wrapper) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Wrapper useMobileUI(Object value) {
		return (Wrapper) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为 container 类型
    */
	public Wrapper type(Object value) {
		return (Wrapper) this.set("type", value);
	}
	
	/**
	 * 内容
    */
	public Wrapper body(Object value) {
		return (Wrapper) this.set("body", value);
	}
	
	/**
	    * 可选值: xs | sm | md | lg | none
    */
	public Wrapper size(Object value) {
		return (Wrapper) this.set("size", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Wrapper hidden(Object value) {
		return (Wrapper) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Wrapper staticLabelClassName(Object value) {
		return (Wrapper) this.set("staticLabelClassName", value);
	}
	}