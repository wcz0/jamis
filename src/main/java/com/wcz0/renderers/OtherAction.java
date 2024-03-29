package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class OtherAction extends BaseRenderer {

	public OtherAction() {
		this.set("type", "otherAction");
	}

	public OtherAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public OtherAction requireSelected(Object value) {
		return (OtherAction) this.set("requireSelected", value);
	}
	
	/**
	 * 是否显示
    */
	public OtherAction visible(Object value) {
		return (OtherAction) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public OtherAction visibleOn(Object value) {
		return (OtherAction) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public OtherAction staticPlaceholder(Object value) {
		return (OtherAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public OtherAction useMobileUI(Object value) {
		return (OtherAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 按钮文字
    */
	public OtherAction label(Object value) {
		return (OtherAction) this.set("label", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public OtherAction size(Object value) {
		return (OtherAction) this.set("size", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public OtherAction activeClassName(Object value) {
		return (OtherAction) this.set("activeClassName", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public OtherAction countDownTpl(Object value) {
		return (OtherAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public OtherAction loadingOn(Object value) {
		return (OtherAction) this.set("loadingOn", value);
	}
	
	/**
	    * 可选值: prev | next | cancel | close | submit | confirm | add | reset | reset-and-submit
    */
	public OtherAction actionType(Object value) {
		return (OtherAction) this.set("actionType", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public OtherAction className(Object value) {
		return (OtherAction) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public OtherAction disabled(Object value) {
		return (OtherAction) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public OtherAction staticLabelClassName(Object value) {
		return (OtherAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public OtherAction icon(Object value) {
		return (OtherAction) this.set("icon", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public OtherAction activeLevel(Object value) {
		return (OtherAction) this.set("activeLevel", value);
	}
	
	/**
	 * 角标
    */
	public OtherAction badge(Object value) {
		return (OtherAction) this.set("badge", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public OtherAction disabledOn(Object value) {
		return (OtherAction) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public OtherAction staticInputClassName(Object value) {
		return (OtherAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public OtherAction type(Object value) {
		return (OtherAction) this.set("type", value);
	}
	
	/**
	    */
	public OtherAction testid(Object value) {
		return (OtherAction) this.set("testid", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public OtherAction target(Object value) {
		return (OtherAction) this.set("target", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public OtherAction countDown(Object value) {
		return (OtherAction) this.set("countDown", value);
	}
	
	/**
	 * 是否隐藏
    */
	public OtherAction hidden(Object value) {
		return (OtherAction) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public OtherAction staticOn(Object value) {
		return (OtherAction) this.set("staticOn", value);
	}
	
	/**
	 * 子内容
    */
	public OtherAction body(Object value) {
		return (OtherAction) this.set("body", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public OtherAction hotKey(Object value) {
		return (OtherAction) this.set("hotKey", value);
	}
	
	/**
	 * 事件动作配置
    */
	public OtherAction onEvent(Object value) {
		return (OtherAction) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public OtherAction staticClassName(Object value) {
		return (OtherAction) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public OtherAction style(Object value) {
		return (OtherAction) this.set("style", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public OtherAction rightIconClassName(Object value) {
		return (OtherAction) this.set("rightIconClassName", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public OtherAction tooltipPlacement(Object value) {
		return (OtherAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public OtherAction required(Object value) {
		return (OtherAction) this.set("required", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public OtherAction mergeData(Object value) {
		return (OtherAction) this.set("mergeData", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public OtherAction hiddenOn(Object value) {
		return (OtherAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public OtherAction editorSetting(Object value) {
		return (OtherAction) this.set("editorSetting", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public OtherAction level(Object value) {
		return (OtherAction) this.set("level", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public OtherAction onClick(Object value) {
		return (OtherAction) this.set("onClick", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public OtherAction close(Object value) {
		return (OtherAction) this.set("close", value);
	}
	
	/**
	 * 是否静态展示
    */
	public OtherAction static_(Object value) {
		return (OtherAction) this.set("static_", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public OtherAction block(Object value) {
		return (OtherAction) this.set("block", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public OtherAction disabledTip(Object value) {
		return (OtherAction) this.set("disabledTip", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public OtherAction rightIcon(Object value) {
		return (OtherAction) this.set("rightIcon", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public OtherAction loadingClassName(Object value) {
		return (OtherAction) this.set("loadingClassName", value);
	}
	
	/**
	    */
	public OtherAction primary(Object value) {
		return (OtherAction) this.set("primary", value);
	}
	
	/**
	    */
	public OtherAction tooltip(Object value) {
		return (OtherAction) this.set("tooltip", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public OtherAction id(Object value) {
		return (OtherAction) this.set("id", value);
	}
	
	/**
	    */
	public OtherAction staticSchema(Object value) {
		return (OtherAction) this.set("staticSchema", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public OtherAction iconClassName(Object value) {
		return (OtherAction) this.set("iconClassName", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public OtherAction confirmText(Object value) {
		return (OtherAction) this.set("confirmText", value);
	}
	}