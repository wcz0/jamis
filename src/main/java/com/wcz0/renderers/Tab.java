package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Tab extends BaseRenderer {

	public Tab() {
		this.set("type", "tab");
	}

	public Tab set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏
    */
	public Tab hidden(Object value) {
		return (Tab) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public Tab visible(Object value) {
		return (Tab) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Tab staticLabelClassName(Object value) {
		return (Tab) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Tab className(Object value) {
		return (Tab) this.set("className", value);
	}
	
	/**
	 * 是否可关闭，优先级高于 tabs 的 closable
    */
	public Tab closable(Object value) {
		return (Tab) this.set("closable", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Tab static_(Object value) {
		return (Tab) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Tab staticClassName(Object value) {
		return (Tab) this.set("staticClassName", value);
	}
	
	/**
	 * Tab 标题
    */
	public Tab title(Object value) {
		return (Tab) this.set("title", value);
	}
	
	/**
	 * 按钮图标
    */
	public Tab icon(Object value) {
		return (Tab) this.set("icon", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Tab hiddenOn(Object value) {
		return (Tab) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Tab id(Object value) {
		return (Tab) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Tab editorSetting(Object value) {
		return (Tab) this.set("editorSetting", value);
	}
	
	/**
	 * 内容
    */
	public Tab tab(Object value) {
		return (Tab) this.set("tab", value);
	}
	
	/**
	    * 可选值: left | right
    */
	public Tab iconPosition(Object value) {
		return (Tab) this.set("iconPosition", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Tab onEvent(Object value) {
		return (Tab) this.set("onEvent", value);
	}
	
	/**
	 * 内容
    */
	public Tab body(Object value) {
		return (Tab) this.set("body", value);
	}
	
	/**
	 * 设置以后将跟url的hash对应
    */
	public Tab hash(Object value) {
		return (Tab) this.set("hash", value);
	}
	
	/**
	 * 卡片隐藏就销毁卡片节点。
    */
	public Tab unmountOnExit(Object value) {
		return (Tab) this.set("unmountOnExit", value);
	}
	
	/**
	 * 是否禁用
    */
	public Tab disabled(Object value) {
		return (Tab) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Tab visibleOn(Object value) {
		return (Tab) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Tab staticInputClassName(Object value) {
		return (Tab) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Tab style(Object value) {
		return (Tab) this.set("style", value);
	}
	
	/**
	 * 设置以后内容每次都会重新渲染
    */
	public Tab reload(Object value) {
		return (Tab) this.set("reload", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Tab disabledOn(Object value) {
		return (Tab) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Tab staticOn(Object value) {
		return (Tab) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Tab staticPlaceholder(Object value) {
		return (Tab) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Tab staticSchema(Object value) {
		return (Tab) this.set("staticSchema", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public Tab horizontal(Object value) {
		return (Tab) this.set("horizontal", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Tab useMobileUI(Object value) {
		return (Tab) this.set("useMobileUI", value);
	}
	
	/**
	 * 徽标
    */
	public Tab badge(Object value) {
		return (Tab) this.set("badge", value);
	}
	
	/**
	 * 点开时才加载卡片内容
    */
	public Tab mountOnEnter(Object value) {
		return (Tab) this.set("mountOnEnter", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public Tab mode(Object value) {
		return (Tab) this.set("mode", value);
	}
	}