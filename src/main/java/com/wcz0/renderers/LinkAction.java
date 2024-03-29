package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class LinkAction extends BaseRenderer {

	public LinkAction() {
		this.set("type", "linkAction");
	}

	public LinkAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 容器 css 类名
    */
	public LinkAction className(Object value) {
		return (LinkAction) this.set("className", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public LinkAction level(Object value) {
		return (LinkAction) this.set("level", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public LinkAction tooltipPlacement(Object value) {
		return (LinkAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public LinkAction confirmText(Object value) {
		return (LinkAction) this.set("confirmText", value);
	}
	
	/**
	 * 是否隐藏
    */
	public LinkAction hidden(Object value) {
		return (LinkAction) this.set("hidden", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public LinkAction staticPlaceholder(Object value) {
		return (LinkAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public LinkAction loadingClassName(Object value) {
		return (LinkAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public LinkAction target(Object value) {
		return (LinkAction) this.set("target", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public LinkAction onClick(Object value) {
		return (LinkAction) this.set("onClick", value);
	}
	
	/**
	 * 跳转到哪？支持配置相对路径。
    */
	public LinkAction link(Object value) {
		return (LinkAction) this.set("link", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public LinkAction countDownTpl(Object value) {
		return (LinkAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public LinkAction hotKey(Object value) {
		return (LinkAction) this.set("hotKey", value);
	}
	
	/**
	 * 是否显示
    */
	public LinkAction visible(Object value) {
		return (LinkAction) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public LinkAction staticClassName(Object value) {
		return (LinkAction) this.set("staticClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public LinkAction label(Object value) {
		return (LinkAction) this.set("label", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public LinkAction size(Object value) {
		return (LinkAction) this.set("size", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public LinkAction requireSelected(Object value) {
		return (LinkAction) this.set("requireSelected", value);
	}
	
	/**
	 * 子内容
    */
	public LinkAction body(Object value) {
		return (LinkAction) this.set("body", value);
	}
	
	/**
	 * 指定为打开链接行为，跟 url 不同的时这个行为为单页模式。
    */
	public LinkAction actionType(Object value) {
		return (LinkAction) this.set("actionType", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public LinkAction required(Object value) {
		return (LinkAction) this.set("required", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public LinkAction countDown(Object value) {
		return (LinkAction) this.set("countDown", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public LinkAction disabledOn(Object value) {
		return (LinkAction) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public LinkAction static_(Object value) {
		return (LinkAction) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public LinkAction staticLabelClassName(Object value) {
		return (LinkAction) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public LinkAction staticSchema(Object value) {
		return (LinkAction) this.set("staticSchema", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public LinkAction block(Object value) {
		return (LinkAction) this.set("block", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public LinkAction disabledTip(Object value) {
		return (LinkAction) this.set("disabledTip", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public LinkAction loadingOn(Object value) {
		return (LinkAction) this.set("loadingOn", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public LinkAction rightIcon(Object value) {
		return (LinkAction) this.set("rightIcon", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public LinkAction rightIconClassName(Object value) {
		return (LinkAction) this.set("rightIconClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public LinkAction disabled(Object value) {
		return (LinkAction) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public LinkAction visibleOn(Object value) {
		return (LinkAction) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public LinkAction onEvent(Object value) {
		return (LinkAction) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public LinkAction style(Object value) {
		return (LinkAction) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public LinkAction editorSetting(Object value) {
		return (LinkAction) this.set("editorSetting", value);
	}
	
	/**
	    */
	public LinkAction testid(Object value) {
		return (LinkAction) this.set("testid", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public LinkAction activeClassName(Object value) {
		return (LinkAction) this.set("activeClassName", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public LinkAction close(Object value) {
		return (LinkAction) this.set("close", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public LinkAction mergeData(Object value) {
		return (LinkAction) this.set("mergeData", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public LinkAction id(Object value) {
		return (LinkAction) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public LinkAction staticInputClassName(Object value) {
		return (LinkAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public LinkAction type(Object value) {
		return (LinkAction) this.set("type", value);
	}
	
	/**
	    */
	public LinkAction tooltip(Object value) {
		return (LinkAction) this.set("tooltip", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public LinkAction useMobileUI(Object value) {
		return (LinkAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public LinkAction icon(Object value) {
		return (LinkAction) this.set("icon", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public LinkAction iconClassName(Object value) {
		return (LinkAction) this.set("iconClassName", value);
	}
	
	/**
	    */
	public LinkAction primary(Object value) {
		return (LinkAction) this.set("primary", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public LinkAction activeLevel(Object value) {
		return (LinkAction) this.set("activeLevel", value);
	}
	
	/**
	 * 角标
    */
	public LinkAction badge(Object value) {
		return (LinkAction) this.set("badge", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public LinkAction hiddenOn(Object value) {
		return (LinkAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public LinkAction staticOn(Object value) {
		return (LinkAction) this.set("staticOn", value);
	}
	}