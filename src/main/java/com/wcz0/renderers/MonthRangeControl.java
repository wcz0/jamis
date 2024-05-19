package com.wcz0.renderers;
/**
 * MonthRange 月范围控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/month-range

 * @author wcz0
 * @version 6.2.2
 */
public class MonthRangeControl extends BaseRenderer {

	public MonthRangeControl() {
		this.set("type", "monthRangeControl");
	}

	/**
	 * 只读条件
    */
	public MonthRangeControl readOnlyOn(Object value) {
		return (MonthRangeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public MonthRangeControl description(Object value) {
		return (MonthRangeControl) this.set("description", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public MonthRangeControl descriptionClassName(Object value) {
		return (MonthRangeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public MonthRangeControl $$id(Object value) {
		return (MonthRangeControl) this.set("$$id", value);
	}
	
	/**
	 * 最大跨度，比如 2days
    */
	public MonthRangeControl maxDuration(Object value) {
		return (MonthRangeControl) this.set("maxDuration", value);
	}
	
	/**
	 * 最小跨度，比如 2days
    */
	public MonthRangeControl minDuration(Object value) {
		return (MonthRangeControl) this.set("minDuration", value);
	}
	
	/**
	 * 这里面 value 需要特殊说明一下，因为支持相对值。* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public MonthRangeControl value(Object value) {
		return (MonthRangeControl) this.set("value", value);
	}
	
	/**
	 * 日期范围结束时间-占位符
    */
	public MonthRangeControl endPlaceholder(Object value) {
		return (MonthRangeControl) this.set("endPlaceholder", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public MonthRangeControl validateOnChange(Object value) {
		return (MonthRangeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 用来提交的时间格式。更多格式类型请参考 moment.（新：同format）
    */
	public MonthRangeControl valueFormat(Object value) {
		return (MonthRangeControl) this.set("valueFormat", value);
	}
	
	/**
	 * 日期范围开始时间-占位符
    */
	public MonthRangeControl startPlaceholder(Object value) {
		return (MonthRangeControl) this.set("startPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public MonthRangeControl staticInputClassName(Object value) {
		return (MonthRangeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public MonthRangeControl shortcuts(Object value) {
		return (MonthRangeControl) this.set("shortcuts", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public MonthRangeControl submitOnChange(Object value) {
		return (MonthRangeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public MonthRangeControl disabledOn(Object value) {
		return (MonthRangeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public MonthRangeControl visibleOn(Object value) {
		return (MonthRangeControl) this.set("visibleOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public MonthRangeControl remark(Object value) {
		return (MonthRangeControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public MonthRangeControl labelRemark(Object value) {
		return (MonthRangeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述标题
    */
	public MonthRangeControl labelAlign(Object value) {
		return (MonthRangeControl) this.set("labelAlign", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public MonthRangeControl hint(Object value) {
		return (MonthRangeControl) this.set("hint", value);
	}
	
	/**
	    */
	public MonthRangeControl staticSchema(Object value) {
		return (MonthRangeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否启用游标动画，默认开启
    */
	public MonthRangeControl animation(Object value) {
		return (MonthRangeControl) this.set("animation", value);
	}
	
	/**
	 * 日期数据处理函数，用来处理选择日期之后的的值(value: moment.Moment, config: {type: 'start' | 'end'; originValue: moment.Moment, timeFormat: string}, props: any, data: any, moment: moment) => moment.Moment;
    */
	public MonthRangeControl transform(Object value) {
		return (MonthRangeControl) this.set("transform", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public MonthRangeControl name(Object value) {
		return (MonthRangeControl) this.set("name", value);
	}
	
	/**
	 * 是否隐藏
    */
	public MonthRangeControl hidden(Object value) {
		return (MonthRangeControl) this.set("hidden", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public MonthRangeControl width(Object value) {
		return (MonthRangeControl) this.set("width", value);
	}
	
	/**
	 * 最小日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public MonthRangeControl minDate(Object value) {
		return (MonthRangeControl) this.set("minDate", value);
	}
	
	/**
	 * 占位符
    */
	public MonthRangeControl placeholder(Object value) {
		return (MonthRangeControl) this.set("placeholder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public MonthRangeControl className(Object value) {
		return (MonthRangeControl) this.set("className", value);
	}
	
	/**
	 * 默认 `X` 即时间戳格式，用来提交的时间格式。更多格式类型请参考 moment.
    */
	public MonthRangeControl format(Object value) {
		return (MonthRangeControl) this.set("format", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public MonthRangeControl autoFill(Object value) {
		return (MonthRangeControl) this.set("autoFill", value);
	}
	
	/**
	 * 事件动作配置
    */
	public MonthRangeControl onEvent(Object value) {
		return (MonthRangeControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public MonthRangeControl staticPlaceholder(Object value) {
		return (MonthRangeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 配置 label className
    */
	public MonthRangeControl labelClassName(Object value) {
		return (MonthRangeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public MonthRangeControl borderMode(Object value) {
		return (MonthRangeControl) this.set("borderMode", value);
	}
	
	/**
	 * 开启后变成非弹出模式，即内联模式。
    */
	public MonthRangeControl embed(Object value) {
		return (MonthRangeControl) this.set("embed", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public MonthRangeControl size(Object value) {
		return (MonthRangeControl) this.set("size", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public MonthRangeControl extraName(Object value) {
		return (MonthRangeControl) this.set("extraName", value);
	}
	
	/**
	 * 是否只读
    */
	public MonthRangeControl readOnly(Object value) {
		return (MonthRangeControl) this.set("readOnly", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public MonthRangeControl validationErrors(Object value) {
		return (MonthRangeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public MonthRangeControl id(Object value) {
		return (MonthRangeControl) this.set("id", value);
	}
	
	/**
	 * 默认 `YYYY-MM-DD` 用来配置显示的时间格式。
    */
	public MonthRangeControl inputFormat(Object value) {
		return (MonthRangeControl) this.set("inputFormat", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public MonthRangeControl labelWidth(Object value) {
		return (MonthRangeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public MonthRangeControl inline(Object value) {
		return (MonthRangeControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public MonthRangeControl required(Object value) {
		return (MonthRangeControl) this.set("required", value);
	}
	
	/**
	 * 是否显示
    */
	public MonthRangeControl visible(Object value) {
		return (MonthRangeControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public MonthRangeControl staticClassName(Object value) {
		return (MonthRangeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 日期范围快捷键
    */
	public MonthRangeControl ranges(Object value) {
		return (MonthRangeControl) this.set("ranges", value);
	}
	
	/**
	    */
	public MonthRangeControl validations(Object value) {
		return (MonthRangeControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public MonthRangeControl validateApi(Object value) {
		return (MonthRangeControl) this.set("validateApi", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public MonthRangeControl horizontal(Object value) {
		return (MonthRangeControl) this.set("horizontal", value);
	}
	
	/**
	 * 弹窗容器选择器
    */
	public MonthRangeControl popOverContainerSelector(Object value) {
		return (MonthRangeControl) this.set("popOverContainerSelector", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public MonthRangeControl mode(Object value) {
		return (MonthRangeControl) this.set("mode", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public MonthRangeControl clearValueOnHidden(Object value) {
		return (MonthRangeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public MonthRangeControl initAutoFill(Object value) {
		return (MonthRangeControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public MonthRangeControl editorSetting(Object value) {
		return (MonthRangeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值用连接符拼接起来，作为当前表单项的值。如： `value1,value2` 否则为 `[value1, value2]`
    */
	public MonthRangeControl joinValues(Object value) {
		return (MonthRangeControl) this.set("joinValues", value);
	}
	
	/**
	    */
	public MonthRangeControl desc(Object value) {
		return (MonthRangeControl) this.set("desc", value);
	}
	
	/**
	 * 是否禁用
    */
	public MonthRangeControl disabled(Object value) {
		return (MonthRangeControl) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public MonthRangeControl staticOn(Object value) {
		return (MonthRangeControl) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public MonthRangeControl style(Object value) {
		return (MonthRangeControl) this.set("style", value);
	}
	
	/**
	 * 用来配置显示的时间格式（新：同inputFormat）
    */
	public MonthRangeControl displayFormat(Object value) {
		return (MonthRangeControl) this.set("displayFormat", value);
	}
	
	/**
	 * 最大日期限制，支持变量 $xxx 来取值，或者用相对值如：* `-2mins` 2分钟前\n * `+2days` 2天后\n* `-10week` 十周前\n可用单位： `min`、`hour`、`day`、`week`、`month`、`year`。所有单位支持复数形式。
    */
	public MonthRangeControl maxDate(Object value) {
		return (MonthRangeControl) this.set("maxDate", value);
	}
	
	/**
	 * 配置 input className
    */
	public MonthRangeControl inputClassName(Object value) {
		return (MonthRangeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public MonthRangeControl static_(Object value) {
		return (MonthRangeControl) this.set("static_", value);
	}
	
	/**
	 * 分割符, 因为有两个值，开始时间和结束时间，所以要有连接符。默认为英文逗号。
    */
	public MonthRangeControl delimiter(Object value) {
		return (MonthRangeControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public MonthRangeControl hiddenOn(Object value) {
		return (MonthRangeControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public MonthRangeControl type(Object value) {
		return (MonthRangeControl) this.set("type", value);
	}
	
	/**
	 * 描述标题
    */
	public MonthRangeControl label(Object value) {
		return (MonthRangeControl) this.set("label", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public MonthRangeControl useMobileUI(Object value) {
		return (MonthRangeControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public MonthRangeControl testIdBuilder(Object value) {
		return (MonthRangeControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public MonthRangeControl staticLabelClassName(Object value) {
		return (MonthRangeControl) this.set("staticLabelClassName", value);
	}
	}