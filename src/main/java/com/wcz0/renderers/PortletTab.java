package com.wcz0.renderers;
/**
 * 栏目容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/portlet

 * @author wcz0
 * @version 6.2.2
 */
public class PortletTab extends BaseRenderer {

	public PortletTab() {
		this.set("type", "portletTab");
	}

	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public PortletTab id(Object value) {
		return (PortletTab) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public PortletTab static_(Object value) {
		return (PortletTab) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public PortletTab staticPlaceholder(Object value) {
		return (PortletTab) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public PortletTab style(Object value) {
		return (PortletTab) this.set("style", value);
	}
	
	/**
	    * 可选值: left | right
    */
	public PortletTab iconPosition(Object value) {
		return (PortletTab) this.set("iconPosition", value);
	}
	
	/**
	 * 是否隐藏
    */
	public PortletTab hidden(Object value) {
		return (PortletTab) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public PortletTab visibleOn(Object value) {
		return (PortletTab) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public PortletTab staticClassName(Object value) {
		return (PortletTab) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public PortletTab staticInputClassName(Object value) {
		return (PortletTab) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public PortletTab editorSetting(Object value) {
		return (PortletTab) this.set("editorSetting", value);
	}
	
	/**
	 * 按钮图标
    */
	public PortletTab icon(Object value) {
		return (PortletTab) this.set("icon", value);
	}
	
	/**
	 * 点开时才加载卡片内容
    */
	public PortletTab mountOnEnter(Object value) {
		return (PortletTab) this.set("mountOnEnter", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public PortletTab $$id(Object value) {
		return (PortletTab) this.set("$$id", value);
	}
	
	/**
	 * 内容
    */
	public PortletTab body(Object value) {
		return (PortletTab) this.set("body", value);
	}
	
	/**
	    */
	public PortletTab testid(Object value) {
		return (PortletTab) this.set("testid", value);
	}
	
	/**
	 * 事件动作配置
    */
	public PortletTab onEvent(Object value) {
		return (PortletTab) this.set("onEvent", value);
	}
	
	/**
	 * 设置以后内容每次都会重新渲染
    */
	public PortletTab reload(Object value) {
		return (PortletTab) this.set("reload", value);
	}
	
	/**
	 * 是否显示
    */
	public PortletTab visible(Object value) {
		return (PortletTab) this.set("visible", value);
	}
	
	/**
	    */
	public PortletTab staticSchema(Object value) {
		return (PortletTab) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public PortletTab useMobileUI(Object value) {
		return (PortletTab) this.set("useMobileUI", value);
	}
	
	/**
	 * 内容
    */
	public PortletTab tab(Object value) {
		return (PortletTab) this.set("tab", value);
	}
	
	/**
	 * 卡片隐藏就销毁卡片节点。
    */
	public PortletTab unmountOnExit(Object value) {
		return (PortletTab) this.set("unmountOnExit", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public PortletTab staticLabelClassName(Object value) {
		return (PortletTab) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public PortletTab testIdBuilder(Object value) {
		return (PortletTab) this.set("testIdBuilder", value);
	}
	
	/**
	 * 可以在右侧配置点其他功能按钮，随着tab切换而切换
    */
	public PortletTab toolbar(Object value) {
		return (PortletTab) this.set("toolbar", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public PortletTab disabledOn(Object value) {
		return (PortletTab) this.set("disabledOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public PortletTab disabled(Object value) {
		return (PortletTab) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public PortletTab hiddenOn(Object value) {
		return (PortletTab) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public PortletTab staticOn(Object value) {
		return (PortletTab) this.set("staticOn", value);
	}
	
	/**
	 * Tab 标题
    */
	public PortletTab title(Object value) {
		return (PortletTab) this.set("title", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public PortletTab className(Object value) {
		return (PortletTab) this.set("className", value);
	}
	}