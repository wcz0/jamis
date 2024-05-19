package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class UrlAction extends BaseRenderer {

	public UrlAction() {
		this.set("type", "urlAction");
	}

	/**
	 * 指定为打开链接
    */
	public UrlAction actionType(Object value) {
		return (UrlAction) this.set("actionType", value);
	}
	
	/**
	 * 设置链接
    */
	public UrlAction link(Object value) {
		return (UrlAction) this.set("link", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public UrlAction loadingClassName(Object value) {
		return (UrlAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public UrlAction label(Object value) {
		return (UrlAction) this.set("label", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public UrlAction hiddenOn(Object value) {
		return (UrlAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public UrlAction visibleOn(Object value) {
		return (UrlAction) this.set("visibleOn", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public UrlAction icon(Object value) {
		return (UrlAction) this.set("icon", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public UrlAction className(Object value) {
		return (UrlAction) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public UrlAction visible(Object value) {
		return (UrlAction) this.set("visible", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public UrlAction disabledOn(Object value) {
		return (UrlAction) this.set("disabledOn", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public UrlAction target(Object value) {
		return (UrlAction) this.set("target", value);
	}
	
	/**
	 * 角标
    */
	public UrlAction badge(Object value) {
		return (UrlAction) this.set("badge", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public UrlAction useMobileUI(Object value) {
		return (UrlAction) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public UrlAction testid(Object value) {
		return (UrlAction) this.set("testid", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public UrlAction requireSelected(Object value) {
		return (UrlAction) this.set("requireSelected", value);
	}
	
	/**
	    */
	public UrlAction staticSchema(Object value) {
		return (UrlAction) this.set("staticSchema", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public UrlAction disabledTip(Object value) {
		return (UrlAction) this.set("disabledTip", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public UrlAction size(Object value) {
		return (UrlAction) this.set("size", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public UrlAction tooltipPlacement(Object value) {
		return (UrlAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public UrlAction staticOn(Object value) {
		return (UrlAction) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public UrlAction staticPlaceholder(Object value) {
		return (UrlAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public UrlAction staticInputClassName(Object value) {
		return (UrlAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public UrlAction block(Object value) {
		return (UrlAction) this.set("block", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public UrlAction onClick(Object value) {
		return (UrlAction) this.set("onClick", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public UrlAction id(Object value) {
		return (UrlAction) this.set("id", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public UrlAction countDownTpl(Object value) {
		return (UrlAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public UrlAction hotKey(Object value) {
		return (UrlAction) this.set("hotKey", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public UrlAction level(Object value) {
		return (UrlAction) this.set("level", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public UrlAction confirmText(Object value) {
		return (UrlAction) this.set("confirmText", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public UrlAction required(Object value) {
		return (UrlAction) this.set("required", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public UrlAction $$id(Object value) {
		return (UrlAction) this.set("$$id", value);
	}
	
	/**
	 * 组件样式
    */
	public UrlAction style(Object value) {
		return (UrlAction) this.set("style", value);
	}
	
	/**
	    */
	public UrlAction testIdBuilder(Object value) {
		return (UrlAction) this.set("testIdBuilder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public UrlAction staticClassName(Object value) {
		return (UrlAction) this.set("staticClassName", value);
	}
	
	/**
	 * 是否新窗口打开
    */
	public UrlAction blank(Object value) {
		return (UrlAction) this.set("blank", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public UrlAction staticLabelClassName(Object value) {
		return (UrlAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public UrlAction iconClassName(Object value) {
		return (UrlAction) this.set("iconClassName", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public UrlAction activeLevel(Object value) {
		return (UrlAction) this.set("activeLevel", value);
	}
	
	/**
	 * 是否禁用
    */
	public UrlAction disabled(Object value) {
		return (UrlAction) this.set("disabled", value);
	}
	
	/**
	    */
	public UrlAction primary(Object value) {
		return (UrlAction) this.set("primary", value);
	}
	
	/**
	    */
	public UrlAction tooltip(Object value) {
		return (UrlAction) this.set("tooltip", value);
	}
	
	/**
	 * 事件动作配置
    */
	public UrlAction onEvent(Object value) {
		return (UrlAction) this.set("onEvent", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public UrlAction rightIcon(Object value) {
		return (UrlAction) this.set("rightIcon", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public UrlAction countDown(Object value) {
		return (UrlAction) this.set("countDown", value);
	}
	
	/**
	 * 子内容
    */
	public UrlAction body(Object value) {
		return (UrlAction) this.set("body", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public UrlAction type(Object value) {
		return (UrlAction) this.set("type", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public UrlAction activeClassName(Object value) {
		return (UrlAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public UrlAction mergeData(Object value) {
		return (UrlAction) this.set("mergeData", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public UrlAction loadingOn(Object value) {
		return (UrlAction) this.set("loadingOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public UrlAction static_(Object value) {
		return (UrlAction) this.set("static_", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public UrlAction close(Object value) {
		return (UrlAction) this.set("close", value);
	}
	
	/**
	 * 打开的目标地址
    */
	public UrlAction url(Object value) {
		return (UrlAction) this.set("url", value);
	}
	
	/**
	 * 是否隐藏
    */
	public UrlAction hidden(Object value) {
		return (UrlAction) this.set("hidden", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public UrlAction editorSetting(Object value) {
		return (UrlAction) this.set("editorSetting", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public UrlAction rightIconClassName(Object value) {
		return (UrlAction) this.set("rightIconClassName", value);
	}
	}