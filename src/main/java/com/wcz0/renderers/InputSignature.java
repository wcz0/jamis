package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class InputSignature extends BaseRenderer {

	public InputSignature() {
		this.set("type", "inputSignature");
	}

	/**
	 * 描述内容，支持 Html 片段。
    */
	public InputSignature description(Object value) {
		return (InputSignature) this.set("description", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public InputSignature validationErrors(Object value) {
		return (InputSignature) this.set("validationErrors", value);
	}
	
	/**
	 * 组件背景颜色
    */
	public InputSignature bgColor(Object value) {
		return (InputSignature) this.set("bgColor", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public InputSignature visibleOn(Object value) {
		return (InputSignature) this.set("visibleOn", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public InputSignature autoFill(Object value) {
		return (InputSignature) this.set("autoFill", value);
	}
	
	/**
	 * 弹窗取消按钮名称
    */
	public InputSignature ebmedCancelLabel(Object value) {
		return (InputSignature) this.set("ebmedCancelLabel", value);
	}
	
	/**
	 * 是否只读
    */
	public InputSignature readOnly(Object value) {
		return (InputSignature) this.set("readOnly", value);
	}
	
	/**
	    */
	public InputSignature testIdBuilder(Object value) {
		return (InputSignature) this.set("testIdBuilder", value);
	}
	
	/**
	 * 占位符
    */
	public InputSignature placeholder(Object value) {
		return (InputSignature) this.set("placeholder", value);
	}
	
	/**
	 * 组件字段颜色
    */
	public InputSignature color(Object value) {
		return (InputSignature) this.set("color", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public InputSignature staticInputClassName(Object value) {
		return (InputSignature) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public InputSignature remark(Object value) {
		return (InputSignature) this.set("remark", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public InputSignature validateOnChange(Object value) {
		return (InputSignature) this.set("validateOnChange", value);
	}
	
	/**
	 * 弹窗确认按钮名称
    */
	public InputSignature embedConfirmLabel(Object value) {
		return (InputSignature) this.set("embedConfirmLabel", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public InputSignature className(Object value) {
		return (InputSignature) this.set("className", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public InputSignature submitOnChange(Object value) {
		return (InputSignature) this.set("submitOnChange", value);
	}
	
	/**
	 * 组件高度，默认占满父容器
    */
	public InputSignature height(Object value) {
		return (InputSignature) this.set("height", value);
	}
	
	/**
	 * 清空按钮图标
    */
	public InputSignature undoBtnIcon(Object value) {
		return (InputSignature) this.set("undoBtnIcon", value);
	}
	
	/**
	 * 弹窗按钮图标
    */
	public InputSignature embedBtnIcon(Object value) {
		return (InputSignature) this.set("embedBtnIcon", value);
	}
	
	/**
	 * 是否禁用
    */
	public InputSignature disabled(Object value) {
		return (InputSignature) this.set("disabled", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public InputSignature value(Object value) {
		return (InputSignature) this.set("value", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public InputSignature clearValueOnHidden(Object value) {
		return (InputSignature) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 撤销按钮名称
    */
	public InputSignature undoBtnLabel(Object value) {
		return (InputSignature) this.set("undoBtnLabel", value);
	}
	
	/**
	 * 事件动作配置
    */
	public InputSignature onEvent(Object value) {
		return (InputSignature) this.set("onEvent", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public InputSignature id(Object value) {
		return (InputSignature) this.set("id", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public InputSignature name(Object value) {
		return (InputSignature) this.set("name", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public InputSignature inline(Object value) {
		return (InputSignature) this.set("inline", value);
	}
	
	/**
	    */
	public InputSignature initAutoFill(Object value) {
		return (InputSignature) this.set("initAutoFill", value);
	}
	
	/**
	 * 弹窗取消按钮图标
    */
	public InputSignature ebmedCancelIcon(Object value) {
		return (InputSignature) this.set("ebmedCancelIcon", value);
	}
	
	/**
	 * 是否隐藏
    */
	public InputSignature hidden(Object value) {
		return (InputSignature) this.set("hidden", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public InputSignature horizontal(Object value) {
		return (InputSignature) this.set("horizontal", value);
	}
	
	/**
	    */
	public InputSignature validations(Object value) {
		return (InputSignature) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public InputSignature validateApi(Object value) {
		return (InputSignature) this.set("validateApi", value);
	}
	
	/**
	 * 清空按钮图标
    */
	public InputSignature clearBtnIcon(Object value) {
		return (InputSignature) this.set("clearBtnIcon", value);
	}
	
	/**
	 * 确认按钮图标
    */
	public InputSignature confirmBtnIcon(Object value) {
		return (InputSignature) this.set("confirmBtnIcon", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public InputSignature mode(Object value) {
		return (InputSignature) this.set("mode", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public InputSignature hint(Object value) {
		return (InputSignature) this.set("hint", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public InputSignature staticLabelClassName(Object value) {
		return (InputSignature) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public InputSignature label(Object value) {
		return (InputSignature) this.set("label", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public InputSignature extraName(Object value) {
		return (InputSignature) this.set("extraName", value);
	}
	
	/**
	 * 只读条件
    */
	public InputSignature readOnlyOn(Object value) {
		return (InputSignature) this.set("readOnlyOn", value);
	}
	
	/**
	 * 清空按钮名称
    */
	public InputSignature clearBtnLabel(Object value) {
		return (InputSignature) this.set("clearBtnLabel", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public InputSignature staticClassName(Object value) {
		return (InputSignature) this.set("staticClassName", value);
	}
	
	/**
	 * 配置 input className
    */
	public InputSignature inputClassName(Object value) {
		return (InputSignature) this.set("inputClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public InputSignature static_(Object value) {
		return (InputSignature) this.set("static_", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public InputSignature useMobileUI(Object value) {
		return (InputSignature) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否为必填
    */
	public InputSignature required(Object value) {
		return (InputSignature) this.set("required", value);
	}
	
	/**
	 * 表单项类型
    */
	public InputSignature type(Object value) {
		return (InputSignature) this.set("type", value);
	}
	
	/**
	    */
	public InputSignature staticSchema(Object value) {
		return (InputSignature) this.set("staticSchema", value);
	}
	
	/**
	 * 描述标题
    */
	public InputSignature labelAlign(Object value) {
		return (InputSignature) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public InputSignature labelWidth(Object value) {
		return (InputSignature) this.set("labelWidth", value);
	}
	
	/**
	    */
	public InputSignature desc(Object value) {
		return (InputSignature) this.set("desc", value);
	}
	
	/**
	 * 弹窗确认按钮图标
    */
	public InputSignature embedConfirmIcon(Object value) {
		return (InputSignature) this.set("embedConfirmIcon", value);
	}
	
	/**
	 * 弹窗按钮文案
    */
	public InputSignature embedBtnLabel(Object value) {
		return (InputSignature) this.set("embedBtnLabel", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public InputSignature size(Object value) {
		return (InputSignature) this.set("size", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public InputSignature staticOn(Object value) {
		return (InputSignature) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public InputSignature staticPlaceholder(Object value) {
		return (InputSignature) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public InputSignature style(Object value) {
		return (InputSignature) this.set("style", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public InputSignature labelRemark(Object value) {
		return (InputSignature) this.set("labelRemark", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public InputSignature descriptionClassName(Object value) {
		return (InputSignature) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件宽度，默认占满父容器
    */
	public InputSignature width(Object value) {
		return (InputSignature) this.set("width", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public InputSignature $$id(Object value) {
		return (InputSignature) this.set("$$id", value);
	}
	
	/**
	 * 是否内嵌
    */
	public InputSignature embed(Object value) {
		return (InputSignature) this.set("embed", value);
	}
	
	/**
	 * 确认按钮名称
    */
	public InputSignature confirmBtnLabel(Object value) {
		return (InputSignature) this.set("confirmBtnLabel", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public InputSignature hiddenOn(Object value) {
		return (InputSignature) this.set("hiddenOn", value);
	}
	
	/**
	 * 配置 label className
    */
	public InputSignature labelClassName(Object value) {
		return (InputSignature) this.set("labelClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public InputSignature disabledOn(Object value) {
		return (InputSignature) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public InputSignature editorSetting(Object value) {
		return (InputSignature) this.set("editorSetting", value);
	}
	
	/**
	 * 是否显示
    */
	public InputSignature visible(Object value) {
		return (InputSignature) this.set("visible", value);
	}
	}