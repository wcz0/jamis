package com.wcz0.renderers;
/**
 * 二维码展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/qrcode

 * @author wcz0
 * @version 6.2.2
 */
public class QRCode extends BaseRenderer {

	public QRCode() {
		this.set("type", "qRCode");
	}

	/**
	 * 是否隐藏表达式
    */
	public QRCode hiddenOn(Object value) {
		return (QRCode) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public QRCode id(Object value) {
		return (QRCode) this.set("id", value);
	}
	
	/**
	    */
	public QRCode staticSchema(Object value) {
		return (QRCode) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public QRCode editorSetting(Object value) {
		return (QRCode) this.set("editorSetting", value);
	}
	
	/**
	 * 组件样式
    */
	public QRCode style(Object value) {
		return (QRCode) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public QRCode useMobileUI(Object value) {
		return (QRCode) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public QRCode testid(Object value) {
		return (QRCode) this.set("testid", value);
	}
	
	/**
	 * 二维码的宽高大小，默认 128
    */
	public QRCode codeSize(Object value) {
		return (QRCode) this.set("codeSize", value);
	}
	
	/**
	 * 背景色
    */
	public QRCode backgroundColor(Object value) {
		return (QRCode) this.set("backgroundColor", value);
	}
	
	/**
	 * 二维码复杂级别
    * 可选值: L | M | Q | H
    */
	public QRCode level(Object value) {
		return (QRCode) this.set("level", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public QRCode disabledOn(Object value) {
		return (QRCode) this.set("disabledOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public QRCode className(Object value) {
		return (QRCode) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public QRCode hidden(Object value) {
		return (QRCode) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public QRCode visible(Object value) {
		return (QRCode) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public QRCode visibleOn(Object value) {
		return (QRCode) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public QRCode onEvent(Object value) {
		return (QRCode) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public QRCode static_(Object value) {
		return (QRCode) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public QRCode staticClassName(Object value) {
		return (QRCode) this.set("staticClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public QRCode $$id(Object value) {
		return (QRCode) this.set("$$id", value);
	}
	
	/**
	 * 图片配置
    */
	public QRCode imageSettings(Object value) {
		return (QRCode) this.set("imageSettings", value);
	}
	
	/**
	 * 前景色
    */
	public QRCode foregroundColor(Object value) {
		return (QRCode) this.set("foregroundColor", value);
	}
	
	/**
	 * css 类名
    */
	public QRCode qrcodeClassName(Object value) {
		return (QRCode) this.set("qrcodeClassName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public QRCode staticPlaceholder(Object value) {
		return (QRCode) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public QRCode staticInputClassName(Object value) {
		return (QRCode) this.set("staticInputClassName", value);
	}
	
	/**
	 * 关联字段名。
    */
	public QRCode name(Object value) {
		return (QRCode) this.set("name", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public QRCode staticOn(Object value) {
		return (QRCode) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public QRCode staticLabelClassName(Object value) {
		return (QRCode) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public QRCode disabled(Object value) {
		return (QRCode) this.set("disabled", value);
	}
	
	/**
	    * 可选值: qrcode | qr-code
    */
	public QRCode type(Object value) {
		return (QRCode) this.set("type", value);
	}
	
	/**
	 * 占位符
    */
	public QRCode placeholder(Object value) {
		return (QRCode) this.set("placeholder", value);
	}
	
	/**
	    */
	public QRCode testIdBuilder(Object value) {
		return (QRCode) this.set("testIdBuilder", value);
	}
	}