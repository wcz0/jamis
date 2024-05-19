package com.wcz0.renderers;
/**
 * Datetime日期时间选择控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/datetime

 * @author wcz0
 * @version 6.2.2
 */
public class DateTimeControl extends BaseRenderer {

	public DateTimeControl() {
		this.set("type", "dateTimeControl");
	}

	/**
	 * 描述标题
    */
	public DateTimeControl labelAlign(Object value) {
		return (DateTimeControl) this.set("labelAlign", value);
	}
	
	/**
	    */
	public DateTimeControl desc(Object value) {
		return (DateTimeControl) this.set("desc", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public DateTimeControl horizontal(Object value) {
		return (DateTimeControl) this.set("horizontal", value);
	}
	
	/**
	 * 占位符
    */
	public DateTimeControl placeholder(Object value) {
		return (DateTimeControl) this.set("placeholder", value);
	}
	
	/**
	    */
	public DateTimeControl validations(Object value) {
		return (DateTimeControl) this.set("validations", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public DateTimeControl autoFill(Object value) {
		return (DateTimeControl) this.set("autoFill", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DateTimeControl onEvent(Object value) {
		return (DateTimeControl) this.set("onEvent", value);
	}
	
	/**
	 * 限制最小日期
    */
	public DateTimeControl minDate(Object value) {
		return (DateTimeControl) this.set("minDate", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DateTimeControl hidden(Object value) {
		return (DateTimeControl) this.set("hidden", value);
	}
	
	/**
	 * 指定为日期时间选择控件
    */
	public DateTimeControl type(Object value) {
		return (DateTimeControl) this.set("type", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public DateTimeControl size(Object value) {
		return (DateTimeControl) this.set("size", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DateTimeControl useMobileUI(Object value) {
		return (DateTimeControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public DateTimeControl validateOnChange(Object value) {
		return (DateTimeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 配置 input className
    */
	public DateTimeControl inputClassName(Object value) {
		return (DateTimeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 替代format
    */
	public DateTimeControl valueFormat(Object value) {
		return (DateTimeControl) this.set("valueFormat", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DateTimeControl staticPlaceholder(Object value) {
		return (DateTimeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public DateTimeControl submitOnChange(Object value) {
		return (DateTimeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public DateTimeControl description(Object value) {
		return (DateTimeControl) this.set("description", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public DateTimeControl mode(Object value) {
		return (DateTimeControl) this.set("mode", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public DateTimeControl validateApi(Object value) {
		return (DateTimeControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public DateTimeControl clearable(Object value) {
		return (DateTimeControl) this.set("clearable", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public DateTimeControl displayFormat(Object value) {
		return (DateTimeControl) this.set("displayFormat", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DateTimeControl className(Object value) {
		return (DateTimeControl) this.set("className", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public DateTimeControl disabledDate(Object value) {
		return (DateTimeControl) this.set("disabledDate", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DateTimeControl staticClassName(Object value) {
		return (DateTimeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 时间的格式。
    */
	public DateTimeControl timeFormat(Object value) {
		return (DateTimeControl) this.set("timeFormat", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DateTimeControl static_(Object value) {
		return (DateTimeControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DateTimeControl staticLabelClassName(Object value) {
		return (DateTimeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public DateTimeControl staticSchema(Object value) {
		return (DateTimeControl) this.set("staticSchema", value);
	}
	
	/**
	    */
	public DateTimeControl testIdBuilder(Object value) {
		return (DateTimeControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否为结束时间，如果是，那么会自动加上 23:59:59
    */
	public DateTimeControl isEndDate(Object value) {
		return (DateTimeControl) this.set("isEndDate", value);
	}
	
	/**
	 * 是否禁用
    */
	public DateTimeControl disabled(Object value) {
		return (DateTimeControl) this.set("disabled", value);
	}
	
	/**
	 * 配置 label className
    */
	public DateTimeControl labelClassName(Object value) {
		return (DateTimeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public DateTimeControl labelRemark(Object value) {
		return (DateTimeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public DateTimeControl inline(Object value) {
		return (DateTimeControl) this.set("inline", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public DateTimeControl clearValueOnHidden(Object value) {
		return (DateTimeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public DateTimeControl utc(Object value) {
		return (DateTimeControl) this.set("utc", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DateTimeControl id(Object value) {
		return (DateTimeControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DateTimeControl editorSetting(Object value) {
		return (DateTimeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述标题
    */
	public DateTimeControl label(Object value) {
		return (DateTimeControl) this.set("label", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public DateTimeControl hint(Object value) {
		return (DateTimeControl) this.set("hint", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public DateTimeControl descriptionClassName(Object value) {
		return (DateTimeControl) this.set("descriptionClassName", value);
	}
	
	/**
	    */
	public DateTimeControl initAutoFill(Object value) {
		return (DateTimeControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public DateTimeControl emebed(Object value) {
		return (DateTimeControl) this.set("emebed", value);
	}
	
	/**
	 * 是否显示
    */
	public DateTimeControl visible(Object value) {
		return (DateTimeControl) this.set("visible", value);
	}
	
	/**
	 * 是否只读
    */
	public DateTimeControl readOnly(Object value) {
		return (DateTimeControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否为必填
    */
	public DateTimeControl required(Object value) {
		return (DateTimeControl) this.set("required", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public DateTimeControl borderMode(Object value) {
		return (DateTimeControl) this.set("borderMode", value);
	}
	
	/**
	 * 限制最大日期
    */
	public DateTimeControl maxDate(Object value) {
		return (DateTimeControl) this.set("maxDate", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DateTimeControl staticInputClassName(Object value) {
		return (DateTimeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public DateTimeControl remark(Object value) {
		return (DateTimeControl) this.set("remark", value);
	}
	
	/**
	 * 日期快捷键
    */
	public DateTimeControl shortcuts(Object value) {
		return (DateTimeControl) this.set("shortcuts", value);
	}
	
	/**
	 * 时间输入范围限制
    */
	public DateTimeControl timeConstraints(Object value) {
		return (DateTimeControl) this.set("timeConstraints", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DateTimeControl staticOn(Object value) {
		return (DateTimeControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DateTimeControl hiddenOn(Object value) {
		return (DateTimeControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件样式
    */
	public DateTimeControl style(Object value) {
		return (DateTimeControl) this.set("style", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public DateTimeControl name(Object value) {
		return (DateTimeControl) this.set("name", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public DateTimeControl extraName(Object value) {
		return (DateTimeControl) this.set("extraName", value);
	}
	
	/**
	 * 只读条件
    */
	public DateTimeControl readOnlyOn(Object value) {
		return (DateTimeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 日期存储格式
    */
	public DateTimeControl format(Object value) {
		return (DateTimeControl) this.set("format", value);
	}
	
	/**
	 * 日期展示格式
    */
	public DateTimeControl inputFormat(Object value) {
		return (DateTimeControl) this.set("inputFormat", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public DateTimeControl $$id(Object value) {
		return (DateTimeControl) this.set("$$id", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public DateTimeControl width(Object value) {
		return (DateTimeControl) this.set("width", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DateTimeControl visibleOn(Object value) {
		return (DateTimeControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DateTimeControl disabledOn(Object value) {
		return (DateTimeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public DateTimeControl validationErrors(Object value) {
		return (DateTimeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public DateTimeControl value(Object value) {
		return (DateTimeControl) this.set("value", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public DateTimeControl labelWidth(Object value) {
		return (DateTimeControl) this.set("labelWidth", value);
	}
	}