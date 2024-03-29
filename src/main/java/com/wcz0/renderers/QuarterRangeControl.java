package com.wcz0.renderers;
/**
 * QuarterRange 季度范围控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/input-quarter-range

 * @author wcz0
 * @version 6.2.2
 */
public class QuarterRangeControl extends BaseRenderer {

	public QuarterRangeControl() {
		this.set("type", "quarterRangeControl");
	}

	public QuarterRangeControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 开启后变成非弹出模式，即内联模式。
    */
	public QuarterRangeControl embed(Object value) {
		return (QuarterRangeControl) this.set("embed", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public QuarterRangeControl descriptionClassName(Object value) {
		return (QuarterRangeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否为必填
    */
	public QuarterRangeControl required(Object value) {
		return (QuarterRangeControl) this.set("required", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public QuarterRangeControl validateApi(Object value) {
		return (QuarterRangeControl) this.set("validateApi", value);
	}
	
	/**
	 * 事件动作配置
    */
	public QuarterRangeControl onEvent(Object value) {
		return (QuarterRangeControl) this.set("onEvent", value);
	}
	
	/**
	 * 默认 `X` 即时间戳格式，用来提交的时间格式。更多格式类型请参考 moment.
    */
	public QuarterRangeControl format(Object value) {
		return (QuarterRangeControl) this.set("format", value);
	}
	
	/**
	 * 最小日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public QuarterRangeControl minDate(Object value) {
		return (QuarterRangeControl) this.set("minDate", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public QuarterRangeControl shortcuts(Object value) {
		return (QuarterRangeControl) this.set("shortcuts", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public QuarterRangeControl disabledOn(Object value) {
		return (QuarterRangeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否只读
    */
	public QuarterRangeControl readOnly(Object value) {
		return (QuarterRangeControl) this.set("readOnly", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public QuarterRangeControl horizontal(Object value) {
		return (QuarterRangeControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public QuarterRangeControl hiddenOn(Object value) {
		return (QuarterRangeControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 日期范围结束时间-占位符
    */
	public QuarterRangeControl endPlaceholder(Object value) {
		return (QuarterRangeControl) this.set("endPlaceholder", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public QuarterRangeControl extraName(Object value) {
		return (QuarterRangeControl) this.set("extraName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public QuarterRangeControl mode(Object value) {
		return (QuarterRangeControl) this.set("mode", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public QuarterRangeControl validationErrors(Object value) {
		return (QuarterRangeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public QuarterRangeControl staticOn(Object value) {
		return (QuarterRangeControl) this.set("staticOn", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值用连接符拼接起来，作为当前表单项的值。如： `value1,value2` 否则为 `[value1, value2]`
    */
	public QuarterRangeControl joinValues(Object value) {
		return (QuarterRangeControl) this.set("joinValues", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public QuarterRangeControl validateOnChange(Object value) {
		return (QuarterRangeControl) this.set("validateOnChange", value);
	}
	
	/**
	    */
	public QuarterRangeControl desc(Object value) {
		return (QuarterRangeControl) this.set("desc", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public QuarterRangeControl className(Object value) {
		return (QuarterRangeControl) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public QuarterRangeControl static_(Object value) {
		return (QuarterRangeControl) this.set("static_", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public QuarterRangeControl visibleOn(Object value) {
		return (QuarterRangeControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public QuarterRangeControl description(Object value) {
		return (QuarterRangeControl) this.set("description", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public QuarterRangeControl clearValueOnHidden(Object value) {
		return (QuarterRangeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public QuarterRangeControl staticInputClassName(Object value) {
		return (QuarterRangeControl) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public QuarterRangeControl staticSchema(Object value) {
		return (QuarterRangeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public QuarterRangeControl editorSetting(Object value) {
		return (QuarterRangeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 最小跨度，比如 2days
    */
	public QuarterRangeControl minDuration(Object value) {
		return (QuarterRangeControl) this.set("minDuration", value);
	}
	
	/**
	 * 是否启用游标动画，默认开启
    */
	public QuarterRangeControl animation(Object value) {
		return (QuarterRangeControl) this.set("animation", value);
	}
	
	/**
	 * 是否禁用
    */
	public QuarterRangeControl disabled(Object value) {
		return (QuarterRangeControl) this.set("disabled", value);
	}
	
	/**
	 * 分割符, 因为有两个值，开始时间和结束时间，所以要有连接符。默认为英文逗号。
    */
	public QuarterRangeControl delimiter(Object value) {
		return (QuarterRangeControl) this.set("delimiter", value);
	}
	
	/**
	 * 默认 `YYYY-MM-DD` 用来配置显示的时间格式。
    */
	public QuarterRangeControl inputFormat(Object value) {
		return (QuarterRangeControl) this.set("inputFormat", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public QuarterRangeControl remark(Object value) {
		return (QuarterRangeControl) this.set("remark", value);
	}
	
	/**
	 * 描述标题
    */
	public QuarterRangeControl labelAlign(Object value) {
		return (QuarterRangeControl) this.set("labelAlign", value);
	}
	
	/**
	 * 组件样式
    */
	public QuarterRangeControl style(Object value) {
		return (QuarterRangeControl) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public QuarterRangeControl useMobileUI(Object value) {
		return (QuarterRangeControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 这里面 value 需要特殊说明一下，因为支持相对值。* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public QuarterRangeControl value(Object value) {
		return (QuarterRangeControl) this.set("value", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public QuarterRangeControl ranges(Object value) {
		return (QuarterRangeControl) this.set("ranges", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public QuarterRangeControl labelRemark(Object value) {
		return (QuarterRangeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 只读条件
    */
	public QuarterRangeControl readOnlyOn(Object value) {
		return (QuarterRangeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public QuarterRangeControl staticLabelClassName(Object value) {
		return (QuarterRangeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 日期范围开始时间-占位符
    */
	public QuarterRangeControl startPlaceholder(Object value) {
		return (QuarterRangeControl) this.set("startPlaceholder", value);
	}
	
	/**
	 * 描述标题
    */
	public QuarterRangeControl label(Object value) {
		return (QuarterRangeControl) this.set("label", value);
	}
	
	/**
	 * 配置 label className
    */
	public QuarterRangeControl labelClassName(Object value) {
		return (QuarterRangeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public QuarterRangeControl inline(Object value) {
		return (QuarterRangeControl) this.set("inline", value);
	}
	
	/**
	 * 最大跨度，比如 2days
    */
	public QuarterRangeControl maxDuration(Object value) {
		return (QuarterRangeControl) this.set("maxDuration", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public QuarterRangeControl name(Object value) {
		return (QuarterRangeControl) this.set("name", value);
	}
	
	/**
	    */
	public QuarterRangeControl validations(Object value) {
		return (QuarterRangeControl) this.set("validations", value);
	}
	
	/**
	 * 用来提交的时间格式。更多格式类型请参考 moment.（新：同format）
    */
	public QuarterRangeControl valueFormat(Object value) {
		return (QuarterRangeControl) this.set("valueFormat", value);
	}
	
	/**
	 * 最大日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public QuarterRangeControl maxDate(Object value) {
		return (QuarterRangeControl) this.set("maxDate", value);
	}
	
	/**
	 * 日期数据处理函数，用来处理选择日期之后的的值(value: moment.Moment, config: {type: 'start' | 'end'; originValue: moment.Moment, timeFormat: string}, props: any, data: any, moment: moment) => moment.Moment;
    */
	public QuarterRangeControl transform(Object value) {
		return (QuarterRangeControl) this.set("transform", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public QuarterRangeControl submitOnChange(Object value) {
		return (QuarterRangeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置 input className
    */
	public QuarterRangeControl inputClassName(Object value) {
		return (QuarterRangeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public QuarterRangeControl hidden(Object value) {
		return (QuarterRangeControl) this.set("hidden", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public QuarterRangeControl borderMode(Object value) {
		return (QuarterRangeControl) this.set("borderMode", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public QuarterRangeControl hint(Object value) {
		return (QuarterRangeControl) this.set("hint", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public QuarterRangeControl staticPlaceholder(Object value) {
		return (QuarterRangeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public QuarterRangeControl width(Object value) {
		return (QuarterRangeControl) this.set("width", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public QuarterRangeControl size(Object value) {
		return (QuarterRangeControl) this.set("size", value);
	}
	
	/**
	 * 占位符
    */
	public QuarterRangeControl placeholder(Object value) {
		return (QuarterRangeControl) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public QuarterRangeControl staticClassName(Object value) {
		return (QuarterRangeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 用来配置显示的时间格式（新：同inputFormat）
    */
	public QuarterRangeControl displayFormat(Object value) {
		return (QuarterRangeControl) this.set("displayFormat", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public QuarterRangeControl labelWidth(Object value) {
		return (QuarterRangeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否显示
    */
	public QuarterRangeControl visible(Object value) {
		return (QuarterRangeControl) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public QuarterRangeControl id(Object value) {
		return (QuarterRangeControl) this.set("id", value);
	}
	
	/**
	    */
	public QuarterRangeControl type(Object value) {
		return (QuarterRangeControl) this.set("type", value);
	}
	}