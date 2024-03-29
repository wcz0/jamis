package com.wcz0.renderers;
/**
 * Button Toolar 渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/button-toolbar

 * @author wcz0
 * @version 6.2.2
 */
public class ButtonToolbar extends BaseRenderer {

	public ButtonToolbar() {
		this.set("type", "buttonToolbar");
	}

	public ButtonToolbar set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏
    */
	public ButtonToolbar hidden(Object value) {
		return (ButtonToolbar) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ButtonToolbar onEvent(Object value) {
		return (ButtonToolbar) this.set("onEvent", value);
	}
	
	/**
	    */
	public ButtonToolbar buttons(Object value) {
		return (ButtonToolbar) this.set("buttons", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ButtonToolbar staticLabelClassName(Object value) {
		return (ButtonToolbar) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ButtonToolbar staticInputClassName(Object value) {
		return (ButtonToolbar) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public ButtonToolbar style(Object value) {
		return (ButtonToolbar) this.set("style", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ButtonToolbar className(Object value) {
		return (ButtonToolbar) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ButtonToolbar hiddenOn(Object value) {
		return (ButtonToolbar) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ButtonToolbar static_(Object value) {
		return (ButtonToolbar) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ButtonToolbar staticPlaceholder(Object value) {
		return (ButtonToolbar) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ButtonToolbar useMobileUI(Object value) {
		return (ButtonToolbar) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用
    */
	public ButtonToolbar disabled(Object value) {
		return (ButtonToolbar) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ButtonToolbar disabledOn(Object value) {
		return (ButtonToolbar) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ButtonToolbar id(Object value) {
		return (ButtonToolbar) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ButtonToolbar staticOn(Object value) {
		return (ButtonToolbar) this.set("staticOn", value);
	}
	
	/**
	    */
	public ButtonToolbar staticSchema(Object value) {
		return (ButtonToolbar) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ButtonToolbar editorSetting(Object value) {
		return (ButtonToolbar) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为按钮工具集合类型
    */
	public ButtonToolbar type(Object value) {
		return (ButtonToolbar) this.set("type", value);
	}
	
	/**
	 * 是否显示
    */
	public ButtonToolbar visible(Object value) {
		return (ButtonToolbar) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ButtonToolbar visibleOn(Object value) {
		return (ButtonToolbar) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ButtonToolbar staticClassName(Object value) {
		return (ButtonToolbar) this.set("staticClassName", value);
	}
	}