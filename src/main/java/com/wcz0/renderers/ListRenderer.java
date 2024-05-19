package com.wcz0.renderers;
/**
 * List 列表展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card

 * @author wcz0
 * @version 6.2.2
 */
public class ListRenderer extends BaseRenderer {

	public ListRenderer() {
		this.set("type", "listRenderer");
	}

	/**
	 * 是否禁用
    */
	public ListRenderer disabled(Object value) {
		return (ListRenderer) this.set("disabled", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public ListRenderer valueField(Object value) {
		return (ListRenderer) this.set("valueField", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ListRenderer onEvent(Object value) {
		return (ListRenderer) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ListRenderer editorSetting(Object value) {
		return (ListRenderer) this.set("editorSetting", value);
	}
	
	/**
	 * 顶部区域
    */
	public ListRenderer header(Object value) {
		return (ListRenderer) this.set("header", value);
	}
	
	/**
	 * 是否显示底部
    */
	public ListRenderer showFooter(Object value) {
		return (ListRenderer) this.set("showFooter", value);
	}
	
	/**
	 * 是否显示头部
    */
	public ListRenderer showHeader(Object value) {
		return (ListRenderer) this.set("showHeader", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public ListRenderer hideCheckToggler(Object value) {
		return (ListRenderer) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 大小
    * 可选值: sm | base
    */
	public ListRenderer size(Object value) {
		return (ListRenderer) this.set("size", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ListRenderer $$id(Object value) {
		return (ListRenderer) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ListRenderer disabledOn(Object value) {
		return (ListRenderer) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ListRenderer visibleOn(Object value) {
		return (ListRenderer) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ListRenderer staticOn(Object value) {
		return (ListRenderer) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ListRenderer staticClassName(Object value) {
		return (ListRenderer) this.set("staticClassName", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public ListRenderer itemCheckableOn(Object value) {
		return (ListRenderer) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 点击列表单行时，是否选择
    */
	public ListRenderer checkOnItemClick(Object value) {
		return (ListRenderer) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 点击列表项的行为
    */
	public ListRenderer itemAction(Object value) {
		return (ListRenderer) this.set("itemAction", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ListRenderer className(Object value) {
		return (ListRenderer) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ListRenderer staticLabelClassName(Object value) {
		return (ListRenderer) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 标题
    */
	public ListRenderer title(Object value) {
		return (ListRenderer) this.set("title", value);
	}
	
	/**
	 * 底部区域
    */
	public ListRenderer footer(Object value) {
		return (ListRenderer) this.set("footer", value);
	}
	
	/**
	 * 顶部区域类名
    */
	public ListRenderer headerClassName(Object value) {
		return (ListRenderer) this.set("headerClassName", value);
	}
	
	/**
	 * 单条数据展示内容配置
    */
	public ListRenderer listItem(Object value) {
		return (ListRenderer) this.set("listItem", value);
	}
	
	/**
	 * 是否固底
    */
	public ListRenderer affixFooter(Object value) {
		return (ListRenderer) this.set("affixFooter", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ListRenderer staticInputClassName(Object value) {
		return (ListRenderer) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ListRenderer useMobileUI(Object value) {
		return (ListRenderer) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public ListRenderer testid(Object value) {
		return (ListRenderer) this.set("testid", value);
	}
	
	/**
	 * 无数据提示
    */
	public ListRenderer placeholder(Object value) {
		return (ListRenderer) this.set("placeholder", value);
	}
	
	/**
	 * 是否固顶
    */
	public ListRenderer affixHeader(Object value) {
		return (ListRenderer) this.set("affixHeader", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public ListRenderer itemDraggableOn(Object value) {
		return (ListRenderer) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ListRenderer hidden(Object value) {
		return (ListRenderer) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ListRenderer hiddenOn(Object value) {
		return (ListRenderer) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public ListRenderer visible(Object value) {
		return (ListRenderer) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ListRenderer id(Object value) {
		return (ListRenderer) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public ListRenderer style(Object value) {
		return (ListRenderer) this.set("style", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ListRenderer staticPlaceholder(Object value) {
		return (ListRenderer) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public ListRenderer testIdBuilder(Object value) {
		return (ListRenderer) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ListRenderer static_(Object value) {
		return (ListRenderer) this.set("static_", value);
	}
	
	/**
	    */
	public ListRenderer staticSchema(Object value) {
		return (ListRenderer) this.set("staticSchema", value);
	}
	
	/**
	 * 指定为 List 列表展示控件。
    * 可选值: list | static-list
    */
	public ListRenderer type(Object value) {
		return (ListRenderer) this.set("type", value);
	}
	
	/**
	 * 底部区域类名
    */
	public ListRenderer footerClassName(Object value) {
		return (ListRenderer) this.set("footerClassName", value);
	}
	
	/**
	 * 数据源: 绑定当前环境变量
    */
	public ListRenderer source(Object value) {
		return (ListRenderer) this.set("source", value);
	}
	}