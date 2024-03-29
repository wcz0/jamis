package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CopyAction extends BaseRenderer {

	public CopyAction() {
		this.set("type", "copyAction");
	}

	public CopyAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CopyAction useMobileUI(Object value) {
		return (CopyAction) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public CopyAction testid(Object value) {
		return (CopyAction) this.set("testid", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public CopyAction icon(Object value) {
		return (CopyAction) this.set("icon", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public CopyAction target(Object value) {
		return (CopyAction) this.set("target", value);
	}
	
	/**
	 * 角标
    */
	public CopyAction badge(Object value) {
		return (CopyAction) this.set("badge", value);
	}
	
	/**
	 * 是否显示
    */
	public CopyAction visible(Object value) {
		return (CopyAction) this.set("visible", value);
	}
	
	/**
	    */
	public CopyAction staticSchema(Object value) {
		return (CopyAction) this.set("staticSchema", value);
	}
	
	/**
	    */
	public CopyAction primary(Object value) {
		return (CopyAction) this.set("primary", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public CopyAction required(Object value) {
		return (CopyAction) this.set("required", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public CopyAction close(Object value) {
		return (CopyAction) this.set("close", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public CopyAction onClick(Object value) {
		return (CopyAction) this.set("onClick", value);
	}
	
	/**
	 * 指定为复制内容行为
    */
	public CopyAction actionType(Object value) {
		return (CopyAction) this.set("actionType", value);
	}
	
	/**
	 * 复制啥内容由此配置，支持模板语法。
    */
	public CopyAction copy(Object value) {
		return (CopyAction) this.set("copy", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CopyAction className(Object value) {
		return (CopyAction) this.set("className", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public CopyAction disabledTip(Object value) {
		return (CopyAction) this.set("disabledTip", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public CopyAction rightIconClassName(Object value) {
		return (CopyAction) this.set("rightIconClassName", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public CopyAction size(Object value) {
		return (CopyAction) this.set("size", value);
	}
	
	/**
	 * 是否禁用
    */
	public CopyAction disabled(Object value) {
		return (CopyAction) this.set("disabled", value);
	}
	
	/**
	 * 组件样式
    */
	public CopyAction style(Object value) {
		return (CopyAction) this.set("style", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public CopyAction type(Object value) {
		return (CopyAction) this.set("type", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public CopyAction block(Object value) {
		return (CopyAction) this.set("block", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public CopyAction tooltipPlacement(Object value) {
		return (CopyAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public CopyAction activeLevel(Object value) {
		return (CopyAction) this.set("activeLevel", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public CopyAction requireSelected(Object value) {
		return (CopyAction) this.set("requireSelected", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CopyAction visibleOn(Object value) {
		return (CopyAction) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CopyAction staticLabelClassName(Object value) {
		return (CopyAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public CopyAction loadingOn(Object value) {
		return (CopyAction) this.set("loadingOn", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public CopyAction iconClassName(Object value) {
		return (CopyAction) this.set("iconClassName", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public CopyAction confirmText(Object value) {
		return (CopyAction) this.set("confirmText", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public CopyAction countDownTpl(Object value) {
		return (CopyAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CopyAction staticPlaceholder(Object value) {
		return (CopyAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CopyAction staticClassName(Object value) {
		return (CopyAction) this.set("staticClassName", value);
	}
	
	/**
	 * 按钮文字
    */
	public CopyAction label(Object value) {
		return (CopyAction) this.set("label", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public CopyAction level(Object value) {
		return (CopyAction) this.set("level", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public CopyAction activeClassName(Object value) {
		return (CopyAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public CopyAction mergeData(Object value) {
		return (CopyAction) this.set("mergeData", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public CopyAction hotKey(Object value) {
		return (CopyAction) this.set("hotKey", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CopyAction hidden(Object value) {
		return (CopyAction) this.set("hidden", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public CopyAction loadingClassName(Object value) {
		return (CopyAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CopyAction onEvent(Object value) {
		return (CopyAction) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CopyAction staticOn(Object value) {
		return (CopyAction) this.set("staticOn", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public CopyAction rightIcon(Object value) {
		return (CopyAction) this.set("rightIcon", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CopyAction disabledOn(Object value) {
		return (CopyAction) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CopyAction hiddenOn(Object value) {
		return (CopyAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CopyAction staticInputClassName(Object value) {
		return (CopyAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CopyAction editorSetting(Object value) {
		return (CopyAction) this.set("editorSetting", value);
	}
	
	/**
	    */
	public CopyAction tooltip(Object value) {
		return (CopyAction) this.set("tooltip", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public CopyAction countDown(Object value) {
		return (CopyAction) this.set("countDown", value);
	}
	
	/**
	 * 子内容
    */
	public CopyAction body(Object value) {
		return (CopyAction) this.set("body", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public CopyAction id(Object value) {
		return (CopyAction) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CopyAction static_(Object value) {
		return (CopyAction) this.set("static_", value);
	}
	}