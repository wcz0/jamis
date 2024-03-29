package com.wcz0.renderers;
/**
 * 二维布局渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/grid-2d

 * @author wcz0
 * @version 6.2.2
 */
public class Grid2D extends BaseRenderer {

	public Grid2D() {
		this.set("type", "grid2D");
	}

	public Grid2D set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public Grid2D onEvent(Object value) {
		return (Grid2D) this.set("onEvent", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Grid2D useMobileUI(Object value) {
		return (Grid2D) this.set("useMobileUI", value);
	}
	
	/**
	 * 格子行级别的间距，如果不设置就和 gap 一样
    */
	public Grid2D gapRow(Object value) {
		return (Grid2D) this.set("gapRow", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Grid2D disabledOn(Object value) {
		return (Grid2D) this.set("disabledOn", value);
	}
	
	/**
	 * 组件样式
    */
	public Grid2D style(Object value) {
		return (Grid2D) this.set("style", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Grid2D className(Object value) {
		return (Grid2D) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Grid2D visibleOn(Object value) {
		return (Grid2D) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Grid2D staticOn(Object value) {
		return (Grid2D) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Grid2D staticPlaceholder(Object value) {
		return (Grid2D) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Grid2D staticClassName(Object value) {
		return (Grid2D) this.set("staticClassName", value);
	}
	
	/**
	 * 每个格子的配置
    */
	public Grid2D grids(Object value) {
		return (Grid2D) this.set("grids", value);
	}
	
	/**
	 * 单位行高度，默认 50 px
    */
	public Grid2D rowHeight(Object value) {
		return (Grid2D) this.set("rowHeight", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Grid2D staticInputClassName(Object value) {
		return (Grid2D) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Grid2D staticSchema(Object value) {
		return (Grid2D) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Grid2D editorSetting(Object value) {
		return (Grid2D) this.set("editorSetting", value);
	}
	
	/**
	 * 是否禁用
    */
	public Grid2D disabled(Object value) {
		return (Grid2D) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Grid2D hidden(Object value) {
		return (Grid2D) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Grid2D id(Object value) {
		return (Grid2D) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Grid2D staticLabelClassName(Object value) {
		return (Grid2D) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Grid2D static_(Object value) {
		return (Grid2D) this.set("static_", value);
	}
	
	/**
	 * 指定为 grid-2d 展示类型
    */
	public Grid2D type(Object value) {
		return (Grid2D) this.set("type", value);
	}
	
	/**
	 * grid 2d 容器宽度，默认是 auto
    */
	public Grid2D width(Object value) {
		return (Grid2D) this.set("width", value);
	}
	
	/**
	 * 格子间距，默认 0，包含行和列
    */
	public Grid2D gap(Object value) {
		return (Grid2D) this.set("gap", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Grid2D hiddenOn(Object value) {
		return (Grid2D) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Grid2D visible(Object value) {
		return (Grid2D) this.set("visible", value);
	}
	
	/**
	 * 列数量，默认是 12
    */
	public Grid2D cols(Object value) {
		return (Grid2D) this.set("cols", value);
	}
	}