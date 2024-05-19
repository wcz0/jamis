package com.wcz0.renderers;
/**
 * Collapse 折叠渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/collapse

 * @author wcz0
 * @version 6.2.2
 */
public class Collapse extends BaseRenderer {

	public Collapse() {
		this.set("type", "collapse");
	}

	/**
	 * 是否显示表达式
    */
	public Collapse visibleOn(Object value) {
		return (Collapse) this.set("visibleOn", value);
	}
	
	/**
	    */
	public Collapse testIdBuilder(Object value) {
		return (Collapse) this.set("testIdBuilder", value);
	}
	
	/**
	 * 标识
    */
	public Collapse key(Object value) {
		return (Collapse) this.set("key", value);
	}
	
	/**
	 * 默认是否折叠
    */
	public Collapse collapsed(Object value) {
		return (Collapse) this.set("collapsed", value);
	}
	
	/**
	 * 卡片隐藏就销毁内容。
    */
	public Collapse unmountOnExit(Object value) {
		return (Collapse) this.set("unmountOnExit", value);
	}
	
	/**
	 * 标题内容分割线
    */
	public Collapse divideLine(Object value) {
		return (Collapse) this.set("divideLine", value);
	}
	
	/**
	    */
	public Collapse staticSchema(Object value) {
		return (Collapse) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Collapse editorSetting(Object value) {
		return (Collapse) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为折叠器类型
    */
	public Collapse type(Object value) {
		return (Collapse) this.set("type", value);
	}
	
	/**
	 * 标题
    */
	public Collapse header(Object value) {
		return (Collapse) this.set("header", value);
	}
	
	/**
	 * 内容区域
    */
	public Collapse body(Object value) {
		return (Collapse) this.set("body", value);
	}
	
	/**
	 * 控件大小
    * 可选值: xs | sm | md | lg | base
    */
	public Collapse size(Object value) {
		return (Collapse) this.set("size", value);
	}
	
	/**
	 * 点开时才加载内容
    */
	public Collapse mountOnEnter(Object value) {
		return (Collapse) this.set("mountOnEnter", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Collapse className(Object value) {
		return (Collapse) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Collapse disabledOn(Object value) {
		return (Collapse) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Collapse hidden(Object value) {
		return (Collapse) this.set("hidden", value);
	}
	
	/**
	 * 组件样式
    */
	public Collapse style(Object value) {
		return (Collapse) this.set("style", value);
	}
	
	/**
	 * 标题展示位置
    * 可选值: top | bottom
    */
	public Collapse headerPosition(Object value) {
		return (Collapse) this.set("headerPosition", value);
	}
	
	/**
	 * 配置 Body 容器 className
    */
	public Collapse bodyClassName(Object value) {
		return (Collapse) this.set("bodyClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Collapse $$id(Object value) {
		return (Collapse) this.set("$$id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Collapse static_(Object value) {
		return (Collapse) this.set("static_", value);
	}
	
	/**
	    */
	public Collapse testid(Object value) {
		return (Collapse) this.set("testid", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Collapse onEvent(Object value) {
		return (Collapse) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Collapse staticPlaceholder(Object value) {
		return (Collapse) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Collapse staticInputClassName(Object value) {
		return (Collapse) this.set("staticInputClassName", value);
	}
	
	/**
	 * 标题 CSS 类名
    */
	public Collapse headingClassName(Object value) {
		return (Collapse) this.set("headingClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public Collapse visible(Object value) {
		return (Collapse) this.set("visible", value);
	}
	
	/**
	 * 图标是否展示
    */
	public Collapse showArrow(Object value) {
		return (Collapse) this.set("showArrow", value);
	}
	
	/**
	 * 自定义切换图标
    */
	public Collapse expandIcon(Object value) {
		return (Collapse) this.set("expandIcon", value);
	}
	
	/**
	 * 收起的标题
    */
	public Collapse collapseHeader(Object value) {
		return (Collapse) this.set("collapseHeader", value);
	}
	
	/**
	 * 是否禁用
    */
	public Collapse disabled(Object value) {
		return (Collapse) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Collapse staticOn(Object value) {
		return (Collapse) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Collapse staticLabelClassName(Object value) {
		return (Collapse) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Collapse useMobileUI(Object value) {
		return (Collapse) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否可折叠
    */
	public Collapse collapsable(Object value) {
		return (Collapse) this.set("collapsable", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Collapse hiddenOn(Object value) {
		return (Collapse) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Collapse id(Object value) {
		return (Collapse) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Collapse staticClassName(Object value) {
		return (Collapse) this.set("staticClassName", value);
	}
	}