package com.wcz0.renderers;
/**
 * Button Group 渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/button-group

 * @author wcz0
 * @version 6.2.2
 */
public class ButtonGroup extends BaseRenderer {

	public ButtonGroup() {
		this.set("type", "buttonGroup");
	}

	public ButtonGroup set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public ButtonGroup visible(Object value) {
		return (ButtonGroup) this.set("visible", value);
	}
	
	/**
	 * 组件样式
    */
	public ButtonGroup style(Object value) {
		return (ButtonGroup) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ButtonGroup useMobileUI(Object value) {
		return (ButtonGroup) this.set("useMobileUI", value);
	}
	
	/**
	 * 按钮集合
    */
	public ButtonGroup buttons(Object value) {
		return (ButtonGroup) this.set("buttons", value);
	}
	
	/**
	    */
	public ButtonGroup btnClassName(Object value) {
		return (ButtonGroup) this.set("btnClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ButtonGroup staticLabelClassName(Object value) {
		return (ButtonGroup) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ButtonGroup staticInputClassName(Object value) {
		return (ButtonGroup) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public ButtonGroup staticSchema(Object value) {
		return (ButtonGroup) this.set("staticSchema", value);
	}
	
	/**
	 * 指定为提交按钮类型
    */
	public ButtonGroup type(Object value) {
		return (ButtonGroup) this.set("type", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ButtonGroup onEvent(Object value) {
		return (ButtonGroup) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ButtonGroup staticClassName(Object value) {
		return (ButtonGroup) this.set("staticClassName", value);
	}
	
	/**
	    */
	public ButtonGroup btnActiveClassName(Object value) {
		return (ButtonGroup) this.set("btnActiveClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ButtonGroup hiddenOn(Object value) {
		return (ButtonGroup) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ButtonGroup staticOn(Object value) {
		return (ButtonGroup) this.set("staticOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ButtonGroup editorSetting(Object value) {
		return (ButtonGroup) this.set("editorSetting", value);
	}
	
	/**
	 * 按钮样式级别
    */
	public ButtonGroup btnLevel(Object value) {
		return (ButtonGroup) this.set("btnLevel", value);
	}
	
	/**
	 * 平铺展示？
    */
	public ButtonGroup tiled(Object value) {
		return (ButtonGroup) this.set("tiled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ButtonGroup hidden(Object value) {
		return (ButtonGroup) this.set("hidden", value);
	}
	
	/**
	 * 通过 JS 表达式来配置当前表单项是否显示
    */
	public ButtonGroup visibleOn(Object value) {
		return (ButtonGroup) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ButtonGroup static_(Object value) {
		return (ButtonGroup) this.set("static_", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ButtonGroup id(Object value) {
		return (ButtonGroup) this.set("id", value);
	}
	
	/**
	 * 按钮选中的样式级别
    */
	public ButtonGroup btnActiveLevel(Object value) {
		return (ButtonGroup) this.set("btnActiveLevel", value);
	}
	
	/**
	 * 通过 JS 表达式来配置当前表单项的禁用状态。
    */
	public ButtonGroup disabledOn(Object value) {
		return (ButtonGroup) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ButtonGroup staticPlaceholder(Object value) {
		return (ButtonGroup) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 垂直展示？
    */
	public ButtonGroup vertical(Object value) {
		return (ButtonGroup) this.set("vertical", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public ButtonGroup size(Object value) {
		return (ButtonGroup) this.set("size", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ButtonGroup className(Object value) {
		return (ButtonGroup) this.set("className", value);
	}
	
	/**
	 * 是否为禁用状态。
    */
	public ButtonGroup disabled(Object value) {
		return (ButtonGroup) this.set("disabled", value);
	}
	}