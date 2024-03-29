package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ReloadAction extends BaseRenderer {

	public ReloadAction() {
		this.set("type", "reloadAction");
	}

	public ReloadAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    * 可选值: top | right | bottom | left
    */
	public ReloadAction tooltipPlacement(Object value) {
		return (ReloadAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public ReloadAction required(Object value) {
		return (ReloadAction) this.set("required", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public ReloadAction requireSelected(Object value) {
		return (ReloadAction) this.set("requireSelected", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public ReloadAction hotKey(Object value) {
		return (ReloadAction) this.set("hotKey", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public ReloadAction iconClassName(Object value) {
		return (ReloadAction) this.set("iconClassName", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public ReloadAction size(Object value) {
		return (ReloadAction) this.set("size", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ReloadAction staticInputClassName(Object value) {
		return (ReloadAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public ReloadAction icon(Object value) {
		return (ReloadAction) this.set("icon", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public ReloadAction level(Object value) {
		return (ReloadAction) this.set("level", value);
	}
	
	/**
	 * 指定为刷新目标组件。
    */
	public ReloadAction actionType(Object value) {
		return (ReloadAction) this.set("actionType", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ReloadAction staticLabelClassName(Object value) {
		return (ReloadAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ReloadAction useMobileUI(Object value) {
		return (ReloadAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public ReloadAction type(Object value) {
		return (ReloadAction) this.set("type", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public ReloadAction mergeData(Object value) {
		return (ReloadAction) this.set("mergeData", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public ReloadAction countDown(Object value) {
		return (ReloadAction) this.set("countDown", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public ReloadAction loadingOn(Object value) {
		return (ReloadAction) this.set("loadingOn", value);
	}
	
	/**
	 * 子内容
    */
	public ReloadAction body(Object value) {
		return (ReloadAction) this.set("body", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public ReloadAction id(Object value) {
		return (ReloadAction) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ReloadAction static_(Object value) {
		return (ReloadAction) this.set("static_", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ReloadAction visibleOn(Object value) {
		return (ReloadAction) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ReloadAction staticOn(Object value) {
		return (ReloadAction) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ReloadAction staticPlaceholder(Object value) {
		return (ReloadAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ReloadAction staticClassName(Object value) {
		return (ReloadAction) this.set("staticClassName", value);
	}
	
	/**
	    */
	public ReloadAction staticSchema(Object value) {
		return (ReloadAction) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public ReloadAction style(Object value) {
		return (ReloadAction) this.set("style", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ReloadAction disabledOn(Object value) {
		return (ReloadAction) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ReloadAction hidden(Object value) {
		return (ReloadAction) this.set("hidden", value);
	}
	
	/**
	 * 指定目标组件。
    */
	public ReloadAction target(Object value) {
		return (ReloadAction) this.set("target", value);
	}
	
	/**
	 * 角标
    */
	public ReloadAction badge(Object value) {
		return (ReloadAction) this.set("badge", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ReloadAction editorSetting(Object value) {
		return (ReloadAction) this.set("editorSetting", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public ReloadAction block(Object value) {
		return (ReloadAction) this.set("block", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public ReloadAction rightIconClassName(Object value) {
		return (ReloadAction) this.set("rightIconClassName", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public ReloadAction loadingClassName(Object value) {
		return (ReloadAction) this.set("loadingClassName", value);
	}
	
	/**
	    */
	public ReloadAction primary(Object value) {
		return (ReloadAction) this.set("primary", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public ReloadAction activeClassName(Object value) {
		return (ReloadAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public ReloadAction disabled(Object value) {
		return (ReloadAction) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public ReloadAction visible(Object value) {
		return (ReloadAction) this.set("visible", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public ReloadAction rightIcon(Object value) {
		return (ReloadAction) this.set("rightIcon", value);
	}
	
	/**
	    */
	public ReloadAction tooltip(Object value) {
		return (ReloadAction) this.set("tooltip", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public ReloadAction confirmText(Object value) {
		return (ReloadAction) this.set("confirmText", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public ReloadAction activeLevel(Object value) {
		return (ReloadAction) this.set("activeLevel", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public ReloadAction close(Object value) {
		return (ReloadAction) this.set("close", value);
	}
	
	/**
	    */
	public ReloadAction testid(Object value) {
		return (ReloadAction) this.set("testid", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public ReloadAction disabledTip(Object value) {
		return (ReloadAction) this.set("disabledTip", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public ReloadAction onClick(Object value) {
		return (ReloadAction) this.set("onClick", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ReloadAction onEvent(Object value) {
		return (ReloadAction) this.set("onEvent", value);
	}
	
	/**
	 * 按钮文字
    */
	public ReloadAction label(Object value) {
		return (ReloadAction) this.set("label", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public ReloadAction countDownTpl(Object value) {
		return (ReloadAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ReloadAction className(Object value) {
		return (ReloadAction) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ReloadAction hiddenOn(Object value) {
		return (ReloadAction) this.set("hiddenOn", value);
	}
	}