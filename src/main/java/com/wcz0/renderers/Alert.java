package com.wcz0.renderers;
/**
 * Alert 提示渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/alert

 * @author wcz0
 * @version 6.2.2
 */
public class Alert extends BaseRenderer {

	public Alert() {
		this.set("type", "alert");
	}

	public Alert set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 容器 css 类名
    */
	public Alert className(Object value) {
		return (Alert) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Alert staticPlaceholder(Object value) {
		return (Alert) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Alert staticSchema(Object value) {
		return (Alert) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Alert editorSetting(Object value) {
		return (Alert) this.set("editorSetting", value);
	}
	
	/**
	 * 是否显示
    */
	public Alert visible(Object value) {
		return (Alert) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Alert staticLabelClassName(Object value) {
		return (Alert) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Alert useMobileUI(Object value) {
		return (Alert) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否显示ICON
    */
	public Alert showIcon(Object value) {
		return (Alert) this.set("showIcon", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Alert onEvent(Object value) {
		return (Alert) this.set("onEvent", value);
	}
	
	/**
	 * 提示框标题
    */
	public Alert title(Object value) {
		return (Alert) this.set("title", value);
	}
	
	/**
	 * 提示类型
    * 可选值: info | warning | success | danger
    */
	public Alert level(Object value) {
		return (Alert) this.set("level", value);
	}
	
	/**
	 * 是否显示关闭按钮
    */
	public Alert showCloseButton(Object value) {
		return (Alert) this.set("showCloseButton", value);
	}
	
	/**
	 * 操作区域
    */
	public Alert actions(Object value) {
		return (Alert) this.set("actions", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Alert hidden(Object value) {
		return (Alert) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Alert hiddenOn(Object value) {
		return (Alert) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Alert staticClassName(Object value) {
		return (Alert) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Alert style(Object value) {
		return (Alert) this.set("style", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Alert staticOn(Object value) {
		return (Alert) this.set("staticOn", value);
	}
	
	/**
	 * 内容区域
    */
	public Alert body(Object value) {
		return (Alert) this.set("body", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Alert disabledOn(Object value) {
		return (Alert) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Alert visibleOn(Object value) {
		return (Alert) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Alert static_(Object value) {
		return (Alert) this.set("static_", value);
	}
	
	/**
	 * 左侧图标
    */
	public Alert icon(Object value) {
		return (Alert) this.set("icon", value);
	}
	
	/**
	 * 是否禁用
    */
	public Alert disabled(Object value) {
		return (Alert) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Alert id(Object value) {
		return (Alert) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Alert staticInputClassName(Object value) {
		return (Alert) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定为提示框类型
    */
	public Alert type(Object value) {
		return (Alert) this.set("type", value);
	}
	
	/**
	 * 关闭按钮CSS类名
    */
	public Alert closeButtonClassName(Object value) {
		return (Alert) this.set("closeButtonClassName", value);
	}
	
	/**
	 * 图标CSS类名
    */
	public Alert iconClassName(Object value) {
		return (Alert) this.set("iconClassName", value);
	}
	}