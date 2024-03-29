package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Timeline extends BaseRenderer {

	public Timeline() {
		this.set("type", "timeline");
	}

	public Timeline set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public Timeline visible(Object value) {
		return (Timeline) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Timeline staticOn(Object value) {
		return (Timeline) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Timeline staticPlaceholder(Object value) {
		return (Timeline) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Timeline staticClassName(Object value) {
		return (Timeline) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Timeline style(Object value) {
		return (Timeline) this.set("style", value);
	}
	
	/**
	 * 文字相对于时间轴展示方向
    * 可选值: left | right | alternate
    */
	public Timeline mode(Object value) {
		return (Timeline) this.set("mode", value);
	}
	
	/**
	 * 节点标题的CSS类名
    */
	public Timeline titleClassName(Object value) {
		return (Timeline) this.set("titleClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public Timeline disabled(Object value) {
		return (Timeline) this.set("disabled", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Timeline useMobileUI(Object value) {
		return (Timeline) this.set("useMobileUI", value);
	}
	
	/**
	 * API 或 数据映射
    */
	public Timeline source(Object value) {
		return (Timeline) this.set("source", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Timeline static_(Object value) {
		return (Timeline) this.set("static_", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Timeline onEvent(Object value) {
		return (Timeline) this.set("onEvent", value);
	}
	
	/**
	 * 节点倒序
    */
	public Timeline reverse(Object value) {
		return (Timeline) this.set("reverse", value);
	}
	
	/**
	 * 节点时间的CSS类名
    */
	public Timeline timeClassName(Object value) {
		return (Timeline) this.set("timeClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Timeline className(Object value) {
		return (Timeline) this.set("className", value);
	}
	
	/**
	    */
	public Timeline staticSchema(Object value) {
		return (Timeline) this.set("staticSchema", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Timeline hidden(Object value) {
		return (Timeline) this.set("hidden", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Timeline editorSetting(Object value) {
		return (Timeline) this.set("editorSetting", value);
	}
	
	/**
	 * 节点数据
    */
	public Timeline items(Object value) {
		return (Timeline) this.set("items", value);
	}
	
	/**
	 * 节点title自定一展示模板
    */
	public Timeline itemTitleSchema(Object value) {
		return (Timeline) this.set("itemTitleSchema", value);
	}
	
	/**
	 * 图标的CSS类名
    */
	public Timeline iconClassName(Object value) {
		return (Timeline) this.set("iconClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Timeline staticInputClassName(Object value) {
		return (Timeline) this.set("staticInputClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Timeline staticLabelClassName(Object value) {
		return (Timeline) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Timeline visibleOn(Object value) {
		return (Timeline) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Timeline id(Object value) {
		return (Timeline) this.set("id", value);
	}
	
	/**
	 * 指定为 Timeline 时间轴渲染器
    */
	public Timeline type(Object value) {
		return (Timeline) this.set("type", value);
	}
	
	/**
	 * 展示方向
    * 可选值: horizontal | vertical
    */
	public Timeline direction(Object value) {
		return (Timeline) this.set("direction", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Timeline hiddenOn(Object value) {
		return (Timeline) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Timeline disabledOn(Object value) {
		return (Timeline) this.set("disabledOn", value);
	}
	
	/**
	 * 节点详情的CSS类名
    */
	public Timeline detailClassName(Object value) {
		return (Timeline) this.set("detailClassName", value);
	}
	}