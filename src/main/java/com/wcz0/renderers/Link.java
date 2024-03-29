package com.wcz0.renderers;
/**
 * Link 链接展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/link

 * @author wcz0
 * @version 6.2.2
 */
public class Link extends BaseRenderer {

	public Link() {
		this.set("type", "link");
	}

	public Link set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用表达式
    */
	public Link disabledOn(Object value) {
		return (Link) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Link hidden(Object value) {
		return (Link) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Link id(Object value) {
		return (Link) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Link staticOn(Object value) {
		return (Link) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Link staticLabelClassName(Object value) {
		return (Link) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Link className(Object value) {
		return (Link) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Link hiddenOn(Object value) {
		return (Link) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Link visibleOn(Object value) {
		return (Link) this.set("visibleOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public Link disabled(Object value) {
		return (Link) this.set("disabled", value);
	}
	
	/**
	 * 是否新窗口打开。
    */
	public Link blank(Object value) {
		return (Link) this.set("blank", value);
	}
	
	/**
	 * 图标
    */
	public Link icon(Object value) {
		return (Link) this.set("icon", value);
	}
	
	/**
	 * 右侧图标
    */
	public Link rightIcon(Object value) {
		return (Link) this.set("rightIcon", value);
	}
	
	/**
	 * 是否显示
    */
	public Link visible(Object value) {
		return (Link) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Link static_(Object value) {
		return (Link) this.set("static_", value);
	}
	
	/**
	 * 组件样式
    */
	public Link style(Object value) {
		return (Link) this.set("style", value);
	}
	
	/**
	 * 链接内容，如果不配置将显示链接地址。
    */
	public Link body(Object value) {
		return (Link) this.set("body", value);
	}
	
	/**
	 * 角标
    */
	public Link badge(Object value) {
		return (Link) this.set("badge", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Link useMobileUI(Object value) {
		return (Link) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为 link 链接展示控件
    */
	public Link type(Object value) {
		return (Link) this.set("type", value);
	}
	
	/**
	    */
	public Link staticSchema(Object value) {
		return (Link) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Link editorSetting(Object value) {
		return (Link) this.set("editorSetting", value);
	}
	
	/**
	 * 链接地址
    */
	public Link href(Object value) {
		return (Link) this.set("href", value);
	}
	
	/**
	 * a标签原生target属性
    */
	public Link htmlTarget(Object value) {
		return (Link) this.set("htmlTarget", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Link onEvent(Object value) {
		return (Link) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Link staticClassName(Object value) {
		return (Link) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Link staticInputClassName(Object value) {
		return (Link) this.set("staticInputClassName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Link staticPlaceholder(Object value) {
		return (Link) this.set("staticPlaceholder", value);
	}
	}