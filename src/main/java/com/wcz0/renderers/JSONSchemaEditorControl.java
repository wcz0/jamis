package com.wcz0.renderers;
/**
 * JSON Schema Editor 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/json-schema-editor

 * @author wcz0
 * @version 6.2.2
 */
public class JSONSchemaEditorControl extends BaseRenderer {

	public JSONSchemaEditorControl() {
		this.set("type", "jSONSchemaEditorControl");
	}

	/**
	 * 是否只读
    */
	public JSONSchemaEditorControl readOnly(Object value) {
		return (JSONSchemaEditorControl) this.set("readOnly", value);
	}
	
	/**
	 * 顶层类型信息是否隐藏
    */
	public JSONSchemaEditorControl showRootInfo(Object value) {
		return (JSONSchemaEditorControl) this.set("showRootInfo", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public JSONSchemaEditorControl submitOnChange(Object value) {
		return (JSONSchemaEditorControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public JSONSchemaEditorControl autoFill(Object value) {
		return (JSONSchemaEditorControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public JSONSchemaEditorControl hiddenOn(Object value) {
		return (JSONSchemaEditorControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public JSONSchemaEditorControl hint(Object value) {
		return (JSONSchemaEditorControl) this.set("hint", value);
	}
	
	/**
	 * 是否显示
    */
	public JSONSchemaEditorControl visible(Object value) {
		return (JSONSchemaEditorControl) this.set("visible", value);
	}
	
	/**
	 * 禁用类型，默认禁用了 null 类型
    */
	public JSONSchemaEditorControl disabledTypes(Object value) {
		return (JSONSchemaEditorControl) this.set("disabledTypes", value);
	}
	
	/**
	 * 开启详情配置
    */
	public JSONSchemaEditorControl enableAdvancedSetting(Object value) {
		return (JSONSchemaEditorControl) this.set("enableAdvancedSetting", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public JSONSchemaEditorControl validateOnChange(Object value) {
		return (JSONSchemaEditorControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public JSONSchemaEditorControl validationErrors(Object value) {
		return (JSONSchemaEditorControl) this.set("validationErrors", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public JSONSchemaEditorControl clearValueOnHidden(Object value) {
		return (JSONSchemaEditorControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public JSONSchemaEditorControl validateApi(Object value) {
		return (JSONSchemaEditorControl) this.set("validateApi", value);
	}
	
	/**
	 * 组件样式
    */
	public JSONSchemaEditorControl style(Object value) {
		return (JSONSchemaEditorControl) this.set("style", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public JSONSchemaEditorControl staticLabelClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为 JSON Schema Editor
    */
	public JSONSchemaEditorControl type(Object value) {
		return (JSONSchemaEditorControl) this.set("type", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public JSONSchemaEditorControl size(Object value) {
		return (JSONSchemaEditorControl) this.set("size", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public JSONSchemaEditorControl descriptionClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("descriptionClassName", value);
	}
	
	/**
	    */
	public JSONSchemaEditorControl validations(Object value) {
		return (JSONSchemaEditorControl) this.set("validations", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public JSONSchemaEditorControl className(Object value) {
		return (JSONSchemaEditorControl) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public JSONSchemaEditorControl staticPlaceholder(Object value) {
		return (JSONSchemaEditorControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否为迷你模式，会隐藏一些不必要的元素
    */
	public JSONSchemaEditorControl mini(Object value) {
		return (JSONSchemaEditorControl) this.set("mini", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public JSONSchemaEditorControl extraName(Object value) {
		return (JSONSchemaEditorControl) this.set("extraName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public JSONSchemaEditorControl disabledOn(Object value) {
		return (JSONSchemaEditorControl) this.set("disabledOn", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public JSONSchemaEditorControl horizontal(Object value) {
		return (JSONSchemaEditorControl) this.set("horizontal", value);
	}
	
	/**
	 * 可以理解为类型模板，方便快速定义复杂类型
    */
	public JSONSchemaEditorControl definitions(Object value) {
		return (JSONSchemaEditorControl) this.set("definitions", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public JSONSchemaEditorControl labelRemark(Object value) {
		return (JSONSchemaEditorControl) this.set("labelRemark", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public JSONSchemaEditorControl staticClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("staticClassName", value);
	}
	
	/**
	 * 配置 label className
    */
	public JSONSchemaEditorControl labelClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("labelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public JSONSchemaEditorControl staticInputClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public JSONSchemaEditorControl useMobileUI(Object value) {
		return (JSONSchemaEditorControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 各属性输入控件的占位提示文本{   key: "key placeholder",   title: "title placeholder",   description: "description placeholder",   default: "default placeholder" }
    */
	public JSONSchemaEditorControl placeholder(Object value) {
		return (JSONSchemaEditorControl) this.set("placeholder", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public JSONSchemaEditorControl width(Object value) {
		return (JSONSchemaEditorControl) this.set("width", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public JSONSchemaEditorControl remark(Object value) {
		return (JSONSchemaEditorControl) this.set("remark", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public JSONSchemaEditorControl name(Object value) {
		return (JSONSchemaEditorControl) this.set("name", value);
	}
	
	/**
	 * 只读条件
    */
	public JSONSchemaEditorControl readOnlyOn(Object value) {
		return (JSONSchemaEditorControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public JSONSchemaEditorControl onEvent(Object value) {
		return (JSONSchemaEditorControl) this.set("onEvent", value);
	}
	
	/**
	    */
	public JSONSchemaEditorControl testIdBuilder(Object value) {
		return (JSONSchemaEditorControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 自定义详情配置面板如：{   boolean: [      {type: "input-text", name: "aa", label: "AA" }   ] }当配置布尔字段详情时，就会出现以上配置
    */
	public JSONSchemaEditorControl advancedSettings(Object value) {
		return (JSONSchemaEditorControl) this.set("advancedSettings", value);
	}
	
	/**
	    */
	public JSONSchemaEditorControl desc(Object value) {
		return (JSONSchemaEditorControl) this.set("desc", value);
	}
	
	/**
	 * 是否为必填
    */
	public JSONSchemaEditorControl required(Object value) {
		return (JSONSchemaEditorControl) this.set("required", value);
	}
	
	/**
	 * 是否隐藏
    */
	public JSONSchemaEditorControl hidden(Object value) {
		return (JSONSchemaEditorControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public JSONSchemaEditorControl visibleOn(Object value) {
		return (JSONSchemaEditorControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public JSONSchemaEditorControl staticOn(Object value) {
		return (JSONSchemaEditorControl) this.set("staticOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public JSONSchemaEditorControl description(Object value) {
		return (JSONSchemaEditorControl) this.set("description", value);
	}
	
	/**
	 * 是否禁用
    */
	public JSONSchemaEditorControl disabled(Object value) {
		return (JSONSchemaEditorControl) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示
    */
	public JSONSchemaEditorControl static_(Object value) {
		return (JSONSchemaEditorControl) this.set("static_", value);
	}
	
	/**
	    */
	public JSONSchemaEditorControl staticSchema(Object value) {
		return (JSONSchemaEditorControl) this.set("staticSchema", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public JSONSchemaEditorControl id(Object value) {
		return (JSONSchemaEditorControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public JSONSchemaEditorControl editorSetting(Object value) {
		return (JSONSchemaEditorControl) this.set("editorSetting", value);
	}
	
	/**
	 * 顶层是否允许修改类型
    */
	public JSONSchemaEditorControl rootTypeMutable(Object value) {
		return (JSONSchemaEditorControl) this.set("rootTypeMutable", value);
	}
	
	/**
	 * 描述标题
    */
	public JSONSchemaEditorControl labelAlign(Object value) {
		return (JSONSchemaEditorControl) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public JSONSchemaEditorControl labelWidth(Object value) {
		return (JSONSchemaEditorControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置 input className
    */
	public JSONSchemaEditorControl inputClassName(Object value) {
		return (JSONSchemaEditorControl) this.set("inputClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public JSONSchemaEditorControl value(Object value) {
		return (JSONSchemaEditorControl) this.set("value", value);
	}
	
	/**
	    */
	public JSONSchemaEditorControl initAutoFill(Object value) {
		return (JSONSchemaEditorControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 描述标题
    */
	public JSONSchemaEditorControl label(Object value) {
		return (JSONSchemaEditorControl) this.set("label", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public JSONSchemaEditorControl mode(Object value) {
		return (JSONSchemaEditorControl) this.set("mode", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public JSONSchemaEditorControl inline(Object value) {
		return (JSONSchemaEditorControl) this.set("inline", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public JSONSchemaEditorControl $$id(Object value) {
		return (JSONSchemaEditorControl) this.set("$$id", value);
	}
	}