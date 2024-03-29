package com.wcz0.renderers;
/**
 * 季度选择控件

 * @author wcz0
 * @version 6.2.2
 */
public class QuarterControl extends BaseRenderer {

	public QuarterControl() {
		this.set("type", "quarterControl");
	}

	public QuarterControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public QuarterControl useMobileUI(Object value) {
		return (QuarterControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 配置 label className
    */
	public QuarterControl labelClassName(Object value) {
		return (QuarterControl) this.set("labelClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public QuarterControl name(Object value) {
		return (QuarterControl) this.set("name", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public QuarterControl className(Object value) {
		return (QuarterControl) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public QuarterControl visibleOn(Object value) {
		return (QuarterControl) this.set("visibleOn", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public QuarterControl utc(Object value) {
		return (QuarterControl) this.set("utc", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public QuarterControl id(Object value) {
		return (QuarterControl) this.set("id", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public QuarterControl description(Object value) {
		return (QuarterControl) this.set("description", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public QuarterControl value(Object value) {
		return (QuarterControl) this.set("value", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public QuarterControl clearValueOnHidden(Object value) {
		return (QuarterControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 日期快捷键
    */
	public QuarterControl shortcuts(Object value) {
		return (QuarterControl) this.set("shortcuts", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public QuarterControl staticOn(Object value) {
		return (QuarterControl) this.set("staticOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public QuarterControl descriptionClassName(Object value) {
		return (QuarterControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public QuarterControl horizontal(Object value) {
		return (QuarterControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否隐藏
    */
	public QuarterControl hidden(Object value) {
		return (QuarterControl) this.set("hidden", value);
	}
	
	/**
	 * 描述标题
    */
	public QuarterControl label(Object value) {
		return (QuarterControl) this.set("label", value);
	}
	
	/**
	 * 描述标题
    */
	public QuarterControl labelAlign(Object value) {
		return (QuarterControl) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public QuarterControl labelWidth(Object value) {
		return (QuarterControl) this.set("labelWidth", value);
	}
	
	/**
	 * 指定为月份时间选择控件
    */
	public QuarterControl type(Object value) {
		return (QuarterControl) this.set("type", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public QuarterControl disabledDate(Object value) {
		return (QuarterControl) this.set("disabledDate", value);
	}
	
	/**
	 * 月份存储格式
    */
	public QuarterControl format(Object value) {
		return (QuarterControl) this.set("format", value);
	}
	
	/**
	 * 月份展示格式
    */
	public QuarterControl inputFormat(Object value) {
		return (QuarterControl) this.set("inputFormat", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public QuarterControl disabledOn(Object value) {
		return (QuarterControl) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public QuarterControl editorSetting(Object value) {
		return (QuarterControl) this.set("editorSetting", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public QuarterControl extraName(Object value) {
		return (QuarterControl) this.set("extraName", value);
	}
	
	/**
	 * 配置 input className
    */
	public QuarterControl inputClassName(Object value) {
		return (QuarterControl) this.set("inputClassName", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public QuarterControl displayFormat(Object value) {
		return (QuarterControl) this.set("displayFormat", value);
	}
	
	/**
	 * 是否禁用
    */
	public QuarterControl disabled(Object value) {
		return (QuarterControl) this.set("disabled", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public QuarterControl size(Object value) {
		return (QuarterControl) this.set("size", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public QuarterControl remark(Object value) {
		return (QuarterControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public QuarterControl labelRemark(Object value) {
		return (QuarterControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public QuarterControl inline(Object value) {
		return (QuarterControl) this.set("inline", value);
	}
	
	/**
	    */
	public QuarterControl validations(Object value) {
		return (QuarterControl) this.set("validations", value);
	}
	
	/**
	 * 替代format
    */
	public QuarterControl valueFormat(Object value) {
		return (QuarterControl) this.set("valueFormat", value);
	}
	
	/**
	 * 事件动作配置
    */
	public QuarterControl onEvent(Object value) {
		return (QuarterControl) this.set("onEvent", value);
	}
	
	/**
	    */
	public QuarterControl staticSchema(Object value) {
		return (QuarterControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否只读
    */
	public QuarterControl readOnly(Object value) {
		return (QuarterControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否静态展示
    */
	public QuarterControl static_(Object value) {
		return (QuarterControl) this.set("static_", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public QuarterControl validateOnChange(Object value) {
		return (QuarterControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public QuarterControl mode(Object value) {
		return (QuarterControl) this.set("mode", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public QuarterControl emebed(Object value) {
		return (QuarterControl) this.set("emebed", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public QuarterControl staticLabelClassName(Object value) {
		return (QuarterControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 只读条件
    */
	public QuarterControl readOnlyOn(Object value) {
		return (QuarterControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public QuarterControl desc(Object value) {
		return (QuarterControl) this.set("desc", value);
	}
	
	/**
	 * 是否为必填
    */
	public QuarterControl required(Object value) {
		return (QuarterControl) this.set("required", value);
	}
	
	/**
	 * 是否显示
    */
	public QuarterControl visible(Object value) {
		return (QuarterControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public QuarterControl staticPlaceholder(Object value) {
		return (QuarterControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public QuarterControl style(Object value) {
		return (QuarterControl) this.set("style", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public QuarterControl validateApi(Object value) {
		return (QuarterControl) this.set("validateApi", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public QuarterControl borderMode(Object value) {
		return (QuarterControl) this.set("borderMode", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public QuarterControl hint(Object value) {
		return (QuarterControl) this.set("hint", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public QuarterControl staticInputClassName(Object value) {
		return (QuarterControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public QuarterControl submitOnChange(Object value) {
		return (QuarterControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 占位符
    */
	public QuarterControl placeholder(Object value) {
		return (QuarterControl) this.set("placeholder", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public QuarterControl validationErrors(Object value) {
		return (QuarterControl) this.set("validationErrors", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public QuarterControl staticClassName(Object value) {
		return (QuarterControl) this.set("staticClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public QuarterControl hiddenOn(Object value) {
		return (QuarterControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public QuarterControl clearable(Object value) {
		return (QuarterControl) this.set("clearable", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public QuarterControl width(Object value) {
		return (QuarterControl) this.set("width", value);
	}
	}