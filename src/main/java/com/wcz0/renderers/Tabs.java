package com.wcz0.renderers;
/**
 * 选项卡控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/tabs

 * @author wcz0
 * @version 6.2.2
 */
public class Tabs extends BaseRenderer {

	public Tabs() {
		this.set("type", "tabs");
	}

	public Tabs set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 卡片是否只有在点开的时候加载？
    */
	public Tabs mountOnEnter(Object value) {
		return (Tabs) this.set("mountOnEnter", value);
	}
	
	/**
	 * 可以在右侧配置点其他功能按钮。
    */
	public Tabs toolbar(Object value) {
		return (Tabs) this.set("toolbar", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Tabs className(Object value) {
		return (Tabs) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public Tabs disabled(Object value) {
		return (Tabs) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Tabs disabledOn(Object value) {
		return (Tabs) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Tabs id(Object value) {
		return (Tabs) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public Tabs style(Object value) {
		return (Tabs) this.set("style", value);
	}
	
	/**
	    */
	public Tabs type(Object value) {
		return (Tabs) this.set("type", value);
	}
	
	/**
	 * 是否显示提示
    */
	public Tabs showTip(Object value) {
		return (Tabs) this.set("showTip", value);
	}
	
	/**
	 * tooltip 提示的类名
    */
	public Tabs showTipClassName(Object value) {
		return (Tabs) this.set("showTipClassName", value);
	}
	
	/**
	 * 是否导航支持内容溢出滚动。属性废弃，为了兼容暂且保留
    */
	public Tabs scrollable(Object value) {
		return (Tabs) this.set("scrollable", value);
	}
	
	/**
	 * 初始化激活的选项卡，hash值或索引值，支持使用表达式
    */
	public Tabs defaultKey(Object value) {
		return (Tabs) this.set("defaultKey", value);
	}
	
	/**
	 * 超过多少个时折叠按钮
    */
	public Tabs collapseOnExceed(Object value) {
		return (Tabs) this.set("collapseOnExceed", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Tabs staticClassName(Object value) {
		return (Tabs) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Tabs staticSchema(Object value) {
		return (Tabs) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Tabs useMobileUI(Object value) {
		return (Tabs) this.set("useMobileUI", value);
	}
	
	/**
	 * 内容类名
    */
	public Tabs contentClassName(Object value) {
		return (Tabs) this.set("contentClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Tabs hiddenOn(Object value) {
		return (Tabs) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Tabs static_(Object value) {
		return (Tabs) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Tabs staticLabelClassName(Object value) {
		return (Tabs) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否支持拖拽
    */
	public Tabs draggable(Object value) {
		return (Tabs) this.set("draggable", value);
	}
	
	/**
	 * 是否滑动切换只在移动端生效
    */
	public Tabs swipeable(Object value) {
		return (Tabs) this.set("swipeable", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Tabs staticPlaceholder(Object value) {
		return (Tabs) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Tabs hidden(Object value) {
		return (Tabs) this.set("hidden", value);
	}
	
	/**
	 * 选项卡成员。当配置了 source 时，选项卡成员，将会根据目标数据进行重复。
    */
	public Tabs tabs(Object value) {
		return (Tabs) this.set("tabs", value);
	}
	
	/**
	 * 链接外层类名
    */
	public Tabs linksClassName(Object value) {
		return (Tabs) this.set("linksClassName", value);
	}
	
	/**
	 * 是否支持新增
    */
	public Tabs addable(Object value) {
		return (Tabs) this.set("addable", value);
	}
	
	/**
	 * 是否可编辑标签名
    */
	public Tabs editable(Object value) {
		return (Tabs) this.set("editable", value);
	}
	
	/**
	 * 编辑器模式，侧边的位置
    * 可选值: left | right
    */
	public Tabs sidePosition(Object value) {
		return (Tabs) this.set("sidePosition", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Tabs staticOn(Object value) {
		return (Tabs) this.set("staticOn", value);
	}
	
	/**
	 * 卡片隐藏的时候是否销毁卡片内容
    */
	public Tabs unmountOnExit(Object value) {
		return (Tabs) this.set("unmountOnExit", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public Tabs subFormMode(Object value) {
		return (Tabs) this.set("subFormMode", value);
	}
	
	/**
	 * 是否支持删除
    */
	public Tabs closable(Object value) {
		return (Tabs) this.set("closable", value);
	}
	
	/**
	 * 折叠按钮文字
    */
	public Tabs collapseBtnLabel(Object value) {
		return (Tabs) this.set("collapseBtnLabel", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Tabs onEvent(Object value) {
		return (Tabs) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Tabs editorSetting(Object value) {
		return (Tabs) this.set("editorSetting", value);
	}
	
	/**
	 * 关联已有数据，选项卡直接根据目标数据重复。
    */
	public Tabs source(Object value) {
		return (Tabs) this.set("source", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public Tabs subFormHorizontal(Object value) {
		return (Tabs) this.set("subFormHorizontal", value);
	}
	
	/**
	 * 激活的选项卡，hash值或索引值，支持使用表达式
    */
	public Tabs activeKey(Object value) {
		return (Tabs) this.set("activeKey", value);
	}
	
	/**
	 * 是否显示
    */
	public Tabs visible(Object value) {
		return (Tabs) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Tabs visibleOn(Object value) {
		return (Tabs) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Tabs staticInputClassName(Object value) {
		return (Tabs) this.set("staticInputClassName", value);
	}
	
	/**
	 * 展示形式
    */
	public Tabs tabsMode(Object value) {
		return (Tabs) this.set("tabsMode", value);
	}
	
	/**
	 * 自定义增加按钮文案
    */
	public Tabs addBtnText(Object value) {
		return (Tabs) this.set("addBtnText", value);
	}
	}