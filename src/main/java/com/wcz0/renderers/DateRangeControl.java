package com.wcz0.renderers;
/**
 * DateRange 日期范围控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/date-range

 * @author wcz0
 * @version 6.2.2
 */
public class DateRangeControl extends BaseRenderer {

	public DateRangeControl() {
		this.set("type", "dateRangeControl");
	}

	/**
	 * 是否隐藏
    */
	public DateRangeControl hidden(Object value) {
		return (DateRangeControl) this.set("hidden", value);
	}
	
	/**
	 * 只读条件
    */
	public DateRangeControl readOnlyOn(Object value) {
		return (DateRangeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否启用游标动画，默认开启
    */
	public DateRangeControl animation(Object value) {
		return (DateRangeControl) this.set("animation", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DateRangeControl hiddenOn(Object value) {
		return (DateRangeControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DateRangeControl onEvent(Object value) {
		return (DateRangeControl) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public DateRangeControl style(Object value) {
		return (DateRangeControl) this.set("style", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值用连接符拼接起来，作为当前表单项的值。如： `value1,value2` 否则为 `[value1, value2]`
    */
	public DateRangeControl joinValues(Object value) {
		return (DateRangeControl) this.set("joinValues", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public DateRangeControl inline(Object value) {
		return (DateRangeControl) this.set("inline", value);
	}
	
	/**
	 * 默认 `YYYY-MM-DD` 用来配置显示的时间格式。
    */
	public DateRangeControl inputFormat(Object value) {
		return (DateRangeControl) this.set("inputFormat", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DateRangeControl staticInputClassName(Object value) {
		return (DateRangeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public DateRangeControl hint(Object value) {
		return (DateRangeControl) this.set("hint", value);
	}
	
	/**
	 * 配置 input className
    */
	public DateRangeControl inputClassName(Object value) {
		return (DateRangeControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public DateRangeControl validations(Object value) {
		return (DateRangeControl) this.set("validations", value);
	}
	
	/**
	 * 默认 `X` 即时间戳格式，用来提交的时间格式。更多格式类型请参考 moment.
    */
	public DateRangeControl format(Object value) {
		return (DateRangeControl) this.set("format", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DateRangeControl useMobileUI(Object value) {
		return (DateRangeControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public DateRangeControl testIdBuilder(Object value) {
		return (DateRangeControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public DateRangeControl labelWidth(Object value) {
		return (DateRangeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public DateRangeControl submitOnChange(Object value) {
		return (DateRangeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 这里面 value 需要特殊说明一下，因为支持相对值。* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public DateRangeControl value(Object value) {
		return (DateRangeControl) this.set("value", value);
	}
	
	/**
	 * 最小日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public DateRangeControl minDate(Object value) {
		return (DateRangeControl) this.set("minDate", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public DateRangeControl borderMode(Object value) {
		return (DateRangeControl) this.set("borderMode", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DateRangeControl disabledOn(Object value) {
		return (DateRangeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DateRangeControl editorSetting(Object value) {
		return (DateRangeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 配置 label className
    */
	public DateRangeControl labelClassName(Object value) {
		return (DateRangeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public DateRangeControl validateOnChange(Object value) {
		return (DateRangeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 日期数据处理函数，用来处理选择日期之后的的值(value: moment.Moment, config: {type: 'start' | 'end'; originValue: moment.Moment, timeFormat: string}, props: any, data: any, moment: moment) => moment.Moment;
    */
	public DateRangeControl transform(Object value) {
		return (DateRangeControl) this.set("transform", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DateRangeControl staticPlaceholder(Object value) {
		return (DateRangeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public DateRangeControl name(Object value) {
		return (DateRangeControl) this.set("name", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public DateRangeControl autoFill(Object value) {
		return (DateRangeControl) this.set("autoFill", value);
	}
	
	/**
	 * 开启后变成非弹出模式，即内联模式。
    */
	public DateRangeControl embed(Object value) {
		return (DateRangeControl) this.set("embed", value);
	}
	
	/**
	 * 指定为日期范围控件
    * 可选值: input-date-range | input-datetime-range | input-time-range
    */
	public DateRangeControl type(Object value) {
		return (DateRangeControl) this.set("type", value);
	}
	
	/**
	 * 分割符, 因为有两个值，开始时间和结束时间，所以要有连接符。默认为英文逗号。
    */
	public DateRangeControl delimiter(Object value) {
		return (DateRangeControl) this.set("delimiter", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public DateRangeControl $$id(Object value) {
		return (DateRangeControl) this.set("$$id", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DateRangeControl id(Object value) {
		return (DateRangeControl) this.set("id", value);
	}
	
	/**
	 * 是否只读
    */
	public DateRangeControl readOnly(Object value) {
		return (DateRangeControl) this.set("readOnly", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public DateRangeControl validationErrors(Object value) {
		return (DateRangeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public DateRangeControl extraName(Object value) {
		return (DateRangeControl) this.set("extraName", value);
	}
	
	/**
	 * 最大跨度，比如 2days
    */
	public DateRangeControl maxDuration(Object value) {
		return (DateRangeControl) this.set("maxDuration", value);
	}
	
	/**
	 * 弹窗容器选择器
    */
	public DateRangeControl popOverContainerSelector(Object value) {
		return (DateRangeControl) this.set("popOverContainerSelector", value);
	}
	
	/**
	 * 最小跨度，比如 2days
    */
	public DateRangeControl minDuration(Object value) {
		return (DateRangeControl) this.set("minDuration", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DateRangeControl className(Object value) {
		return (DateRangeControl) this.set("className", value);
	}
	
	/**
	 * 描述标题
    */
	public DateRangeControl label(Object value) {
		return (DateRangeControl) this.set("label", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public DateRangeControl clearValueOnHidden(Object value) {
		return (DateRangeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 用来提交的时间格式。更多格式类型请参考 moment.（新：同format）
    */
	public DateRangeControl valueFormat(Object value) {
		return (DateRangeControl) this.set("valueFormat", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public DateRangeControl horizontal(Object value) {
		return (DateRangeControl) this.set("horizontal", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public DateRangeControl validateApi(Object value) {
		return (DateRangeControl) this.set("validateApi", value);
	}
	
	/**
	 * 日期范围开始时间-占位符
    */
	public DateRangeControl startPlaceholder(Object value) {
		return (DateRangeControl) this.set("startPlaceholder", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public DateRangeControl mode(Object value) {
		return (DateRangeControl) this.set("mode", value);
	}
	
	/**
	 * 最大日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public DateRangeControl maxDate(Object value) {
		return (DateRangeControl) this.set("maxDate", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public DateRangeControl width(Object value) {
		return (DateRangeControl) this.set("width", value);
	}
	
	/**
	 * 用来配置显示的时间格式（新：同inputFormat）
    */
	public DateRangeControl displayFormat(Object value) {
		return (DateRangeControl) this.set("displayFormat", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public DateRangeControl ranges(Object value) {
		return (DateRangeControl) this.set("ranges", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public DateRangeControl shortcuts(Object value) {
		return (DateRangeControl) this.set("shortcuts", value);
	}
	
	/**
	 * 日期范围结束时间-占位符
    */
	public DateRangeControl endPlaceholder(Object value) {
		return (DateRangeControl) this.set("endPlaceholder", value);
	}
	
	/**
	 * 是否禁用
    */
	public DateRangeControl disabled(Object value) {
		return (DateRangeControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DateRangeControl visibleOn(Object value) {
		return (DateRangeControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public DateRangeControl desc(Object value) {
		return (DateRangeControl) this.set("desc", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public DateRangeControl descriptionClassName(Object value) {
		return (DateRangeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DateRangeControl static_(Object value) {
		return (DateRangeControl) this.set("static_", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public DateRangeControl remark(Object value) {
		return (DateRangeControl) this.set("remark", value);
	}
	
	/**
	 * 是否为必填
    */
	public DateRangeControl required(Object value) {
		return (DateRangeControl) this.set("required", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DateRangeControl staticOn(Object value) {
		return (DateRangeControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DateRangeControl staticLabelClassName(Object value) {
		return (DateRangeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public DateRangeControl labelRemark(Object value) {
		return (DateRangeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public DateRangeControl description(Object value) {
		return (DateRangeControl) this.set("description", value);
	}
	
	/**
	 * 描述标题
    */
	public DateRangeControl labelAlign(Object value) {
		return (DateRangeControl) this.set("labelAlign", value);
	}
	
	/**
	 * 占位符
    */
	public DateRangeControl placeholder(Object value) {
		return (DateRangeControl) this.set("placeholder", value);
	}
	
	/**
	    */
	public DateRangeControl initAutoFill(Object value) {
		return (DateRangeControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否显示
    */
	public DateRangeControl visible(Object value) {
		return (DateRangeControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DateRangeControl staticClassName(Object value) {
		return (DateRangeControl) this.set("staticClassName", value);
	}
	
	/**
	    */
	public DateRangeControl staticSchema(Object value) {
		return (DateRangeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public DateRangeControl size(Object value) {
		return (DateRangeControl) this.set("size", value);
	}
	}