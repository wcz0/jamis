package com.wcz0.renderers;
/**
 * Panel渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/panel

 * @author wcz0
 * @version 6.2.2
 */
public class Panel extends BaseRenderer {

	public Panel() {
		this.set("type", "panel");
	}

	/**
	 * 配置 Body 容器 className
    */
	public Panel bodyClassName(Object value) {
		return (Panel) this.set("bodyClassName", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public Panel subFormMode(Object value) {
		return (Panel) this.set("subFormMode", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Panel onEvent(Object value) {
		return (Panel) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Panel staticOn(Object value) {
		return (Panel) this.set("staticOn", value);
	}
	
	/**
	    */
	public Panel staticSchema(Object value) {
		return (Panel) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public Panel style(Object value) {
		return (Panel) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Panel editorSetting(Object value) {
		return (Panel) this.set("editorSetting", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Panel className(Object value) {
		return (Panel) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Panel disabledOn(Object value) {
		return (Panel) this.set("disabledOn", value);
	}
	
	/**
	 * 指定为Panel渲染器。
    */
	public Panel type(Object value) {
		return (Panel) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public Panel disabled(Object value) {
		return (Panel) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Panel staticClassName(Object value) {
		return (Panel) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Panel staticLabelClassName(Object value) {
		return (Panel) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Panel staticInputClassName(Object value) {
		return (Panel) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Panel testIdBuilder(Object value) {
		return (Panel) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Panel testid(Object value) {
		return (Panel) this.set("testid", value);
	}
	
	/**
	 * 按钮集合
    */
	public Panel actions(Object value) {
		return (Panel) this.set("actions", value);
	}
	
	/**
	 * 内容区域
    */
	public Panel body(Object value) {
		return (Panel) this.set("body", value);
	}
	
	/**
	 * 是否显示
    */
	public Panel visible(Object value) {
		return (Panel) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Panel id(Object value) {
		return (Panel) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Panel staticPlaceholder(Object value) {
		return (Panel) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 底部内容区域
    */
	public Panel footer(Object value) {
		return (Panel) this.set("footer", value);
	}
	
	/**
	 * footer 和 actions 外层 div 类名。
    */
	public Panel footerWrapClassName(Object value) {
		return (Panel) this.set("footerWrapClassName", value);
	}
	
	/**
	 * 固定底部, 想要把按钮固定在底部的时候配置。
    */
	public Panel affixFooter(Object value) {
		return (Panel) this.set("affixFooter", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public Panel subFormHorizontal(Object value) {
		return (Panel) this.set("subFormHorizontal", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Panel $$id(Object value) {
		return (Panel) this.set("$$id", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Panel visibleOn(Object value) {
		return (Panel) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Panel static_(Object value) {
		return (Panel) this.set("static_", value);
	}
	
	/**
	 * 配置 footer 容器 className
    */
	public Panel footerClassName(Object value) {
		return (Panel) this.set("footerClassName", value);
	}
	
	/**
	 * Panel 标题
    */
	public Panel title(Object value) {
		return (Panel) this.set("title", value);
	}
	
	/**
	 * 配置 header 容器 className
    */
	public Panel headerClassName(Object value) {
		return (Panel) this.set("headerClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Panel hidden(Object value) {
		return (Panel) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Panel hiddenOn(Object value) {
		return (Panel) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Panel useMobileUI(Object value) {
		return (Panel) this.set("useMobileUI", value);
	}
	
	/**
	 * 按钮集合外层类名
    */
	public Panel actionsClassName(Object value) {
		return (Panel) this.set("actionsClassName", value);
	}
	
	/**
	 * 头部内容, 和 title 二选一。
    */
	public Panel header(Object value) {
		return (Panel) this.set("header", value);
	}
	}