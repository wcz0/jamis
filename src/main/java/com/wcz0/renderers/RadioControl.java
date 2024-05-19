package com.wcz0.renderers;
/**
 * Radio 单选框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/radios

 * @author wcz0
 * @version 6.2.2
 */
public class RadioControl extends BaseRenderer {

	public RadioControl() {
		this.set("type", "radioControl");
	}

	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RadioControl validateOnChange(Object value) {
		return (RadioControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public RadioControl value(Object value) {
		return (RadioControl) this.set("value", value);
	}
	
	/**
	 * 未勾选值
    */
	public RadioControl falseValue(Object value) {
		return (RadioControl) this.set("falseValue", value);
	}
	
	/**
	    */
	public RadioControl partial(Object value) {
		return (RadioControl) this.set("partial", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RadioControl visibleOn(Object value) {
		return (RadioControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public RadioControl staticOn(Object value) {
		return (RadioControl) this.set("staticOn", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RadioControl submitOnChange(Object value) {
		return (RadioControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public RadioControl validations(Object value) {
		return (RadioControl) this.set("validations", value);
	}
	
	/**
	 * 选项说明
    */
	public RadioControl option(Object value) {
		return (RadioControl) this.set("option", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RadioControl staticClassName(Object value) {
		return (RadioControl) this.set("staticClassName", value);
	}
	
	/**
	    */
	public RadioControl testIdBuilder(Object value) {
		return (RadioControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否只读
    */
	public RadioControl readOnly(Object value) {
		return (RadioControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否为必填
    */
	public RadioControl required(Object value) {
		return (RadioControl) this.set("required", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RadioControl descriptionClassName(Object value) {
		return (RadioControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RadioControl mode(Object value) {
		return (RadioControl) this.set("mode", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RadioControl clearValueOnHidden(Object value) {
		return (RadioControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RadioControl validateApi(Object value) {
		return (RadioControl) this.set("validateApi", value);
	}
	
	/**
	 * 指定为多行文本输入框
    */
	public RadioControl type(Object value) {
		return (RadioControl) this.set("type", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RadioControl onEvent(Object value) {
		return (RadioControl) this.set("onEvent", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public RadioControl description(Object value) {
		return (RadioControl) this.set("description", value);
	}
	
	/**
	 * 勾选值
    */
	public RadioControl trueValue(Object value) {
		return (RadioControl) this.set("trueValue", value);
	}
	
	/**
	 * 是否禁用
    */
	public RadioControl disabled(Object value) {
		return (RadioControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RadioControl hidden(Object value) {
		return (RadioControl) this.set("hidden", value);
	}
	
	/**
	 * 只读条件
    */
	public RadioControl readOnlyOn(Object value) {
		return (RadioControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public RadioControl desc(Object value) {
		return (RadioControl) this.set("desc", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RadioControl useMobileUI(Object value) {
		return (RadioControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public RadioControl label(Object value) {
		return (RadioControl) this.set("label", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RadioControl disabledOn(Object value) {
		return (RadioControl) this.set("disabledOn", value);
	}
	
	/**
	 * 配置 label className
    */
	public RadioControl labelClassName(Object value) {
		return (RadioControl) this.set("labelClassName", value);
	}
	
	/**
	    * 可选值: default | button
    */
	public RadioControl optionType(Object value) {
		return (RadioControl) this.set("optionType", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public RadioControl $$id(Object value) {
		return (RadioControl) this.set("$$id", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RadioControl name(Object value) {
		return (RadioControl) this.set("name", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RadioControl staticPlaceholder(Object value) {
		return (RadioControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RadioControl staticLabelClassName(Object value) {
		return (RadioControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RadioControl staticInputClassName(Object value) {
		return (RadioControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RadioControl size(Object value) {
		return (RadioControl) this.set("size", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RadioControl validationErrors(Object value) {
		return (RadioControl) this.set("validationErrors", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RadioControl id(Object value) {
		return (RadioControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RadioControl editorSetting(Object value) {
		return (RadioControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述标题
    */
	public RadioControl labelAlign(Object value) {
		return (RadioControl) this.set("labelAlign", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RadioControl remark(Object value) {
		return (RadioControl) this.set("remark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RadioControl horizontal(Object value) {
		return (RadioControl) this.set("horizontal", value);
	}
	
	/**
	 * 配置 input className
    */
	public RadioControl inputClassName(Object value) {
		return (RadioControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RadioControl hiddenOn(Object value) {
		return (RadioControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件样式
    */
	public RadioControl style(Object value) {
		return (RadioControl) this.set("style", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RadioControl labelRemark(Object value) {
		return (RadioControl) this.set("labelRemark", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RadioControl className(Object value) {
		return (RadioControl) this.set("className", value);
	}
	
	/**
	    */
	public RadioControl staticSchema(Object value) {
		return (RadioControl) this.set("staticSchema", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RadioControl labelWidth(Object value) {
		return (RadioControl) this.set("labelWidth", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public RadioControl autoFill(Object value) {
		return (RadioControl) this.set("autoFill", value);
	}
	
	/**
	    */
	public RadioControl initAutoFill(Object value) {
		return (RadioControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 角标
    */
	public RadioControl badge(Object value) {
		return (RadioControl) this.set("badge", value);
	}
	
	/**
	 * 是否静态展示
    */
	public RadioControl static_(Object value) {
		return (RadioControl) this.set("static_", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RadioControl inline(Object value) {
		return (RadioControl) this.set("inline", value);
	}
	
	/**
	 * 占位符
    */
	public RadioControl placeholder(Object value) {
		return (RadioControl) this.set("placeholder", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RadioControl width(Object value) {
		return (RadioControl) this.set("width", value);
	}
	
	/**
	 * 是否显示
    */
	public RadioControl visible(Object value) {
		return (RadioControl) this.set("visible", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RadioControl extraName(Object value) {
		return (RadioControl) this.set("extraName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RadioControl hint(Object value) {
		return (RadioControl) this.set("hint", value);
	}
	}