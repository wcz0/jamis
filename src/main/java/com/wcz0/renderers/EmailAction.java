package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class EmailAction extends BaseRenderer {

	public EmailAction() {
		this.set("type", "emailAction");
	}

	public EmailAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public EmailAction required(Object value) {
		return (EmailAction) this.set("required", value);
	}
	
	/**
	    */
	public EmailAction staticSchema(Object value) {
		return (EmailAction) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public EmailAction editorSetting(Object value) {
		return (EmailAction) this.set("editorSetting", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public EmailAction icon(Object value) {
		return (EmailAction) this.set("icon", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public EmailAction countDownTpl(Object value) {
		return (EmailAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public EmailAction staticClassName(Object value) {
		return (EmailAction) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public EmailAction useMobileUI(Object value) {
		return (EmailAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public EmailAction block(Object value) {
		return (EmailAction) this.set("block", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public EmailAction activeClassName(Object value) {
		return (EmailAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public EmailAction hidden(Object value) {
		return (EmailAction) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public EmailAction visibleOn(Object value) {
		return (EmailAction) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public EmailAction onEvent(Object value) {
		return (EmailAction) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public EmailAction staticOn(Object value) {
		return (EmailAction) this.set("staticOn", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public EmailAction onClick(Object value) {
		return (EmailAction) this.set("onClick", value);
	}
	
	/**
	 * 是否禁用
    */
	public EmailAction disabled(Object value) {
		return (EmailAction) this.set("disabled", value);
	}
	
	/**
	 * 邮件主题
    */
	public EmailAction subject(Object value) {
		return (EmailAction) this.set("subject", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public EmailAction id(Object value) {
		return (EmailAction) this.set("id", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public EmailAction disabledTip(Object value) {
		return (EmailAction) this.set("disabledTip", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public EmailAction requireSelected(Object value) {
		return (EmailAction) this.set("requireSelected", value);
	}
	
	/**
	 * 邮件正文
    */
	public EmailAction body(Object value) {
		return (EmailAction) this.set("body", value);
	}
	
	/**
	    */
	public EmailAction primary(Object value) {
		return (EmailAction) this.set("primary", value);
	}
	
	/**
	 * 收件人邮箱
    */
	public EmailAction to(Object value) {
		return (EmailAction) this.set("to", value);
	}
	
	/**
	 * 匿名抄送邮箱
    */
	public EmailAction bcc(Object value) {
		return (EmailAction) this.set("bcc", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public EmailAction hiddenOn(Object value) {
		return (EmailAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public EmailAction staticLabelClassName(Object value) {
		return (EmailAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public EmailAction type(Object value) {
		return (EmailAction) this.set("type", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public EmailAction loadingOn(Object value) {
		return (EmailAction) this.set("loadingOn", value);
	}
	
	/**
	    */
	public EmailAction testid(Object value) {
		return (EmailAction) this.set("testid", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public EmailAction rightIcon(Object value) {
		return (EmailAction) this.set("rightIcon", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public EmailAction className(Object value) {
		return (EmailAction) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public EmailAction staticPlaceholder(Object value) {
		return (EmailAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public EmailAction loadingClassName(Object value) {
		return (EmailAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public EmailAction level(Object value) {
		return (EmailAction) this.set("level", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public EmailAction countDown(Object value) {
		return (EmailAction) this.set("countDown", value);
	}
	
	/**
	 * 指定为打开邮箱行为
    */
	public EmailAction actionType(Object value) {
		return (EmailAction) this.set("actionType", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public EmailAction staticInputClassName(Object value) {
		return (EmailAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public EmailAction size(Object value) {
		return (EmailAction) this.set("size", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public EmailAction hotKey(Object value) {
		return (EmailAction) this.set("hotKey", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public EmailAction confirmText(Object value) {
		return (EmailAction) this.set("confirmText", value);
	}
	
	/**
	 * 抄送邮箱
    */
	public EmailAction cc(Object value) {
		return (EmailAction) this.set("cc", value);
	}
	
	/**
	 * 是否显示
    */
	public EmailAction visible(Object value) {
		return (EmailAction) this.set("visible", value);
	}
	
	/**
	 * 按钮文字
    */
	public EmailAction label(Object value) {
		return (EmailAction) this.set("label", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public EmailAction tooltipPlacement(Object value) {
		return (EmailAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public EmailAction iconClassName(Object value) {
		return (EmailAction) this.set("iconClassName", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public EmailAction target(Object value) {
		return (EmailAction) this.set("target", value);
	}
	
	/**
	 * 组件样式
    */
	public EmailAction style(Object value) {
		return (EmailAction) this.set("style", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public EmailAction activeLevel(Object value) {
		return (EmailAction) this.set("activeLevel", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public EmailAction close(Object value) {
		return (EmailAction) this.set("close", value);
	}
	
	/**
	 * 角标
    */
	public EmailAction badge(Object value) {
		return (EmailAction) this.set("badge", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public EmailAction disabledOn(Object value) {
		return (EmailAction) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public EmailAction static_(Object value) {
		return (EmailAction) this.set("static_", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public EmailAction rightIconClassName(Object value) {
		return (EmailAction) this.set("rightIconClassName", value);
	}
	
	/**
	    */
	public EmailAction tooltip(Object value) {
		return (EmailAction) this.set("tooltip", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public EmailAction mergeData(Object value) {
		return (EmailAction) this.set("mergeData", value);
	}
	}