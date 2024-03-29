package com.wcz0.renderers;
/**
 * 下拉按钮渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/dropdown-button

 * @author wcz0
 * @version 6.2.2
 */
public class DropdownButton extends BaseRenderer {

	public DropdownButton() {
		this.set("type", "dropdownButton");
	}

	public DropdownButton set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 容器 css 类名
    */
	public DropdownButton className(Object value) {
		return (DropdownButton) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DropdownButton visibleOn(Object value) {
		return (DropdownButton) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DropdownButton useMobileUI(Object value) {
		return (DropdownButton) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否独占一行 `display: block`
    */
	public DropdownButton block(Object value) {
		return (DropdownButton) this.set("block", value);
	}
	
	/**
	 * 是否只显示图标。
    */
	public DropdownButton iconOnly(Object value) {
		return (DropdownButton) this.set("iconOnly", value);
	}
	
	/**
	 * 是否显示下拉按钮
    */
	public DropdownButton hideCaret(Object value) {
		return (DropdownButton) this.set("hideCaret", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DropdownButton editorSetting(Object value) {
		return (DropdownButton) this.set("editorSetting", value);
	}
	
	/**
	 * 对齐方式
    * 可选值: left | right
    */
	public DropdownButton align(Object value) {
		return (DropdownButton) this.set("align", value);
	}
	
	/**
	 * 是否禁用
    */
	public DropdownButton disabled(Object value) {
		return (DropdownButton) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public DropdownButton visible(Object value) {
		return (DropdownButton) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DropdownButton static_(Object value) {
		return (DropdownButton) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DropdownButton staticClassName(Object value) {
		return (DropdownButton) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public DropdownButton style(Object value) {
		return (DropdownButton) this.set("style", value);
	}
	
	/**
	 * 内容区域
    */
	public DropdownButton body(Object value) {
		return (DropdownButton) this.set("body", value);
	}
	
	/**
	 * 按钮级别，样式
    * 可选值: info | success | danger | warning | primary | link
    */
	public DropdownButton level(Object value) {
		return (DropdownButton) this.set("level", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DropdownButton onEvent(Object value) {
		return (DropdownButton) this.set("onEvent", value);
	}
	
	/**
	 * 点击外部是否关闭
    */
	public DropdownButton closeOnOutside(Object value) {
		return (DropdownButton) this.set("closeOnOutside", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DropdownButton disabledOn(Object value) {
		return (DropdownButton) this.set("disabledOn", value);
	}
	
	/**
	    */
	public DropdownButton staticSchema(Object value) {
		return (DropdownButton) this.set("staticSchema", value);
	}
	
	/**
	    */
	public DropdownButton testid(Object value) {
		return (DropdownButton) this.set("testid", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DropdownButton hidden(Object value) {
		return (DropdownButton) this.set("hidden", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DropdownButton staticPlaceholder(Object value) {
		return (DropdownButton) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DropdownButton staticInputClassName(Object value) {
		return (DropdownButton) this.set("staticInputClassName", value);
	}
	
	/**
	 * 给 Button 配置 className。
    */
	public DropdownButton btnClassName(Object value) {
		return (DropdownButton) this.set("btnClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public DropdownButton label(Object value) {
		return (DropdownButton) this.set("label", value);
	}
	
	/**
	 * 点击内容是否关闭
    */
	public DropdownButton closeOnClick(Object value) {
		return (DropdownButton) this.set("closeOnClick", value);
	}
	
	/**
	 * 右侧图标
    */
	public DropdownButton rightIcon(Object value) {
		return (DropdownButton) this.set("rightIcon", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DropdownButton staticLabelClassName(Object value) {
		return (DropdownButton) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为 DropDown Button 类型
    */
	public DropdownButton type(Object value) {
		return (DropdownButton) this.set("type", value);
	}
	
	/**
	 * 触发条件，默认是 click
    * 可选值: click | hover
    */
	public DropdownButton trigger(Object value) {
		return (DropdownButton) this.set("trigger", value);
	}
	
	/**
	 * 菜单 CSS 样式
    */
	public DropdownButton menuClassName(Object value) {
		return (DropdownButton) this.set("menuClassName", value);
	}
	
	/**
	    */
	public DropdownButton overlayPlacement(Object value) {
		return (DropdownButton) this.set("overlayPlacement", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DropdownButton hiddenOn(Object value) {
		return (DropdownButton) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DropdownButton id(Object value) {
		return (DropdownButton) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DropdownButton staticOn(Object value) {
		return (DropdownButton) this.set("staticOn", value);
	}
	
	/**
	 * 按钮集合，支持分组
    */
	public DropdownButton buttons(Object value) {
		return (DropdownButton) this.set("buttons", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public DropdownButton size(Object value) {
		return (DropdownButton) this.set("size", value);
	}
	}