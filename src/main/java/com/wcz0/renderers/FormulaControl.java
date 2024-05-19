package com.wcz0.renderers;
/**
 * 公式功能控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/formula

 * @author wcz0
 * @version 6.2.2
 */
public class FormulaControl extends BaseRenderer {

	public FormulaControl() {
		this.set("type", "formulaControl");
	}

	/**
	 * label自定义宽度，默认单位为px
    */
	public FormulaControl labelWidth(Object value) {
		return (FormulaControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置 label className
    */
	public FormulaControl labelClassName(Object value) {
		return (FormulaControl) this.set("labelClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public FormulaControl extraName(Object value) {
		return (FormulaControl) this.set("extraName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public FormulaControl submitOnChange(Object value) {
		return (FormulaControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否隐藏
    */
	public FormulaControl hidden(Object value) {
		return (FormulaControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public FormulaControl visibleOn(Object value) {
		return (FormulaControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public FormulaControl static_(Object value) {
		return (FormulaControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public FormulaControl staticPlaceholder(Object value) {
		return (FormulaControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 描述标题
    */
	public FormulaControl labelAlign(Object value) {
		return (FormulaControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置 input className
    */
	public FormulaControl inputClassName(Object value) {
		return (FormulaControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public FormulaControl validations(Object value) {
		return (FormulaControl) this.set("validations", value);
	}
	
	/**
	 * 公式
    */
	public FormulaControl formula(Object value) {
		return (FormulaControl) this.set("formula", value);
	}
	
	/**
	 * 事件动作配置
    */
	public FormulaControl onEvent(Object value) {
		return (FormulaControl) this.set("onEvent", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public FormulaControl value(Object value) {
		return (FormulaControl) this.set("value", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public FormulaControl staticLabelClassName(Object value) {
		return (FormulaControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public FormulaControl label(Object value) {
		return (FormulaControl) this.set("label", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public FormulaControl autoFill(Object value) {
		return (FormulaControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否只读
    */
	public FormulaControl readOnly(Object value) {
		return (FormulaControl) this.set("readOnly", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public FormulaControl description(Object value) {
		return (FormulaControl) this.set("description", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public FormulaControl clearValueOnHidden(Object value) {
		return (FormulaControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public FormulaControl validateApi(Object value) {
		return (FormulaControl) this.set("validateApi", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public FormulaControl remark(Object value) {
		return (FormulaControl) this.set("remark", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public FormulaControl inline(Object value) {
		return (FormulaControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public FormulaControl required(Object value) {
		return (FormulaControl) this.set("required", value);
	}
	
	/**
	 * 是否禁用
    */
	public FormulaControl disabled(Object value) {
		return (FormulaControl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public FormulaControl staticClassName(Object value) {
		return (FormulaControl) this.set("staticClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public FormulaControl validationErrors(Object value) {
		return (FormulaControl) this.set("validationErrors", value);
	}
	
	/**
	    */
	public FormulaControl initAutoFill(Object value) {
		return (FormulaControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public FormulaControl className(Object value) {
		return (FormulaControl) this.set("className", value);
	}
	
	/**
	    */
	public FormulaControl staticSchema(Object value) {
		return (FormulaControl) this.set("staticSchema", value);
	}
	
	/**
	    */
	public FormulaControl testIdBuilder(Object value) {
		return (FormulaControl) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public FormulaControl desc(Object value) {
		return (FormulaControl) this.set("desc", value);
	}
	
	/**
	 * 指定为公式功能控件。
    */
	public FormulaControl type(Object value) {
		return (FormulaControl) this.set("type", value);
	}
	
	/**
	 * 是否初始应用
    */
	public FormulaControl initSet(Object value) {
		return (FormulaControl) this.set("initSet", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public FormulaControl editorSetting(Object value) {
		return (FormulaControl) this.set("editorSetting", value);
	}
	
	/**
	 * 字段名，公式结果将作用到此处指定的变量中去
    */
	public FormulaControl name(Object value) {
		return (FormulaControl) this.set("name", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public FormulaControl hint(Object value) {
		return (FormulaControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public FormulaControl validateOnChange(Object value) {
		return (FormulaControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public FormulaControl width(Object value) {
		return (FormulaControl) this.set("width", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public FormulaControl $$id(Object value) {
		return (FormulaControl) this.set("$$id", value);
	}
	
	/**
	 * 当某个按钮的目标指定为此值后，会触发一次公式应用。这个机制可以在 autoSet 为 false 时用来手动触发
    */
	public FormulaControl id(Object value) {
		return (FormulaControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public FormulaControl staticOn(Object value) {
		return (FormulaControl) this.set("staticOn", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public FormulaControl size(Object value) {
		return (FormulaControl) this.set("size", value);
	}
	
	/**
	 * 是否显示
    */
	public FormulaControl visible(Object value) {
		return (FormulaControl) this.set("visible", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public FormulaControl mode(Object value) {
		return (FormulaControl) this.set("mode", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public FormulaControl staticInputClassName(Object value) {
		return (FormulaControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public FormulaControl style(Object value) {
		return (FormulaControl) this.set("style", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public FormulaControl descriptionClassName(Object value) {
		return (FormulaControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 触发公式的作用条件，如 data.xxx == \"a\" 或者 ${xx}
    */
	public FormulaControl condition(Object value) {
		return (FormulaControl) this.set("condition", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public FormulaControl disabledOn(Object value) {
		return (FormulaControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public FormulaControl hiddenOn(Object value) {
		return (FormulaControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public FormulaControl horizontal(Object value) {
		return (FormulaControl) this.set("horizontal", value);
	}
	
	/**
	 * 占位符
    */
	public FormulaControl placeholder(Object value) {
		return (FormulaControl) this.set("placeholder", value);
	}
	
	/**
	 * 只读条件
    */
	public FormulaControl readOnlyOn(Object value) {
		return (FormulaControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public FormulaControl useMobileUI(Object value) {
		return (FormulaControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public FormulaControl labelRemark(Object value) {
		return (FormulaControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否自动应用
    */
	public FormulaControl autoSet(Object value) {
		return (FormulaControl) this.set("autoSet", value);
	}
	}