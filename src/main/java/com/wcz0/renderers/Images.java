package com.wcz0.renderers;
/**
 * 图片集展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/images

 * @author wcz0
 * @version 6.2.2
 */
public class Images extends BaseRenderer {

	public Images() {
		this.set("type", "images");
	}

	/**
	 * 是否显示表达式
    */
	public Images visibleOn(Object value) {
		return (Images) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Images id(Object value) {
		return (Images) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Images staticOn(Object value) {
		return (Images) this.set("staticOn", value);
	}
	
	/**
	 * 配置值的连接符
    */
	public Images delimiter(Object value) {
		return (Images) this.set("delimiter", value);
	}
	
	/**
	 * 图片地址，默认读取数据中的 image 属性，如果不是请配置 ,如  ${imageUrl}
    */
	public Images src(Object value) {
		return (Images) this.set("src", value);
	}
	
	/**
	 * 默认图片地址
    */
	public Images defaultImage(Object value) {
		return (Images) this.set("defaultImage", value);
	}
	
	/**
	    */
	public Images value(Object value) {
		return (Images) this.set("value", value);
	}
	
	/**
	    */
	public Images source(Object value) {
		return (Images) this.set("source", value);
	}
	
	/**
	 * 放大时是否显示图片集
    */
	public Images enlargetWithImages(Object value) {
		return (Images) this.set("enlargetWithImages", value);
	}
	
	/**
	 * 是否展示图片工具栏
    */
	public Images showToolbar(Object value) {
		return (Images) this.set("showToolbar", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Images hiddenOn(Object value) {
		return (Images) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Images visible(Object value) {
		return (Images) this.set("visible", value);
	}
	
	/**
	    */
	public Images staticSchema(Object value) {
		return (Images) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Images editorSetting(Object value) {
		return (Images) this.set("editorSetting", value);
	}
	
	/**
	 * 预览图模式
    * 可选值: w-full | h-full | contain | cover
    */
	public Images thumbMode(Object value) {
		return (Images) this.set("thumbMode", value);
	}
	
	/**
	 * 预览图比率
    * 可选值: 1:1 | 4:3 | 16:9
    */
	public Images thumbRatio(Object value) {
		return (Images) this.set("thumbRatio", value);
	}
	
	/**
	 * 是否启动放大功能。
    */
	public Images enlargeAble(Object value) {
		return (Images) this.set("enlargeAble", value);
	}
	
	/**
	 * 列表 CSS 类名
    */
	public Images listClassName(Object value) {
		return (Images) this.set("listClassName", value);
	}
	
	/**
	 * 工具栏配置
    */
	public Images toolbarActions(Object value) {
		return (Images) this.set("toolbarActions", value);
	}
	
	/**
	 * 组件样式
    */
	public Images style(Object value) {
		return (Images) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Images useMobileUI(Object value) {
		return (Images) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Images testIdBuilder(Object value) {
		return (Images) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public Images testid(Object value) {
		return (Images) this.set("testid", value);
	}
	
	/**
	 * 放大详情图 CSS 类名
    */
	public Images imageGallaryClassName(Object value) {
		return (Images) this.set("imageGallaryClassName", value);
	}
	
	/**
	 * 列表为空时显示
    */
	public Images placeholder(Object value) {
		return (Images) this.set("placeholder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Images $$id(Object value) {
		return (Images) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Images disabledOn(Object value) {
		return (Images) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Images staticPlaceholder(Object value) {
		return (Images) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Images staticClassName(Object value) {
		return (Images) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Images staticInputClassName(Object value) {
		return (Images) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定为图片集渲染器
    * 可选值: images | static-images
    */
	public Images type(Object value) {
		return (Images) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public Images disabled(Object value) {
		return (Images) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Images hidden(Object value) {
		return (Images) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Images onEvent(Object value) {
		return (Images) this.set("onEvent", value);
	}
	
	/**
	    */
	public Images options(Object value) {
		return (Images) this.set("options", value);
	}
	
	/**
	 * 外层 CSS 类名
    */
	public Images className(Object value) {
		return (Images) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Images static_(Object value) {
		return (Images) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Images staticLabelClassName(Object value) {
		return (Images) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 关联字段名，也可以直接配置 src
    */
	public Images name(Object value) {
		return (Images) this.set("name", value);
	}
	
	/**
	 * 大图地址，不设置用 src 属性，如果不是请配置，如：${imageOriginUrl}
    */
	public Images originalSrc(Object value) {
		return (Images) this.set("originalSrc", value);
	}
	
	/**
	 * 是否显示尺寸。
    */
	public Images showDimensions(Object value) {
		return (Images) this.set("showDimensions", value);
	}
	}