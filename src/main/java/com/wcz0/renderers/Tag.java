package com.wcz0.renderers;
/**
 * Tag

 * @author wcz0
 * @version 6.2.2
 */
public class Tag extends BaseRenderer {

	public Tag() {
		this.set("type", "tag");
	}

	public Tag set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * status模式时候设置的前置图标
    */
	public Tag icon(Object value) {
		return (Tag) this.set("icon", value);
	}
	
	/**
	 * 关闭图标
    */
	public Tag closeIcon(Object value) {
		return (Tag) this.set("closeIcon", value);
	}
	
	/**
	 * 是否是可选的标签
    */
	public Tag checkable(Object value) {
		return (Tag) this.set("checkable", value);
	}
	
	/**
	 * 是否禁用
    */
	public Tag disabled(Object value) {
		return (Tag) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Tag id(Object value) {
		return (Tag) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Tag editorSetting(Object value) {
		return (Tag) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Tag type(Object value) {
		return (Tag) this.set("type", value);
	}
	
	/**
	 * 是否展示关闭按钮
    */
	public Tag closable(Object value) {
		return (Tag) this.set("closable", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Tag hiddenOn(Object value) {
		return (Tag) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Tag visible(Object value) {
		return (Tag) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Tag staticLabelClassName(Object value) {
		return (Tag) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 自定义样式
    */
	public Tag style(Object value) {
		return (Tag) this.set("style", value);
	}
	
	/**
	 * 标签颜色
    */
	public Tag color(Object value) {
		return (Tag) this.set("color", value);
	}
	
	/**
	 * normal: 面性标签，对应color的背景色 rounded: 线性标签， 对应color的边框 status: 带图标的标签， 图标可以自定义
    * 可选值: normal | rounded | status
    */
	public Tag displayMode(Object value) {
		return (Tag) this.set("displayMode", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Tag staticOn(Object value) {
		return (Tag) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Tag staticPlaceholder(Object value) {
		return (Tag) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 类名
    */
	public Tag className(Object value) {
		return (Tag) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Tag staticClassName(Object value) {
		return (Tag) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Tag staticSchema(Object value) {
		return (Tag) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Tag useMobileUI(Object value) {
		return (Tag) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Tag visibleOn(Object value) {
		return (Tag) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Tag onEvent(Object value) {
		return (Tag) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Tag static_(Object value) {
		return (Tag) this.set("static_", value);
	}
	
	/**
	 * 标签文本内容
    */
	public Tag label(Object value) {
		return (Tag) this.set("label", value);
	}
	
	/**
	 * 是否选中
    */
	public Tag checked(Object value) {
		return (Tag) this.set("checked", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Tag disabledOn(Object value) {
		return (Tag) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Tag hidden(Object value) {
		return (Tag) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Tag staticInputClassName(Object value) {
		return (Tag) this.set("staticInputClassName", value);
	}
	}