package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class VanillaAction extends BaseRenderer {

	public VanillaAction() {
		this.set("type", "vanillaAction");
	}

	/**
	    */
	public VanillaAction testid(Object value) {
		return (VanillaAction) this.set("testid", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public VanillaAction staticClassName(Object value) {
		return (VanillaAction) this.set("staticClassName", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public VanillaAction type(Object value) {
		return (VanillaAction) this.set("type", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public VanillaAction className(Object value) {
		return (VanillaAction) this.set("className", value);
	}
	
	/**
	    */
	public VanillaAction testIdBuilder(Object value) {
		return (VanillaAction) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public VanillaAction primary(Object value) {
		return (VanillaAction) this.set("primary", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public VanillaAction required(Object value) {
		return (VanillaAction) this.set("required", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public VanillaAction countDown(Object value) {
		return (VanillaAction) this.set("countDown", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public VanillaAction id(Object value) {
		return (VanillaAction) this.set("id", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public VanillaAction confirmText(Object value) {
		return (VanillaAction) this.set("confirmText", value);
	}
	
	/**
	 * 是否显示
    */
	public VanillaAction visible(Object value) {
		return (VanillaAction) this.set("visible", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public VanillaAction editorSetting(Object value) {
		return (VanillaAction) this.set("editorSetting", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public VanillaAction rightIconClassName(Object value) {
		return (VanillaAction) this.set("rightIconClassName", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public VanillaAction tooltipPlacement(Object value) {
		return (VanillaAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public VanillaAction close(Object value) {
		return (VanillaAction) this.set("close", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public VanillaAction disabledOn(Object value) {
		return (VanillaAction) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public VanillaAction staticInputClassName(Object value) {
		return (VanillaAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public VanillaAction style(Object value) {
		return (VanillaAction) this.set("style", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public VanillaAction iconClassName(Object value) {
		return (VanillaAction) this.set("iconClassName", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public VanillaAction size(Object value) {
		return (VanillaAction) this.set("size", value);
	}
	
	/**
	    */
	public VanillaAction downloadFileName(Object value) {
		return (VanillaAction) this.set("downloadFileName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public VanillaAction hiddenOn(Object value) {
		return (VanillaAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否禁用
    */
	public VanillaAction disabled(Object value) {
		return (VanillaAction) this.set("disabled", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public VanillaAction requireSelected(Object value) {
		return (VanillaAction) this.set("requireSelected", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public VanillaAction $$id(Object value) {
		return (VanillaAction) this.set("$$id", value);
	}
	
	/**
	 * 角标
    */
	public VanillaAction badge(Object value) {
		return (VanillaAction) this.set("badge", value);
	}
	
	/**
	 * 是否静态展示
    */
	public VanillaAction static_(Object value) {
		return (VanillaAction) this.set("static_", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public VanillaAction block(Object value) {
		return (VanillaAction) this.set("block", value);
	}
	
	/**
	 * 子内容
    */
	public VanillaAction body(Object value) {
		return (VanillaAction) this.set("body", value);
	}
	
	/**
	    */
	public VanillaAction actionType(Object value) {
		return (VanillaAction) this.set("actionType", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public VanillaAction staticPlaceholder(Object value) {
		return (VanillaAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 按钮文字
    */
	public VanillaAction label(Object value) {
		return (VanillaAction) this.set("label", value);
	}
	
	/**
	    */
	public VanillaAction tooltip(Object value) {
		return (VanillaAction) this.set("tooltip", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public VanillaAction onClick(Object value) {
		return (VanillaAction) this.set("onClick", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public VanillaAction visibleOn(Object value) {
		return (VanillaAction) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public VanillaAction useMobileUI(Object value) {
		return (VanillaAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public VanillaAction rightIcon(Object value) {
		return (VanillaAction) this.set("rightIcon", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public VanillaAction loadingClassName(Object value) {
		return (VanillaAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public VanillaAction activeLevel(Object value) {
		return (VanillaAction) this.set("activeLevel", value);
	}
	
	/**
	 * 事件动作配置
    */
	public VanillaAction onEvent(Object value) {
		return (VanillaAction) this.set("onEvent", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public VanillaAction icon(Object value) {
		return (VanillaAction) this.set("icon", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public VanillaAction hotKey(Object value) {
		return (VanillaAction) this.set("hotKey", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public VanillaAction staticLabelClassName(Object value) {
		return (VanillaAction) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public VanillaAction staticSchema(Object value) {
		return (VanillaAction) this.set("staticSchema", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public VanillaAction activeClassName(Object value) {
		return (VanillaAction) this.set("activeClassName", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public VanillaAction target(Object value) {
		return (VanillaAction) this.set("target", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public VanillaAction disabledTip(Object value) {
		return (VanillaAction) this.set("disabledTip", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public VanillaAction level(Object value) {
		return (VanillaAction) this.set("level", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public VanillaAction mergeData(Object value) {
		return (VanillaAction) this.set("mergeData", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public VanillaAction loadingOn(Object value) {
		return (VanillaAction) this.set("loadingOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public VanillaAction hidden(Object value) {
		return (VanillaAction) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public VanillaAction staticOn(Object value) {
		return (VanillaAction) this.set("staticOn", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public VanillaAction countDownTpl(Object value) {
		return (VanillaAction) this.set("countDownTpl", value);
	}
	}