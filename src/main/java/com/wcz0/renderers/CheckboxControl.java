package com.wcz0.renderers;
/**
 * Checkbox 勾选框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/checkbox

 * @author wcz0
 * @version 6.2.2
 */
public class CheckboxControl extends BaseRenderer {

	public CheckboxControl() {
		this.set("type", "checkboxControl");
	}

	/**
	 * label自定义宽度，默认单位为px
    */
	public CheckboxControl labelWidth(Object value) {
		return (CheckboxControl) this.set("labelWidth", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public CheckboxControl horizontal(Object value) {
		return (CheckboxControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public CheckboxControl checked(Object value) {
		return (CheckboxControl) this.set("checked", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public CheckboxControl width(Object value) {
		return (CheckboxControl) this.set("width", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CheckboxControl useMobileUI(Object value) {
		return (CheckboxControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public CheckboxControl name(Object value) {
		return (CheckboxControl) this.set("name", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public CheckboxControl remark(Object value) {
		return (CheckboxControl) this.set("remark", value);
	}
	
	/**
	 * 占位符
    */
	public CheckboxControl placeholder(Object value) {
		return (CheckboxControl) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CheckboxControl staticClassName(Object value) {
		return (CheckboxControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CheckboxControl staticInputClassName(Object value) {
		return (CheckboxControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CheckboxControl editorSetting(Object value) {
		return (CheckboxControl) this.set("editorSetting", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public CheckboxControl submitOnChange(Object value) {
		return (CheckboxControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public CheckboxControl desc(Object value) {
		return (CheckboxControl) this.set("desc", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public CheckboxControl validateApi(Object value) {
		return (CheckboxControl) this.set("validateApi", value);
	}
	
	/**
	 * 选项说明
    */
	public CheckboxControl option(Object value) {
		return (CheckboxControl) this.set("option", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CheckboxControl hiddenOn(Object value) {
		return (CheckboxControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CheckboxControl onEvent(Object value) {
		return (CheckboxControl) this.set("onEvent", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public CheckboxControl labelRemark(Object value) {
		return (CheckboxControl) this.set("labelRemark", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public CheckboxControl mode(Object value) {
		return (CheckboxControl) this.set("mode", value);
	}
	
	/**
	 * 是否为必填
    */
	public CheckboxControl required(Object value) {
		return (CheckboxControl) this.set("required", value);
	}
	
	/**
	    */
	public CheckboxControl partial(Object value) {
		return (CheckboxControl) this.set("partial", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CheckboxControl staticPlaceholder(Object value) {
		return (CheckboxControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public CheckboxControl value(Object value) {
		return (CheckboxControl) this.set("value", value);
	}
	
	/**
	    * 可选值: default | button
    */
	public CheckboxControl optionType(Object value) {
		return (CheckboxControl) this.set("optionType", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CheckboxControl id(Object value) {
		return (CheckboxControl) this.set("id", value);
	}
	
	/**
	 * 配置 label className
    */
	public CheckboxControl labelClassName(Object value) {
		return (CheckboxControl) this.set("labelClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public CheckboxControl extraName(Object value) {
		return (CheckboxControl) this.set("extraName", value);
	}
	
	/**
	 * 是否只读
    */
	public CheckboxControl readOnly(Object value) {
		return (CheckboxControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置 input className
    */
	public CheckboxControl inputClassName(Object value) {
		return (CheckboxControl) this.set("inputClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public CheckboxControl $$id(Object value) {
		return (CheckboxControl) this.set("$$id", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CheckboxControl className(Object value) {
		return (CheckboxControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public CheckboxControl disabled(Object value) {
		return (CheckboxControl) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CheckboxControl disabledOn(Object value) {
		return (CheckboxControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CheckboxControl static_(Object value) {
		return (CheckboxControl) this.set("static_", value);
	}
	
	/**
	    */
	public CheckboxControl testIdBuilder(Object value) {
		return (CheckboxControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public CheckboxControl autoFill(Object value) {
		return (CheckboxControl) this.set("autoFill", value);
	}
	
	/**
	    */
	public CheckboxControl initAutoFill(Object value) {
		return (CheckboxControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public CheckboxControl size(Object value) {
		return (CheckboxControl) this.set("size", value);
	}
	
	/**
	 * 描述标题
    */
	public CheckboxControl label(Object value) {
		return (CheckboxControl) this.set("label", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public CheckboxControl hint(Object value) {
		return (CheckboxControl) this.set("hint", value);
	}
	
	/**
	 * 未勾选值
    */
	public CheckboxControl falseValue(Object value) {
		return (CheckboxControl) this.set("falseValue", value);
	}
	
	/**
	 * 角标
    */
	public CheckboxControl badge(Object value) {
		return (CheckboxControl) this.set("badge", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CheckboxControl hidden(Object value) {
		return (CheckboxControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CheckboxControl visibleOn(Object value) {
		return (CheckboxControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CheckboxControl staticLabelClassName(Object value) {
		return (CheckboxControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public CheckboxControl descriptionClassName(Object value) {
		return (CheckboxControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public CheckboxControl validationErrors(Object value) {
		return (CheckboxControl) this.set("validationErrors", value);
	}
	
	/**
	 * 指定为多行文本输入框
    */
	public CheckboxControl type(Object value) {
		return (CheckboxControl) this.set("type", value);
	}
	
	/**
	 * 是否显示
    */
	public CheckboxControl visible(Object value) {
		return (CheckboxControl) this.set("visible", value);
	}
	
	/**
	 * 描述标题
    */
	public CheckboxControl labelAlign(Object value) {
		return (CheckboxControl) this.set("labelAlign", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public CheckboxControl validateOnChange(Object value) {
		return (CheckboxControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public CheckboxControl description(Object value) {
		return (CheckboxControl) this.set("description", value);
	}
	
	/**
	 * 组件样式
    */
	public CheckboxControl style(Object value) {
		return (CheckboxControl) this.set("style", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public CheckboxControl inline(Object value) {
		return (CheckboxControl) this.set("inline", value);
	}
	
	/**
	    */
	public CheckboxControl validations(Object value) {
		return (CheckboxControl) this.set("validations", value);
	}
	
	/**
	 * 勾选值
    */
	public CheckboxControl trueValue(Object value) {
		return (CheckboxControl) this.set("trueValue", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CheckboxControl staticOn(Object value) {
		return (CheckboxControl) this.set("staticOn", value);
	}
	
	/**
	    */
	public CheckboxControl staticSchema(Object value) {
		return (CheckboxControl) this.set("staticSchema", value);
	}
	
	/**
	 * 只读条件
    */
	public CheckboxControl readOnlyOn(Object value) {
		return (CheckboxControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public CheckboxControl clearValueOnHidden(Object value) {
		return (CheckboxControl) this.set("clearValueOnHidden", value);
	}
	}