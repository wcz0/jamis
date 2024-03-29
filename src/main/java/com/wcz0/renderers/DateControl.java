package com.wcz0.renderers;
/**
 * Date日期选择控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/date

 * @author wcz0
 * @version 6.2.2
 */
public class DateControl extends BaseRenderer {

	public DateControl() {
		this.set("type", "dateControl");
	}

	public DateControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏表达式
    */
	public DateControl hiddenOn(Object value) {
		return (DateControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public DateControl name(Object value) {
		return (DateControl) this.set("name", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public DateControl descriptionClassName(Object value) {
		return (DateControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public DateControl horizontal(Object value) {
		return (DateControl) this.set("horizontal", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public DateControl inline(Object value) {
		return (DateControl) this.set("inline", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DateControl visibleOn(Object value) {
		return (DateControl) this.set("visibleOn", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public DateControl width(Object value) {
		return (DateControl) this.set("width", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public DateControl size(Object value) {
		return (DateControl) this.set("size", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public DateControl labelRemark(Object value) {
		return (DateControl) this.set("labelRemark", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public DateControl hint(Object value) {
		return (DateControl) this.set("hint", value);
	}
	
	/**
	 * 日期展示格式
    */
	public DateControl inputFormat(Object value) {
		return (DateControl) this.set("inputFormat", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public DateControl displayFormat(Object value) {
		return (DateControl) this.set("displayFormat", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DateControl staticLabelClassName(Object value) {
		return (DateControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public DateControl extraName(Object value) {
		return (DateControl) this.set("extraName", value);
	}
	
	/**
	 * 点选日期后是否关闭弹窗
    */
	public DateControl closeOnSelect(Object value) {
		return (DateControl) this.set("closeOnSelect", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DateControl hidden(Object value) {
		return (DateControl) this.set("hidden", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public DateControl submitOnChange(Object value) {
		return (DateControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public DateControl description(Object value) {
		return (DateControl) this.set("description", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public DateControl mode(Object value) {
		return (DateControl) this.set("mode", value);
	}
	
	/**
	 * 限制最大日期
    */
	public DateControl maxDate(Object value) {
		return (DateControl) this.set("maxDate", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DateControl useMobileUI(Object value) {
		return (DateControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public DateControl utc(Object value) {
		return (DateControl) this.set("utc", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DateControl editorSetting(Object value) {
		return (DateControl) this.set("editorSetting", value);
	}
	
	/**
	 * 是否只读
    */
	public DateControl readOnly(Object value) {
		return (DateControl) this.set("readOnly", value);
	}
	
	/**
	 * 只读条件
    */
	public DateControl readOnlyOn(Object value) {
		return (DateControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public DateControl desc(Object value) {
		return (DateControl) this.set("desc", value);
	}
	
	/**
	 * 日期快捷键
    */
	public DateControl shortcuts(Object value) {
		return (DateControl) this.set("shortcuts", value);
	}
	
	/**
	 * 组件样式
    */
	public DateControl style(Object value) {
		return (DateControl) this.set("style", value);
	}
	
	/**
	 * 描述标题
    */
	public DateControl label(Object value) {
		return (DateControl) this.set("label", value);
	}
	
	/**
	 * 日期存储格式
    */
	public DateControl format(Object value) {
		return (DateControl) this.set("format", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public DateControl borderMode(Object value) {
		return (DateControl) this.set("borderMode", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DateControl staticOn(Object value) {
		return (DateControl) this.set("staticOn", value);
	}
	
	/**
	 * 配置 label className
    */
	public DateControl labelClassName(Object value) {
		return (DateControl) this.set("labelClassName", value);
	}
	
	/**
	 * 替代format
    */
	public DateControl valueFormat(Object value) {
		return (DateControl) this.set("valueFormat", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DateControl className(Object value) {
		return (DateControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public DateControl disabled(Object value) {
		return (DateControl) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DateControl id(Object value) {
		return (DateControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DateControl staticClassName(Object value) {
		return (DateControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DateControl staticInputClassName(Object value) {
		return (DateControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 配置 input className
    */
	public DateControl inputClassName(Object value) {
		return (DateControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DateControl disabledOn(Object value) {
		return (DateControl) this.set("disabledOn", value);
	}
	
	/**
	    */
	public DateControl staticSchema(Object value) {
		return (DateControl) this.set("staticSchema", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public DateControl labelWidth(Object value) {
		return (DateControl) this.set("labelWidth", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public DateControl validateOnChange(Object value) {
		return (DateControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public DateControl required(Object value) {
		return (DateControl) this.set("required", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public DateControl disabledDate(Object value) {
		return (DateControl) this.set("disabledDate", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DateControl static_(Object value) {
		return (DateControl) this.set("static_", value);
	}
	
	/**
	    */
	public DateControl validations(Object value) {
		return (DateControl) this.set("validations", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public DateControl clearValueOnHidden(Object value) {
		return (DateControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public DateControl validateApi(Object value) {
		return (DateControl) this.set("validateApi", value);
	}
	
	/**
	 * 指定为日期选择控件
    */
	public DateControl type(Object value) {
		return (DateControl) this.set("type", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public DateControl clearable(Object value) {
		return (DateControl) this.set("clearable", value);
	}
	
	/**
	 * 限制最小日期
    */
	public DateControl minDate(Object value) {
		return (DateControl) this.set("minDate", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DateControl onEvent(Object value) {
		return (DateControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DateControl staticPlaceholder(Object value) {
		return (DateControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 占位符
    */
	public DateControl placeholder(Object value) {
		return (DateControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public DateControl emebed(Object value) {
		return (DateControl) this.set("emebed", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public DateControl remark(Object value) {
		return (DateControl) this.set("remark", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public DateControl value(Object value) {
		return (DateControl) this.set("value", value);
	}
	
	/**
	 * 是否显示
    */
	public DateControl visible(Object value) {
		return (DateControl) this.set("visible", value);
	}
	
	/**
	 * 描述标题
    */
	public DateControl labelAlign(Object value) {
		return (DateControl) this.set("labelAlign", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public DateControl validationErrors(Object value) {
		return (DateControl) this.set("validationErrors", value);
	}
	}