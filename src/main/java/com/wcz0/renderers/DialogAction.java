package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class DialogAction extends BaseRenderer {

	public DialogAction() {
		this.set("type", "dialogAction");
	}

	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public DialogAction id(Object value) {
		return (DialogAction) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DialogAction static_(Object value) {
		return (DialogAction) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DialogAction staticInputClassName(Object value) {
		return (DialogAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public DialogAction visible(Object value) {
		return (DialogAction) this.set("visible", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public DialogAction required(Object value) {
		return (DialogAction) this.set("required", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public DialogAction activeLevel(Object value) {
		return (DialogAction) this.set("activeLevel", value);
	}
	
	/**
	 * 按钮文字
    */
	public DialogAction label(Object value) {
		return (DialogAction) this.set("label", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public DialogAction type(Object value) {
		return (DialogAction) this.set("type", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public DialogAction iconClassName(Object value) {
		return (DialogAction) this.set("iconClassName", value);
	}
	
	/**
	    */
	public DialogAction tooltip(Object value) {
		return (DialogAction) this.set("tooltip", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public DialogAction activeClassName(Object value) {
		return (DialogAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DialogAction staticOn(Object value) {
		return (DialogAction) this.set("staticOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DialogAction hiddenOn(Object value) {
		return (DialogAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public DialogAction rightIconClassName(Object value) {
		return (DialogAction) this.set("rightIconClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DialogAction className(Object value) {
		return (DialogAction) this.set("className", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public DialogAction mergeData(Object value) {
		return (DialogAction) this.set("mergeData", value);
	}
	
	/**
	 * 是否有下一个的表达式，正常可以不用配置，如果想要刷掉某些数据可以配置这个。
    */
	public DialogAction nextCondition(Object value) {
		return (DialogAction) this.set("nextCondition", value);
	}
	
	/**
	    */
	public DialogAction reload(Object value) {
		return (DialogAction) this.set("reload", value);
	}
	
	/**
	 * 数据映射
    */
	public DialogAction data(Object value) {
		return (DialogAction) this.set("data", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public DialogAction confirmText(Object value) {
		return (DialogAction) this.set("confirmText", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DialogAction staticClassName(Object value) {
		return (DialogAction) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DialogAction staticLabelClassName(Object value) {
		return (DialogAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public DialogAction rightIcon(Object value) {
		return (DialogAction) this.set("rightIcon", value);
	}
	
	/**
	 * 角标
    */
	public DialogAction badge(Object value) {
		return (DialogAction) this.set("badge", value);
	}
	
	/**
	 * 指定为打开弹窗
    */
	public DialogAction actionType(Object value) {
		return (DialogAction) this.set("actionType", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DialogAction onEvent(Object value) {
		return (DialogAction) this.set("onEvent", value);
	}
	
	/**
	    */
	public DialogAction testid(Object value) {
		return (DialogAction) this.set("testid", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public DialogAction icon(Object value) {
		return (DialogAction) this.set("icon", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public DialogAction loadingClassName(Object value) {
		return (DialogAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public DialogAction requireSelected(Object value) {
		return (DialogAction) this.set("requireSelected", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public DialogAction $$id(Object value) {
		return (DialogAction) this.set("$$id", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public DialogAction countDown(Object value) {
		return (DialogAction) this.set("countDown", value);
	}
	
	/**
	    */
	public DialogAction staticSchema(Object value) {
		return (DialogAction) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DialogAction editorSetting(Object value) {
		return (DialogAction) this.set("editorSetting", value);
	}
	
	/**
	    */
	public DialogAction primary(Object value) {
		return (DialogAction) this.set("primary", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public DialogAction countDownTpl(Object value) {
		return (DialogAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 是否禁用
    */
	public DialogAction disabled(Object value) {
		return (DialogAction) this.set("disabled", value);
	}
	
	/**
	 * 弹框详情 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/dialog
    */
	public DialogAction dialog(Object value) {
		return (DialogAction) this.set("dialog", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DialogAction staticPlaceholder(Object value) {
		return (DialogAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public DialogAction loadingOn(Object value) {
		return (DialogAction) this.set("loadingOn", value);
	}
	
	/**
	 * 子内容
    */
	public DialogAction body(Object value) {
		return (DialogAction) this.set("body", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public DialogAction level(Object value) {
		return (DialogAction) this.set("level", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DialogAction hidden(Object value) {
		return (DialogAction) this.set("hidden", value);
	}
	
	/**
	    */
	public DialogAction testIdBuilder(Object value) {
		return (DialogAction) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public DialogAction block(Object value) {
		return (DialogAction) this.set("block", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public DialogAction tooltipPlacement(Object value) {
		return (DialogAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public DialogAction onClick(Object value) {
		return (DialogAction) this.set("onClick", value);
	}
	
	/**
	    */
	public DialogAction redirect(Object value) {
		return (DialogAction) this.set("redirect", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public DialogAction size(Object value) {
		return (DialogAction) this.set("size", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public DialogAction close(Object value) {
		return (DialogAction) this.set("close", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public DialogAction hotKey(Object value) {
		return (DialogAction) this.set("hotKey", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DialogAction disabledOn(Object value) {
		return (DialogAction) this.set("disabledOn", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public DialogAction disabledTip(Object value) {
		return (DialogAction) this.set("disabledTip", value);
	}
	
	/**
	 * 组件样式
    */
	public DialogAction style(Object value) {
		return (DialogAction) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DialogAction useMobileUI(Object value) {
		return (DialogAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public DialogAction target(Object value) {
		return (DialogAction) this.set("target", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DialogAction visibleOn(Object value) {
		return (DialogAction) this.set("visibleOn", value);
	}
	}