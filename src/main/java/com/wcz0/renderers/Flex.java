package com.wcz0.renderers;
/**
 * Flex 布局 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/flex

 * @author wcz0
 * @version 6.2.2
 */
public class Flex extends BaseRenderer {

	public Flex() {
		this.set("type", "flex");
	}

	/**
	 * 事件动作配置
    */
	public Flex onEvent(Object value) {
		return (Flex) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Flex staticPlaceholder(Object value) {
		return (Flex) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 方向
    * 可选值: row | column | row-reverse | column-reverse
    */
	public Flex direction(Object value) {
		return (Flex) this.set("direction", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Flex staticLabelClassName(Object value) {
		return (Flex) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public Flex visible(Object value) {
		return (Flex) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Flex staticClassName(Object value) {
		return (Flex) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Flex useMobileUI(Object value) {
		return (Flex) this.set("useMobileUI", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Flex className(Object value) {
		return (Flex) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Flex hidden(Object value) {
		return (Flex) this.set("hidden", value);
	}
	
	/**
	    */
	public Flex testIdBuilder(Object value) {
		return (Flex) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Flex testid(Object value) {
		return (Flex) this.set("testid", value);
	}
	
	/**
	 * 水平分布
    * 可选值: start | flex-start | center | end | flex-end | space-around | space-between | space-evenly
    */
	public Flex justify(Object value) {
		return (Flex) this.set("justify", value);
	}
	
	/**
	 * 是否禁用
    */
	public Flex disabled(Object value) {
		return (Flex) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Flex visibleOn(Object value) {
		return (Flex) this.set("visibleOn", value);
	}
	
	/**
	 * 自定义样式
    */
	public Flex style(Object value) {
		return (Flex) this.set("style", value);
	}
	
	/**
	 * 指定为 flex 展示类型
    */
	public Flex type(Object value) {
		return (Flex) this.set("type", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Flex static_(Object value) {
		return (Flex) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Flex editorSetting(Object value) {
		return (Flex) this.set("editorSetting", value);
	}
	
	/**
	 * 垂直布局
    * 可选值: stretch | start | flex-start | flex-end | end | center | baseline
    */
	public Flex alignItems(Object value) {
		return (Flex) this.set("alignItems", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Flex staticInputClassName(Object value) {
		return (Flex) this.set("staticInputClassName", value);
	}
	
	/**
	 * 多行情况下的垂直分布
    * 可选值: normal | flex-start | flex-end | center | space-between | space-around | space-evenly | stretch
    */
	public Flex alignContent(Object value) {
		return (Flex) this.set("alignContent", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Flex disabledOn(Object value) {
		return (Flex) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Flex hiddenOn(Object value) {
		return (Flex) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Flex id(Object value) {
		return (Flex) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Flex staticOn(Object value) {
		return (Flex) this.set("staticOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Flex $$id(Object value) {
		return (Flex) this.set("$$id", value);
	}
	
	/**
	    */
	public Flex staticSchema(Object value) {
		return (Flex) this.set("staticSchema", value);
	}
	
	/**
	 * 每个 flex 的设置
    */
	public Flex items(Object value) {
		return (Flex) this.set("items", value);
	}
	}