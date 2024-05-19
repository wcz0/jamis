package com.wcz0.renderers;
/**
 * DateRange 展示渲染器。

 * @author wcz0
 * @version 6.2.2
 */
public class DateRange extends BaseRenderer {

	public DateRange() {
		this.set("type", "dateRange");
	}

	/**
	 * 值的时间格式，参考 moment 中的格式说明。
    */
	public DateRange valueFormat(Object value) {
		return (DateRange) this.set("valueFormat", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DateRange disabledOn(Object value) {
		return (DateRange) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DateRange hiddenOn(Object value) {
		return (DateRange) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DateRange staticPlaceholder(Object value) {
		return (DateRange) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DateRange staticClassName(Object value) {
		return (DateRange) this.set("staticClassName", value);
	}
	
	/**
	 * 展示的时间格式，参考 moment 中的格式说明。（新：同format）
    */
	public DateRange displayFormat(Object value) {
		return (DateRange) this.set("displayFormat", value);
	}
	
	/**
	 * 是否禁用
    */
	public DateRange disabled(Object value) {
		return (DateRange) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DateRange id(Object value) {
		return (DateRange) this.set("id", value);
	}
	
	/**
	    */
	public DateRange testid(Object value) {
		return (DateRange) this.set("testid", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DateRange visibleOn(Object value) {
		return (DateRange) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DateRange staticOn(Object value) {
		return (DateRange) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DateRange staticLabelClassName(Object value) {
		return (DateRange) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DateRange editorSetting(Object value) {
		return (DateRange) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DateRange useMobileUI(Object value) {
		return (DateRange) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public DateRange testIdBuilder(Object value) {
		return (DateRange) this.set("testIdBuilder", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DateRange onEvent(Object value) {
		return (DateRange) this.set("onEvent", value);
	}
	
	/**
	 * 连接符
    */
	public DateRange connector(Object value) {
		return (DateRange) this.set("connector", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DateRange className(Object value) {
		return (DateRange) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DateRange hidden(Object value) {
		return (DateRange) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DateRange staticInputClassName(Object value) {
		return (DateRange) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public DateRange staticSchema(Object value) {
		return (DateRange) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public DateRange style(Object value) {
		return (DateRange) this.set("style", value);
	}
	
	/**
	 * 展示的时间格式，参考 moment 中的格式说明。
    */
	public DateRange format(Object value) {
		return (DateRange) this.set("format", value);
	}
	
	/**
	 * 分割符
    */
	public DateRange delimiter(Object value) {
		return (DateRange) this.set("delimiter", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public DateRange $$id(Object value) {
		return (DateRange) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public DateRange visible(Object value) {
		return (DateRange) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DateRange static_(Object value) {
		return (DateRange) this.set("static_", value);
	}
	
	/**
	 * 指定为日期展示类型
    */
	public DateRange type(Object value) {
		return (DateRange) this.set("type", value);
	}
	}