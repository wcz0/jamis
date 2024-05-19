package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ListItem extends BaseRenderer {

	public ListItem() {
		this.set("type", "listItem");
	}

	/**
	 * 是否禁用表达式
    */
	public ListItem disabledOn(Object value) {
		return (ListItem) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示
    */
	public ListItem visible(Object value) {
		return (ListItem) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ListItem $$id(Object value) {
		return (ListItem) this.set("$$id", value);
	}
	
	/**
	 * 图片地址
    */
	public ListItem avatar(Object value) {
		return (ListItem) this.set("avatar", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ListItem visibleOn(Object value) {
		return (ListItem) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ListItem staticOn(Object value) {
		return (ListItem) this.set("staticOn", value);
	}
	
	/**
	 * 描述
    */
	public ListItem desc(Object value) {
		return (ListItem) this.set("desc", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ListItem hidden(Object value) {
		return (ListItem) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ListItem static_(Object value) {
		return (ListItem) this.set("static_", value);
	}
	
	/**
	    */
	public ListItem staticSchema(Object value) {
		return (ListItem) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ListItem useMobileUI(Object value) {
		return (ListItem) this.set("useMobileUI", value);
	}
	
	/**
	 * tooltip 说明
    */
	public ListItem remark(Object value) {
		return (ListItem) this.set("remark", value);
	}
	
	/**
	    */
	public ListItem testid(Object value) {
		return (ListItem) this.set("testid", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ListItem hiddenOn(Object value) {
		return (ListItem) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ListItem staticPlaceholder(Object value) {
		return (ListItem) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ListItem staticLabelClassName(Object value) {
		return (ListItem) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public ListItem style(Object value) {
		return (ListItem) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ListItem editorSetting(Object value) {
		return (ListItem) this.set("editorSetting", value);
	}
	
	/**
	    */
	public ListItem testIdBuilder(Object value) {
		return (ListItem) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public ListItem actions(Object value) {
		return (ListItem) this.set("actions", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ListItem className(Object value) {
		return (ListItem) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public ListItem disabled(Object value) {
		return (ListItem) this.set("disabled", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ListItem onEvent(Object value) {
		return (ListItem) this.set("onEvent", value);
	}
	
	/**
	 * 操作位置，默认在右侧，可以设置成左侧。
    * 可选值: left | right
    */
	public ListItem actionsPosition(Object value) {
		return (ListItem) this.set("actionsPosition", value);
	}
	
	/**
	 * 副标题
    */
	public ListItem subTitle(Object value) {
		return (ListItem) this.set("subTitle", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ListItem staticInputClassName(Object value) {
		return (ListItem) this.set("staticInputClassName", value);
	}
	
	/**
	 * 内容区域
    */
	public ListItem body(Object value) {
		return (ListItem) this.set("body", value);
	}
	
	/**
	 * 标题
    */
	public ListItem title(Object value) {
		return (ListItem) this.set("title", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ListItem id(Object value) {
		return (ListItem) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ListItem staticClassName(Object value) {
		return (ListItem) this.set("staticClassName", value);
	}
	}