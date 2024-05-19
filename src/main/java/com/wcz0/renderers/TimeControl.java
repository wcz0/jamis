package com.wcz0.renderers;
/**
 * Time 时间选择控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/time

 * @author wcz0
 * @version 6.2.2
 */
public class TimeControl extends BaseRenderer {

	public TimeControl() {
		this.set("type", "timeControl");
	}

	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TimeControl size(Object value) {
		return (TimeControl) this.set("size", value);
	}
	
	/**
	 * 是否只读
    */
	public TimeControl readOnly(Object value) {
		return (TimeControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public TimeControl validations(Object value) {
		return (TimeControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TimeControl validateApi(Object value) {
		return (TimeControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TimeControl visibleOn(Object value) {
		return (TimeControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述标题
    */
	public TimeControl label(Object value) {
		return (TimeControl) this.set("label", value);
	}
	
	/**
	 * 描述标题
    */
	public TimeControl labelAlign(Object value) {
		return (TimeControl) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TimeControl labelWidth(Object value) {
		return (TimeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TimeControl extraName(Object value) {
		return (TimeControl) this.set("extraName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TimeControl hint(Object value) {
		return (TimeControl) this.set("hint", value);
	}
	
	/**
	    */
	public TimeControl initAutoFill(Object value) {
		return (TimeControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否显示
    */
	public TimeControl visible(Object value) {
		return (TimeControl) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TimeControl onEvent(Object value) {
		return (TimeControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public TimeControl clearable(Object value) {
		return (TimeControl) this.set("clearable", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public TimeControl utc(Object value) {
		return (TimeControl) this.set("utc", value);
	}
	
	/**
	 * 时间输入范围限制
    */
	public TimeControl timeConstraints(Object value) {
		return (TimeControl) this.set("timeConstraints", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TimeControl hidden(Object value) {
		return (TimeControl) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TimeControl id(Object value) {
		return (TimeControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TimeControl editorSetting(Object value) {
		return (TimeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TimeControl descriptionClassName(Object value) {
		return (TimeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public TimeControl displayFormat(Object value) {
		return (TimeControl) this.set("displayFormat", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TimeControl width(Object value) {
		return (TimeControl) this.set("width", value);
	}
	
	/**
	    */
	public TimeControl staticSchema(Object value) {
		return (TimeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TimeControl useMobileUI(Object value) {
		return (TimeControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TimeControl validateOnChange(Object value) {
		return (TimeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TimeControl mode(Object value) {
		return (TimeControl) this.set("mode", value);
	}
	
	/**
	 * 占位符
    */
	public TimeControl placeholder(Object value) {
		return (TimeControl) this.set("placeholder", value);
	}
	
	/**
	 * 指定为日期时间选择控件
    */
	public TimeControl type(Object value) {
		return (TimeControl) this.set("type", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TimeControl staticPlaceholder(Object value) {
		return (TimeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TimeControl submitOnChange(Object value) {
		return (TimeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TimeControl horizontal(Object value) {
		return (TimeControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public TimeControl emebed(Object value) {
		return (TimeControl) this.set("emebed", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public TimeControl borderMode(Object value) {
		return (TimeControl) this.set("borderMode", value);
	}
	
	/**
	    */
	public TimeControl testIdBuilder(Object value) {
		return (TimeControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TimeControl disabledOn(Object value) {
		return (TimeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TimeControl name(Object value) {
		return (TimeControl) this.set("name", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TimeControl clearValueOnHidden(Object value) {
		return (TimeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否禁用
    */
	public TimeControl disabled(Object value) {
		return (TimeControl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TimeControl staticClassName(Object value) {
		return (TimeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TimeControl staticLabelClassName(Object value) {
		return (TimeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public TimeControl style(Object value) {
		return (TimeControl) this.set("style", value);
	}
	
	/**
	 * 只读条件
    */
	public TimeControl readOnlyOn(Object value) {
		return (TimeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TimeControl description(Object value) {
		return (TimeControl) this.set("description", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TimeControl validationErrors(Object value) {
		return (TimeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TimeControl staticOn(Object value) {
		return (TimeControl) this.set("staticOn", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TimeControl inline(Object value) {
		return (TimeControl) this.set("inline", value);
	}
	
	/**
	 * 配置 input className
    */
	public TimeControl inputClassName(Object value) {
		return (TimeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TimeControl autoFill(Object value) {
		return (TimeControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TimeControl static_(Object value) {
		return (TimeControl) this.set("static_", value);
	}
	
	/**
	 * 配置 label className
    */
	public TimeControl labelClassName(Object value) {
		return (TimeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 日期快捷键
    */
	public TimeControl shortcuts(Object value) {
		return (TimeControl) this.set("shortcuts", value);
	}
	
	/**
	 * 时间的格式。
    */
	public TimeControl timeFormat(Object value) {
		return (TimeControl) this.set("timeFormat", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TimeControl hiddenOn(Object value) {
		return (TimeControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public TimeControl desc(Object value) {
		return (TimeControl) this.set("desc", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TimeControl value(Object value) {
		return (TimeControl) this.set("value", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public TimeControl disabledDate(Object value) {
		return (TimeControl) this.set("disabledDate", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TimeControl $$id(Object value) {
		return (TimeControl) this.set("$$id", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TimeControl className(Object value) {
		return (TimeControl) this.set("className", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TimeControl remark(Object value) {
		return (TimeControl) this.set("remark", value);
	}
	
	/**
	 * 是否为必填
    */
	public TimeControl required(Object value) {
		return (TimeControl) this.set("required", value);
	}
	
	/**
	 * 替代format
    */
	public TimeControl valueFormat(Object value) {
		return (TimeControl) this.set("valueFormat", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TimeControl staticInputClassName(Object value) {
		return (TimeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TimeControl labelRemark(Object value) {
		return (TimeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 日期存储格式
    */
	public TimeControl format(Object value) {
		return (TimeControl) this.set("format", value);
	}
	
	/**
	 * 日期展示格式
    */
	public TimeControl inputFormat(Object value) {
		return (TimeControl) this.set("inputFormat", value);
	}
	}