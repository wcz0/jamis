package com.wcz0.renderers;
/**
 * Dialog 弹框渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/dialog

 * @author wcz0
 * @version 6.2.2
 */
public class Dialog extends BaseRenderer {

	public Dialog() {
		this.set("type", "dialog");
	}

	/**
	 * 是否隐藏表达式
    */
	public Dialog hiddenOn(Object value) {
		return (Dialog) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public Dialog staticSchema(Object value) {
		return (Dialog) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public Dialog style(Object value) {
		return (Dialog) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Dialog useMobileUI(Object value) {
		return (Dialog) this.set("useMobileUI", value);
	}
	
	/**
	 * Dialog 大小
    * 可选值: xs | sm | md | lg | xl | full
    */
	public Dialog size(Object value) {
		return (Dialog) this.set("size", value);
	}
	
	/**
	 * 是否禁用
    */
	public Dialog disabled(Object value) {
		return (Dialog) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Dialog disabledOn(Object value) {
		return (Dialog) this.set("disabledOn", value);
	}
	
	/**
	 * 弹窗参数说明，值格式为 JSONSchema。
    */
	public Dialog inputParams(Object value) {
		return (Dialog) this.set("inputParams", value);
	}
	
	/**
	 * 请通过配置 title 设置标题
    */
	public Dialog title(Object value) {
		return (Dialog) this.set("title", value);
	}
	
	/**
	    */
	public Dialog footer(Object value) {
		return (Dialog) this.set("footer", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Dialog className(Object value) {
		return (Dialog) this.set("className", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Dialog onEvent(Object value) {
		return (Dialog) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Dialog staticLabelClassName(Object value) {
		return (Dialog) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否支持按 ESC 关闭 Dialog
    */
	public Dialog closeOnEsc(Object value) {
		return (Dialog) this.set("closeOnEsc", value);
	}
	
	/**
	    */
	public Dialog name(Object value) {
		return (Dialog) this.set("name", value);
	}
	
	/**
	 * Dialog 宽度
    */
	public Dialog width(Object value) {
		return (Dialog) this.set("width", value);
	}
	
	/**
	 * 是否显示错误信息
    */
	public Dialog showErrorMsg(Object value) {
		return (Dialog) this.set("showErrorMsg", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Dialog visibleOn(Object value) {
		return (Dialog) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Dialog staticOn(Object value) {
		return (Dialog) this.set("staticOn", value);
	}
	
	/**
	    */
	public Dialog type(Object value) {
		return (Dialog) this.set("type", value);
	}
	
	/**
	 * 是否支持点其它区域关闭 Dialog
    */
	public Dialog closeOnOutside(Object value) {
		return (Dialog) this.set("closeOnOutside", value);
	}
	
	/**
	 * Dialog 高度
    */
	public Dialog height(Object value) {
		return (Dialog) this.set("height", value);
	}
	
	/**
	 * 是否显示关闭按钮
    */
	public Dialog showCloseButton(Object value) {
		return (Dialog) this.set("showCloseButton", value);
	}
	
	/**
	 * 是否显示蒙层
    */
	public Dialog overlay(Object value) {
		return (Dialog) this.set("overlay", value);
	}
	
	/**
	 * 可拖拽
    */
	public Dialog draggable(Object value) {
		return (Dialog) this.set("draggable", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Dialog id(Object value) {
		return (Dialog) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Dialog staticPlaceholder(Object value) {
		return (Dialog) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 弹框类型 confirm 确认弹框
    */
	public Dialog dialogType(Object value) {
		return (Dialog) this.set("dialogType", value);
	}
	
	/**
	 * 数据映射
    */
	public Dialog data(Object value) {
		return (Dialog) this.set("data", value);
	}
	
	/**
	    */
	public Dialog header(Object value) {
		return (Dialog) this.set("header", value);
	}
	
	/**
	 * 默认不用填写，自动会创建确认和取消按钮。
    */
	public Dialog actions(Object value) {
		return (Dialog) this.set("actions", value);
	}
	
	/**
	 * 配置 Body 容器 className
    */
	public Dialog bodyClassName(Object value) {
		return (Dialog) this.set("bodyClassName", value);
	}
	
	/**
	    */
	public Dialog headerClassName(Object value) {
		return (Dialog) this.set("headerClassName", value);
	}
	
	/**
	 * 影响自动生成的按钮，如果自己配置了按钮这个配置无效。
    */
	public Dialog confirm(Object value) {
		return (Dialog) this.set("confirm", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Dialog $$id(Object value) {
		return (Dialog) this.set("$$id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Dialog staticInputClassName(Object value) {
		return (Dialog) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否显示 spinner
    */
	public Dialog showLoading(Object value) {
		return (Dialog) this.set("showLoading", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Dialog staticClassName(Object value) {
		return (Dialog) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Dialog testid(Object value) {
		return (Dialog) this.set("testid", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Dialog static_(Object value) {
		return (Dialog) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Dialog editorSetting(Object value) {
		return (Dialog) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Dialog testIdBuilder(Object value) {
		return (Dialog) this.set("testIdBuilder", value);
	}
	
	/**
	 * 内容区域
    */
	public Dialog body(Object value) {
		return (Dialog) this.set("body", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Dialog hidden(Object value) {
		return (Dialog) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public Dialog visible(Object value) {
		return (Dialog) this.set("visible", value);
	}
	}