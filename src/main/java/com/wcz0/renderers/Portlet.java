package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Portlet extends BaseRenderer {

	public Portlet() {
		this.set("type", "portlet");
	}

	public Portlet set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 卡片隐藏的时候是否销毁卡片内容
    */
	public Portlet unmountOnExit(Object value) {
		return (Portlet) this.set("unmountOnExit", value);
	}
	
	/**
	 * 是否禁用
    */
	public Portlet disabled(Object value) {
		return (Portlet) this.set("disabled", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Portlet staticPlaceholder(Object value) {
		return (Portlet) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 链接外层类名
    */
	public Portlet linksClassName(Object value) {
		return (Portlet) this.set("linksClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Portlet editorSetting(Object value) {
		return (Portlet) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Portlet tabs(Object value) {
		return (Portlet) this.set("tabs", value);
	}
	
	/**
	 * 类名
    */
	public Portlet tabsClassName(Object value) {
		return (Portlet) this.set("tabsClassName", value);
	}
	
	/**
	 * 标题右侧的描述
    */
	public Portlet description(Object value) {
		return (Portlet) this.set("description", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Portlet visibleOn(Object value) {
		return (Portlet) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Portlet onEvent(Object value) {
		return (Portlet) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Portlet static_(Object value) {
		return (Portlet) this.set("static_", value);
	}
	
	/**
	 * 自定义样式
    */
	public Portlet style(Object value) {
		return (Portlet) this.set("style", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Portlet disabledOn(Object value) {
		return (Portlet) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Portlet staticLabelClassName(Object value) {
		return (Portlet) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Portlet staticInputClassName(Object value) {
		return (Portlet) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public Portlet visible(Object value) {
		return (Portlet) this.set("visible", value);
	}
	
	/**
	 * 卡片是否只有在点开的时候加载？
    */
	public Portlet mountOnEnter(Object value) {
		return (Portlet) this.set("mountOnEnter", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Portlet className(Object value) {
		return (Portlet) this.set("className", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Portlet staticOn(Object value) {
		return (Portlet) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Portlet staticClassName(Object value) {
		return (Portlet) this.set("staticClassName", value);
	}
	
	/**
	 * 内容类名
    */
	public Portlet contentClassName(Object value) {
		return (Portlet) this.set("contentClassName", value);
	}
	
	/**
	 * header和内容是否展示分割线
    */
	public Portlet divider(Object value) {
		return (Portlet) this.set("divider", value);
	}
	
	/**
	 * 隐藏头部
    */
	public Portlet hideHeader(Object value) {
		return (Portlet) this.set("hideHeader", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Portlet hiddenOn(Object value) {
		return (Portlet) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public Portlet staticSchema(Object value) {
		return (Portlet) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Portlet useMobileUI(Object value) {
		return (Portlet) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为 portlet 类型
    */
	public Portlet type(Object value) {
		return (Portlet) this.set("type", value);
	}
	
	/**
	 * 关联已有数据，选项卡直接根据目标数据重复。
    */
	public Portlet source(Object value) {
		return (Portlet) this.set("source", value);
	}
	
	/**
	 * 是否支持溢出滚动
    */
	public Portlet scrollable(Object value) {
		return (Portlet) this.set("scrollable", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Portlet hidden(Object value) {
		return (Portlet) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Portlet id(Object value) {
		return (Portlet) this.set("id", value);
	}
	
	/**
	 * 展示形式
    * 可选值:  | line | card | radio | vertical | tiled
    */
	public Portlet tabsMode(Object value) {
		return (Portlet) this.set("tabsMode", value);
	}
	
	/**
	 * 可以在右侧配置点其他功能按钮。不会随着tab切换
    */
	public Portlet toolbar(Object value) {
		return (Portlet) this.set("toolbar", value);
	}
	}