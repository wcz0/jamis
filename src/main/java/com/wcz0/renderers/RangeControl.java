package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class RangeControl extends BaseRenderer {

	public RangeControl() {
		this.set("type", "rangeControl");
	}

	public RangeControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public RangeControl desc(Object value) {
		return (RangeControl) this.set("desc", value);
	}
	
	/**
	 * 是否为必填
    */
	public RangeControl required(Object value) {
		return (RangeControl) this.set("required", value);
	}
	
	/**
	 * 单位
    */
	public RangeControl unit(Object value) {
		return (RangeControl) this.set("unit", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RangeControl hiddenOn(Object value) {
		return (RangeControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RangeControl id(Object value) {
		return (RangeControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RangeControl staticClassName(Object value) {
		return (RangeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RangeControl staticLabelClassName(Object value) {
		return (RangeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RangeControl disabledOn(Object value) {
		return (RangeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 描述标题
    */
	public RangeControl label(Object value) {
		return (RangeControl) this.set("label", value);
	}
	
	/**
	 * 描述标题
    */
	public RangeControl labelAlign(Object value) {
		return (RangeControl) this.set("labelAlign", value);
	}
	
	/**
	 * 步长
    */
	public RangeControl step(Object value) {
		return (RangeControl) this.set("step", value);
	}
	
	/**
	 * 分隔符
    */
	public RangeControl delimiter(Object value) {
		return (RangeControl) this.set("delimiter", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RangeControl editorSetting(Object value) {
		return (RangeControl) this.set("editorSetting", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RangeControl labelWidth(Object value) {
		return (RangeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RangeControl labelRemark(Object value) {
		return (RangeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单项类型
    */
	public RangeControl type(Object value) {
		return (RangeControl) this.set("type", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RangeControl className(Object value) {
		return (RangeControl) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RangeControl hidden(Object value) {
		return (RangeControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RangeControl visibleOn(Object value) {
		return (RangeControl) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RangeControl useMobileUI(Object value) {
		return (RangeControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RangeControl extraName(Object value) {
		return (RangeControl) this.set("extraName", value);
	}
	
	/**
	 * 最大值
    */
	public RangeControl max(Object value) {
		return (RangeControl) this.set("max", value);
	}
	
	/**
	 * 是否只读
    */
	public RangeControl readOnly(Object value) {
		return (RangeControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public RangeControl validations(Object value) {
		return (RangeControl) this.set("validations", value);
	}
	
	/**
	 * 输入框是否可清除
    */
	public RangeControl clearable(Object value) {
		return (RangeControl) this.set("clearable", value);
	}
	
	/**
	 * 是否显示
    */
	public RangeControl visible(Object value) {
		return (RangeControl) this.set("visible", value);
	}
	
	/**
	 * 配置 input className
    */
	public RangeControl inputClassName(Object value) {
		return (RangeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否展示标签
    */
	public RangeControl tooltipVisible(Object value) {
		return (RangeControl) this.set("tooltipVisible", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RangeControl validateOnChange(Object value) {
		return (RangeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RangeControl name(Object value) {
		return (RangeControl) this.set("name", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RangeControl size(Object value) {
		return (RangeControl) this.set("size", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RangeControl hint(Object value) {
		return (RangeControl) this.set("hint", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public RangeControl description(Object value) {
		return (RangeControl) this.set("description", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RangeControl mode(Object value) {
		return (RangeControl) this.set("mode", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RangeControl clearValueOnHidden(Object value) {
		return (RangeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RangeControl validateApi(Object value) {
		return (RangeControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否展示输入框
    */
	public RangeControl showInput(Object value) {
		return (RangeControl) this.set("showInput", value);
	}
	
	/**
	    */
	public RangeControl staticSchema(Object value) {
		return (RangeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RangeControl width(Object value) {
		return (RangeControl) this.set("width", value);
	}
	
	/**
	 * 滑块值
    */
	public RangeControl value(Object value) {
		return (RangeControl) this.set("value", value);
	}
	
	/**
	 * 刻度
    */
	public RangeControl marks(Object value) {
		return (RangeControl) this.set("marks", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RangeControl staticInputClassName(Object value) {
		return (RangeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 最小值
    */
	public RangeControl min(Object value) {
		return (RangeControl) this.set("min", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RangeControl remark(Object value) {
		return (RangeControl) this.set("remark", value);
	}
	
	/**
	 * 是否展示步长
    */
	public RangeControl showSteps(Object value) {
		return (RangeControl) this.set("showSteps", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RangeControl staticPlaceholder(Object value) {
		return (RangeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public RangeControl staticOn(Object value) {
		return (RangeControl) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public RangeControl style(Object value) {
		return (RangeControl) this.set("style", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RangeControl horizontal(Object value) {
		return (RangeControl) this.set("horizontal", value);
	}
	
	/**
	 * 占位符
    */
	public RangeControl placeholder(Object value) {
		return (RangeControl) this.set("placeholder", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RangeControl validationErrors(Object value) {
		return (RangeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否禁用
    */
	public RangeControl disabled(Object value) {
		return (RangeControl) this.set("disabled", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RangeControl inline(Object value) {
		return (RangeControl) this.set("inline", value);
	}
	
	/**
	 * 是否为双滑块
    */
	public RangeControl multiple(Object value) {
		return (RangeControl) this.set("multiple", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RangeControl submitOnChange(Object value) {
		return (RangeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否静态展示
    */
	public RangeControl static_(Object value) {
		return (RangeControl) this.set("static_", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RangeControl descriptionClassName(Object value) {
		return (RangeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 标签方向
    */
	public RangeControl tooltipPlacement(Object value) {
		return (RangeControl) this.set("tooltipPlacement", value);
	}
	
	/**
	 * 是否通过分隔符连接
    */
	public RangeControl joinValues(Object value) {
		return (RangeControl) this.set("joinValues", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RangeControl onEvent(Object value) {
		return (RangeControl) this.set("onEvent", value);
	}
	
	/**
	 * 只读条件
    */
	public RangeControl readOnlyOn(Object value) {
		return (RangeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 分割块数
    */
	public RangeControl parts(Object value) {
		return (RangeControl) this.set("parts", value);
	}
	
	/**
	 * 配置 label className
    */
	public RangeControl labelClassName(Object value) {
		return (RangeControl) this.set("labelClassName", value);
	}
	}