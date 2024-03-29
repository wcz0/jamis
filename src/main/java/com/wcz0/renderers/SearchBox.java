package com.wcz0.renderers;
/**
 * 搜索框渲染器

 * @author wcz0
 * @version 6.2.2
 */
public class SearchBox extends BaseRenderer {

	public SearchBox() {
		this.set("type", "searchBox");
	}

	public SearchBox set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏
    */
	public SearchBox hidden(Object value) {
		return (SearchBox) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public SearchBox visible(Object value) {
		return (SearchBox) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SearchBox visibleOn(Object value) {
		return (SearchBox) this.set("visibleOn", value);
	}
	
	/**
	    */
	public SearchBox staticSchema(Object value) {
		return (SearchBox) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SearchBox editorSetting(Object value) {
		return (SearchBox) this.set("editorSetting", value);
	}
	
	/**
	 * 是否为 Mini 样式。
    */
	public SearchBox mini(Object value) {
		return (SearchBox) this.set("mini", value);
	}
	
	/**
	 * 是否立马搜索。
    */
	public SearchBox searchImediately(Object value) {
		return (SearchBox) this.set("searchImediately", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SearchBox disabledOn(Object value) {
		return (SearchBox) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SearchBox static_(Object value) {
		return (SearchBox) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SearchBox staticPlaceholder(Object value) {
		return (SearchBox) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否处于加载状态
    */
	public SearchBox loading(Object value) {
		return (SearchBox) this.set("loading", value);
	}
	
	/**
	 * 是否为加强样式
    */
	public SearchBox enhance(Object value) {
		return (SearchBox) this.set("enhance", value);
	}
	
	/**
	 * 是否开启清空内容后立即重新搜索
    */
	public SearchBox clearAndSubmit(Object value) {
		return (SearchBox) this.set("clearAndSubmit", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SearchBox staticClassName(Object value) {
		return (SearchBox) this.set("staticClassName", value);
	}
	
	/**
	 * 是否可清除
    */
	public SearchBox clearable(Object value) {
		return (SearchBox) this.set("clearable", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SearchBox staticInputClassName(Object value) {
		return (SearchBox) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SearchBox useMobileUI(Object value) {
		return (SearchBox) this.set("useMobileUI", value);
	}
	
	/**
	 * 占位符
    */
	public SearchBox placeholder(Object value) {
		return (SearchBox) this.set("placeholder", value);
	}
	
	/**
	 * 外层 css 类名
    */
	public SearchBox className(Object value) {
		return (SearchBox) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SearchBox id(Object value) {
		return (SearchBox) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SearchBox staticLabelClassName(Object value) {
		return (SearchBox) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为搜索框。文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/search-box
    */
	public SearchBox type(Object value) {
		return (SearchBox) this.set("type", value);
	}
	
	/**
	 * 关键字名字。
    */
	public SearchBox name(Object value) {
		return (SearchBox) this.set("name", value);
	}
	
	/**
	 * 是否禁用
    */
	public SearchBox disabled(Object value) {
		return (SearchBox) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SearchBox hiddenOn(Object value) {
		return (SearchBox) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SearchBox onEvent(Object value) {
		return (SearchBox) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SearchBox staticOn(Object value) {
		return (SearchBox) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public SearchBox style(Object value) {
		return (SearchBox) this.set("style", value);
	}
	}