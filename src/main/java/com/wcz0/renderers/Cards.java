package com.wcz0.renderers;
/**
 * Cards 卡片集合渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/card

 * @author wcz0
 * @version 6.2.2
 */
public class Cards extends BaseRenderer {

	public Cards() {
		this.set("type", "cards");
	}

	/**
	 * 静态展示表单项Value类名
    */
	public Cards staticInputClassName(Object value) {
		return (Cards) this.set("staticInputClassName", value);
	}
	
	/**
	 * 底部 CSS 类名
    */
	public Cards footerClassName(Object value) {
		return (Cards) this.set("footerClassName", value);
	}
	
	/**
	 * 底部区域
    */
	public Cards footer(Object value) {
		return (Cards) this.set("footer", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public Cards itemCheckableOn(Object value) {
		return (Cards) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 是否为瀑布流布局？
    */
	public Cards masonryLayout(Object value) {
		return (Cards) this.set("masonryLayout", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Cards visibleOn(Object value) {
		return (Cards) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Cards onEvent(Object value) {
		return (Cards) this.set("onEvent", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Cards hiddenOn(Object value) {
		return (Cards) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Cards staticOn(Object value) {
		return (Cards) this.set("staticOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Cards editorSetting(Object value) {
		return (Cards) this.set("editorSetting", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public Cards hideCheckToggler(Object value) {
		return (Cards) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 是否固顶
    */
	public Cards affixHeader(Object value) {
		return (Cards) this.set("affixHeader", value);
	}
	
	/**
	 * 是否禁用
    */
	public Cards disabled(Object value) {
		return (Cards) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Cards hidden(Object value) {
		return (Cards) this.set("hidden", value);
	}
	
	/**
	    */
	public Cards testid(Object value) {
		return (Cards) this.set("testid", value);
	}
	
	/**
	 * 数据源: 绑定当前环境变量
    */
	public Cards source(Object value) {
		return (Cards) this.set("source", value);
	}
	
	/**
	 * 顶部区域
    */
	public Cards header(Object value) {
		return (Cards) this.set("header", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public Cards itemDraggableOn(Object value) {
		return (Cards) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 点击卡片的时候是否勾选卡片。
    */
	public Cards checkOnItemClick(Object value) {
		return (Cards) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public Cards valueField(Object value) {
		return (Cards) this.set("valueField", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Cards $$id(Object value) {
		return (Cards) this.set("$$id", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Cards className(Object value) {
		return (Cards) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Cards id(Object value) {
		return (Cards) this.set("id", value);
	}
	
	/**
	 * 是否显示头部
    */
	public Cards showHeader(Object value) {
		return (Cards) this.set("showHeader", value);
	}
	
	/**
	 * 是否固底
    */
	public Cards affixFooter(Object value) {
		return (Cards) this.set("affixFooter", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Cards staticPlaceholder(Object value) {
		return (Cards) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Cards staticLabelClassName(Object value) {
		return (Cards) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Cards style(Object value) {
		return (Cards) this.set("style", value);
	}
	
	/**
	 * 标题
    */
	public Cards title(Object value) {
		return (Cards) this.set("title", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Cards disabledOn(Object value) {
		return (Cards) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Cards staticClassName(Object value) {
		return (Cards) this.set("staticClassName", value);
	}
	
	/**
	 * 指定为 cards 类型
    */
	public Cards type(Object value) {
		return (Cards) this.set("type", value);
	}
	
	/**
	    */
	public Cards card(Object value) {
		return (Cards) this.set("card", value);
	}
	
	/**
	 * 头部 CSS 类名
    */
	public Cards headerClassName(Object value) {
		return (Cards) this.set("headerClassName", value);
	}
	
	/**
	 * 是否显示底部
    */
	public Cards showFooter(Object value) {
		return (Cards) this.set("showFooter", value);
	}
	
	/**
	    */
	public Cards staticSchema(Object value) {
		return (Cards) this.set("staticSchema", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Cards static_(Object value) {
		return (Cards) this.set("static_", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Cards useMobileUI(Object value) {
		return (Cards) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Cards testIdBuilder(Object value) {
		return (Cards) this.set("testIdBuilder", value);
	}
	
	/**
	 * 卡片 CSS 类名
    */
	public Cards itemClassName(Object value) {
		return (Cards) this.set("itemClassName", value);
	}
	
	/**
	 * 无数据提示
    */
	public Cards placeholder(Object value) {
		return (Cards) this.set("placeholder", value);
	}
	
	/**
	    */
	public Cards loadingConfig(Object value) {
		return (Cards) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否显示
    */
	public Cards visible(Object value) {
		return (Cards) this.set("visible", value);
	}
	}