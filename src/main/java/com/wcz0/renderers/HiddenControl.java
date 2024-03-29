package com.wcz0.renderers;
/**
 * Hidden 隐藏域。功能性组件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/hidden

 * @author wcz0
 * @version 6.2.2
 */
public class HiddenControl extends BaseRenderer {

	public HiddenControl() {
		this.set("type", "hiddenControl");
	}

	public HiddenControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public HiddenControl disabled(Object value) {
		return (HiddenControl) this.set("disabled", value);
	}
	
	/**
	 * 是否只读
    */
	public HiddenControl readOnly(Object value) {
		return (HiddenControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public HiddenControl descriptionClassName(Object value) {
		return (HiddenControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public HiddenControl validateApi(Object value) {
		return (HiddenControl) this.set("validateApi", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public HiddenControl width(Object value) {
		return (HiddenControl) this.set("width", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public HiddenControl staticOn(Object value) {
		return (HiddenControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public HiddenControl staticClassName(Object value) {
		return (HiddenControl) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public HiddenControl useMobileUI(Object value) {
		return (HiddenControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 配置 label className
    */
	public HiddenControl labelClassName(Object value) {
		return (HiddenControl) this.set("labelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public HiddenControl remark(Object value) {
		return (HiddenControl) this.set("remark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public HiddenControl description(Object value) {
		return (HiddenControl) this.set("description", value);
	}
	
	/**
	    */
	public HiddenControl desc(Object value) {
		return (HiddenControl) this.set("desc", value);
	}
	
	/**
	 * 是否隐藏
    */
	public HiddenControl hidden(Object value) {
		return (HiddenControl) this.set("hidden", value);
	}
	
	/**
	 * 配置 input className
    */
	public HiddenControl inputClassName(Object value) {
		return (HiddenControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public HiddenControl disabledOn(Object value) {
		return (HiddenControl) this.set("disabledOn", value);
	}
	
	/**
	 * 描述标题
    */
	public HiddenControl label(Object value) {
		return (HiddenControl) this.set("label", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public HiddenControl name(Object value) {
		return (HiddenControl) this.set("name", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public HiddenControl labelRemark(Object value) {
		return (HiddenControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否为必填
    */
	public HiddenControl required(Object value) {
		return (HiddenControl) this.set("required", value);
	}
	
	/**
	 * 表单项类型
    */
	public HiddenControl type(Object value) {
		return (HiddenControl) this.set("type", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public HiddenControl className(Object value) {
		return (HiddenControl) this.set("className", value);
	}
	
	/**
	 * 组件样式
    */
	public HiddenControl style(Object value) {
		return (HiddenControl) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public HiddenControl editorSetting(Object value) {
		return (HiddenControl) this.set("editorSetting", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public HiddenControl labelWidth(Object value) {
		return (HiddenControl) this.set("labelWidth", value);
	}
	
	/**
	 * 只读条件
    */
	public HiddenControl readOnlyOn(Object value) {
		return (HiddenControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public HiddenControl staticPlaceholder(Object value) {
		return (HiddenControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public HiddenControl id(Object value) {
		return (HiddenControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public HiddenControl static_(Object value) {
		return (HiddenControl) this.set("static_", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public HiddenControl size(Object value) {
		return (HiddenControl) this.set("size", value);
	}
	
	/**
	 * 描述标题
    */
	public HiddenControl labelAlign(Object value) {
		return (HiddenControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public HiddenControl extraName(Object value) {
		return (HiddenControl) this.set("extraName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public HiddenControl hint(Object value) {
		return (HiddenControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public HiddenControl validateOnChange(Object value) {
		return (HiddenControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public HiddenControl visibleOn(Object value) {
		return (HiddenControl) this.set("visibleOn", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public HiddenControl inline(Object value) {
		return (HiddenControl) this.set("inline", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public HiddenControl validationErrors(Object value) {
		return (HiddenControl) this.set("validationErrors", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public HiddenControl value(Object value) {
		return (HiddenControl) this.set("value", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public HiddenControl horizontal(Object value) {
		return (HiddenControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public HiddenControl staticSchema(Object value) {
		return (HiddenControl) this.set("staticSchema", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public HiddenControl submitOnChange(Object value) {
		return (HiddenControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public HiddenControl validations(Object value) {
		return (HiddenControl) this.set("validations", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public HiddenControl clearValueOnHidden(Object value) {
		return (HiddenControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否显示
    */
	public HiddenControl visible(Object value) {
		return (HiddenControl) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public HiddenControl onEvent(Object value) {
		return (HiddenControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public HiddenControl staticLabelClassName(Object value) {
		return (HiddenControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public HiddenControl staticInputClassName(Object value) {
		return (HiddenControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public HiddenControl mode(Object value) {
		return (HiddenControl) this.set("mode", value);
	}
	
	/**
	 * 占位符
    */
	public HiddenControl placeholder(Object value) {
		return (HiddenControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public HiddenControl hiddenOn(Object value) {
		return (HiddenControl) this.set("hiddenOn", value);
	}
	}