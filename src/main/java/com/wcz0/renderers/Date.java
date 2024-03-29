package com.wcz0.renderers;
/**
 * Date 展示渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/date

 * @author wcz0
 * @version 6.2.2
 */
public class Date extends BaseRenderer {

	public Date() {
		this.set("type", "date");
	}

	public Date set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 静态展示表单项类名
    */
	public Date staticClassName(Object value) {
		return (Date) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Date useMobileUI(Object value) {
		return (Date) this.set("useMobileUI", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Date id(Object value) {
		return (Date) this.set("id", value);
	}
	
	/**
	 * 展示的时间格式，参考 moment 中的格式说明。
    */
	public Date format(Object value) {
		return (Date) this.set("format", value);
	}
	
	/**
	 * 是否显示
    */
	public Date visible(Object value) {
		return (Date) this.set("visible", value);
	}
	
	/**
	 * 占位符
    */
	public Date placeholder(Object value) {
		return (Date) this.set("placeholder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Date className(Object value) {
		return (Date) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Date disabled(Object value) {
		return (Date) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Date staticLabelClassName(Object value) {
		return (Date) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Date editorSetting(Object value) {
		return (Date) this.set("editorSetting", value);
	}
	
	/**
	 * 值的时间格式，参考 moment 中的格式说明。
    */
	public Date valueFormat(Object value) {
		return (Date) this.set("valueFormat", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Date hiddenOn(Object value) {
		return (Date) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Date visibleOn(Object value) {
		return (Date) this.set("visibleOn", value);
	}
	
	/**
	 * 组件样式
    */
	public Date style(Object value) {
		return (Date) this.set("style", value);
	}
	
	/**
	 * 展示的时间格式，参考 moment 中的格式说明。（新：同format）
    */
	public Date displayFormat(Object value) {
		return (Date) this.set("displayFormat", value);
	}
	
	/**
	 * 时区
    */
	public Date displayTimeZone(Object value) {
		return (Date) this.set("displayTimeZone", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Date onEvent(Object value) {
		return (Date) this.set("onEvent", value);
	}
	
	/**
	    */
	public Date staticSchema(Object value) {
		return (Date) this.set("staticSchema", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Date disabledOn(Object value) {
		return (Date) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Date static_(Object value) {
		return (Date) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Date staticPlaceholder(Object value) {
		return (Date) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 指定为日期展示类型
    * 可选值: date | datetime | time | static-date | static-datetime | static-time
    */
	public Date type(Object value) {
		return (Date) this.set("type", value);
	}
	
	/**
	 * 更新频率， 默认为1分钟
    */
	public Date updateFrequency(Object value) {
		return (Date) this.set("updateFrequency", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Date hidden(Object value) {
		return (Date) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Date staticOn(Object value) {
		return (Date) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Date staticInputClassName(Object value) {
		return (Date) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示成相对时间，比如1分钟前
    */
	public Date fromNow(Object value) {
		return (Date) this.set("fromNow", value);
	}
	}