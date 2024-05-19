package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Option extends BaseRenderer {

	public Option() {
		this.set("type", "option");
	}

	/**
	 * 用来显示的文字
    */
	public Option label(Object value) {
		return (Option) this.set("label", value);
	}
	
	/**
	 * 是否禁用
    */
	public Option disabled(Object value) {
		return (Option) this.set("disabled", value);
	}
	
	/**
	 * 最好不要用！因为有 visible 就够了。
    */
	public Option hidden(Object value) {
		return (Option) this.set("hidden", value);
	}
	
	/**
	 * 如果设置了，优先级更高，不设置走 source 接口加载。
    */
	public Option deferApi(Object value) {
		return (Option) this.set("deferApi", value);
	}
	
	/**
	 * 标记正在加载。只有 defer 为 true 时有意义。内部字段不可以外部设置
    */
	public Option loading(Object value) {
		return (Option) this.set("loading", value);
	}
	
	/**
	 * 可以用来给 Option 标记个范围，让数据展示更清晰。这个只有在数值展示的时候显示。
    */
	public Option scopeLabel(Object value) {
		return (Option) this.set("scopeLabel", value);
	}
	
	/**
	 * 请保证数值唯一，多个选项值一致会认为是同一个选项。
    */
	public Option value(Object value) {
		return (Option) this.set("value", value);
	}
	
	/**
	 * 支持嵌套
    */
	public Option children(Object value) {
		return (Option) this.set("children", value);
	}
	
	/**
	 * 是否可见
    */
	public Option visible(Object value) {
		return (Option) this.set("visible", value);
	}
	
	/**
	 * 描述，部分控件支持
    */
	public Option description(Object value) {
		return (Option) this.set("description", value);
	}
	
	/**
	 * 标记后数据延时加载
    */
	public Option defer(Object value) {
		return (Option) this.set("defer", value);
	}
	
	/**
	 * 只有设置了 defer 才有意义，内部字段不可以外部设置
    */
	public Option loaded(Object value) {
		return (Option) this.set("loaded", value);
	}
	}