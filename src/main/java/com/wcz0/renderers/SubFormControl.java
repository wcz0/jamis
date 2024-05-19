package com.wcz0.renderers;
/**
 * SubForm 子表单 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/subform

 * @author wcz0
 * @version 6.2.2
 */
public class SubFormControl extends BaseRenderer {

	public SubFormControl() {
		this.set("type", "subFormControl");
	}

	/**
	 * 当修改完的时候是否提交表单。
    */
	public SubFormControl submitOnChange(Object value) {
		return (SubFormControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 占位符
    */
	public SubFormControl placeholder(Object value) {
		return (SubFormControl) this.set("placeholder", value);
	}
	
	/**
	    */
	public SubFormControl validations(Object value) {
		return (SubFormControl) this.set("validations", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SubFormControl staticInputClassName(Object value) {
		return (SubFormControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public SubFormControl disabled(Object value) {
		return (SubFormControl) this.set("disabled", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SubFormControl useMobileUI(Object value) {
		return (SubFormControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public SubFormControl labelRemark(Object value) {
		return (SubFormControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public SubFormControl clearValueOnHidden(Object value) {
		return (SubFormControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public SubFormControl autoFill(Object value) {
		return (SubFormControl) this.set("autoFill", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public SubFormControl $$id(Object value) {
		return (SubFormControl) this.set("$$id", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public SubFormControl hint(Object value) {
		return (SubFormControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public SubFormControl validateOnChange(Object value) {
		return (SubFormControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public SubFormControl name(Object value) {
		return (SubFormControl) this.set("name", value);
	}
	
	/**
	 * 是否显示
    */
	public SubFormControl visible(Object value) {
		return (SubFormControl) this.set("visible", value);
	}
	
	/**
	 * 配置 label className
    */
	public SubFormControl labelClassName(Object value) {
		return (SubFormControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否隐藏
    */
	public SubFormControl hidden(Object value) {
		return (SubFormControl) this.set("hidden", value);
	}
	
	/**
	 * 是否可新增
    */
	public SubFormControl addable(Object value) {
		return (SubFormControl) this.set("addable", value);
	}
	
	/**
	 * 是否可删除
    */
	public SubFormControl removable(Object value) {
		return (SubFormControl) this.set("removable", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SubFormControl staticPlaceholder(Object value) {
		return (SubFormControl) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public SubFormControl staticSchema(Object value) {
		return (SubFormControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否只读
    */
	public SubFormControl readOnly(Object value) {
		return (SubFormControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public SubFormControl descriptionClassName(Object value) {
		return (SubFormControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public SubFormControl inline(Object value) {
		return (SubFormControl) this.set("inline", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SubFormControl static_(Object value) {
		return (SubFormControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SubFormControl staticLabelClassName(Object value) {
		return (SubFormControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public SubFormControl scaffold(Object value) {
		return (SubFormControl) this.set("scaffold", value);
	}
	
	/**
	 * 组件样式
    */
	public SubFormControl style(Object value) {
		return (SubFormControl) this.set("style", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SubFormControl visibleOn(Object value) {
		return (SubFormControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public SubFormControl testIdBuilder(Object value) {
		return (SubFormControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 指定为 SubForm 子表单
    */
	public SubFormControl type(Object value) {
		return (SubFormControl) this.set("type", value);
	}
	
	/**
	 * 拖拽提示信息
    */
	public SubFormControl draggableTip(Object value) {
		return (SubFormControl) this.set("draggableTip", value);
	}
	
	/**
	 * 按钮默认名称
    */
	public SubFormControl btnLabel(Object value) {
		return (SubFormControl) this.set("btnLabel", value);
	}
	
	/**
	 * 值列表元素的类名
    */
	public SubFormControl itemsClassName(Object value) {
		return (SubFormControl) this.set("itemsClassName", value);
	}
	
	/**
	 * 子表单详情
    */
	public SubFormControl form(Object value) {
		return (SubFormControl) this.set("form", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SubFormControl hiddenOn(Object value) {
		return (SubFormControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 描述标题
    */
	public SubFormControl label(Object value) {
		return (SubFormControl) this.set("label", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public SubFormControl labelWidth(Object value) {
		return (SubFormControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public SubFormControl extraName(Object value) {
		return (SubFormControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public SubFormControl remark(Object value) {
		return (SubFormControl) this.set("remark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public SubFormControl description(Object value) {
		return (SubFormControl) this.set("description", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SubFormControl onEvent(Object value) {
		return (SubFormControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SubFormControl staticClassName(Object value) {
		return (SubFormControl) this.set("staticClassName", value);
	}
	
	/**
	    */
	public SubFormControl desc(Object value) {
		return (SubFormControl) this.set("desc", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public SubFormControl horizontal(Object value) {
		return (SubFormControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否为必填
    */
	public SubFormControl required(Object value) {
		return (SubFormControl) this.set("required", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public SubFormControl validationErrors(Object value) {
		return (SubFormControl) this.set("validationErrors", value);
	}
	
	/**
	 * 新增按钮 CSS 类名
    */
	public SubFormControl addButtonClassName(Object value) {
		return (SubFormControl) this.set("addButtonClassName", value);
	}
	
	/**
	 * 是否在左下角显示报错信息
    */
	public SubFormControl showErrorMsg(Object value) {
		return (SubFormControl) this.set("showErrorMsg", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public SubFormControl className(Object value) {
		return (SubFormControl) this.set("className", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SubFormControl editorSetting(Object value) {
		return (SubFormControl) this.set("editorSetting", value);
	}
	
	/**
	 * 只读条件
    */
	public SubFormControl readOnlyOn(Object value) {
		return (SubFormControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 最少个数
    */
	public SubFormControl minLength(Object value) {
		return (SubFormControl) this.set("minLength", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SubFormControl staticOn(Object value) {
		return (SubFormControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否可拖拽排序
    */
	public SubFormControl draggable(Object value) {
		return (SubFormControl) this.set("draggable", value);
	}
	
	/**
	 * 最多个数
    */
	public SubFormControl maxLength(Object value) {
		return (SubFormControl) this.set("maxLength", value);
	}
	
	/**
	 * 是否多选
    */
	public SubFormControl multiple(Object value) {
		return (SubFormControl) this.set("multiple", value);
	}
	
	/**
	 * 描述标题
    */
	public SubFormControl labelAlign(Object value) {
		return (SubFormControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置 input className
    */
	public SubFormControl inputClassName(Object value) {
		return (SubFormControl) this.set("inputClassName", value);
	}
	
	/**
	 * 当值中存在这个字段，则按钮名称将使用此字段的值来展示。
    */
	public SubFormControl labelField(Object value) {
		return (SubFormControl) this.set("labelField", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SubFormControl disabledOn(Object value) {
		return (SubFormControl) this.set("disabledOn", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public SubFormControl size(Object value) {
		return (SubFormControl) this.set("size", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public SubFormControl mode(Object value) {
		return (SubFormControl) this.set("mode", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public SubFormControl value(Object value) {
		return (SubFormControl) this.set("value", value);
	}
	
	/**
	    */
	public SubFormControl initAutoFill(Object value) {
		return (SubFormControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 新增按钮文字
    */
	public SubFormControl addButtonText(Object value) {
		return (SubFormControl) this.set("addButtonText", value);
	}
	
	/**
	 * 值元素的类名
    */
	public SubFormControl itemClassName(Object value) {
		return (SubFormControl) this.set("itemClassName", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public SubFormControl validateApi(Object value) {
		return (SubFormControl) this.set("validateApi", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public SubFormControl width(Object value) {
		return (SubFormControl) this.set("width", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SubFormControl id(Object value) {
		return (SubFormControl) this.set("id", value);
	}
	}