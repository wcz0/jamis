package com.wcz0.renderers;
/**
 * JSON 数据展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/json

 * @author wcz0
 * @version 6.2.2
 */
public class Json extends BaseRenderer {

	public Json() {
		this.set("type", "json");
	}

	/**
	 * 是否静态展示表达式
    */
	public Json staticOn(Object value) {
		return (Json) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Json staticPlaceholder(Object value) {
		return (Json) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否为键排序
    */
	public Json sortKeys(Object value) {
		return (Json) this.set("sortKeys", value);
	}
	
	/**
	 * 支持从数据链取值
    */
	public Json source(Object value) {
		return (Json) this.set("source", value);
	}
	
	/**
	 * 图标风格
    * 可选值: square | circle | triangle
    */
	public Json iconStyle(Object value) {
		return (Json) this.set("iconStyle", value);
	}
	
	/**
	 * 是否显示键的引号
    */
	public Json quotesOnKeys(Object value) {
		return (Json) this.set("quotesOnKeys", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Json $$id(Object value) {
		return (Json) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用
    */
	public Json disabled(Object value) {
		return (Json) this.set("disabled", value);
	}
	
	/**
	    */
	public Json testIdBuilder(Object value) {
		return (Json) this.set("testIdBuilder", value);
	}
	
	/**
	 * 默认展开的级别
    */
	public Json levelExpand(Object value) {
		return (Json) this.set("levelExpand", value);
	}
	
	/**
	 * 是否可修改
    */
	public Json mutable(Object value) {
		return (Json) this.set("mutable", value);
	}
	
	/**
	 * 是否可复制
    */
	public Json enableClipboard(Object value) {
		return (Json) this.set("enableClipboard", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Json className(Object value) {
		return (Json) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Json hiddenOn(Object value) {
		return (Json) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Json useMobileUI(Object value) {
		return (Json) this.set("useMobileUI", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Json staticClassName(Object value) {
		return (Json) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Json staticInputClassName(Object value) {
		return (Json) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Json hidden(Object value) {
		return (Json) this.set("hidden", value);
	}
	
	/**
	 * 指定为Json展示类型
    * 可选值: json | static-json
    */
	public Json type(Object value) {
		return (Json) this.set("type", value);
	}
	
	/**
	 * 要展示的 JSON 数据
    */
	public Json value(Object value) {
		return (Json) this.set("value", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Json visibleOn(Object value) {
		return (Json) this.set("visibleOn", value);
	}
	
	/**
	 * 是否显示数据类型
    */
	public Json displayDataTypes(Object value) {
		return (Json) this.set("displayDataTypes", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Json disabledOn(Object value) {
		return (Json) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Json onEvent(Object value) {
		return (Json) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Json staticLabelClassName(Object value) {
		return (Json) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Json staticSchema(Object value) {
		return (Json) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public Json style(Object value) {
		return (Json) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Json editorSetting(Object value) {
		return (Json) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Json testid(Object value) {
		return (Json) this.set("testid", value);
	}
	
	/**
	 * 设置字符串的最大展示长度，超出长度阈值的字符串将被截断，点击value可切换字符串展示方式，默认为false
    */
	public Json ellipsisThreshold(Object value) {
		return (Json) this.set("ellipsisThreshold", value);
	}
	
	/**
	 * 是否显示
    */
	public Json visible(Object value) {
		return (Json) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Json id(Object value) {
		return (Json) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Json static_(Object value) {
		return (Json) this.set("static_", value);
	}
	}