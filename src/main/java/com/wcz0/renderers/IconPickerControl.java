package com.wcz0.renderers;
/**
 * 图标选择器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/icon-picker

 * @author wcz0
 * @version 6.2.2
 */
public class IconPickerControl extends BaseRenderer {

	public IconPickerControl() {
		this.set("type", "iconPickerControl");
	}

	public IconPickerControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏
    */
	public IconPickerControl hidden(Object value) {
		return (IconPickerControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public IconPickerControl staticInputClassName(Object value) {
		return (IconPickerControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public IconPickerControl labelAlign(Object value) {
		return (IconPickerControl) this.set("labelAlign", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public IconPickerControl name(Object value) {
		return (IconPickerControl) this.set("name", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public IconPickerControl mode(Object value) {
		return (IconPickerControl) this.set("mode", value);
	}
	
	/**
	 * 是否静态展示
    */
	public IconPickerControl static_(Object value) {
		return (IconPickerControl) this.set("static_", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public IconPickerControl labelRemark(Object value) {
		return (IconPickerControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否只读
    */
	public IconPickerControl readOnly(Object value) {
		return (IconPickerControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否显示
    */
	public IconPickerControl visible(Object value) {
		return (IconPickerControl) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public IconPickerControl visibleOn(Object value) {
		return (IconPickerControl) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public IconPickerControl id(Object value) {
		return (IconPickerControl) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public IconPickerControl onEvent(Object value) {
		return (IconPickerControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否为必填
    */
	public IconPickerControl required(Object value) {
		return (IconPickerControl) this.set("required", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public IconPickerControl width(Object value) {
		return (IconPickerControl) this.set("width", value);
	}
	
	/**
	 * 占位符
    */
	public IconPickerControl placeholder(Object value) {
		return (IconPickerControl) this.set("placeholder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public IconPickerControl className(Object value) {
		return (IconPickerControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public IconPickerControl disabled(Object value) {
		return (IconPickerControl) this.set("disabled", value);
	}
	
	/**
	 * 配置 label className
    */
	public IconPickerControl labelClassName(Object value) {
		return (IconPickerControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public IconPickerControl submitOnChange(Object value) {
		return (IconPickerControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public IconPickerControl horizontal(Object value) {
		return (IconPickerControl) this.set("horizontal", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public IconPickerControl validateApi(Object value) {
		return (IconPickerControl) this.set("validateApi", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public IconPickerControl editorSetting(Object value) {
		return (IconPickerControl) this.set("editorSetting", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public IconPickerControl size(Object value) {
		return (IconPickerControl) this.set("size", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public IconPickerControl labelWidth(Object value) {
		return (IconPickerControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public IconPickerControl extraName(Object value) {
		return (IconPickerControl) this.set("extraName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public IconPickerControl validateOnChange(Object value) {
		return (IconPickerControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public IconPickerControl disabledOn(Object value) {
		return (IconPickerControl) this.set("disabledOn", value);
	}
	
	/**
	 * 组件样式
    */
	public IconPickerControl style(Object value) {
		return (IconPickerControl) this.set("style", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public IconPickerControl remark(Object value) {
		return (IconPickerControl) this.set("remark", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public IconPickerControl descriptionClassName(Object value) {
		return (IconPickerControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public IconPickerControl value(Object value) {
		return (IconPickerControl) this.set("value", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public IconPickerControl staticOn(Object value) {
		return (IconPickerControl) this.set("staticOn", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public IconPickerControl hint(Object value) {
		return (IconPickerControl) this.set("hint", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public IconPickerControl clearValueOnHidden(Object value) {
		return (IconPickerControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 表单项类型
    */
	public IconPickerControl type(Object value) {
		return (IconPickerControl) this.set("type", value);
	}
	
	/**
	    */
	public IconPickerControl desc(Object value) {
		return (IconPickerControl) this.set("desc", value);
	}
	
	/**
	 * 配置 input className
    */
	public IconPickerControl inputClassName(Object value) {
		return (IconPickerControl) this.set("inputClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public IconPickerControl validationErrors(Object value) {
		return (IconPickerControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public IconPickerControl hiddenOn(Object value) {
		return (IconPickerControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public IconPickerControl staticPlaceholder(Object value) {
		return (IconPickerControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public IconPickerControl staticLabelClassName(Object value) {
		return (IconPickerControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public IconPickerControl staticSchema(Object value) {
		return (IconPickerControl) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public IconPickerControl useMobileUI(Object value) {
		return (IconPickerControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public IconPickerControl validations(Object value) {
		return (IconPickerControl) this.set("validations", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public IconPickerControl staticClassName(Object value) {
		return (IconPickerControl) this.set("staticClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public IconPickerControl label(Object value) {
		return (IconPickerControl) this.set("label", value);
	}
	
	/**
	 * 只读条件
    */
	public IconPickerControl readOnlyOn(Object value) {
		return (IconPickerControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public IconPickerControl description(Object value) {
		return (IconPickerControl) this.set("description", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public IconPickerControl inline(Object value) {
		return (IconPickerControl) this.set("inline", value);
	}
	}