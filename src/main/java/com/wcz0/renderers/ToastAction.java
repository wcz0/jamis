package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ToastAction extends BaseRenderer {

	public ToastAction() {
		this.set("type", "toastAction");
	}

	public ToastAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 禁用时的文案提示。
    */
	public ToastAction disabledTip(Object value) {
		return (ToastAction) this.set("disabledTip", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public ToastAction iconClassName(Object value) {
		return (ToastAction) this.set("iconClassName", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public ToastAction rightIcon(Object value) {
		return (ToastAction) this.set("rightIcon", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public ToastAction target(Object value) {
		return (ToastAction) this.set("target", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ToastAction className(Object value) {
		return (ToastAction) this.set("className", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ToastAction onEvent(Object value) {
		return (ToastAction) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ToastAction staticPlaceholder(Object value) {
		return (ToastAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public ToastAction type(Object value) {
		return (ToastAction) this.set("type", value);
	}
	
	/**
	 * 轻提示详情 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/toast
    */
	public ToastAction toast(Object value) {
		return (ToastAction) this.set("toast", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public ToastAction tooltipPlacement(Object value) {
		return (ToastAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public ToastAction onClick(Object value) {
		return (ToastAction) this.set("onClick", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ToastAction staticOn(Object value) {
		return (ToastAction) this.set("staticOn", value);
	}
	
	/**
	    */
	public ToastAction testid(Object value) {
		return (ToastAction) this.set("testid", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public ToastAction loadingClassName(Object value) {
		return (ToastAction) this.set("loadingClassName", value);
	}
	
	/**
	    */
	public ToastAction tooltip(Object value) {
		return (ToastAction) this.set("tooltip", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public ToastAction mergeData(Object value) {
		return (ToastAction) this.set("mergeData", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public ToastAction countDown(Object value) {
		return (ToastAction) this.set("countDown", value);
	}
	
	/**
	 * 指定为打开弹窗，抽出式弹窗
    */
	public ToastAction actionType(Object value) {
		return (ToastAction) this.set("actionType", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ToastAction static_(Object value) {
		return (ToastAction) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ToastAction editorSetting(Object value) {
		return (ToastAction) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ToastAction useMobileUI(Object value) {
		return (ToastAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public ToastAction close(Object value) {
		return (ToastAction) this.set("close", value);
	}
	
	/**
	 * 是否禁用
    */
	public ToastAction disabled(Object value) {
		return (ToastAction) this.set("disabled", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public ToastAction activeLevel(Object value) {
		return (ToastAction) this.set("activeLevel", value);
	}
	
	/**
	 * 角标
    */
	public ToastAction badge(Object value) {
		return (ToastAction) this.set("badge", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public ToastAction activeClassName(Object value) {
		return (ToastAction) this.set("activeClassName", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public ToastAction countDownTpl(Object value) {
		return (ToastAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public ToastAction hotKey(Object value) {
		return (ToastAction) this.set("hotKey", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ToastAction hiddenOn(Object value) {
		return (ToastAction) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public ToastAction staticSchema(Object value) {
		return (ToastAction) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public ToastAction style(Object value) {
		return (ToastAction) this.set("style", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public ToastAction rightIconClassName(Object value) {
		return (ToastAction) this.set("rightIconClassName", value);
	}
	
	/**
	    */
	public ToastAction primary(Object value) {
		return (ToastAction) this.set("primary", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public ToastAction confirmText(Object value) {
		return (ToastAction) this.set("confirmText", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ToastAction hidden(Object value) {
		return (ToastAction) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public ToastAction visible(Object value) {
		return (ToastAction) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ToastAction staticInputClassName(Object value) {
		return (ToastAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public ToastAction block(Object value) {
		return (ToastAction) this.set("block", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public ToastAction size(Object value) {
		return (ToastAction) this.set("size", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public ToastAction required(Object value) {
		return (ToastAction) this.set("required", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public ToastAction loadingOn(Object value) {
		return (ToastAction) this.set("loadingOn", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public ToastAction id(Object value) {
		return (ToastAction) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ToastAction staticClassName(Object value) {
		return (ToastAction) this.set("staticClassName", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public ToastAction icon(Object value) {
		return (ToastAction) this.set("icon", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public ToastAction level(Object value) {
		return (ToastAction) this.set("level", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public ToastAction requireSelected(Object value) {
		return (ToastAction) this.set("requireSelected", value);
	}
	
	/**
	 * 子内容
    */
	public ToastAction body(Object value) {
		return (ToastAction) this.set("body", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ToastAction disabledOn(Object value) {
		return (ToastAction) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ToastAction visibleOn(Object value) {
		return (ToastAction) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ToastAction staticLabelClassName(Object value) {
		return (ToastAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public ToastAction label(Object value) {
		return (ToastAction) this.set("label", value);
	}
	}