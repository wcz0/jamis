package com.wcz0.renderers;
/**
 * Switch 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/switch

 * @author wcz0
 * @version 6.2.2
 */
public class SwitchControl extends BaseRenderer {

	public SwitchControl() {
		this.set("type", "switchControl");
	}

	/**
	 * 验证失败的提示信息
    */
	public SwitchControl validationErrors(Object value) {
		return (SwitchControl) this.set("validationErrors", value);
	}
	
	/**
	 * 配置 input className
    */
	public SwitchControl inputClassName(Object value) {
		return (SwitchControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SwitchControl visibleOn(Object value) {
		return (SwitchControl) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SwitchControl useMobileUI(Object value) {
		return (SwitchControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public SwitchControl desc(Object value) {
		return (SwitchControl) this.set("desc", value);
	}
	
	/**
	 * 指定为多行文本输入框
    */
	public SwitchControl type(Object value) {
		return (SwitchControl) this.set("type", value);
	}
	
	/**
	 * 关闭时显示的内容
    */
	public SwitchControl offText(Object value) {
		return (SwitchControl) this.set("offText", value);
	}
	
	/**
	 * 是否隐藏
    */
	public SwitchControl hidden(Object value) {
		return (SwitchControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public SwitchControl visible(Object value) {
		return (SwitchControl) this.set("visible", value);
	}
	
	/**
	    */
	public SwitchControl initAutoFill(Object value) {
		return (SwitchControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否处于加载状态
    */
	public SwitchControl loading(Object value) {
		return (SwitchControl) this.set("loading", value);
	}
	
	/**
	 * 开关尺寸
    * 可选值: sm | md
    */
	public SwitchControl size(Object value) {
		return (SwitchControl) this.set("size", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public SwitchControl labelRemark(Object value) {
		return (SwitchControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public SwitchControl description(Object value) {
		return (SwitchControl) this.set("description", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public SwitchControl validateApi(Object value) {
		return (SwitchControl) this.set("validateApi", value);
	}
	
	/**
	 * 未勾选值
    */
	public SwitchControl falseValue(Object value) {
		return (SwitchControl) this.set("falseValue", value);
	}
	
	/**
	 * 是否只读
    */
	public SwitchControl readOnly(Object value) {
		return (SwitchControl) this.set("readOnly", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public SwitchControl validateOnChange(Object value) {
		return (SwitchControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SwitchControl hiddenOn(Object value) {
		return (SwitchControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 只读条件
    */
	public SwitchControl readOnlyOn(Object value) {
		return (SwitchControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述标题
    */
	public SwitchControl labelAlign(Object value) {
		return (SwitchControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public SwitchControl extraName(Object value) {
		return (SwitchControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public SwitchControl remark(Object value) {
		return (SwitchControl) this.set("remark", value);
	}
	
	/**
	 * 选项说明
    */
	public SwitchControl option(Object value) {
		return (SwitchControl) this.set("option", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SwitchControl static_(Object value) {
		return (SwitchControl) this.set("static_", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SwitchControl staticOn(Object value) {
		return (SwitchControl) this.set("staticOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public SwitchControl descriptionClassName(Object value) {
		return (SwitchControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public SwitchControl horizontal(Object value) {
		return (SwitchControl) this.set("horizontal", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public SwitchControl width(Object value) {
		return (SwitchControl) this.set("width", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SwitchControl staticClassName(Object value) {
		return (SwitchControl) this.set("staticClassName", value);
	}
	
	/**
	    */
	public SwitchControl testIdBuilder(Object value) {
		return (SwitchControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SwitchControl staticInputClassName(Object value) {
		return (SwitchControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public SwitchControl name(Object value) {
		return (SwitchControl) this.set("name", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public SwitchControl submitOnChange(Object value) {
		return (SwitchControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public SwitchControl inline(Object value) {
		return (SwitchControl) this.set("inline", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public SwitchControl clearValueOnHidden(Object value) {
		return (SwitchControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public SwitchControl className(Object value) {
		return (SwitchControl) this.set("className", value);
	}
	
	/**
	 * 描述标题
    */
	public SwitchControl label(Object value) {
		return (SwitchControl) this.set("label", value);
	}
	
	/**
	 * 是否为必填
    */
	public SwitchControl required(Object value) {
		return (SwitchControl) this.set("required", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public SwitchControl autoFill(Object value) {
		return (SwitchControl) this.set("autoFill", value);
	}
	
	/**
	 * 勾选值
    */
	public SwitchControl trueValue(Object value) {
		return (SwitchControl) this.set("trueValue", value);
	}
	
	/**
	 * 开启时显示的内容
    */
	public SwitchControl onText(Object value) {
		return (SwitchControl) this.set("onText", value);
	}
	
	/**
	    */
	public SwitchControl staticSchema(Object value) {
		return (SwitchControl) this.set("staticSchema", value);
	}
	
	/**
	 * 占位符
    */
	public SwitchControl placeholder(Object value) {
		return (SwitchControl) this.set("placeholder", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public SwitchControl labelWidth(Object value) {
		return (SwitchControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public SwitchControl mode(Object value) {
		return (SwitchControl) this.set("mode", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SwitchControl onEvent(Object value) {
		return (SwitchControl) this.set("onEvent", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public SwitchControl hint(Object value) {
		return (SwitchControl) this.set("hint", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public SwitchControl value(Object value) {
		return (SwitchControl) this.set("value", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SwitchControl editorSetting(Object value) {
		return (SwitchControl) this.set("editorSetting", value);
	}
	
	/**
	 * 配置 label className
    */
	public SwitchControl labelClassName(Object value) {
		return (SwitchControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public SwitchControl validations(Object value) {
		return (SwitchControl) this.set("validations", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public SwitchControl $$id(Object value) {
		return (SwitchControl) this.set("$$id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SwitchControl staticPlaceholder(Object value) {
		return (SwitchControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否禁用
    */
	public SwitchControl disabled(Object value) {
		return (SwitchControl) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SwitchControl id(Object value) {
		return (SwitchControl) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public SwitchControl style(Object value) {
		return (SwitchControl) this.set("style", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SwitchControl disabledOn(Object value) {
		return (SwitchControl) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SwitchControl staticLabelClassName(Object value) {
		return (SwitchControl) this.set("staticLabelClassName", value);
	}
	}