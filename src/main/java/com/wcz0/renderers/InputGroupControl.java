package com.wcz0.renderers;
/**
 * InputGroup 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/input-group

 * @author wcz0
 * @version 6.2.2
 */
public class InputGroupControl extends BaseRenderer {

	public InputGroupControl() {
		this.set("type", "inputGroupControl");
	}

	/**
	 * 组件样式
    */
	public InputGroupControl style(Object value) {
		return (InputGroupControl) this.set("style", value);
	}
	
	/**
	 * 描述标题
    */
	public InputGroupControl labelAlign(Object value) {
		return (InputGroupControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public InputGroupControl extraName(Object value) {
		return (InputGroupControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public InputGroupControl remark(Object value) {
		return (InputGroupControl) this.set("remark", value);
	}
	
	/**
	    */
	public InputGroupControl initAutoFill(Object value) {
		return (InputGroupControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public InputGroupControl hiddenOn(Object value) {
		return (InputGroupControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public InputGroupControl useMobileUI(Object value) {
		return (InputGroupControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public InputGroupControl desc(Object value) {
		return (InputGroupControl) this.set("desc", value);
	}
	
	/**
	 * 配置 input className
    */
	public InputGroupControl inputClassName(Object value) {
		return (InputGroupControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public InputGroupControl validations(Object value) {
		return (InputGroupControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public InputGroupControl validateApi(Object value) {
		return (InputGroupControl) this.set("validateApi", value);
	}
	
	/**
	    */
	public InputGroupControl testIdBuilder(Object value) {
		return (InputGroupControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public InputGroupControl size(Object value) {
		return (InputGroupControl) this.set("size", value);
	}
	
	/**
	 * 配置 label className
    */
	public InputGroupControl labelClassName(Object value) {
		return (InputGroupControl) this.set("labelClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public InputGroupControl clearValueOnHidden(Object value) {
		return (InputGroupControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public InputGroupControl $$id(Object value) {
		return (InputGroupControl) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public InputGroupControl visible(Object value) {
		return (InputGroupControl) this.set("visible", value);
	}
	
	/**
	 * 描述标题
    */
	public InputGroupControl label(Object value) {
		return (InputGroupControl) this.set("label", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public InputGroupControl labelRemark(Object value) {
		return (InputGroupControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否只读
    */
	public InputGroupControl readOnly(Object value) {
		return (InputGroupControl) this.set("readOnly", value);
	}
	
	/**
	 * 只读条件
    */
	public InputGroupControl readOnlyOn(Object value) {
		return (InputGroupControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否为必填
    */
	public InputGroupControl required(Object value) {
		return (InputGroupControl) this.set("required", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public InputGroupControl disabledOn(Object value) {
		return (InputGroupControl) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public InputGroupControl onEvent(Object value) {
		return (InputGroupControl) this.set("onEvent", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public InputGroupControl validationErrors(Object value) {
		return (InputGroupControl) this.set("validationErrors", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public InputGroupControl labelWidth(Object value) {
		return (InputGroupControl) this.set("labelWidth", value);
	}
	
	/**
	 * 表单项类型
    */
	public InputGroupControl type(Object value) {
		return (InputGroupControl) this.set("type", value);
	}
	
	/**
	 * 是否隐藏
    */
	public InputGroupControl hidden(Object value) {
		return (InputGroupControl) this.set("hidden", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public InputGroupControl submitOnChange(Object value) {
		return (InputGroupControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public InputGroupControl visibleOn(Object value) {
		return (InputGroupControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public InputGroupControl static_(Object value) {
		return (InputGroupControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public InputGroupControl staticPlaceholder(Object value) {
		return (InputGroupControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public InputGroupControl validateOnChange(Object value) {
		return (InputGroupControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public InputGroupControl hint(Object value) {
		return (InputGroupControl) this.set("hint", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public InputGroupControl inline(Object value) {
		return (InputGroupControl) this.set("inline", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public InputGroupControl staticClassName(Object value) {
		return (InputGroupControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public InputGroupControl staticLabelClassName(Object value) {
		return (InputGroupControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public InputGroupControl staticInputClassName(Object value) {
		return (InputGroupControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public InputGroupControl descriptionClassName(Object value) {
		return (InputGroupControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * FormItem 集合
    */
	public InputGroupControl body(Object value) {
		return (InputGroupControl) this.set("body", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public InputGroupControl className(Object value) {
		return (InputGroupControl) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public InputGroupControl id(Object value) {
		return (InputGroupControl) this.set("id", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public InputGroupControl mode(Object value) {
		return (InputGroupControl) this.set("mode", value);
	}
	
	/**
	 * 是否禁用
    */
	public InputGroupControl disabled(Object value) {
		return (InputGroupControl) this.set("disabled", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public InputGroupControl editorSetting(Object value) {
		return (InputGroupControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public InputGroupControl description(Object value) {
		return (InputGroupControl) this.set("description", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public InputGroupControl horizontal(Object value) {
		return (InputGroupControl) this.set("horizontal", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public InputGroupControl autoFill(Object value) {
		return (InputGroupControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public InputGroupControl staticOn(Object value) {
		return (InputGroupControl) this.set("staticOn", value);
	}
	
	/**
	 * 占位符
    */
	public InputGroupControl placeholder(Object value) {
		return (InputGroupControl) this.set("placeholder", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public InputGroupControl value(Object value) {
		return (InputGroupControl) this.set("value", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public InputGroupControl width(Object value) {
		return (InputGroupControl) this.set("width", value);
	}
	
	/**
	    */
	public InputGroupControl staticSchema(Object value) {
		return (InputGroupControl) this.set("staticSchema", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public InputGroupControl name(Object value) {
		return (InputGroupControl) this.set("name", value);
	}
	
	/**
	 * 校验提示信息配置
    */
	public InputGroupControl validationConfig(Object value) {
		return (InputGroupControl) this.set("validationConfig", value);
	}
	}