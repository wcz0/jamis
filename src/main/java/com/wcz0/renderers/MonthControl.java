package com.wcz0.renderers;
/**
 * Month 月份选择控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/Month

 * @author wcz0
 * @version 6.2.2
 */
public class MonthControl extends BaseRenderer {

	public MonthControl() {
		this.set("type", "monthControl");
	}

	public MonthControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 事件动作配置
    */
	public MonthControl onEvent(Object value) {
		return (MonthControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public MonthControl staticInputClassName(Object value) {
		return (MonthControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public MonthControl label(Object value) {
		return (MonthControl) this.set("label", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public MonthControl submitOnChange(Object value) {
		return (MonthControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置 input className
    */
	public MonthControl inputClassName(Object value) {
		return (MonthControl) this.set("inputClassName", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public MonthControl staticClassName(Object value) {
		return (MonthControl) this.set("staticClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public MonthControl disabledOn(Object value) {
		return (MonthControl) this.set("disabledOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public MonthControl descriptionClassName(Object value) {
		return (MonthControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public MonthControl clearable(Object value) {
		return (MonthControl) this.set("clearable", value);
	}
	
	/**
	 * 日期快捷键
    */
	public MonthControl shortcuts(Object value) {
		return (MonthControl) this.set("shortcuts", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public MonthControl staticLabelClassName(Object value) {
		return (MonthControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public MonthControl name(Object value) {
		return (MonthControl) this.set("name", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public MonthControl remark(Object value) {
		return (MonthControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public MonthControl labelRemark(Object value) {
		return (MonthControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否显示
    */
	public MonthControl visible(Object value) {
		return (MonthControl) this.set("visible", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public MonthControl width(Object value) {
		return (MonthControl) this.set("width", value);
	}
	
	/**
	 * 是否静态展示
    */
	public MonthControl static_(Object value) {
		return (MonthControl) this.set("static_", value);
	}
	
	/**
	 * 是否隐藏
    */
	public MonthControl hidden(Object value) {
		return (MonthControl) this.set("hidden", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public MonthControl labelWidth(Object value) {
		return (MonthControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public MonthControl extraName(Object value) {
		return (MonthControl) this.set("extraName", value);
	}
	
	/**
	    */
	public MonthControl desc(Object value) {
		return (MonthControl) this.set("desc", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public MonthControl mode(Object value) {
		return (MonthControl) this.set("mode", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public MonthControl visibleOn(Object value) {
		return (MonthControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public MonthControl staticSchema(Object value) {
		return (MonthControl) this.set("staticSchema", value);
	}
	
	/**
	 * 组件样式
    */
	public MonthControl style(Object value) {
		return (MonthControl) this.set("style", value);
	}
	
	/**
	 * 是否为必填
    */
	public MonthControl required(Object value) {
		return (MonthControl) this.set("required", value);
	}
	
	/**
	 * 指定为月份时间选择控件
    */
	public MonthControl type(Object value) {
		return (MonthControl) this.set("type", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public MonthControl hiddenOn(Object value) {
		return (MonthControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 配置 label className
    */
	public MonthControl labelClassName(Object value) {
		return (MonthControl) this.set("labelClassName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public MonthControl validateOnChange(Object value) {
		return (MonthControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public MonthControl staticOn(Object value) {
		return (MonthControl) this.set("staticOn", value);
	}
	
	/**
	 * 替代format
    */
	public MonthControl valueFormat(Object value) {
		return (MonthControl) this.set("valueFormat", value);
	}
	
	/**
	 * 日期展示格式(新：替代inputFormat)
    */
	public MonthControl displayFormat(Object value) {
		return (MonthControl) this.set("displayFormat", value);
	}
	
	/**
	 * 是否为内联模式？
    */
	public MonthControl emebed(Object value) {
		return (MonthControl) this.set("emebed", value);
	}
	
	/**
	 * 字符串函数，用来决定是否禁用某个日期。(currentDate: moment.Moment, props: any) => boolean;
    */
	public MonthControl disabledDate(Object value) {
		return (MonthControl) this.set("disabledDate", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public MonthControl validateApi(Object value) {
		return (MonthControl) this.set("validateApi", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public MonthControl description(Object value) {
		return (MonthControl) this.set("description", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public MonthControl horizontal(Object value) {
		return (MonthControl) this.set("horizontal", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public MonthControl value(Object value) {
		return (MonthControl) this.set("value", value);
	}
	
	/**
	 * 设定是否存储 utc 时间。
    */
	public MonthControl utc(Object value) {
		return (MonthControl) this.set("utc", value);
	}
	
	/**
	 * 描述标题
    */
	public MonthControl labelAlign(Object value) {
		return (MonthControl) this.set("labelAlign", value);
	}
	
	/**
	    */
	public MonthControl validations(Object value) {
		return (MonthControl) this.set("validations", value);
	}
	
	/**
	 * 月份展示格式
    */
	public MonthControl inputFormat(Object value) {
		return (MonthControl) this.set("inputFormat", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public MonthControl className(Object value) {
		return (MonthControl) this.set("className", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public MonthControl useMobileUI(Object value) {
		return (MonthControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public MonthControl size(Object value) {
		return (MonthControl) this.set("size", value);
	}
	
	/**
	 * 是否禁用
    */
	public MonthControl disabled(Object value) {
		return (MonthControl) this.set("disabled", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public MonthControl inline(Object value) {
		return (MonthControl) this.set("inline", value);
	}
	
	/**
	 * 是否只读
    */
	public MonthControl readOnly(Object value) {
		return (MonthControl) this.set("readOnly", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public MonthControl editorSetting(Object value) {
		return (MonthControl) this.set("editorSetting", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public MonthControl hint(Object value) {
		return (MonthControl) this.set("hint", value);
	}
	
	/**
	 * 只读条件
    */
	public MonthControl readOnlyOn(Object value) {
		return (MonthControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 占位符
    */
	public MonthControl placeholder(Object value) {
		return (MonthControl) this.set("placeholder", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public MonthControl clearValueOnHidden(Object value) {
		return (MonthControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public MonthControl staticPlaceholder(Object value) {
		return (MonthControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public MonthControl validationErrors(Object value) {
		return (MonthControl) this.set("validationErrors", value);
	}
	
	/**
	 * 月份存储格式
    */
	public MonthControl format(Object value) {
		return (MonthControl) this.set("format", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public MonthControl borderMode(Object value) {
		return (MonthControl) this.set("borderMode", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public MonthControl id(Object value) {
		return (MonthControl) this.set("id", value);
	}
	}