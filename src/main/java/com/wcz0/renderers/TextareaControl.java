package com.wcz0.renderers;
/**
 * TextArea 多行文本输入框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/textarea

 * @author wcz0
 * @version 6.2.2
 */
public class TextareaControl extends BaseRenderer {

	public TextareaControl() {
		this.set("type", "textareaControl");
	}

	public TextareaControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public TextareaControl visible(Object value) {
		return (TextareaControl) this.set("visible", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TextareaControl description(Object value) {
		return (TextareaControl) this.set("description", value);
	}
	
	/**
	 * 最小行数
    */
	public TextareaControl minRows(Object value) {
		return (TextareaControl) this.set("minRows", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TextareaControl labelWidth(Object value) {
		return (TextareaControl) this.set("labelWidth", value);
	}
	
	/**
	    */
	public TextareaControl staticSchema(Object value) {
		return (TextareaControl) this.set("staticSchema", value);
	}
	
	/**
	 * 只读条件
    */
	public TextareaControl readOnlyOn(Object value) {
		return (TextareaControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 指定为多行文本输入框
    */
	public TextareaControl type(Object value) {
		return (TextareaControl) this.set("type", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TextareaControl className(Object value) {
		return (TextareaControl) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TextareaControl hidden(Object value) {
		return (TextareaControl) this.set("hidden", value);
	}
	
	/**
	 * 描述标题
    */
	public TextareaControl labelAlign(Object value) {
		return (TextareaControl) this.set("labelAlign", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TextareaControl inline(Object value) {
		return (TextareaControl) this.set("inline", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TextareaControl value(Object value) {
		return (TextareaControl) this.set("value", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TextareaControl hiddenOn(Object value) {
		return (TextareaControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TextareaControl staticLabelClassName(Object value) {
		return (TextareaControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public TextareaControl borderMode(Object value) {
		return (TextareaControl) this.set("borderMode", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TextareaControl hint(Object value) {
		return (TextareaControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TextareaControl validateOnChange(Object value) {
		return (TextareaControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TextareaControl clearValueOnHidden(Object value) {
		return (TextareaControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 重置值
    */
	public TextareaControl resetValue(Object value) {
		return (TextareaControl) this.set("resetValue", value);
	}
	
	/**
	 * 是否禁用
    */
	public TextareaControl disabled(Object value) {
		return (TextareaControl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TextareaControl staticPlaceholder(Object value) {
		return (TextareaControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public TextareaControl style(Object value) {
		return (TextareaControl) this.set("style", value);
	}
	
	/**
	 * 描述标题
    */
	public TextareaControl label(Object value) {
		return (TextareaControl) this.set("label", value);
	}
	
	/**
	 * 配置 input className
    */
	public TextareaControl inputClassName(Object value) {
		return (TextareaControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否显示计数
    */
	public TextareaControl showCounter(Object value) {
		return (TextareaControl) this.set("showCounter", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TextareaControl disabledOn(Object value) {
		return (TextareaControl) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TextareaControl onEvent(Object value) {
		return (TextareaControl) this.set("onEvent", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TextareaControl name(Object value) {
		return (TextareaControl) this.set("name", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TextareaControl staticInputClassName(Object value) {
		return (TextareaControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TextareaControl size(Object value) {
		return (TextareaControl) this.set("size", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TextareaControl validationErrors(Object value) {
		return (TextareaControl) this.set("validationErrors", value);
	}
	
	/**
	 * 最大行数
    */
	public TextareaControl maxRows(Object value) {
		return (TextareaControl) this.set("maxRows", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TextareaControl staticClassName(Object value) {
		return (TextareaControl) this.set("staticClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TextareaControl extraName(Object value) {
		return (TextareaControl) this.set("extraName", value);
	}
	
	/**
	    */
	public TextareaControl desc(Object value) {
		return (TextareaControl) this.set("desc", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TextareaControl descriptionClassName(Object value) {
		return (TextareaControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TextareaControl staticOn(Object value) {
		return (TextareaControl) this.set("staticOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TextareaControl remark(Object value) {
		return (TextareaControl) this.set("remark", value);
	}
	
	/**
	 * 是否只读
    */
	public TextareaControl readOnly(Object value) {
		return (TextareaControl) this.set("readOnly", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TextareaControl editorSetting(Object value) {
		return (TextareaControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TextareaControl useMobileUI(Object value) {
		return (TextareaControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 占位符
    */
	public TextareaControl placeholder(Object value) {
		return (TextareaControl) this.set("placeholder", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TextareaControl validateApi(Object value) {
		return (TextareaControl) this.set("validateApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TextareaControl id(Object value) {
		return (TextareaControl) this.set("id", value);
	}
	
	/**
	 * 配置 label className
    */
	public TextareaControl labelClassName(Object value) {
		return (TextareaControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TextareaControl visibleOn(Object value) {
		return (TextareaControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TextareaControl static_(Object value) {
		return (TextareaControl) this.set("static_", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TextareaControl labelRemark(Object value) {
		return (TextareaControl) this.set("labelRemark", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TextareaControl submitOnChange(Object value) {
		return (TextareaControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public TextareaControl validations(Object value) {
		return (TextareaControl) this.set("validations", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TextareaControl horizontal(Object value) {
		return (TextareaControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否为必填
    */
	public TextareaControl required(Object value) {
		return (TextareaControl) this.set("required", value);
	}
	
	/**
	 * 限制文字个数
    */
	public TextareaControl maxLength(Object value) {
		return (TextareaControl) this.set("maxLength", value);
	}
	
	/**
	 * 输入内容是否可清除
    */
	public TextareaControl clearable(Object value) {
		return (TextareaControl) this.set("clearable", value);
	}
	
	/**
	    */
	public TextareaControl testid(Object value) {
		return (TextareaControl) this.set("testid", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TextareaControl width(Object value) {
		return (TextareaControl) this.set("width", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TextareaControl mode(Object value) {
		return (TextareaControl) this.set("mode", value);
	}
	}