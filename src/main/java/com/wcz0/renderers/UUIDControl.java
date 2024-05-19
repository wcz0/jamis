package com.wcz0.renderers;
/**
 * UUID 功能性组件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/uuid

 * @author wcz0
 * @version 6.2.2
 */
public class UUIDControl extends BaseRenderer {

	public UUIDControl() {
		this.set("type", "uUIDControl");
	}

	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public UUIDControl autoFill(Object value) {
		return (UUIDControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public UUIDControl disabledOn(Object value) {
		return (UUIDControl) this.set("disabledOn", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public UUIDControl horizontal(Object value) {
		return (UUIDControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否静态展示
    */
	public UUIDControl static_(Object value) {
		return (UUIDControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public UUIDControl staticPlaceholder(Object value) {
		return (UUIDControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否只读
    */
	public UUIDControl readOnly(Object value) {
		return (UUIDControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public UUIDControl mode(Object value) {
		return (UUIDControl) this.set("mode", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public UUIDControl width(Object value) {
		return (UUIDControl) this.set("width", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public UUIDControl validateApi(Object value) {
		return (UUIDControl) this.set("validateApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public UUIDControl id(Object value) {
		return (UUIDControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public UUIDControl editorSetting(Object value) {
		return (UUIDControl) this.set("editorSetting", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public UUIDControl labelWidth(Object value) {
		return (UUIDControl) this.set("labelWidth", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public UUIDControl hint(Object value) {
		return (UUIDControl) this.set("hint", value);
	}
	
	/**
	 * 长度，默认 uuid 的长度是 36，如果不需要那么长，可以设置这个来缩短
    */
	public UUIDControl length(Object value) {
		return (UUIDControl) this.set("length", value);
	}
	
	/**
	 * 事件动作配置
    */
	public UUIDControl onEvent(Object value) {
		return (UUIDControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public UUIDControl staticOn(Object value) {
		return (UUIDControl) this.set("staticOn", value);
	}
	
	/**
	    */
	public UUIDControl validations(Object value) {
		return (UUIDControl) this.set("validations", value);
	}
	
	/**
	 * 只读条件
    */
	public UUIDControl readOnlyOn(Object value) {
		return (UUIDControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public UUIDControl initAutoFill(Object value) {
		return (UUIDControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否隐藏
    */
	public UUIDControl hidden(Object value) {
		return (UUIDControl) this.set("hidden", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public UUIDControl useMobileUI(Object value) {
		return (UUIDControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public UUIDControl label(Object value) {
		return (UUIDControl) this.set("label", value);
	}
	
	/**
	 * 是否为必填
    */
	public UUIDControl required(Object value) {
		return (UUIDControl) this.set("required", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public UUIDControl name(Object value) {
		return (UUIDControl) this.set("name", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public UUIDControl descriptionClassName(Object value) {
		return (UUIDControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public UUIDControl size(Object value) {
		return (UUIDControl) this.set("size", value);
	}
	
	/**
	 * 描述标题
    */
	public UUIDControl labelAlign(Object value) {
		return (UUIDControl) this.set("labelAlign", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public UUIDControl clearValueOnHidden(Object value) {
		return (UUIDControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 表单项类型
    */
	public UUIDControl type(Object value) {
		return (UUIDControl) this.set("type", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public UUIDControl $$id(Object value) {
		return (UUIDControl) this.set("$$id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public UUIDControl staticClassName(Object value) {
		return (UUIDControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public UUIDControl staticInputClassName(Object value) {
		return (UUIDControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public UUIDControl inline(Object value) {
		return (UUIDControl) this.set("inline", value);
	}
	
	/**
	 * 配置 input className
    */
	public UUIDControl inputClassName(Object value) {
		return (UUIDControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public UUIDControl hiddenOn(Object value) {
		return (UUIDControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public UUIDControl staticSchema(Object value) {
		return (UUIDControl) this.set("staticSchema", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public UUIDControl description(Object value) {
		return (UUIDControl) this.set("description", value);
	}
	
	/**
	    */
	public UUIDControl desc(Object value) {
		return (UUIDControl) this.set("desc", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public UUIDControl validationErrors(Object value) {
		return (UUIDControl) this.set("validationErrors", value);
	}
	
	/**
	 * 组件样式
    */
	public UUIDControl style(Object value) {
		return (UUIDControl) this.set("style", value);
	}
	
	/**
	    */
	public UUIDControl testIdBuilder(Object value) {
		return (UUIDControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 配置 label className
    */
	public UUIDControl labelClassName(Object value) {
		return (UUIDControl) this.set("labelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public UUIDControl labelRemark(Object value) {
		return (UUIDControl) this.set("labelRemark", value);
	}
	
	/**
	 * 占位符
    */
	public UUIDControl placeholder(Object value) {
		return (UUIDControl) this.set("placeholder", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public UUIDControl value(Object value) {
		return (UUIDControl) this.set("value", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public UUIDControl visibleOn(Object value) {
		return (UUIDControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public UUIDControl staticLabelClassName(Object value) {
		return (UUIDControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public UUIDControl extraName(Object value) {
		return (UUIDControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public UUIDControl remark(Object value) {
		return (UUIDControl) this.set("remark", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public UUIDControl submitOnChange(Object value) {
		return (UUIDControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public UUIDControl validateOnChange(Object value) {
		return (UUIDControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public UUIDControl className(Object value) {
		return (UUIDControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public UUIDControl disabled(Object value) {
		return (UUIDControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示
    */
	public UUIDControl visible(Object value) {
		return (UUIDControl) this.set("visible", value);
	}
	}