package com.wcz0.renderers;
/**
 * Mapping 映射展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/mapping

 * @author wcz0
 * @version 6.2.2
 */
public class Mapping extends BaseRenderer {

	public Mapping() {
		this.set("type", "mapping");
	}

	public Mapping set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否静态展示表达式
    */
	public Mapping staticOn(Object value) {
		return (Mapping) this.set("staticOn", value);
	}
	
	/**
	 * 指定为映射展示控件
    * 可选值: map | mapping
    */
	public Mapping type(Object value) {
		return (Mapping) this.set("type", value);
	}
	
	/**
	 * 关联字段名。
    */
	public Mapping name(Object value) {
		return (Mapping) this.set("name", value);
	}
	
	/**
	 * map或source为对象数组时，作为label值的字段名
    */
	public Mapping labelField(Object value) {
		return (Mapping) this.set("labelField", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Mapping id(Object value) {
		return (Mapping) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Mapping staticPlaceholder(Object value) {
		return (Mapping) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 如果想远程拉取字典，请配置 source 为接口。
    */
	public Mapping source(Object value) {
		return (Mapping) this.set("source", value);
	}
	
	/**
	 * 是否禁用
    */
	public Mapping disabled(Object value) {
		return (Mapping) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Mapping hidden(Object value) {
		return (Mapping) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Mapping onEvent(Object value) {
		return (Mapping) this.set("onEvent", value);
	}
	
	/**
	    */
	public Mapping staticSchema(Object value) {
		return (Mapping) this.set("staticSchema", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Mapping hiddenOn(Object value) {
		return (Mapping) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Mapping staticClassName(Object value) {
		return (Mapping) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Mapping style(Object value) {
		return (Mapping) this.set("style", value);
	}
	
	/**
	 * 配置映射规则，值可以使用模板语法。当 key 为 * 时表示 else，也就是说值没有映射到任何规则时用 * 对应的值展示。
    */
	public Mapping map(Object value) {
		return (Mapping) this.set("map", value);
	}
	
	/**
	 * 占位符
    */
	public Mapping placeholder(Object value) {
		return (Mapping) this.set("placeholder", value);
	}
	
	/**
	 * 是否显示
    */
	public Mapping visible(Object value) {
		return (Mapping) this.set("visible", value);
	}
	
	/**
	 * map或source为对象数组时，作为value值的字段名
    */
	public Mapping valueField(Object value) {
		return (Mapping) this.set("valueField", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Mapping disabledOn(Object value) {
		return (Mapping) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Mapping staticLabelClassName(Object value) {
		return (Mapping) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 自定义渲染映射值，支持html或schema
    */
	public Mapping itemSchema(Object value) {
		return (Mapping) this.set("itemSchema", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Mapping className(Object value) {
		return (Mapping) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Mapping visibleOn(Object value) {
		return (Mapping) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Mapping static_(Object value) {
		return (Mapping) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Mapping staticInputClassName(Object value) {
		return (Mapping) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Mapping editorSetting(Object value) {
		return (Mapping) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Mapping useMobileUI(Object value) {
		return (Mapping) this.set("useMobileUI", value);
	}
	}