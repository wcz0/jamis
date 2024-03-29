package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class NavItem extends BaseRenderer {

	public NavItem() {
		this.set("type", "navItem");
	}

	public NavItem set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 静态展示表单项Label类名
    */
	public NavItem staticLabelClassName(Object value) {
		return (NavItem) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public NavItem staticInputClassName(Object value) {
		return (NavItem) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public NavItem deferApi(Object value) {
		return (NavItem) this.set("deferApi", value);
	}
	
	/**
	    */
	public NavItem className(Object value) {
		return (NavItem) this.set("className", value);
	}
	
	/**
	    */
	public NavItem disabled(Object value) {
		return (NavItem) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public NavItem staticOn(Object value) {
		return (NavItem) this.set("staticOn", value);
	}
	
	/**
	 * 图标类名，参考 fontawesome 4。
    */
	public NavItem icon(Object value) {
		return (NavItem) this.set("icon", value);
	}
	
	/**
	    */
	public NavItem children(Object value) {
		return (NavItem) this.set("children", value);
	}
	
	/**
	    */
	public NavItem key(Object value) {
		return (NavItem) this.set("key", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public NavItem disabledOn(Object value) {
		return (NavItem) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public NavItem onEvent(Object value) {
		return (NavItem) this.set("onEvent", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public NavItem visibleOn(Object value) {
		return (NavItem) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public NavItem static_(Object value) {
		return (NavItem) this.set("static_", value);
	}
	
	/**
	    */
	public NavItem to(Object value) {
		return (NavItem) this.set("to", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public NavItem staticPlaceholder(Object value) {
		return (NavItem) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public NavItem editorSetting(Object value) {
		return (NavItem) this.set("editorSetting", value);
	}
	
	/**
	    */
	public NavItem unfolded(Object value) {
		return (NavItem) this.set("unfolded", value);
	}
	
	/**
	    */
	public NavItem defer(Object value) {
		return (NavItem) this.set("defer", value);
	}
	
	/**
	    */
	public NavItem mode(Object value) {
		return (NavItem) this.set("mode", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public NavItem hiddenOn(Object value) {
		return (NavItem) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public NavItem target(Object value) {
		return (NavItem) this.set("target", value);
	}
	
	/**
	 * 是否显示
    */
	public NavItem visible(Object value) {
		return (NavItem) this.set("visible", value);
	}
	
	/**
	 * 组件样式
    */
	public NavItem style(Object value) {
		return (NavItem) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public NavItem useMobileUI(Object value) {
		return (NavItem) this.set("useMobileUI", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public NavItem staticClassName(Object value) {
		return (NavItem) this.set("staticClassName", value);
	}
	
	/**
	    */
	public NavItem staticSchema(Object value) {
		return (NavItem) this.set("staticSchema", value);
	}
	
	/**
	 * 文字说明
    */
	public NavItem label(Object value) {
		return (NavItem) this.set("label", value);
	}
	
	/**
	    */
	public NavItem active(Object value) {
		return (NavItem) this.set("active", value);
	}
	
	/**
	    */
	public NavItem disabledTip(Object value) {
		return (NavItem) this.set("disabledTip", value);
	}
	
	/**
	 * 是否隐藏
    */
	public NavItem hidden(Object value) {
		return (NavItem) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public NavItem id(Object value) {
		return (NavItem) this.set("id", value);
	}
	}