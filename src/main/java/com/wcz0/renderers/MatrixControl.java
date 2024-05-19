package com.wcz0.renderers;
/**
 * Matrix 选择控件。适合做权限勾选。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/matrix

 * @author wcz0
 * @version 6.2.2
 */
public class MatrixControl extends BaseRenderer {

	public MatrixControl() {
		this.set("type", "matrixControl");
	}

	/**
	 * 当修改完的时候是否提交表单。
    */
	public MatrixControl submitOnChange(Object value) {
		return (MatrixControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 只读条件
    */
	public MatrixControl readOnlyOn(Object value) {
		return (MatrixControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public MatrixControl autoFill(Object value) {
		return (MatrixControl) this.set("autoFill", value);
	}
	
	/**
	 * 配置 label className
    */
	public MatrixControl labelClassName(Object value) {
		return (MatrixControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public MatrixControl staticOn(Object value) {
		return (MatrixControl) this.set("staticOn", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public MatrixControl labelWidth(Object value) {
		return (MatrixControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public MatrixControl descriptionClassName(Object value) {
		return (MatrixControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public MatrixControl mode(Object value) {
		return (MatrixControl) this.set("mode", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public MatrixControl className(Object value) {
		return (MatrixControl) this.set("className", value);
	}
	
	/**
	 * 是否只读
    */
	public MatrixControl readOnly(Object value) {
		return (MatrixControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否为必填
    */
	public MatrixControl required(Object value) {
		return (MatrixControl) this.set("required", value);
	}
	
	/**
	 * 表单项类型
    */
	public MatrixControl type(Object value) {
		return (MatrixControl) this.set("type", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public MatrixControl width(Object value) {
		return (MatrixControl) this.set("width", value);
	}
	
	/**
	    */
	public MatrixControl testIdBuilder(Object value) {
		return (MatrixControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public MatrixControl useMobileUI(Object value) {
		return (MatrixControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public MatrixControl label(Object value) {
		return (MatrixControl) this.set("label", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public MatrixControl extraName(Object value) {
		return (MatrixControl) this.set("extraName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public MatrixControl staticPlaceholder(Object value) {
		return (MatrixControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public MatrixControl name(Object value) {
		return (MatrixControl) this.set("name", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public MatrixControl horizontal(Object value) {
		return (MatrixControl) this.set("horizontal", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public MatrixControl id(Object value) {
		return (MatrixControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public MatrixControl staticClassName(Object value) {
		return (MatrixControl) this.set("staticClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public MatrixControl size(Object value) {
		return (MatrixControl) this.set("size", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public MatrixControl validateOnChange(Object value) {
		return (MatrixControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public MatrixControl clearValueOnHidden(Object value) {
		return (MatrixControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public MatrixControl initAutoFill(Object value) {
		return (MatrixControl) this.set("initAutoFill", value);
	}
	
	/**
	    */
	public MatrixControl rows(Object value) {
		return (MatrixControl) this.set("rows", value);
	}
	
	/**
	 * 是否隐藏
    */
	public MatrixControl hidden(Object value) {
		return (MatrixControl) this.set("hidden", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public MatrixControl disabledOn(Object value) {
		return (MatrixControl) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public MatrixControl editorSetting(Object value) {
		return (MatrixControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述标题
    */
	public MatrixControl labelAlign(Object value) {
		return (MatrixControl) this.set("labelAlign", value);
	}
	
	/**
	    */
	public MatrixControl desc(Object value) {
		return (MatrixControl) this.set("desc", value);
	}
	
	/**
	 * 设置单选模式，multiple为false时有效
    */
	public MatrixControl singleSelectMode(Object value) {
		return (MatrixControl) this.set("singleSelectMode", value);
	}
	
	/**
	 * 是否禁用
    */
	public MatrixControl disabled(Object value) {
		return (MatrixControl) this.set("disabled", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public MatrixControl inline(Object value) {
		return (MatrixControl) this.set("inline", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public MatrixControl value(Object value) {
		return (MatrixControl) this.set("value", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public MatrixControl description(Object value) {
		return (MatrixControl) this.set("description", value);
	}
	
	/**
	 * 是否静态展示
    */
	public MatrixControl static_(Object value) {
		return (MatrixControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public MatrixControl staticLabelClassName(Object value) {
		return (MatrixControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public MatrixControl style(Object value) {
		return (MatrixControl) this.set("style", value);
	}
	
	/**
	    */
	public MatrixControl validations(Object value) {
		return (MatrixControl) this.set("validations", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public MatrixControl visibleOn(Object value) {
		return (MatrixControl) this.set("visibleOn", value);
	}
	
	/**
	 * 占位符
    */
	public MatrixControl placeholder(Object value) {
		return (MatrixControl) this.set("placeholder", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public MatrixControl labelRemark(Object value) {
		return (MatrixControl) this.set("labelRemark", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public MatrixControl staticInputClassName(Object value) {
		return (MatrixControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public MatrixControl remark(Object value) {
		return (MatrixControl) this.set("remark", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public MatrixControl hint(Object value) {
		return (MatrixControl) this.set("hint", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public MatrixControl hiddenOn(Object value) {
		return (MatrixControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public MatrixControl validateApi(Object value) {
		return (MatrixControl) this.set("validateApi", value);
	}
	
	/**
	 * 配置singleSelectMode时设置为false
    */
	public MatrixControl multiple(Object value) {
		return (MatrixControl) this.set("multiple", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public MatrixControl source(Object value) {
		return (MatrixControl) this.set("source", value);
	}
	
	/**
	 * 是否显示
    */
	public MatrixControl visible(Object value) {
		return (MatrixControl) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public MatrixControl onEvent(Object value) {
		return (MatrixControl) this.set("onEvent", value);
	}
	
	/**
	 * 配置 input className
    */
	public MatrixControl inputClassName(Object value) {
		return (MatrixControl) this.set("inputClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public MatrixControl $$id(Object value) {
		return (MatrixControl) this.set("$$id", value);
	}
	
	/**
	    */
	public MatrixControl staticSchema(Object value) {
		return (MatrixControl) this.set("staticSchema", value);
	}
	
	/**
	    */
	public MatrixControl columns(Object value) {
		return (MatrixControl) this.set("columns", value);
	}
	
	/**
	 * 行标题说明
    */
	public MatrixControl rowLabel(Object value) {
		return (MatrixControl) this.set("rowLabel", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public MatrixControl validationErrors(Object value) {
		return (MatrixControl) this.set("validationErrors", value);
	}
	}