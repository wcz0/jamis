package com.wcz0.renderers;
/**
 * Control 表单项包裹 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/control

 * @author wcz0
 * @version 6.2.2
 */
public class FormControl extends BaseRenderer {

	public FormControl() {
		this.set("type", "formControl");
	}

	public FormControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否静态展示表达式
    */
	public FormControl staticOn(Object value) {
		return (FormControl) this.set("staticOn", value);
	}
	
	/**
	 * 描述标题
    */
	public FormControl labelAlign(Object value) {
		return (FormControl) this.set("labelAlign", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public FormControl description(Object value) {
		return (FormControl) this.set("description", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public FormControl clearValueOnHidden(Object value) {
		return (FormControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public FormControl visibleOn(Object value) {
		return (FormControl) this.set("visibleOn", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public FormControl size(Object value) {
		return (FormControl) this.set("size", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public FormControl submitOnChange(Object value) {
		return (FormControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public FormControl validateOnChange(Object value) {
		return (FormControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public FormControl inline(Object value) {
		return (FormControl) this.set("inline", value);
	}
	
	/**
	 * FormItem 内容
    */
	public FormControl body(Object value) {
		return (FormControl) this.set("body", value);
	}
	
	/**
	    */
	public FormControl desc(Object value) {
		return (FormControl) this.set("desc", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public FormControl mode(Object value) {
		return (FormControl) this.set("mode", value);
	}
	
	/**
	 * 是否显示
    */
	public FormControl visible(Object value) {
		return (FormControl) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public FormControl onEvent(Object value) {
		return (FormControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public FormControl static_(Object value) {
		return (FormControl) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public FormControl editorSetting(Object value) {
		return (FormControl) this.set("editorSetting", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public FormControl name(Object value) {
		return (FormControl) this.set("name", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public FormControl hint(Object value) {
		return (FormControl) this.set("hint", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public FormControl horizontal(Object value) {
		return (FormControl) this.set("horizontal", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public FormControl value(Object value) {
		return (FormControl) this.set("value", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public FormControl useMobileUI(Object value) {
		return (FormControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 配置 label className
    */
	public FormControl labelClassName(Object value) {
		return (FormControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否只读
    */
	public FormControl readOnly(Object value) {
		return (FormControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否为必填
    */
	public FormControl required(Object value) {
		return (FormControl) this.set("required", value);
	}
	
	/**
	    */
	public FormControl validations(Object value) {
		return (FormControl) this.set("validations", value);
	}
	
	/**
	 * 占位符
    */
	public FormControl placeholder(Object value) {
		return (FormControl) this.set("placeholder", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public FormControl validateApi(Object value) {
		return (FormControl) this.set("validateApi", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public FormControl staticPlaceholder(Object value) {
		return (FormControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 描述标题
    */
	public FormControl label(Object value) {
		return (FormControl) this.set("label", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public FormControl labelWidth(Object value) {
		return (FormControl) this.set("labelWidth", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public FormControl remark(Object value) {
		return (FormControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public FormControl labelRemark(Object value) {
		return (FormControl) this.set("labelRemark", value);
	}
	
	/**
	 * 配置 input className
    */
	public FormControl inputClassName(Object value) {
		return (FormControl) this.set("inputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public FormControl style(Object value) {
		return (FormControl) this.set("style", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public FormControl extraName(Object value) {
		return (FormControl) this.set("extraName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public FormControl className(Object value) {
		return (FormControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public FormControl disabledOn(Object value) {
		return (FormControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public FormControl hidden(Object value) {
		return (FormControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public FormControl staticClassName(Object value) {
		return (FormControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public FormControl staticInputClassName(Object value) {
		return (FormControl) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public FormControl staticSchema(Object value) {
		return (FormControl) this.set("staticSchema", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public FormControl descriptionClassName(Object value) {
		return (FormControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单项类型
    */
	public FormControl type(Object value) {
		return (FormControl) this.set("type", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public FormControl width(Object value) {
		return (FormControl) this.set("width", value);
	}
	
	/**
	 * 是否禁用
    */
	public FormControl disabled(Object value) {
		return (FormControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public FormControl hiddenOn(Object value) {
		return (FormControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public FormControl id(Object value) {
		return (FormControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public FormControl staticLabelClassName(Object value) {
		return (FormControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 只读条件
    */
	public FormControl readOnlyOn(Object value) {
		return (FormControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public FormControl validationErrors(Object value) {
		return (FormControl) this.set("validationErrors", value);
	}
	}