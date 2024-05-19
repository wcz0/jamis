package com.wcz0.renderers;
/**
 * Repeat 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/repeat

 * @author wcz0
 * @version 6.2.2
 */
public class RepeatControl extends BaseRenderer {

	public RepeatControl() {
		this.set("type", "repeatControl");
	}

	/**
	 * 是否静态展示
    */
	public RepeatControl static_(Object value) {
		return (RepeatControl) this.set("static_", value);
	}
	
	/**
	 * 描述标题
    */
	public RepeatControl labelAlign(Object value) {
		return (RepeatControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置 label className
    */
	public RepeatControl labelClassName(Object value) {
		return (RepeatControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public RepeatControl desc(Object value) {
		return (RepeatControl) this.set("desc", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RepeatControl descriptionClassName(Object value) {
		return (RepeatControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RepeatControl hidden(Object value) {
		return (RepeatControl) this.set("hidden", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RepeatControl labelRemark(Object value) {
		return (RepeatControl) this.set("labelRemark", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public RepeatControl autoFill(Object value) {
		return (RepeatControl) this.set("autoFill", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RepeatControl editorSetting(Object value) {
		return (RepeatControl) this.set("editorSetting", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RepeatControl submitOnChange(Object value) {
		return (RepeatControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 只读条件
    */
	public RepeatControl readOnlyOn(Object value) {
		return (RepeatControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否为必填
    */
	public RepeatControl required(Object value) {
		return (RepeatControl) this.set("required", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RepeatControl validateApi(Object value) {
		return (RepeatControl) this.set("validateApi", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RepeatControl staticLabelClassName(Object value) {
		return (RepeatControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否只读
    */
	public RepeatControl readOnly(Object value) {
		return (RepeatControl) this.set("readOnly", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RepeatControl onEvent(Object value) {
		return (RepeatControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public RepeatControl staticOn(Object value) {
		return (RepeatControl) this.set("staticOn", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RepeatControl horizontal(Object value) {
		return (RepeatControl) this.set("horizontal", value);
	}
	
	/**
	 * 表单项类型
    */
	public RepeatControl type(Object value) {
		return (RepeatControl) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public RepeatControl disabled(Object value) {
		return (RepeatControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RepeatControl visibleOn(Object value) {
		return (RepeatControl) this.set("visibleOn", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RepeatControl extraName(Object value) {
		return (RepeatControl) this.set("extraName", value);
	}
	
	/**
	 * 占位符
    */
	public RepeatControl placeholder(Object value) {
		return (RepeatControl) this.set("placeholder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public RepeatControl $$id(Object value) {
		return (RepeatControl) this.set("$$id", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RepeatControl mode(Object value) {
		return (RepeatControl) this.set("mode", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RepeatControl validationErrors(Object value) {
		return (RepeatControl) this.set("validationErrors", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public RepeatControl value(Object value) {
		return (RepeatControl) this.set("value", value);
	}
	
	/**
	    */
	public RepeatControl initAutoFill(Object value) {
		return (RepeatControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RepeatControl hiddenOn(Object value) {
		return (RepeatControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public RepeatControl staticSchema(Object value) {
		return (RepeatControl) this.set("staticSchema", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public RepeatControl description(Object value) {
		return (RepeatControl) this.set("description", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RepeatControl inline(Object value) {
		return (RepeatControl) this.set("inline", value);
	}
	
	/**
	 * 配置 input className
    */
	public RepeatControl inputClassName(Object value) {
		return (RepeatControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public RepeatControl options(Object value) {
		return (RepeatControl) this.set("options", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RepeatControl disabledOn(Object value) {
		return (RepeatControl) this.set("disabledOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RepeatControl validateOnChange(Object value) {
		return (RepeatControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否显示
    */
	public RepeatControl visible(Object value) {
		return (RepeatControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RepeatControl staticInputClassName(Object value) {
		return (RepeatControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public RepeatControl label(Object value) {
		return (RepeatControl) this.set("label", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RepeatControl remark(Object value) {
		return (RepeatControl) this.set("remark", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RepeatControl hint(Object value) {
		return (RepeatControl) this.set("hint", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RepeatControl size(Object value) {
		return (RepeatControl) this.set("size", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RepeatControl width(Object value) {
		return (RepeatControl) this.set("width", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RepeatControl className(Object value) {
		return (RepeatControl) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RepeatControl staticPlaceholder(Object value) {
		return (RepeatControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RepeatControl staticClassName(Object value) {
		return (RepeatControl) this.set("staticClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RepeatControl id(Object value) {
		return (RepeatControl) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public RepeatControl style(Object value) {
		return (RepeatControl) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RepeatControl useMobileUI(Object value) {
		return (RepeatControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public RepeatControl testIdBuilder(Object value) {
		return (RepeatControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RepeatControl name(Object value) {
		return (RepeatControl) this.set("name", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RepeatControl clearValueOnHidden(Object value) {
		return (RepeatControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public RepeatControl validations(Object value) {
		return (RepeatControl) this.set("validations", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RepeatControl labelWidth(Object value) {
		return (RepeatControl) this.set("labelWidth", value);
	}
	}