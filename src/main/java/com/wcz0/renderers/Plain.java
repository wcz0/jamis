package com.wcz0.renderers;
/**
 * Plain 纯文本渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/plain

 * @author wcz0
 * @version 6.2.2
 */
public class Plain extends BaseRenderer {

	public Plain() {
		this.set("type", "plain");
	}

	/**
	 * 是否禁用
    */
	public Plain disabled(Object value) {
		return (Plain) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Plain id(Object value) {
		return (Plain) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Plain static_(Object value) {
		return (Plain) this.set("static_", value);
	}
	
	/**
	    */
	public Plain testid(Object value) {
		return (Plain) this.set("testid", value);
	}
	
	/**
	 * 是否内联显示？
    */
	public Plain inline(Object value) {
		return (Plain) this.set("inline", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Plain hiddenOn(Object value) {
		return (Plain) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Plain staticPlaceholder(Object value) {
		return (Plain) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Plain staticClassName(Object value) {
		return (Plain) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Plain staticInputClassName(Object value) {
		return (Plain) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Plain style(Object value) {
		return (Plain) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Plain useMobileUI(Object value) {
		return (Plain) this.set("useMobileUI", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Plain onEvent(Object value) {
		return (Plain) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Plain staticLabelClassName(Object value) {
		return (Plain) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Plain $$id(Object value) {
		return (Plain) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public Plain visible(Object value) {
		return (Plain) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Plain visibleOn(Object value) {
		return (Plain) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Plain staticOn(Object value) {
		return (Plain) this.set("staticOn", value);
	}
	
	/**
	    */
	public Plain text(Object value) {
		return (Plain) this.set("text", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Plain disabledOn(Object value) {
		return (Plain) this.set("disabledOn", value);
	}
	
	/**
	 * 指定为模板渲染器。文档：https://aisuda.bce.baidu.com/amis/zh-CN/docs/concepts/template
    * 可选值: plain | text
    */
	public Plain type(Object value) {
		return (Plain) this.set("type", value);
	}
	
	/**
	 * 占位符
    */
	public Plain placeholder(Object value) {
		return (Plain) this.set("placeholder", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Plain hidden(Object value) {
		return (Plain) this.set("hidden", value);
	}
	
	/**
	    */
	public Plain staticSchema(Object value) {
		return (Plain) this.set("staticSchema", value);
	}
	
	/**
	    */
	public Plain tpl(Object value) {
		return (Plain) this.set("tpl", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Plain className(Object value) {
		return (Plain) this.set("className", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Plain editorSetting(Object value) {
		return (Plain) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Plain testIdBuilder(Object value) {
		return (Plain) this.set("testIdBuilder", value);
	}
	}