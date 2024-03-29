package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class TimelineItem extends BaseRenderer {

	public TimelineItem() {
		this.set("type", "timelineItem");
	}

	public TimelineItem set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public TimelineItem onEvent(Object value) {
		return (TimelineItem) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TimelineItem staticOn(Object value) {
		return (TimelineItem) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TimelineItem staticClassName(Object value) {
		return (TimelineItem) this.set("staticClassName", value);
	}
	
	/**
	 * detail展开时文案
    */
	public TimelineItem detailExpandedText(Object value) {
		return (TimelineItem) this.set("detailExpandedText", value);
	}
	
	/**
	 * 是否显示
    */
	public TimelineItem visible(Object value) {
		return (TimelineItem) this.set("visible", value);
	}
	
	/**
	 * 组件样式
    */
	public TimelineItem style(Object value) {
		return (TimelineItem) this.set("style", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TimelineItem hiddenOn(Object value) {
		return (TimelineItem) this.set("hiddenOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TimelineItem editorSetting(Object value) {
		return (TimelineItem) this.set("editorSetting", value);
	}
	
	/**
	 * 时间点
    */
	public TimelineItem time(Object value) {
		return (TimelineItem) this.set("time", value);
	}
	
	/**
	 * 时间节点标题
    */
	public TimelineItem title(Object value) {
		return (TimelineItem) this.set("title", value);
	}
	
	/**
	 * 节点标题的CSS类名（优先级高于统一配置的titleClassName）
    */
	public TimelineItem titleClassName(Object value) {
		return (TimelineItem) this.set("titleClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TimelineItem className(Object value) {
		return (TimelineItem) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TimelineItem disabledOn(Object value) {
		return (TimelineItem) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TimelineItem visibleOn(Object value) {
		return (TimelineItem) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TimelineItem staticInputClassName(Object value) {
		return (TimelineItem) this.set("staticInputClassName", value);
	}
	
	/**
	 * 图标
    */
	public TimelineItem icon(Object value) {
		return (TimelineItem) this.set("icon", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TimelineItem hidden(Object value) {
		return (TimelineItem) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TimelineItem id(Object value) {
		return (TimelineItem) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TimelineItem static_(Object value) {
		return (TimelineItem) this.set("static_", value);
	}
	
	/**
	 * 图标的CSS类名
    */
	public TimelineItem iconClassName(Object value) {
		return (TimelineItem) this.set("iconClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public TimelineItem disabled(Object value) {
		return (TimelineItem) this.set("disabled", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TimelineItem staticPlaceholder(Object value) {
		return (TimelineItem) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TimelineItem staticLabelClassName(Object value) {
		return (TimelineItem) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public TimelineItem staticSchema(Object value) {
		return (TimelineItem) this.set("staticSchema", value);
	}
	
	/**
	 * 节点详情的CSS类名（优先级高于统一配置的detailClassName）
    */
	public TimelineItem detailClassName(Object value) {
		return (TimelineItem) this.set("detailClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TimelineItem useMobileUI(Object value) {
		return (TimelineItem) this.set("useMobileUI", value);
	}
	
	/**
	 * 时间点圆圈颜色
    */
	public TimelineItem color(Object value) {
		return (TimelineItem) this.set("color", value);
	}
	
	/**
	 * 详细内容
    */
	public TimelineItem detail(Object value) {
		return (TimelineItem) this.set("detail", value);
	}
	
	/**
	 * detail折叠时文案
    */
	public TimelineItem detailCollapsedText(Object value) {
		return (TimelineItem) this.set("detailCollapsedText", value);
	}
	
	/**
	 * 节点时间的CSS类名（优先级高于统一配置的timeClassName）
    */
	public TimelineItem timeClassName(Object value) {
		return (TimelineItem) this.set("timeClassName", value);
	}
	}