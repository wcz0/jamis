package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class Avatar extends BaseRenderer {

	public Avatar() {
		this.set("type", "avatar");
	}

	public Avatar set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public Avatar onEvent(Object value) {
		return (Avatar) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Avatar staticOn(Object value) {
		return (Avatar) this.set("staticOn", value);
	}
	
	/**
	 * 默认头像
    */
	public Avatar defaultAvatar(Object value) {
		return (Avatar) this.set("defaultAvatar", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Avatar disabledOn(Object value) {
		return (Avatar) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Avatar hidden(Object value) {
		return (Avatar) this.set("hidden", value);
	}
	
	/**
	 * 图片地址
    */
	public Avatar src(Object value) {
		return (Avatar) this.set("src", value);
	}
	
	/**
	 * 形状
    * 可选值: circle | square | rounded
    */
	public Avatar shape(Object value) {
		return (Avatar) this.set("shape", value);
	}
	
	/**
	 * 图片CORS属性
    * 可选值: anonymous | use-credentials | 
    */
	public Avatar crossOrigin(Object value) {
		return (Avatar) this.set("crossOrigin", value);
	}
	
	/**
	 * 图片加载失败的是否默认处理，字符串函数
    */
	public Avatar onError(Object value) {
		return (Avatar) this.set("onError", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Avatar hiddenOn(Object value) {
		return (Avatar) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Avatar staticInputClassName(Object value) {
		return (Avatar) this.set("staticInputClassName", value);
	}
	
	/**
	 * 图片相对于容器的缩放方式
    * 可选值: fill | contain | cover | none | scale-down
    */
	public Avatar fit(Object value) {
		return (Avatar) this.set("fit", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Avatar visibleOn(Object value) {
		return (Avatar) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Avatar staticLabelClassName(Object value) {
		return (Avatar) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 文本
    */
	public Avatar text(Object value) {
		return (Avatar) this.set("text", value);
	}
	
	/**
	 * 字符类型距离左右两侧边界单位像素
    */
	public Avatar gap(Object value) {
		return (Avatar) this.set("gap", value);
	}
	
	/**
	 * 自定义样式
    */
	public Avatar style(Object value) {
		return (Avatar) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Avatar editorSetting(Object value) {
		return (Avatar) this.set("editorSetting", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Avatar staticClassName(Object value) {
		return (Avatar) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Avatar type(Object value) {
		return (Avatar) this.set("type", value);
	}
	
	/**
	 * 图片无法显示时的替换文字地址
    */
	public Avatar alt(Object value) {
		return (Avatar) this.set("alt", value);
	}
	
	/**
	 * 是否显示
    */
	public Avatar visible(Object value) {
		return (Avatar) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Avatar id(Object value) {
		return (Avatar) this.set("id", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Avatar useMobileUI(Object value) {
		return (Avatar) this.set("useMobileUI", value);
	}
	
	/**
	 * 图片是否允许拖动
    */
	public Avatar draggable(Object value) {
		return (Avatar) this.set("draggable", value);
	}
	
	/**
	 * 大小
    */
	public Avatar size(Object value) {
		return (Avatar) this.set("size", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Avatar staticPlaceholder(Object value) {
		return (Avatar) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 角标
    */
	public Avatar badge(Object value) {
		return (Avatar) this.set("badge", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Avatar static_(Object value) {
		return (Avatar) this.set("static_", value);
	}
	
	/**
	    */
	public Avatar staticSchema(Object value) {
		return (Avatar) this.set("staticSchema", value);
	}
	
	/**
	 * 图标
    */
	public Avatar icon(Object value) {
		return (Avatar) this.set("icon", value);
	}
	
	/**
	 * 类名
    */
	public Avatar className(Object value) {
		return (Avatar) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Avatar disabled(Object value) {
		return (Avatar) this.set("disabled", value);
	}
	}