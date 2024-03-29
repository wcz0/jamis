package com.wcz0.renderers;
/**
 * 进度展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/progress

 * @author wcz0
 * @version 6.2.2
 */
public class Progress extends BaseRenderer {

	public Progress() {
		this.set("type", "progress");
	}

	public Progress set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 静态展示空值占位
    */
	public Progress staticPlaceholder(Object value) {
		return (Progress) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Progress staticInputClassName(Object value) {
		return (Progress) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Progress editorSetting(Object value) {
		return (Progress) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Progress type(Object value) {
		return (Progress) this.set("type", value);
	}
	
	/**
	 * 进度值
    */
	public Progress value(Object value) {
		return (Progress) this.set("value", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Progress className(Object value) {
		return (Progress) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public Progress visible(Object value) {
		return (Progress) this.set("visible", value);
	}
	
	/**
	 * 是否显示动画（只有在开启的时候才能看出来）
    */
	public Progress animate(Object value) {
		return (Progress) this.set("animate", value);
	}
	
	/**
	 * 进度条 CSS 类名
    */
	public Progress progressClassName(Object value) {
		return (Progress) this.set("progressClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Progress hiddenOn(Object value) {
		return (Progress) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Progress visibleOn(Object value) {
		return (Progress) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Progress static_(Object value) {
		return (Progress) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Progress staticLabelClassName(Object value) {
		return (Progress) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Progress staticSchema(Object value) {
		return (Progress) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Progress useMobileUI(Object value) {
		return (Progress) this.set("useMobileUI", value);
	}
	
	/**
	 * 关联字段名
    */
	public Progress name(Object value) {
		return (Progress) this.set("name", value);
	}
	
	/**
	 * 配置不同的值段，用不同的样式提示用户
    */
	public Progress map(Object value) {
		return (Progress) this.set("map", value);
	}
	
	/**
	 * 是否显示值
    */
	public Progress showLabel(Object value) {
		return (Progress) this.set("showLabel", value);
	}
	
	/**
	 * 占位符
    */
	public Progress placeholder(Object value) {
		return (Progress) this.set("placeholder", value);
	}
	
	/**
	 * 仪表盘进度条缺口角度，可取值 0 ~ 295
    */
	public Progress gapDegree(Object value) {
		return (Progress) this.set("gapDegree", value);
	}
	
	/**
	 * 是否禁用
    */
	public Progress disabled(Object value) {
		return (Progress) this.set("disabled", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Progress onEvent(Object value) {
		return (Progress) this.set("onEvent", value);
	}
	
	/**
	 * 是否显示背景间隔
    */
	public Progress stripe(Object value) {
		return (Progress) this.set("stripe", value);
	}
	
	/**
	 * 内容的模板函数
    */
	public Progress valueTpl(Object value) {
		return (Progress) this.set("valueTpl", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Progress id(Object value) {
		return (Progress) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Progress staticClassName(Object value) {
		return (Progress) this.set("staticClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Progress style(Object value) {
		return (Progress) this.set("style", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Progress staticOn(Object value) {
		return (Progress) this.set("staticOn", value);
	}
	
	/**
	 * 仪表盘进度条缺口位置
    * 可选值: top | bottom | left | right
    */
	public Progress gapPosition(Object value) {
		return (Progress) this.set("gapPosition", value);
	}
	
	/**
	 * 阈值
    */
	public Progress threshold(Object value) {
		return (Progress) this.set("threshold", value);
	}
	
	/**
	 * 是否显示阈值数值
    */
	public Progress showThresholdText(Object value) {
		return (Progress) this.set("showThresholdText", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Progress disabledOn(Object value) {
		return (Progress) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Progress hidden(Object value) {
		return (Progress) this.set("hidden", value);
	}
	
	/**
	 * 进度条类型
    * 可选值: line | circle | dashboard
    */
	public Progress mode(Object value) {
		return (Progress) this.set("mode", value);
	}
	
	/**
	 * 进度条线的宽度
    */
	public Progress strokeWidth(Object value) {
		return (Progress) this.set("strokeWidth", value);
	}
	}