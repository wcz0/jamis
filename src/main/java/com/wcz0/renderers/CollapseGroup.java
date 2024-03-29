package com.wcz0.renderers;
/**
 * CollapseGroup 折叠渲染器，格式说明。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/collapse

 * @author wcz0
 * @version 6.2.2
 */
public class CollapseGroup extends BaseRenderer {

	public CollapseGroup() {
		this.set("type", "collapseGroup");
	}

	public CollapseGroup set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public CollapseGroup disabled(Object value) {
		return (CollapseGroup) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CollapseGroup visibleOn(Object value) {
		return (CollapseGroup) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CollapseGroup id(Object value) {
		return (CollapseGroup) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CollapseGroup staticLabelClassName(Object value) {
		return (CollapseGroup) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CollapseGroup useMobileUI(Object value) {
		return (CollapseGroup) this.set("useMobileUI", value);
	}
	
	/**
	 * 激活面板
    */
	public CollapseGroup activeKey(Object value) {
		return (CollapseGroup) this.set("activeKey", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CollapseGroup staticPlaceholder(Object value) {
		return (CollapseGroup) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CollapseGroup staticClassName(Object value) {
		return (CollapseGroup) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CollapseGroup staticInputClassName(Object value) {
		return (CollapseGroup) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定为折叠器类型
    */
	public CollapseGroup type(Object value) {
		return (CollapseGroup) this.set("type", value);
	}
	
	/**
	 * 内容区域
    */
	public CollapseGroup body(Object value) {
		return (CollapseGroup) this.set("body", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CollapseGroup disabledOn(Object value) {
		return (CollapseGroup) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CollapseGroup hidden(Object value) {
		return (CollapseGroup) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CollapseGroup staticOn(Object value) {
		return (CollapseGroup) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public CollapseGroup style(Object value) {
		return (CollapseGroup) this.set("style", value);
	}
	
	/**
	 * 当Collapse作为Form组件的子元素时，开启该属性后组件样式设置为FieldSet组件的样式，默认开启
    */
	public CollapseGroup enableFieldSetStyle(Object value) {
		return (CollapseGroup) this.set("enableFieldSetStyle", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CollapseGroup hiddenOn(Object value) {
		return (CollapseGroup) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CollapseGroup onEvent(Object value) {
		return (CollapseGroup) this.set("onEvent", value);
	}
	
	/**
	 * 自定义切换图标
    */
	public CollapseGroup expandIcon(Object value) {
		return (CollapseGroup) this.set("expandIcon", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CollapseGroup className(Object value) {
		return (CollapseGroup) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public CollapseGroup visible(Object value) {
		return (CollapseGroup) this.set("visible", value);
	}
	
	/**
	 * 手风琴模式
    */
	public CollapseGroup accordion(Object value) {
		return (CollapseGroup) this.set("accordion", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CollapseGroup static_(Object value) {
		return (CollapseGroup) this.set("static_", value);
	}
	
	/**
	    */
	public CollapseGroup staticSchema(Object value) {
		return (CollapseGroup) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CollapseGroup editorSetting(Object value) {
		return (CollapseGroup) this.set("editorSetting", value);
	}
	
	/**
	 * 设置图标位置
    * 可选值: left | right
    */
	public CollapseGroup expandIconPosition(Object value) {
		return (CollapseGroup) this.set("expandIconPosition", value);
	}
	}