package com.wcz0.renderers;
/**
 * Color 颜色选择框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/color

 * @author wcz0
 * @version 6.2.2
 */
public class InputColorControl extends BaseRenderer {

	public InputColorControl() {
		this.set("type", "inputColorControl");
	}

	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public InputColorControl mode(Object value) {
		return (InputColorControl) this.set("mode", value);
	}
	
	/**
	 * 配置 label className
    */
	public InputColorControl labelClassName(Object value) {
		return (InputColorControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public InputColorControl staticSchema(Object value) {
		return (InputColorControl) this.set("staticSchema", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public InputColorControl labelRemark(Object value) {
		return (InputColorControl) this.set("labelRemark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public InputColorControl horizontal(Object value) {
		return (InputColorControl) this.set("horizontal", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public InputColorControl clearValueOnHidden(Object value) {
		return (InputColorControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public InputColorControl initAutoFill(Object value) {
		return (InputColorControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public InputColorControl staticLabelClassName(Object value) {
		return (InputColorControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public InputColorControl value(Object value) {
		return (InputColorControl) this.set("value", value);
	}
	
	/**
	 * 指定为颜色选择框
    */
	public InputColorControl type(Object value) {
		return (InputColorControl) this.set("type", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public InputColorControl size(Object value) {
		return (InputColorControl) this.set("size", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public InputColorControl inline(Object value) {
		return (InputColorControl) this.set("inline", value);
	}
	
	/**
	 * 是否显示清除按钮
    */
	public InputColorControl clearable(Object value) {
		return (InputColorControl) this.set("clearable", value);
	}
	
	/**
	 * 选中颜色后是否关闭弹出层。
    */
	public InputColorControl closeOnSelect(Object value) {
		return (InputColorControl) this.set("closeOnSelect", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public InputColorControl useMobileUI(Object value) {
		return (InputColorControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public InputColorControl id(Object value) {
		return (InputColorControl) this.set("id", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public InputColorControl hiddenOn(Object value) {
		return (InputColorControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public InputColorControl className(Object value) {
		return (InputColorControl) this.set("className", value);
	}
	
	/**
	 * 组件样式
    */
	public InputColorControl style(Object value) {
		return (InputColorControl) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public InputColorControl editorSetting(Object value) {
		return (InputColorControl) this.set("editorSetting", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public InputColorControl $$id(Object value) {
		return (InputColorControl) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用
    */
	public InputColorControl disabled(Object value) {
		return (InputColorControl) this.set("disabled", value);
	}
	
	/**
	 * 描述标题
    */
	public InputColorControl labelAlign(Object value) {
		return (InputColorControl) this.set("labelAlign", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public InputColorControl submitOnChange(Object value) {
		return (InputColorControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否显示
    */
	public InputColorControl visible(Object value) {
		return (InputColorControl) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public InputColorControl onEvent(Object value) {
		return (InputColorControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public InputColorControl staticPlaceholder(Object value) {
		return (InputColorControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public InputColorControl staticClassName(Object value) {
		return (InputColorControl) this.set("staticClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public InputColorControl remark(Object value) {
		return (InputColorControl) this.set("remark", value);
	}
	
	/**
	 * 是否允许用户输入颜色。
    */
	public InputColorControl allowCustomColor(Object value) {
		return (InputColorControl) this.set("allowCustomColor", value);
	}
	
	/**
	 * 是否隐藏
    */
	public InputColorControl hidden(Object value) {
		return (InputColorControl) this.set("hidden", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public InputColorControl descriptionClassName(Object value) {
		return (InputColorControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public InputColorControl disabledOn(Object value) {
		return (InputColorControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否只读
    */
	public InputColorControl readOnly(Object value) {
		return (InputColorControl) this.set("readOnly", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public InputColorControl width(Object value) {
		return (InputColorControl) this.set("width", value);
	}
	
	/**
	 * 是否静态展示
    */
	public InputColorControl static_(Object value) {
		return (InputColorControl) this.set("static_", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public InputColorControl hint(Object value) {
		return (InputColorControl) this.set("hint", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public InputColorControl staticInputClassName(Object value) {
		return (InputColorControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public InputColorControl labelWidth(Object value) {
		return (InputColorControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public InputColorControl extraName(Object value) {
		return (InputColorControl) this.set("extraName", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public InputColorControl description(Object value) {
		return (InputColorControl) this.set("description", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public InputColorControl validationErrors(Object value) {
		return (InputColorControl) this.set("validationErrors", value);
	}
	
	/**
	    */
	public InputColorControl validations(Object value) {
		return (InputColorControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public InputColorControl validateApi(Object value) {
		return (InputColorControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public InputColorControl staticOn(Object value) {
		return (InputColorControl) this.set("staticOn", value);
	}
	
	/**
	 * 预设颜色，用户可以直接从预设中选。
    */
	public InputColorControl presetColors(Object value) {
		return (InputColorControl) this.set("presetColors", value);
	}
	
	/**
	 * 颜色格式
    * 可选值: hex | rgb | rgba | hsl
    */
	public InputColorControl format(Object value) {
		return (InputColorControl) this.set("format", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public InputColorControl name(Object value) {
		return (InputColorControl) this.set("name", value);
	}
	
	/**
	    */
	public InputColorControl desc(Object value) {
		return (InputColorControl) this.set("desc", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public InputColorControl visibleOn(Object value) {
		return (InputColorControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述标题
    */
	public InputColorControl label(Object value) {
		return (InputColorControl) this.set("label", value);
	}
	
	/**
	 * 只读条件
    */
	public InputColorControl readOnlyOn(Object value) {
		return (InputColorControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 配置 input className
    */
	public InputColorControl inputClassName(Object value) {
		return (InputColorControl) this.set("inputClassName", value);
	}
	
	/**
	 * 占位符
    */
	public InputColorControl placeholder(Object value) {
		return (InputColorControl) this.set("placeholder", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public InputColorControl autoFill(Object value) {
		return (InputColorControl) this.set("autoFill", value);
	}
	
	/**
	    */
	public InputColorControl testIdBuilder(Object value) {
		return (InputColorControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否为必填
    */
	public InputColorControl required(Object value) {
		return (InputColorControl) this.set("required", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public InputColorControl validateOnChange(Object value) {
		return (InputColorControl) this.set("validateOnChange", value);
	}
	}