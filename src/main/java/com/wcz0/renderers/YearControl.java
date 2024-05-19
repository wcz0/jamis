package com.wcz0.renderers;
/**
 * 年份选择控件

 * @author wcz0
 * @version 6.2.2
 */
public class YearControl extends BaseRenderer {

	public YearControl() {
		this.set("type", "yearControl");
	}

	/**
	 * 描述标题
    */
	public YearControl labelAlign(Object value) {
		return (YearControl) this.set("labelAlign", value);
	}
	
	/**
	 * 替代format
    */
	public YearControl valueFormat(Object value) {
		return (YearControl) this.set("valueFormat", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public YearControl $$id(Object value) {
		return (YearControl) this.set("$$id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public YearControl onEvent(Object value) {
		return (YearControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public YearControl static_(Object value) {
		return (YearControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public YearControl staticPlaceholder(Object value) {
		return (YearControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public YearControl staticInputClassName(Object value) {
		return (YearControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public YearControl style(Object value) {
		return (YearControl) this.set("style", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public YearControl displayFormat(Object value) {
		return (YearControl) this.set("displayFormat", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public YearControl utc(Object value) {
		return (YearControl) this.set("utc", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public YearControl staticLabelClassName(Object value) {
		return (YearControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public YearControl mode(Object value) {
		return (YearControl) this.set("mode", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public YearControl validateApi(Object value) {
		return (YearControl) this.set("validateApi", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public YearControl borderMode(Object value) {
		return (YearControl) this.set("borderMode", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public YearControl disabledDate(Object value) {
		return (YearControl) this.set("disabledDate", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public YearControl width(Object value) {
		return (YearControl) this.set("width", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public YearControl description(Object value) {
		return (YearControl) this.set("description", value);
	}
	
	/**
	 * 是否隐藏
    */
	public YearControl hidden(Object value) {
		return (YearControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public YearControl staticClassName(Object value) {
		return (YearControl) this.set("staticClassName", value);
	}
	
	/**
	 * 是否只读
    */
	public YearControl readOnly(Object value) {
		return (YearControl) this.set("readOnly", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public YearControl value(Object value) {
		return (YearControl) this.set("value", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public YearControl clearable(Object value) {
		return (YearControl) this.set("clearable", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public YearControl visibleOn(Object value) {
		return (YearControl) this.set("visibleOn", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public YearControl hint(Object value) {
		return (YearControl) this.set("hint", value);
	}
	
	/**
	    */
	public YearControl initAutoFill(Object value) {
		return (YearControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public YearControl useMobileUI(Object value) {
		return (YearControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用
    */
	public YearControl disabled(Object value) {
		return (YearControl) this.set("disabled", value);
	}
	
	/**
	    */
	public YearControl testIdBuilder(Object value) {
		return (YearControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public YearControl inline(Object value) {
		return (YearControl) this.set("inline", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public YearControl disabledOn(Object value) {
		return (YearControl) this.set("disabledOn", value);
	}
	
	/**
	 * 描述标题
    */
	public YearControl label(Object value) {
		return (YearControl) this.set("label", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public YearControl name(Object value) {
		return (YearControl) this.set("name", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public YearControl remark(Object value) {
		return (YearControl) this.set("remark", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public YearControl clearValueOnHidden(Object value) {
		return (YearControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public YearControl autoFill(Object value) {
		return (YearControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否显示
    */
	public YearControl visible(Object value) {
		return (YearControl) this.set("visible", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public YearControl labelRemark(Object value) {
		return (YearControl) this.set("labelRemark", value);
	}
	
	/**
	 * 配置 label className
    */
	public YearControl labelClassName(Object value) {
		return (YearControl) this.set("labelClassName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public YearControl validateOnChange(Object value) {
		return (YearControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public YearControl required(Object value) {
		return (YearControl) this.set("required", value);
	}
	
	/**
	 * 月份展示格式
    */
	public YearControl inputFormat(Object value) {
		return (YearControl) this.set("inputFormat", value);
	}
	
	/**
	    */
	public YearControl validations(Object value) {
		return (YearControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public YearControl hiddenOn(Object value) {
		return (YearControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public YearControl staticSchema(Object value) {
		return (YearControl) this.set("staticSchema", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public YearControl size(Object value) {
		return (YearControl) this.set("size", value);
	}
	
	/**
	 * 配置 input className
    */
	public YearControl inputClassName(Object value) {
		return (YearControl) this.set("inputClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public YearControl validationErrors(Object value) {
		return (YearControl) this.set("validationErrors", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public YearControl extraName(Object value) {
		return (YearControl) this.set("extraName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public YearControl horizontal(Object value) {
		return (YearControl) this.set("horizontal", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public YearControl descriptionClassName(Object value) {
		return (YearControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 占位符
    */
	public YearControl placeholder(Object value) {
		return (YearControl) this.set("placeholder", value);
	}
	
	/**
	 * 月份存储格式
    */
	public YearControl format(Object value) {
		return (YearControl) this.set("format", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public YearControl className(Object value) {
		return (YearControl) this.set("className", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public YearControl editorSetting(Object value) {
		return (YearControl) this.set("editorSetting", value);
	}
	
	/**
	 * 日期快捷键
    */
	public YearControl shortcuts(Object value) {
		return (YearControl) this.set("shortcuts", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public YearControl id(Object value) {
		return (YearControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public YearControl staticOn(Object value) {
		return (YearControl) this.set("staticOn", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public YearControl labelWidth(Object value) {
		return (YearControl) this.set("labelWidth", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public YearControl submitOnChange(Object value) {
		return (YearControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 只读条件
    */
	public YearControl readOnlyOn(Object value) {
		return (YearControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public YearControl desc(Object value) {
		return (YearControl) this.set("desc", value);
	}
	
	/**
	 * 指定为月份时间选择控件
    */
	public YearControl type(Object value) {
		return (YearControl) this.set("type", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public YearControl emebed(Object value) {
		return (YearControl) this.set("emebed", value);
	}
	}