package com.wcz0.renderers;
/**
 * 数字输入框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/input-number

 * @author wcz0
 * @version 6.2.2
 */
public class NumberControl extends BaseRenderer {

	public NumberControl() {
		this.set("type", "numberControl");
	}

	/**
	 * 前缀
    */
	public NumberControl prefix(Object value) {
		return (NumberControl) this.set("prefix", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public NumberControl size(Object value) {
		return (NumberControl) this.set("size", value);
	}
	
	/**
	 * 配置 label className
    */
	public NumberControl labelClassName(Object value) {
		return (NumberControl) this.set("labelClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public NumberControl mode(Object value) {
		return (NumberControl) this.set("mode", value);
	}
	
	/**
	 * 是否为必填
    */
	public NumberControl required(Object value) {
		return (NumberControl) this.set("required", value);
	}
	
	/**
	    */
	public NumberControl validations(Object value) {
		return (NumberControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public NumberControl hiddenOn(Object value) {
		return (NumberControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件样式
    */
	public NumberControl style(Object value) {
		return (NumberControl) this.set("style", value);
	}
	
	/**
	    */
	public NumberControl testIdBuilder(Object value) {
		return (NumberControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public NumberControl submitOnChange(Object value) {
		return (NumberControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public NumberControl validateApi(Object value) {
		return (NumberControl) this.set("validateApi", value);
	}
	
	/**
	 * 单位列表
    */
	public NumberControl unitOptions(Object value) {
		return (NumberControl) this.set("unitOptions", value);
	}
	
	/**
	 * 是否是大数，如果是的话输入输出都将是字符串
    */
	public NumberControl big(Object value) {
		return (NumberControl) this.set("big", value);
	}
	
	/**
	 * 是否静态展示
    */
	public NumberControl static_(Object value) {
		return (NumberControl) this.set("static_", value);
	}
	
	/**
	    */
	public NumberControl desc(Object value) {
		return (NumberControl) this.set("desc", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public NumberControl descriptionClassName(Object value) {
		return (NumberControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 占位符
    */
	public NumberControl placeholder(Object value) {
		return (NumberControl) this.set("placeholder", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public NumberControl clearValueOnHidden(Object value) {
		return (NumberControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否千分分隔
    */
	public NumberControl kilobitSeparator(Object value) {
		return (NumberControl) this.set("kilobitSeparator", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public NumberControl id(Object value) {
		return (NumberControl) this.set("id", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public NumberControl remark(Object value) {
		return (NumberControl) this.set("remark", value);
	}
	
	/**
	 * 最小值
    */
	public NumberControl min(Object value) {
		return (NumberControl) this.set("min", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public NumberControl useMobileUI(Object value) {
		return (NumberControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public NumberControl visibleOn(Object value) {
		return (NumberControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public NumberControl staticInputClassName(Object value) {
		return (NumberControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public NumberControl value(Object value) {
		return (NumberControl) this.set("value", value);
	}
	
	/**
	    */
	public NumberControl initAutoFill(Object value) {
		return (NumberControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 精度
    */
	public NumberControl precision(Object value) {
		return (NumberControl) this.set("precision", value);
	}
	
	/**
	 * 只读
    */
	public NumberControl readOnly(Object value) {
		return (NumberControl) this.set("readOnly", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public NumberControl validateOnChange(Object value) {
		return (NumberControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 后缀
    */
	public NumberControl suffix(Object value) {
		return (NumberControl) this.set("suffix", value);
	}
	
	/**
	 * 是否启用键盘行为
    */
	public NumberControl keyboard(Object value) {
		return (NumberControl) this.set("keyboard", value);
	}
	
	/**
	 * 步长
    */
	public NumberControl step(Object value) {
		return (NumberControl) this.set("step", value);
	}
	
	/**
	 * 配置 input className
    */
	public NumberControl inputClassName(Object value) {
		return (NumberControl) this.set("inputClassName", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public NumberControl autoFill(Object value) {
		return (NumberControl) this.set("autoFill", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public NumberControl borderMode(Object value) {
		return (NumberControl) this.set("borderMode", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public NumberControl className(Object value) {
		return (NumberControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public NumberControl disabledOn(Object value) {
		return (NumberControl) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public NumberControl editorSetting(Object value) {
		return (NumberControl) this.set("editorSetting", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public NumberControl labelWidth(Object value) {
		return (NumberControl) this.set("labelWidth", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public NumberControl name(Object value) {
		return (NumberControl) this.set("name", value);
	}
	
	/**
	 * 是否禁用
    */
	public NumberControl disabled(Object value) {
		return (NumberControl) this.set("disabled", value);
	}
	
	/**
	 * 表单项类型
    */
	public NumberControl type(Object value) {
		return (NumberControl) this.set("type", value);
	}
	
	/**
	 * 输入框为基础输入框还是加强输入框
    * 可选值: base | enhance
    */
	public NumberControl displayMode(Object value) {
		return (NumberControl) this.set("displayMode", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public NumberControl $$id(Object value) {
		return (NumberControl) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public NumberControl visible(Object value) {
		return (NumberControl) this.set("visible", value);
	}
	
	/**
	    */
	public NumberControl staticSchema(Object value) {
		return (NumberControl) this.set("staticSchema", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public NumberControl description(Object value) {
		return (NumberControl) this.set("description", value);
	}
	
	/**
	 * 最大值
    */
	public NumberControl max(Object value) {
		return (NumberControl) this.set("max", value);
	}
	
	/**
	 * 是否隐藏
    */
	public NumberControl hidden(Object value) {
		return (NumberControl) this.set("hidden", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public NumberControl hint(Object value) {
		return (NumberControl) this.set("hint", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public NumberControl inline(Object value) {
		return (NumberControl) this.set("inline", value);
	}
	
	/**
	 * 是否显示上下点击按钮
    */
	public NumberControl showSteps(Object value) {
		return (NumberControl) this.set("showSteps", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public NumberControl extraName(Object value) {
		return (NumberControl) this.set("extraName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public NumberControl validationErrors(Object value) {
		return (NumberControl) this.set("validationErrors", value);
	}
	
	/**
	 * 事件动作配置
    */
	public NumberControl onEvent(Object value) {
		return (NumberControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public NumberControl staticPlaceholder(Object value) {
		return (NumberControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public NumberControl staticClassName(Object value) {
		return (NumberControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public NumberControl staticLabelClassName(Object value) {
		return (NumberControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public NumberControl label(Object value) {
		return (NumberControl) this.set("label", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public NumberControl staticOn(Object value) {
		return (NumberControl) this.set("staticOn", value);
	}
	
	/**
	 * 描述标题
    */
	public NumberControl labelAlign(Object value) {
		return (NumberControl) this.set("labelAlign", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public NumberControl horizontal(Object value) {
		return (NumberControl) this.set("horizontal", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public NumberControl width(Object value) {
		return (NumberControl) this.set("width", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public NumberControl labelRemark(Object value) {
		return (NumberControl) this.set("labelRemark", value);
	}
	
	/**
	 * 只读条件
    */
	public NumberControl readOnlyOn(Object value) {
		return (NumberControl) this.set("readOnlyOn", value);
	}
	}