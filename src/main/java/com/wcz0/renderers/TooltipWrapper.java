package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class TooltipWrapper extends BaseRenderer {

	public TooltipWrapper() {
		this.set("type", "tooltipWrapper");
	}

	/**
	 * 是否显示表达式
    */
	public TooltipWrapper visibleOn(Object value) {
		return (TooltipWrapper) this.set("visibleOn", value);
	}
	
	/**
	 * 内容区自定义样式
    */
	public TooltipWrapper style(Object value) {
		return (TooltipWrapper) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TooltipWrapper useMobileUI(Object value) {
		return (TooltipWrapper) this.set("useMobileUI", value);
	}
	
	/**
	 * 浮层位置相对偏移量
    */
	public TooltipWrapper offset(Object value) {
		return (TooltipWrapper) this.set("offset", value);
	}
	
	/**
	 * 是否展示浮层指向箭头
    */
	public TooltipWrapper showArrow(Object value) {
		return (TooltipWrapper) this.set("showArrow", value);
	}
	
	/**
	 * 文字提示浮层出现位置，默认为top
    * 可选值: top | right | bottom | left
    */
	public TooltipWrapper placement(Object value) {
		return (TooltipWrapper) this.set("placement", value);
	}
	
	/**
	 * 浮层延迟显示时间, 单位 ms
    */
	public TooltipWrapper mouseEnterDelay(Object value) {
		return (TooltipWrapper) this.set("mouseEnterDelay", value);
	}
	
	/**
	 * 内容区CSS类名
    */
	public TooltipWrapper className(Object value) {
		return (TooltipWrapper) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public TooltipWrapper visible(Object value) {
		return (TooltipWrapper) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TooltipWrapper staticClassName(Object value) {
		return (TooltipWrapper) this.set("staticClassName", value);
	}
	
	/**
	    */
	public TooltipWrapper staticSchema(Object value) {
		return (TooltipWrapper) this.set("staticSchema", value);
	}
	
	/**
	    */
	public TooltipWrapper tooltip(Object value) {
		return (TooltipWrapper) this.set("tooltip", value);
	}
	
	/**
	 * 是否点击非内容区域关闭提示，默认为true
    */
	public TooltipWrapper rootClose(Object value) {
		return (TooltipWrapper) this.set("rootClose", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TooltipWrapper onEvent(Object value) {
		return (TooltipWrapper) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TooltipWrapper staticPlaceholder(Object value) {
		return (TooltipWrapper) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 文字提示容器
    */
	public TooltipWrapper type(Object value) {
		return (TooltipWrapper) this.set("type", value);
	}
	
	/**
	 * 文字提示内容，兼容 tooltip，但建议通过 content 来实现提示内容
    */
	public TooltipWrapper content(Object value) {
		return (TooltipWrapper) this.set("content", value);
	}
	
	/**
	 * 浮层延迟隐藏时间, 单位 ms
    */
	public TooltipWrapper mouseLeaveDelay(Object value) {
		return (TooltipWrapper) this.set("mouseLeaveDelay", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TooltipWrapper hiddenOn(Object value) {
		return (TooltipWrapper) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public TooltipWrapper testIdBuilder(Object value) {
		return (TooltipWrapper) this.set("testIdBuilder", value);
	}
	
	/**
	 * 内容区包裹标签
    */
	public TooltipWrapper wrapperComponent(Object value) {
		return (TooltipWrapper) this.set("wrapperComponent", value);
	}
	
	/**
	 * 文字提示浮层CSS类名
    */
	public TooltipWrapper tooltipClassName(Object value) {
		return (TooltipWrapper) this.set("tooltipClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TooltipWrapper $$id(Object value) {
		return (TooltipWrapper) this.set("$$id", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TooltipWrapper hidden(Object value) {
		return (TooltipWrapper) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TooltipWrapper staticOn(Object value) {
		return (TooltipWrapper) this.set("staticOn", value);
	}
	
	/**
	    */
	public TooltipWrapper testid(Object value) {
		return (TooltipWrapper) this.set("testid", value);
	}
	
	/**
	 * 是否可以移入浮层中, 默认true
    */
	public TooltipWrapper enterable(Object value) {
		return (TooltipWrapper) this.set("enterable", value);
	}
	
	/**
	 * 自定义提示浮层样式
    */
	public TooltipWrapper tooltipStyle(Object value) {
		return (TooltipWrapper) this.set("tooltipStyle", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TooltipWrapper id(Object value) {
		return (TooltipWrapper) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TooltipWrapper editorSetting(Object value) {
		return (TooltipWrapper) this.set("editorSetting", value);
	}
	
	/**
	 * 浮层触发方式，默认为hover
    */
	public TooltipWrapper trigger(Object value) {
		return (TooltipWrapper) this.set("trigger", value);
	}
	
	/**
	 * 内容区域
    */
	public TooltipWrapper body(Object value) {
		return (TooltipWrapper) this.set("body", value);
	}
	
	/**
	 * 内容区是否内联显示，默认为false
    */
	public TooltipWrapper inline(Object value) {
		return (TooltipWrapper) this.set("inline", value);
	}
	
	/**
	 * 主题样式， 默认为light
    * 可选值: light | dark
    */
	public TooltipWrapper tooltipTheme(Object value) {
		return (TooltipWrapper) this.set("tooltipTheme", value);
	}
	
	/**
	 * 是否禁用提示
    */
	public TooltipWrapper disabled(Object value) {
		return (TooltipWrapper) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TooltipWrapper staticLabelClassName(Object value) {
		return (TooltipWrapper) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TooltipWrapper staticInputClassName(Object value) {
		return (TooltipWrapper) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TooltipWrapper disabledOn(Object value) {
		return (TooltipWrapper) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TooltipWrapper static_(Object value) {
		return (TooltipWrapper) this.set("static_", value);
	}
	
	/**
	 * 文字提示标题
    */
	public TooltipWrapper title(Object value) {
		return (TooltipWrapper) this.set("title", value);
	}
	}