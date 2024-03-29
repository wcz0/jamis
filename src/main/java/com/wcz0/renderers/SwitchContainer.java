package com.wcz0.renderers;
/**
 * SwitchContainer 状态容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/state-container

 * @author wcz0
 * @version 6.2.2
 */
public class SwitchContainer extends BaseRenderer {

	public SwitchContainer() {
		this.set("type", "switchContainer");
	}

	public SwitchContainer set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public SwitchContainer staticSchema(Object value) {
		return (SwitchContainer) this.set("staticSchema", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public SwitchContainer className(Object value) {
		return (SwitchContainer) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public SwitchContainer disabled(Object value) {
		return (SwitchContainer) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SwitchContainer hiddenOn(Object value) {
		return (SwitchContainer) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SwitchContainer staticOn(Object value) {
		return (SwitchContainer) this.set("staticOn", value);
	}
	
	/**
	 * 状态项列表
    */
	public SwitchContainer items(Object value) {
		return (SwitchContainer) this.set("items", value);
	}
	
	/**
	 * 是否隐藏
    */
	public SwitchContainer hidden(Object value) {
		return (SwitchContainer) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SwitchContainer onEvent(Object value) {
		return (SwitchContainer) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SwitchContainer staticClassName(Object value) {
		return (SwitchContainer) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SwitchContainer staticLabelClassName(Object value) {
		return (SwitchContainer) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为 container 类型
    */
	public SwitchContainer type(Object value) {
		return (SwitchContainer) this.set("type", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SwitchContainer editorSetting(Object value) {
		return (SwitchContainer) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SwitchContainer useMobileUI(Object value) {
		return (SwitchContainer) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SwitchContainer disabledOn(Object value) {
		return (SwitchContainer) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示
    */
	public SwitchContainer visible(Object value) {
		return (SwitchContainer) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SwitchContainer id(Object value) {
		return (SwitchContainer) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SwitchContainer staticPlaceholder(Object value) {
		return (SwitchContainer) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SwitchContainer staticInputClassName(Object value) {
		return (SwitchContainer) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SwitchContainer visibleOn(Object value) {
		return (SwitchContainer) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SwitchContainer static_(Object value) {
		return (SwitchContainer) this.set("static_", value);
	}
	
	/**
	 * 自定义样式
    */
	public SwitchContainer style(Object value) {
		return (SwitchContainer) this.set("style", value);
	}
	}