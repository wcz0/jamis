package com.wcz0.renderers;
/**
 * AnchorNavSection 锚点区域渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/anchor-nav

 * @author wcz0
 * @version 6.2.2
 */
public class AnchorNavSection extends BaseRenderer {

	public AnchorNavSection() {
		this.set("type", "anchorNavSection");
	}

	public AnchorNavSection set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public AnchorNavSection onEvent(Object value) {
		return (AnchorNavSection) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public AnchorNavSection staticOn(Object value) {
		return (AnchorNavSection) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public AnchorNavSection staticClassName(Object value) {
		return (AnchorNavSection) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public AnchorNavSection staticLabelClassName(Object value) {
		return (AnchorNavSection) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public AnchorNavSection staticInputClassName(Object value) {
		return (AnchorNavSection) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public AnchorNavSection style(Object value) {
		return (AnchorNavSection) this.set("style", value);
	}
	
	/**
	 * 锚点链接
    */
	public AnchorNavSection href(Object value) {
		return (AnchorNavSection) this.set("href", value);
	}
	
	/**
	 * 是否隐藏
    */
	public AnchorNavSection hidden(Object value) {
		return (AnchorNavSection) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public AnchorNavSection hiddenOn(Object value) {
		return (AnchorNavSection) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public AnchorNavSection id(Object value) {
		return (AnchorNavSection) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public AnchorNavSection static_(Object value) {
		return (AnchorNavSection) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public AnchorNavSection staticPlaceholder(Object value) {
		return (AnchorNavSection) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public AnchorNavSection useMobileUI(Object value) {
		return (AnchorNavSection) this.set("useMobileUI", value);
	}
	
	/**
	 * 子节点
    */
	public AnchorNavSection children(Object value) {
		return (AnchorNavSection) this.set("children", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public AnchorNavSection className(Object value) {
		return (AnchorNavSection) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public AnchorNavSection visible(Object value) {
		return (AnchorNavSection) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public AnchorNavSection visibleOn(Object value) {
		return (AnchorNavSection) this.set("visibleOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public AnchorNavSection disabled(Object value) {
		return (AnchorNavSection) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public AnchorNavSection disabledOn(Object value) {
		return (AnchorNavSection) this.set("disabledOn", value);
	}
	
	/**
	    */
	public AnchorNavSection staticSchema(Object value) {
		return (AnchorNavSection) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public AnchorNavSection editorSetting(Object value) {
		return (AnchorNavSection) this.set("editorSetting", value);
	}
	
	/**
	 * 导航文字说明
    */
	public AnchorNavSection title(Object value) {
		return (AnchorNavSection) this.set("title", value);
	}
	
	/**
	 * 内容
    */
	public AnchorNavSection body(Object value) {
		return (AnchorNavSection) this.set("body", value);
	}
	}