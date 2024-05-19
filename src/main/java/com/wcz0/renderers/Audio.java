package com.wcz0.renderers;
/**
 * Audio 音频渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/audio

 * @author wcz0
 * @version 6.2.2
 */
public class Audio extends BaseRenderer {

	public Audio() {
		this.set("type", "audio");
	}

	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Audio editorSetting(Object value) {
		return (Audio) this.set("editorSetting", value);
	}
	
	/**
	 * 是否循环播放
    */
	public Audio loop(Object value) {
		return (Audio) this.set("loop", value);
	}
	
	/**
	 * 是否自动播放
    */
	public Audio autoPlay(Object value) {
		return (Audio) this.set("autoPlay", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Audio staticClassName(Object value) {
		return (Audio) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Audio staticInputClassName(Object value) {
		return (Audio) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Audio staticSchema(Object value) {
		return (Audio) this.set("staticSchema", value);
	}
	
	/**
	 * 配置可选播放倍速
    */
	public Audio rates(Object value) {
		return (Audio) this.set("rates", value);
	}
	
	/**
	 * 是否禁用
    */
	public Audio disabled(Object value) {
		return (Audio) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Audio hidden(Object value) {
		return (Audio) this.set("hidden", value);
	}
	
	/**
	 * 组件样式
    */
	public Audio style(Object value) {
		return (Audio) this.set("style", value);
	}
	
	/**
	    */
	public Audio testIdBuilder(Object value) {
		return (Audio) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否是内联模式
    */
	public Audio inline(Object value) {
		return (Audio) this.set("inline", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Audio visibleOn(Object value) {
		return (Audio) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Audio static_(Object value) {
		return (Audio) this.set("static_", value);
	}
	
	/**
	 * 指定为音频播放器
    */
	public Audio type(Object value) {
		return (Audio) this.set("type", value);
	}
	
	/**
	    */
	public Audio testid(Object value) {
		return (Audio) this.set("testid", value);
	}
	
	/**
	 * "视频播放地址, 支持 $ 取变量。
    */
	public Audio src(Object value) {
		return (Audio) this.set("src", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Audio $$id(Object value) {
		return (Audio) this.set("$$id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Audio staticOn(Object value) {
		return (Audio) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Audio staticPlaceholder(Object value) {
		return (Audio) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Audio hiddenOn(Object value) {
		return (Audio) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Audio visible(Object value) {
		return (Audio) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Audio onEvent(Object value) {
		return (Audio) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Audio staticLabelClassName(Object value) {
		return (Audio) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Audio useMobileUI(Object value) {
		return (Audio) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Audio disabledOn(Object value) {
		return (Audio) this.set("disabledOn", value);
	}
	
	/**
	 * 可以配置控制器
    */
	public Audio controls(Object value) {
		return (Audio) this.set("controls", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Audio className(Object value) {
		return (Audio) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Audio id(Object value) {
		return (Audio) this.set("id", value);
	}
	}