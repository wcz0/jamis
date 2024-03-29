package com.wcz0.renderers;
/**
 * Carousel 轮播图渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/carousel

 * @author wcz0
 * @version 6.2.2
 */
public class Carousel extends BaseRenderer {

	public Carousel() {
		this.set("type", "carousel");
	}

	public Carousel set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 多图模式配置项
    */
	public Carousel multiple(Object value) {
		return (Carousel) this.set("multiple", value);
	}
	
	/**
	 * 自定义箭头图标
    */
	public Carousel icons(Object value) {
		return (Carousel) this.set("icons", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Carousel className(Object value) {
		return (Carousel) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Carousel disabled(Object value) {
		return (Carousel) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Carousel visibleOn(Object value) {
		return (Carousel) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Carousel static_(Object value) {
		return (Carousel) this.set("static_", value);
	}
	
	/**
	 * 设置宽度
    */
	public Carousel width(Object value) {
		return (Carousel) this.set("width", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Carousel hidden(Object value) {
		return (Carousel) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Carousel hiddenOn(Object value) {
		return (Carousel) this.set("hiddenOn", value);
	}
	
	/**
	 * 轮播间隔时间
    */
	public Carousel interval(Object value) {
		return (Carousel) this.set("interval", value);
	}
	
	/**
	 * 动画时长
    */
	public Carousel duration(Object value) {
		return (Carousel) this.set("duration", value);
	}
	
	/**
	 * 是否显示
    */
	public Carousel visible(Object value) {
		return (Carousel) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Carousel id(Object value) {
		return (Carousel) this.set("id", value);
	}
	
	/**
	 * 配置控件内容
    */
	public Carousel controls(Object value) {
		return (Carousel) this.set("controls", value);
	}
	
	/**
	 * 设置高度
    */
	public Carousel height(Object value) {
		return (Carousel) this.set("height", value);
	}
	
	/**
	    */
	public Carousel name(Object value) {
		return (Carousel) this.set("name", value);
	}
	
	/**
	    */
	public Carousel staticSchema(Object value) {
		return (Carousel) this.set("staticSchema", value);
	}
	
	/**
	 * 占位
    */
	public Carousel placeholder(Object value) {
		return (Carousel) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Carousel staticPlaceholder(Object value) {
		return (Carousel) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Carousel staticClassName(Object value) {
		return (Carousel) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Carousel staticInputClassName(Object value) {
		return (Carousel) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Carousel style(Object value) {
		return (Carousel) this.set("style", value);
	}
	
	/**
	 * 动画类型
    * 可选值: fade | slide
    */
	public Carousel animation(Object value) {
		return (Carousel) this.set("animation", value);
	}
	
	/**
	 * 配置单条呈现模板
    */
	public Carousel itemSchema(Object value) {
		return (Carousel) this.set("itemSchema", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Carousel disabledOn(Object value) {
		return (Carousel) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Carousel editorSetting(Object value) {
		return (Carousel) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Carousel useMobileUI(Object value) {
		return (Carousel) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为轮播图类型
    */
	public Carousel type(Object value) {
		return (Carousel) this.set("type", value);
	}
	
	/**
	 * 是否自动播放
    */
	public Carousel auto(Object value) {
		return (Carousel) this.set("auto", value);
	}
	
	/**
	    * 可选值: light | dark
    */
	public Carousel controlsTheme(Object value) {
		return (Carousel) this.set("controlsTheme", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Carousel onEvent(Object value) {
		return (Carousel) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Carousel staticOn(Object value) {
		return (Carousel) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Carousel staticLabelClassName(Object value) {
		return (Carousel) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 预览图模式
    * 可选值: contain | cover
    */
	public Carousel thumbMode(Object value) {
		return (Carousel) this.set("thumbMode", value);
	}
	
	/**
	 * 配置固定值
    */
	public Carousel options(Object value) {
		return (Carousel) this.set("options", value);
	}
	
	/**
	 * 是否一直显示箭头
    */
	public Carousel alwaysShowArrow(Object value) {
		return (Carousel) this.set("alwaysShowArrow", value);
	}
	}