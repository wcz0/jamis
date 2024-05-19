package com.wcz0.renderers;
/**
 * 提示渲染器，默认会显示个小图标，鼠标放上来的时候显示配置的内容。

 * @author wcz0
 * @version 6.2.2
 */
public class Remark extends BaseRenderer {

	public Remark() {
		this.set("type", "remark");
	}

	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Remark editorSetting(Object value) {
		return (Remark) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Remark testIdBuilder(Object value) {
		return (Remark) this.set("testIdBuilder", value);
	}
	
	/**
	 * 触发规则
    */
	public Remark trigger(Object value) {
		return (Remark) this.set("trigger", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Remark hidden(Object value) {
		return (Remark) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Remark hiddenOn(Object value) {
		return (Remark) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Remark staticLabelClassName(Object value) {
		return (Remark) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Remark useMobileUI(Object value) {
		return (Remark) this.set("useMobileUI", value);
	}
	
	/**
	 * 点击其他内容时是否关闭弹框信息
    */
	public Remark rootClose(Object value) {
		return (Remark) this.set("rootClose", value);
	}
	
	/**
	 * icon的形状
    * 可选值: circle | square
    */
	public Remark shape(Object value) {
		return (Remark) this.set("shape", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Remark staticClassName(Object value) {
		return (Remark) this.set("staticClassName", value);
	}
	
	/**
	 * 提示内容
    */
	public Remark content(Object value) {
		return (Remark) this.set("content", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Remark className(Object value) {
		return (Remark) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Remark visibleOn(Object value) {
		return (Remark) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Remark staticOn(Object value) {
		return (Remark) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Remark staticPlaceholder(Object value) {
		return (Remark) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Remark staticInputClassName(Object value) {
		return (Remark) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示位置
    * 可选值: top | right | bottom | left
    */
	public Remark placement(Object value) {
		return (Remark) this.set("placement", value);
	}
	
	/**
	 * 是否显示
    */
	public Remark visible(Object value) {
		return (Remark) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Remark static_(Object value) {
		return (Remark) this.set("static_", value);
	}
	
	/**
	    */
	public Remark label(Object value) {
		return (Remark) this.set("label", value);
	}
	
	/**
	 * 组件样式
    */
	public Remark style(Object value) {
		return (Remark) this.set("style", value);
	}
	
	/**
	 * 指定为提示类型
    */
	public Remark type(Object value) {
		return (Remark) this.set("type", value);
	}
	
	/**
	    */
	public Remark testid(Object value) {
		return (Remark) this.set("testid", value);
	}
	
	/**
	    */
	public Remark tooltipClassName(Object value) {
		return (Remark) this.set("tooltipClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Remark id(Object value) {
		return (Remark) this.set("id", value);
	}
	
	/**
	    */
	public Remark staticSchema(Object value) {
		return (Remark) this.set("staticSchema", value);
	}
	
	/**
	    */
	public Remark icon(Object value) {
		return (Remark) this.set("icon", value);
	}
	
	/**
	 * 是否禁用
    */
	public Remark disabled(Object value) {
		return (Remark) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Remark disabledOn(Object value) {
		return (Remark) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Remark onEvent(Object value) {
		return (Remark) this.set("onEvent", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Remark $$id(Object value) {
		return (Remark) this.set("$$id", value);
	}
	
	/**
	 * 提示标题
    */
	public Remark title(Object value) {
		return (Remark) this.set("title", value);
	}
	}