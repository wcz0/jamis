package com.wcz0.renderers;
/**
 * FieldSet 表单项集合 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/fieldset

 * @author wcz0
 * @version 6.2.2
 */
public class FieldSetControl extends BaseRenderer {

	public FieldSetControl() {
		this.set("type", "fieldSetControl");
	}

	public FieldSetControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否只读
    */
	public FieldSetControl readOnly(Object value) {
		return (FieldSetControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置 input className
    */
	public FieldSetControl inputClassName(Object value) {
		return (FieldSetControl) this.set("inputClassName", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public FieldSetControl width(Object value) {
		return (FieldSetControl) this.set("width", value);
	}
	
	/**
	 * 卡片隐藏就销毁内容。
    */
	public FieldSetControl unmountOnExit(Object value) {
		return (FieldSetControl) this.set("unmountOnExit", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public FieldSetControl extraName(Object value) {
		return (FieldSetControl) this.set("extraName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public FieldSetControl id(Object value) {
		return (FieldSetControl) this.set("id", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public FieldSetControl descriptionClassName(Object value) {
		return (FieldSetControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 内容区域
    */
	public FieldSetControl body(Object value) {
		return (FieldSetControl) this.set("body", value);
	}
	
	/**
	 * 标识
    */
	public FieldSetControl key(Object value) {
		return (FieldSetControl) this.set("key", value);
	}
	
	/**
	 * 默认是否折叠
    */
	public FieldSetControl collapsed(Object value) {
		return (FieldSetControl) this.set("collapsed", value);
	}
	
	/**
	 * 是否可折叠
    */
	public FieldSetControl collapsable(Object value) {
		return (FieldSetControl) this.set("collapsable", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public FieldSetControl staticOn(Object value) {
		return (FieldSetControl) this.set("staticOn", value);
	}
	
	/**
	 * 点开时才加载内容
    */
	public FieldSetControl mountOnEnter(Object value) {
		return (FieldSetControl) this.set("mountOnEnter", value);
	}
	
	/**
	 * 标题内容分割线
    */
	public FieldSetControl divideLine(Object value) {
		return (FieldSetControl) this.set("divideLine", value);
	}
	
	/**
	 * 是否隐藏
    */
	public FieldSetControl hidden(Object value) {
		return (FieldSetControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public FieldSetControl staticInputClassName(Object value) {
		return (FieldSetControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public FieldSetControl style(Object value) {
		return (FieldSetControl) this.set("style", value);
	}
	
	/**
	 * 配置 label className
    */
	public FieldSetControl labelClassName(Object value) {
		return (FieldSetControl) this.set("labelClassName", value);
	}
	
	/**
	 * 标题展示位置
    * 可选值: top | bottom
    */
	public FieldSetControl headerPosition(Object value) {
		return (FieldSetControl) this.set("headerPosition", value);
	}
	
	/**
	 * 自定义切换图标
    */
	public FieldSetControl expandIcon(Object value) {
		return (FieldSetControl) this.set("expandIcon", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public FieldSetControl subFormHorizontal(Object value) {
		return (FieldSetControl) this.set("subFormHorizontal", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public FieldSetControl hint(Object value) {
		return (FieldSetControl) this.set("hint", value);
	}
	
	/**
	 * 占位符
    */
	public FieldSetControl placeholder(Object value) {
		return (FieldSetControl) this.set("placeholder", value);
	}
	
	/**
	 * 标题
    */
	public FieldSetControl header(Object value) {
		return (FieldSetControl) this.set("header", value);
	}
	
	/**
	 * 只读条件
    */
	public FieldSetControl readOnlyOn(Object value) {
		return (FieldSetControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public FieldSetControl mode(Object value) {
		return (FieldSetControl) this.set("mode", value);
	}
	
	/**
	 * 配置 Body 容器 className
    */
	public FieldSetControl bodyClassName(Object value) {
		return (FieldSetControl) this.set("bodyClassName", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public FieldSetControl staticClassName(Object value) {
		return (FieldSetControl) this.set("staticClassName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public FieldSetControl validateOnChange(Object value) {
		return (FieldSetControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public FieldSetControl validateApi(Object value) {
		return (FieldSetControl) this.set("validateApi", value);
	}
	
	/**
	 * 标题
    */
	public FieldSetControl title(Object value) {
		return (FieldSetControl) this.set("title", value);
	}
	
	/**
	 * 图标是否展示
    */
	public FieldSetControl showArrow(Object value) {
		return (FieldSetControl) this.set("showArrow", value);
	}
	
	/**
	 * 控件大小
    * 可选值: xs | sm | md | lg | base
    */
	public FieldSetControl size(Object value) {
		return (FieldSetControl) this.set("size", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public FieldSetControl editorSetting(Object value) {
		return (FieldSetControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public FieldSetControl useMobileUI(Object value) {
		return (FieldSetControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public FieldSetControl validations(Object value) {
		return (FieldSetControl) this.set("validations", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public FieldSetControl className(Object value) {
		return (FieldSetControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public FieldSetControl visible(Object value) {
		return (FieldSetControl) this.set("visible", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public FieldSetControl name(Object value) {
		return (FieldSetControl) this.set("name", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public FieldSetControl submitOnChange(Object value) {
		return (FieldSetControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public FieldSetControl staticSchema(Object value) {
		return (FieldSetControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否静态展示
    */
	public FieldSetControl static_(Object value) {
		return (FieldSetControl) this.set("static_", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public FieldSetControl description(Object value) {
		return (FieldSetControl) this.set("description", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public FieldSetControl inline(Object value) {
		return (FieldSetControl) this.set("inline", value);
	}
	
	/**
	 * 收起的标题
    */
	public FieldSetControl collapseTitle(Object value) {
		return (FieldSetControl) this.set("collapseTitle", value);
	}
	
	/**
	 * 是否禁用
    */
	public FieldSetControl disabled(Object value) {
		return (FieldSetControl) this.set("disabled", value);
	}
	
	/**
	 * 事件动作配置
    */
	public FieldSetControl onEvent(Object value) {
		return (FieldSetControl) this.set("onEvent", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public FieldSetControl remark(Object value) {
		return (FieldSetControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public FieldSetControl labelRemark(Object value) {
		return (FieldSetControl) this.set("labelRemark", value);
	}
	
	/**
	    */
	public FieldSetControl desc(Object value) {
		return (FieldSetControl) this.set("desc", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public FieldSetControl horizontal(Object value) {
		return (FieldSetControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否为必填
    */
	public FieldSetControl required(Object value) {
		return (FieldSetControl) this.set("required", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public FieldSetControl clearValueOnHidden(Object value) {
		return (FieldSetControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 标题 CSS 类名
    */
	public FieldSetControl headingClassName(Object value) {
		return (FieldSetControl) this.set("headingClassName", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public FieldSetControl labelWidth(Object value) {
		return (FieldSetControl) this.set("labelWidth", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public FieldSetControl staticPlaceholder(Object value) {
		return (FieldSetControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public FieldSetControl staticLabelClassName(Object value) {
		return (FieldSetControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public FieldSetControl validationErrors(Object value) {
		return (FieldSetControl) this.set("validationErrors", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public FieldSetControl subFormMode(Object value) {
		return (FieldSetControl) this.set("subFormMode", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public FieldSetControl disabledOn(Object value) {
		return (FieldSetControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public FieldSetControl hiddenOn(Object value) {
		return (FieldSetControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 指定为表单项集合
    * 可选值: fieldset | fieldSet
    */
	public FieldSetControl type(Object value) {
		return (FieldSetControl) this.set("type", value);
	}
	
	/**
	 * 标题展示位置
    * 可选值: top | bottom
    */
	public FieldSetControl titlePosition(Object value) {
		return (FieldSetControl) this.set("titlePosition", value);
	}
	
	/**
	 * 收起的标题
    */
	public FieldSetControl collapseHeader(Object value) {
		return (FieldSetControl) this.set("collapseHeader", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public FieldSetControl value(Object value) {
		return (FieldSetControl) this.set("value", value);
	}
	
	/**
	 * 描述标题
    */
	public FieldSetControl labelAlign(Object value) {
		return (FieldSetControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public FieldSetControl visibleOn(Object value) {
		return (FieldSetControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述标题
    */
	public FieldSetControl label(Object value) {
		return (FieldSetControl) this.set("label", value);
	}
	}