package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class DrawerAction extends BaseRenderer {

	public DrawerAction() {
		this.set("type", "drawerAction");
	}

	public DrawerAction set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public DrawerAction visible(Object value) {
		return (DrawerAction) this.set("visible", value);
	}
	
	/**
	 * 按钮样式
    * 可选值: info | success | warning | danger | link | primary | dark | light | secondary
    */
	public DrawerAction level(Object value) {
		return (DrawerAction) this.set("level", value);
	}
	
	/**
	 * 如果按钮在form中，配置此属性会要求用户把指定的字段通过验证后才会触发行为。
    */
	public DrawerAction required(Object value) {
		return (DrawerAction) this.set("required", value);
	}
	
	/**
	 * 指定为打开弹窗，抽出式弹窗
    */
	public DrawerAction actionType(Object value) {
		return (DrawerAction) this.set("actionType", value);
	}
	
	/**
	    */
	public DrawerAction testid(Object value) {
		return (DrawerAction) this.set("testid", value);
	}
	
	/**
	 * 右侧 icon 上的 css 类名
    */
	public DrawerAction rightIconClassName(Object value) {
		return (DrawerAction) this.set("rightIconClassName", value);
	}
	
	/**
	    */
	public DrawerAction tooltip(Object value) {
		return (DrawerAction) this.set("tooltip", value);
	}
	
	/**
	 * 是否将弹框中数据 merge 到父级作用域。
    */
	public DrawerAction mergeData(Object value) {
		return (DrawerAction) this.set("mergeData", value);
	}
	
	/**
	 * 点击后的禁止倒计时（秒）
    */
	public DrawerAction countDown(Object value) {
		return (DrawerAction) this.set("countDown", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DrawerAction editorSetting(Object value) {
		return (DrawerAction) this.set("editorSetting", value);
	}
	
	/**
	 * 按钮文字
    */
	public DrawerAction label(Object value) {
		return (DrawerAction) this.set("label", value);
	}
	
	/**
	    */
	public DrawerAction primary(Object value) {
		return (DrawerAction) this.set("primary", value);
	}
	
	/**
	 * 自定义事件处理函数
    */
	public DrawerAction onClick(Object value) {
		return (DrawerAction) this.set("onClick", value);
	}
	
	/**
	 * 主要用于用户行为跟踪里区分是哪个按钮
    */
	public DrawerAction id(Object value) {
		return (DrawerAction) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DrawerAction onEvent(Object value) {
		return (DrawerAction) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DrawerAction static_(Object value) {
		return (DrawerAction) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DrawerAction staticPlaceholder(Object value) {
		return (DrawerAction) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 禁用时的文案提示。
    */
	public DrawerAction disabledTip(Object value) {
		return (DrawerAction) this.set("disabledTip", value);
	}
	
	/**
	 * 当按钮时批量操作按钮时，默认必须有勾选元素才能可点击，如果此属性配置成 false，则没有点选成员也能点击。
    */
	public DrawerAction requireSelected(Object value) {
		return (DrawerAction) this.set("requireSelected", value);
	}
	
	/**
	 * 倒计时文字自定义
    */
	public DrawerAction countDownTpl(Object value) {
		return (DrawerAction) this.set("countDownTpl", value);
	}
	
	/**
	 * 激活状态时的类名
    */
	public DrawerAction activeClassName(Object value) {
		return (DrawerAction) this.set("activeClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DrawerAction hidden(Object value) {
		return (DrawerAction) this.set("hidden", value);
	}
	
	/**
	 * 提示文字，配置了操作前会要求用户确认。
    */
	public DrawerAction confirmText(Object value) {
		return (DrawerAction) this.set("confirmText", value);
	}
	
	/**
	 * 抽出式弹框详情 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/drawer
    */
	public DrawerAction drawer(Object value) {
		return (DrawerAction) this.set("drawer", value);
	}
	
	/**
	    */
	public DrawerAction staticSchema(Object value) {
		return (DrawerAction) this.set("staticSchema", value);
	}
	
	/**
	 * 如果按钮在弹框中，可以配置这个动作完成后是否关闭弹窗，或者指定关闭目标弹框。
    */
	public DrawerAction close(Object value) {
		return (DrawerAction) this.set("close", value);
	}
	
	/**
	 * 是否显示loading效果
    */
	public DrawerAction loadingOn(Object value) {
		return (DrawerAction) this.set("loadingOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DrawerAction staticLabelClassName(Object value) {
		return (DrawerAction) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否有下一个的表达式，正常可以不用配置，如果想要刷掉某些数据可以配置这个。
    */
	public DrawerAction nextCondition(Object value) {
		return (DrawerAction) this.set("nextCondition", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DrawerAction staticClassName(Object value) {
		return (DrawerAction) this.set("staticClassName", value);
	}
	
	/**
	    */
	public DrawerAction reload(Object value) {
		return (DrawerAction) this.set("reload", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DrawerAction className(Object value) {
		return (DrawerAction) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DrawerAction visibleOn(Object value) {
		return (DrawerAction) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DrawerAction staticInputClassName(Object value) {
		return (DrawerAction) this.set("staticInputClassName", value);
	}
	
	/**
	 * loading 上的css 类名
    */
	public DrawerAction loadingClassName(Object value) {
		return (DrawerAction) this.set("loadingClassName", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public DrawerAction size(Object value) {
		return (DrawerAction) this.set("size", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DrawerAction useMobileUI(Object value) {
		return (DrawerAction) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否为块状展示，默认为内联。
    */
	public DrawerAction block(Object value) {
		return (DrawerAction) this.set("block", value);
	}
	
	/**
	 * icon 上的css 类名
    */
	public DrawerAction iconClassName(Object value) {
		return (DrawerAction) this.set("iconClassName", value);
	}
	
	/**
	 * 右侧按钮图标， iconfont 的类名
    */
	public DrawerAction rightIcon(Object value) {
		return (DrawerAction) this.set("rightIcon", value);
	}
	
	/**
	 * 设置对齐方式
    */
	public DrawerAction align(Object value) {
		return (DrawerAction) this.set("align", value);
	}
	
	/**
	 * 按钮图标， iconfont 的类名
    */
	public DrawerAction icon(Object value) {
		return (DrawerAction) this.set("icon", value);
	}
	
	/**
	    */
	public DrawerAction redirect(Object value) {
		return (DrawerAction) this.set("redirect", value);
	}
	
	/**
	 * 角标
    */
	public DrawerAction badge(Object value) {
		return (DrawerAction) this.set("badge", value);
	}
	
	/**
	 * 子内容
    */
	public DrawerAction body(Object value) {
		return (DrawerAction) this.set("body", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DrawerAction hiddenOn(Object value) {
		return (DrawerAction) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DrawerAction staticOn(Object value) {
		return (DrawerAction) this.set("staticOn", value);
	}
	
	/**
	 * 指定按钮类型，支持 button、submit或者reset三种类型。
    * 可选值: button | submit | reset
    */
	public DrawerAction type(Object value) {
		return (DrawerAction) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public DrawerAction disabled(Object value) {
		return (DrawerAction) this.set("disabled", value);
	}
	
	/**
	 * 组件样式
    */
	public DrawerAction style(Object value) {
		return (DrawerAction) this.set("style", value);
	}
	
	/**
	 * 可以指定让谁来触发这个动作。
    */
	public DrawerAction target(Object value) {
		return (DrawerAction) this.set("target", value);
	}
	
	/**
	 * 键盘快捷键
    */
	public DrawerAction hotKey(Object value) {
		return (DrawerAction) this.set("hotKey", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DrawerAction disabledOn(Object value) {
		return (DrawerAction) this.set("disabledOn", value);
	}
	
	/**
	    * 可选值: top | right | bottom | left
    */
	public DrawerAction tooltipPlacement(Object value) {
		return (DrawerAction) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 激活状态时的样式
    */
	public DrawerAction activeLevel(Object value) {
		return (DrawerAction) this.set("activeLevel", value);
	}
	}