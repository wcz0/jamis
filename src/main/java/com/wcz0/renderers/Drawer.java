package com.wcz0.renderers;
/**
 * Drawer 抽出式弹框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/drawer

 * @author wcz0
 * @version 6.2.2
 */
public class Drawer extends BaseRenderer {

	public Drawer() {
		this.set("type", "drawer");
	}

	/**
	 * 是否支持按 ESC 关闭 Dialog
    */
	public Drawer closeOnEsc(Object value) {
		return (Drawer) this.set("closeOnEsc", value);
	}
	
	/**
	 * 抽屉的高度 （当position为top | bottom时生效）
    */
	public Drawer height(Object value) {
		return (Drawer) this.set("height", value);
	}
	
	/**
	 * 是否禁用
    */
	public Drawer disabled(Object value) {
		return (Drawer) this.set("disabled", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Drawer staticPlaceholder(Object value) {
		return (Drawer) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Drawer staticSchema(Object value) {
		return (Drawer) this.set("staticSchema", value);
	}
	
	/**
	 * 配置 头部 容器 className
    */
	public Drawer footerClassName(Object value) {
		return (Drawer) this.set("footerClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Drawer disabledOn(Object value) {
		return (Drawer) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Drawer hiddenOn(Object value) {
		return (Drawer) this.set("hiddenOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Drawer editorSetting(Object value) {
		return (Drawer) this.set("editorSetting", value);
	}
	
	/**
	 * 内容区域
    */
	public Drawer body(Object value) {
		return (Drawer) this.set("body", value);
	}
	
	/**
	 * 从什么位置弹出
    * 可选值: left | right | top | bottom
    */
	public Drawer position(Object value) {
		return (Drawer) this.set("position", value);
	}
	
	/**
	 * 组件样式
    */
	public Drawer style(Object value) {
		return (Drawer) this.set("style", value);
	}
	
	/**
	 * 默认不用填写，自动会创建确认和取消按钮。
    */
	public Drawer actions(Object value) {
		return (Drawer) this.set("actions", value);
	}
	
	/**
	 * 配置 头部 容器 className
    */
	public Drawer headerClassName(Object value) {
		return (Drawer) this.set("headerClassName", value);
	}
	
	/**
	 * Dialog 大小
    * 可选值: xs | sm | md | lg | full
    */
	public Drawer size(Object value) {
		return (Drawer) this.set("size", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Drawer staticOn(Object value) {
		return (Drawer) this.set("staticOn", value);
	}
	
	/**
	    */
	public Drawer testid(Object value) {
		return (Drawer) this.set("testid", value);
	}
	
	/**
	 * 是否可以拖动弹窗大小
    */
	public Drawer resizable(Object value) {
		return (Drawer) this.set("resizable", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Drawer staticInputClassName(Object value) {
		return (Drawer) this.set("staticInputClassName", value);
	}
	
	/**
	 * 影响自动生成的按钮，如果自己配置了按钮这个配置无效。
    */
	public Drawer confirm(Object value) {
		return (Drawer) this.set("confirm", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Drawer $$id(Object value) {
		return (Drawer) this.set("$$id", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Drawer visibleOn(Object value) {
		return (Drawer) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Drawer id(Object value) {
		return (Drawer) this.set("id", value);
	}
	
	/**
	 * 请通过配置 title 设置标题
    */
	public Drawer title(Object value) {
		return (Drawer) this.set("title", value);
	}
	
	/**
	 * 底部
    */
	public Drawer footer(Object value) {
		return (Drawer) this.set("footer", value);
	}
	
	/**
	 * 是否显示错误信息
    */
	public Drawer showErrorMsg(Object value) {
		return (Drawer) this.set("showErrorMsg", value);
	}
	
	/**
	 * 配置 外层 className
    */
	public Drawer className(Object value) {
		return (Drawer) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public Drawer visible(Object value) {
		return (Drawer) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Drawer staticClassName(Object value) {
		return (Drawer) this.set("staticClassName", value);
	}
	
	/**
	 * 配置 Body 容器 className
    */
	public Drawer bodyClassName(Object value) {
		return (Drawer) this.set("bodyClassName", value);
	}
	
	/**
	 * 是否展示关闭按钮 当值为false时，默认开启closeOnOutside
    */
	public Drawer showCloseButton(Object value) {
		return (Drawer) this.set("showCloseButton", value);
	}
	
	/**
	 * 头部
    */
	public Drawer header(Object value) {
		return (Drawer) this.set("header", value);
	}
	
	/**
	 * 是否显示蒙层
    */
	public Drawer overlay(Object value) {
		return (Drawer) this.set("overlay", value);
	}
	
	/**
	 * 点击外部的时候是否关闭弹框。
    */
	public Drawer closeOnOutside(Object value) {
		return (Drawer) this.set("closeOnOutside", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Drawer static_(Object value) {
		return (Drawer) this.set("static_", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Drawer useMobileUI(Object value) {
		return (Drawer) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Drawer testIdBuilder(Object value) {
		return (Drawer) this.set("testIdBuilder", value);
	}
	
	/**
	 * 弹窗参数说明，值格式为 JSONSchema。
    */
	public Drawer inputParams(Object value) {
		return (Drawer) this.set("inputParams", value);
	}
	
	/**
	    */
	public Drawer name(Object value) {
		return (Drawer) this.set("name", value);
	}
	
	/**
	 * 抽屉的宽度 （当position为left | right时生效）
    */
	public Drawer width(Object value) {
		return (Drawer) this.set("width", value);
	}
	
	/**
	 * 数据映射
    */
	public Drawer data(Object value) {
		return (Drawer) this.set("data", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Drawer hidden(Object value) {
		return (Drawer) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Drawer onEvent(Object value) {
		return (Drawer) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Drawer staticLabelClassName(Object value) {
		return (Drawer) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Drawer type(Object value) {
		return (Drawer) this.set("type", value);
	}
	}