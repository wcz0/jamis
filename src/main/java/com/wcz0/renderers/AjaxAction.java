package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class AjaxAction extends BaseRenderer {

	public AjaxAction() {
		this.set("type", "ajaxAction");
	}

	public AjaxAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public AjaxAction visible(Object value) {
		return (AjaxAction) this.set("visible", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public AjaxAction level(Object value) {
		return (AjaxAction) this.set("level", value);
	}
	
	/**
	 * 是否禁用
    */
	public AjaxAction disabled(Object value) {
		return (AjaxAction) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public AjaxAction staticLabelClassName(Object value) {
		return (AjaxAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public AjaxAction editorSetting(Object value) {
		return (AjaxAction) this.set("editorSetting", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public AjaxAction countDown(Object value) {
		return (AjaxAction) this.set("countDown", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public AjaxAction hotKey(Object value) {
		return (AjaxAction) this.set("hotKey", value);
	}
	
	/**
	    */
	public AjaxAction redirect(Object value) {
		return (AjaxAction) this.set("redirect", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public AjaxAction visibleOn(Object value) {
		return (AjaxAction) this.set("visibleOn", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public AjaxAction rightIcon(Object value) {
		return (AjaxAction) this.set("rightIcon", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public AjaxAction required(Object value) {
		return (AjaxAction) this.set("required", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public AjaxAction staticOn(Object value) {
		return (AjaxAction) this.set("staticOn", value);
	}
	
	/**
	    */
	public AjaxAction primary(Object value) {
		return (AjaxAction) this.set("primary", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public AjaxAction id(Object value) {
		return (AjaxAction) this.set("id", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public AjaxAction useMobileUI(Object value) {
		return (AjaxAction) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public AjaxAction testid(Object value) {
		return (AjaxAction) this.set("testid", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public AjaxAction block(Object value) {
		return (AjaxAction) this.set("block", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public AjaxAction icon(Object value) {
		return (AjaxAction) this.set("icon", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public AjaxAction activeLevel(Object value) {
		return (AjaxAction) this.set("activeLevel", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public AjaxAction target(Object value) {
		return (AjaxAction) this.set("target", value);
	}
	
	/**
	 * 角标
    */
	public AjaxAction badge(Object value) {
		return (AjaxAction) this.set("badge", value);
	}
	
	/**
	 * 指定为发送 ajax 的行为。
    */
	public AjaxAction actionType(Object value) {
		return (AjaxAction) this.set("actionType", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public AjaxAction staticInputClassName(Object value) {
		return (AjaxAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public AjaxAction rightIconClassName(Object value) {
		return (AjaxAction) this.set("rightIconClassName", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public AjaxAction staticClassName(Object value) {
		return (AjaxAction) this.set("staticClassName", value);
	}
	
	/**
	    */
	public AjaxAction tooltip(Object value) {
		return (AjaxAction) this.set("tooltip", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public AjaxAction mergeData(Object value) {
		return (AjaxAction) this.set("mergeData", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public AjaxAction onClick(Object value) {
		return (AjaxAction) this.set("onClick", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public AjaxAction className(Object value) {
		return (AjaxAction) this.set("className", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public AjaxAction requireSelected(Object value) {
		return (AjaxAction) this.set("requireSelected", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public AjaxAction countDownTpl(Object value) {
		return (AjaxAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public AjaxAction loadingOn(Object value) {
		return (AjaxAction) this.set("loadingOn", value);
	}
	
	/**
	 * 配置 ajax 发送地址
    */
	public AjaxAction api(Object value) {
		return (AjaxAction) this.set("api", value);
	}
	
	/**
	    */
	public AjaxAction ignoreConfirm(Object value) {
		return (AjaxAction) this.set("ignoreConfirm", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public AjaxAction disabledTip(Object value) {
		return (AjaxAction) this.set("disabledTip", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public AjaxAction size(Object value) {
		return (AjaxAction) this.set("size", value);
	}
	
	/**
	    */
	public AjaxAction feedback(Object value) {
		return (AjaxAction) this.set("feedback", value);
	}
	
	/**
	 * 是否静态展示
    */
	public AjaxAction static_(Object value) {
		return (AjaxAction) this.set("static_", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public AjaxAction disabledOn(Object value) {
		return (AjaxAction) this.set("disabledOn", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public AjaxAction loadingClassName(Object value) {
		return (AjaxAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public AjaxAction label(Object value) {
		return (AjaxAction) this.set("label", value);
	}
	
	/**
	 * 是否开启请求隔离, 主要用于隔离联动CRUD, Service的请求
    */
	public AjaxAction isolateScope(Object value) {
		return (AjaxAction) this.set("isolateScope", value);
	}
	
	/**
	 * 事件动作配置
    */
	public AjaxAction onEvent(Object value) {
		return (AjaxAction) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public AjaxAction style(Object value) {
		return (AjaxAction) this.set("style", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public AjaxAction tooltipPlacement(Object value) {
		return (AjaxAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public AjaxAction confirmText(Object value) {
		return (AjaxAction) this.set("confirmText", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public AjaxAction activeClassName(Object value) {
		return (AjaxAction) this.set("activeClassName", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public AjaxAction close(Object value) {
		return (AjaxAction) this.set("close", value);
	}
	
	/**
	    */
	public AjaxAction reload(Object value) {
		return (AjaxAction) this.set("reload", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public AjaxAction staticPlaceholder(Object value) {
		return (AjaxAction) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public AjaxAction staticSchema(Object value) {
		return (AjaxAction) this.set("staticSchema", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public AjaxAction type(Object value) {
		return (AjaxAction) this.set("type", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public AjaxAction iconClassName(Object value) {
		return (AjaxAction) this.set("iconClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public AjaxAction hidden(Object value) {
		return (AjaxAction) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public AjaxAction hiddenOn(Object value) {
		return (AjaxAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 子内容
    */
	public AjaxAction body(Object value) {
		return (AjaxAction) this.set("body", value);
	}
	}