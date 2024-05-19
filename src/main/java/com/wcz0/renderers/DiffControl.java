package com.wcz0.renderers;
/**
 * Diff 编辑器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/diff

 * @author wcz0
 * @version 6.2.2
 */
public class DiffControl extends BaseRenderer {

	public DiffControl() {
		this.set("type", "diffControl");
	}

	/**
	 * 是否显示
    */
	public DiffControl visible(Object value) {
		return (DiffControl) this.set("visible", value);
	}
	
	/**
	 * 占位符
    */
	public DiffControl placeholder(Object value) {
		return (DiffControl) this.set("placeholder", value);
	}
	
	/**
	 * 左侧面板的值， 支持取变量。
    */
	public DiffControl diffValue(Object value) {
		return (DiffControl) this.set("diffValue", value);
	}
	
	/**
	 * 是否禁用
    */
	public DiffControl disabled(Object value) {
		return (DiffControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public DiffControl hiddenOn(Object value) {
		return (DiffControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public DiffControl labelRemark(Object value) {
		return (DiffControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public DiffControl disabledOn(Object value) {
		return (DiffControl) this.set("disabledOn", value);
	}
	
	/**
	    */
	public DiffControl desc(Object value) {
		return (DiffControl) this.set("desc", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public DiffControl validationErrors(Object value) {
		return (DiffControl) this.set("validationErrors", value);
	}
	
	/**
	 * 事件动作配置
    */
	public DiffControl onEvent(Object value) {
		return (DiffControl) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置
    */
	public DiffControl options(Object value) {
		return (DiffControl) this.set("options", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public DiffControl visibleOn(Object value) {
		return (DiffControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public DiffControl static_(Object value) {
		return (DiffControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public DiffControl staticClassName(Object value) {
		return (DiffControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public DiffControl staticLabelClassName(Object value) {
		return (DiffControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public DiffControl testIdBuilder(Object value) {
		return (DiffControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public DiffControl hint(Object value) {
		return (DiffControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public DiffControl validateOnChange(Object value) {
		return (DiffControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public DiffControl descriptionClassName(Object value) {
		return (DiffControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public DiffControl style(Object value) {
		return (DiffControl) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public DiffControl editorSetting(Object value) {
		return (DiffControl) this.set("editorSetting", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public DiffControl labelWidth(Object value) {
		return (DiffControl) this.set("labelWidth", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public DiffControl submitOnChange(Object value) {
		return (DiffControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public DiffControl description(Object value) {
		return (DiffControl) this.set("description", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public DiffControl className(Object value) {
		return (DiffControl) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public DiffControl staticPlaceholder(Object value) {
		return (DiffControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 描述标题
    */
	public DiffControl labelAlign(Object value) {
		return (DiffControl) this.set("labelAlign", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public DiffControl value(Object value) {
		return (DiffControl) this.set("value", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public DiffControl $$id(Object value) {
		return (DiffControl) this.set("$$id", value);
	}
	
	/**
	 * 指定为 Diff 编辑器
    */
	public DiffControl type(Object value) {
		return (DiffControl) this.set("type", value);
	}
	
	/**
	    */
	public DiffControl staticSchema(Object value) {
		return (DiffControl) this.set("staticSchema", value);
	}
	
	/**
	 * 只读条件
    */
	public DiffControl readOnlyOn(Object value) {
		return (DiffControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否为必填
    */
	public DiffControl required(Object value) {
		return (DiffControl) this.set("required", value);
	}
	
	/**
	    */
	public DiffControl initAutoFill(Object value) {
		return (DiffControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public DiffControl staticOn(Object value) {
		return (DiffControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public DiffControl staticInputClassName(Object value) {
		return (DiffControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public DiffControl name(Object value) {
		return (DiffControl) this.set("name", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public DiffControl horizontal(Object value) {
		return (DiffControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否隐藏
    */
	public DiffControl hidden(Object value) {
		return (DiffControl) this.set("hidden", value);
	}
	
	/**
	 * 配置 input className
    */
	public DiffControl inputClassName(Object value) {
		return (DiffControl) this.set("inputClassName", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public DiffControl width(Object value) {
		return (DiffControl) this.set("width", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public DiffControl id(Object value) {
		return (DiffControl) this.set("id", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public DiffControl extraName(Object value) {
		return (DiffControl) this.set("extraName", value);
	}
	
	/**
	 * 语言，参考 monaco-editor
    */
	public DiffControl language(Object value) {
		return (DiffControl) this.set("language", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public DiffControl inline(Object value) {
		return (DiffControl) this.set("inline", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public DiffControl validateApi(Object value) {
		return (DiffControl) this.set("validateApi", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public DiffControl useMobileUI(Object value) {
		return (DiffControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public DiffControl size(Object value) {
		return (DiffControl) this.set("size", value);
	}
	
	/**
	 * 描述标题
    */
	public DiffControl label(Object value) {
		return (DiffControl) this.set("label", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public DiffControl remark(Object value) {
		return (DiffControl) this.set("remark", value);
	}
	
	/**
	 * 是否只读
    */
	public DiffControl readOnly(Object value) {
		return (DiffControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public DiffControl mode(Object value) {
		return (DiffControl) this.set("mode", value);
	}
	
	/**
	 * 配置 label className
    */
	public DiffControl labelClassName(Object value) {
		return (DiffControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public DiffControl validations(Object value) {
		return (DiffControl) this.set("validations", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public DiffControl clearValueOnHidden(Object value) {
		return (DiffControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public DiffControl autoFill(Object value) {
		return (DiffControl) this.set("autoFill", value);
	}
	}