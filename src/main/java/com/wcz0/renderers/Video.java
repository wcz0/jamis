package com.wcz0.renderers;
/**
 * 视频播放器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/video

 * @author wcz0
 * @version 6.2.2
 */
public class Video extends BaseRenderer {

	public Video() {
		this.set("type", "video");
	}

	public Video set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public Video disabled(Object value) {
		return (Video) this.set("disabled", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Video useMobileUI(Object value) {
		return (Video) this.set("useMobileUI", value);
	}
	
	/**
	 * 如果显示切帧，通过此配置项可以控制每行显示多少帧
    */
	public Video columnsCount(Object value) {
		return (Video) this.set("columnsCount", value);
	}
	
	/**
	 * 是否显示
    */
	public Video visible(Object value) {
		return (Video) this.set("visible", value);
	}
	
	/**
	 * 视频速率
    */
	public Video rates(Object value) {
		return (Video) this.set("rates", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Video static_(Object value) {
		return (Video) this.set("static_", value);
	}
	
	/**
	 * 指定为视频类型
    */
	public Video type(Object value) {
		return (Video) this.set("type", value);
	}
	
	/**
	 * 配置帧列表容器className
    */
	public Video framesClassName(Object value) {
		return (Video) this.set("framesClassName", value);
	}
	
	/**
	 * 视频封面地址
    */
	public Video poster(Object value) {
		return (Video) this.set("poster", value);
	}
	
	/**
	 * 是否将视频和封面分开显示
    */
	public Video splitPoster(Object value) {
		return (Video) this.set("splitPoster", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Video staticOn(Object value) {
		return (Video) this.set("staticOn", value);
	}
	
	/**
	 * 视频类型如： video/x-flv
    */
	public Video videoType(Object value) {
		return (Video) this.set("videoType", value);
	}
	
	/**
	 * 跳转到帧时，往前多少秒。
    */
	public Video jumpBufferDuration(Object value) {
		return (Video) this.set("jumpBufferDuration", value);
	}
	
	/**
	 * 组件样式
    */
	public Video style(Object value) {
		return (Video) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Video editorSetting(Object value) {
		return (Video) this.set("editorSetting", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Video hidden(Object value) {
		return (Video) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Video visibleOn(Object value) {
		return (Video) this.set("visibleOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Video onEvent(Object value) {
		return (Video) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Video staticPlaceholder(Object value) {
		return (Video) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Video staticClassName(Object value) {
		return (Video) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Video staticSchema(Object value) {
		return (Video) this.set("staticSchema", value);
	}
	
	/**
	 * 是否自动播放
    */
	public Video autoPlay(Object value) {
		return (Video) this.set("autoPlay", value);
	}
	
	/**
	 * 配置播放器 className
    */
	public Video playerClassName(Object value) {
		return (Video) this.set("playerClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Video disabledOn(Object value) {
		return (Video) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Video hiddenOn(Object value) {
		return (Video) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Video staticInputClassName(Object value) {
		return (Video) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否初始静音
    */
	public Video muted(Object value) {
		return (Video) this.set("muted", value);
	}
	
	/**
	 * 是否循环播放
    */
	public Video loop(Object value) {
		return (Video) this.set("loop", value);
	}
	
	/**
	 * 点击帧画面时是否跳转视频对应的点
    */
	public Video jumpFrame(Object value) {
		return (Video) this.set("jumpFrame", value);
	}
	
	/**
	 * 视频播放地址
    */
	public Video src(Object value) {
		return (Video) this.set("src", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Video className(Object value) {
		return (Video) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Video id(Object value) {
		return (Video) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Video staticLabelClassName(Object value) {
		return (Video) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 设置后，可以显示切帧.点击帧的时候会将视频跳到对应时间。frames: {  '01:22': 'http://domain/xxx.jpg' }
    */
	public Video frames(Object value) {
		return (Video) this.set("frames", value);
	}
	
	/**
	 * 如果是实时的，请标记一下
    */
	public Video isLive(Object value) {
		return (Video) this.set("isLive", value);
	}
	
	/**
	 * 视频比率
    * 可选值: auto | 4:3 | 16:9
    */
	public Video aspectRatio(Object value) {
		return (Video) this.set("aspectRatio", value);
	}
	
	/**
	 * 默认播放的时候到了下一帧会继续播放，同时高亮下一帧。 如果配置这个则会停止播放，等待用户选择新的区间再播放。
    */
	public Video stopOnNextFrame(Object value) {
		return (Video) this.set("stopOnNextFrame", value);
	}
	}