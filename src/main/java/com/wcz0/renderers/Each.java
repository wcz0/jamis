package com.wcz0.renderers;
/**
 * Each 循环功能渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/each

 * @author wcz0
 * @version 6.2.2
 */
public class Each extends BaseRenderer {

	public Each() {
		this.set("type", "each");
	}

	/**
	 * 是否隐藏表达式
    */
	public Each hiddenOn(Object value) {
		return (Each) this.set("hiddenOn", value);
	}
	
	/**
	 * 关联字段名 支持数据映射
    */
	public Each source(Object value) {
		return (Each) this.set("source", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Each disabledOn(Object value) {
		return (Each) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Each hidden(Object value) {
		return (Each) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Each staticOn(Object value) {
		return (Each) this.set("staticOn", value);
	}
	
	/**
	 * 用来控制通过什么字段读取序号，考虑到可能多层嵌套 如果名字一样会读取不到上层变量，所以这里可以指定一下
    */
	public Each indexKeyName(Object value) {
		return (Each) this.set("indexKeyName", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Each staticClassName(Object value) {
		return (Each) this.set("staticClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Each visibleOn(Object value) {
		return (Each) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Each onEvent(Object value) {
		return (Each) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Each staticLabelClassName(Object value) {
		return (Each) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Each editorSetting(Object value) {
		return (Each) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为each展示类型
    */
	public Each type(Object value) {
		return (Each) this.set("type", value);
	}
	
	/**
	    */
	public Each testid(Object value) {
		return (Each) this.set("testid", value);
	}
	
	/**
	    */
	public Each items(Object value) {
		return (Each) this.set("items", value);
	}
	
	/**
	    */
	public Each placeholder(Object value) {
		return (Each) this.set("placeholder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Each id(Object value) {
		return (Each) this.set("id", value);
	}
	
	/**
	 * 是否禁用
    */
	public Each disabled(Object value) {
		return (Each) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Each staticInputClassName(Object value) {
		return (Each) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Each staticSchema(Object value) {
		return (Each) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public Each style(Object value) {
		return (Each) this.set("style", value);
	}
	
	/**
	    */
	public Each testIdBuilder(Object value) {
		return (Each) this.set("testIdBuilder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Each $$id(Object value) {
		return (Each) this.set("$$id", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Each className(Object value) {
		return (Each) this.set("className", value);
	}
	
	/**
	 * 用来控制通过什么字段读取成员数据，考虑到可能多层嵌套 如果名字一样会读取不到上层变量，所以这里可以指定一下
    */
	public Each itemKeyName(Object value) {
		return (Each) this.set("itemKeyName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Each staticPlaceholder(Object value) {
		return (Each) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Each useMobileUI(Object value) {
		return (Each) this.set("useMobileUI", value);
	}
	
	/**
	 * 关联字段名
    */
	public Each name(Object value) {
		return (Each) this.set("name", value);
	}
	
	/**
	 * 是否显示
    */
	public Each visible(Object value) {
		return (Each) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Each static_(Object value) {
		return (Each) this.set("static_", value);
	}
	}