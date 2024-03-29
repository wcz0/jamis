package com.wcz0.renderers;
/**
 * Group 表单集合渲染器，能让多个表单在一行显示 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/group

 * @author wcz0
 * @version 6.2.2
 */
public class GroupControl extends BaseRenderer {

	public GroupControl() {
		this.set("type", "groupControl");
	}

	public GroupControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏
    */
	public GroupControl hidden(Object value) {
		return (GroupControl) this.set("hidden", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public GroupControl size(Object value) {
		return (GroupControl) this.set("size", value);
	}
	
	/**
	 * 配置 label className
    */
	public GroupControl labelClassName(Object value) {
		return (GroupControl) this.set("labelClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public GroupControl onEvent(Object value) {
		return (GroupControl) this.set("onEvent", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public GroupControl validateOnChange(Object value) {
		return (GroupControl) this.set("validateOnChange", value);
	}
	
	/**
	 * FormItem 集合
    */
	public GroupControl body(Object value) {
		return (GroupControl) this.set("body", value);
	}
	
	/**
	 * 间隔
    * 可选值: xs | sm | normal
    */
	public GroupControl gap(Object value) {
		return (GroupControl) this.set("gap", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public GroupControl subFormHorizontal(Object value) {
		return (GroupControl) this.set("subFormHorizontal", value);
	}
	
	/**
	    */
	public GroupControl desc(Object value) {
		return (GroupControl) this.set("desc", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public GroupControl disabledOn(Object value) {
		return (GroupControl) this.set("disabledOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public GroupControl remark(Object value) {
		return (GroupControl) this.set("remark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public GroupControl description(Object value) {
		return (GroupControl) this.set("description", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public GroupControl clearValueOnHidden(Object value) {
		return (GroupControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 配置子表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public GroupControl subFormMode(Object value) {
		return (GroupControl) this.set("subFormMode", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public GroupControl staticLabelClassName(Object value) {
		return (GroupControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public GroupControl editorSetting(Object value) {
		return (GroupControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public GroupControl useMobileUI(Object value) {
		return (GroupControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public GroupControl label(Object value) {
		return (GroupControl) this.set("label", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public GroupControl validateApi(Object value) {
		return (GroupControl) this.set("validateApi", value);
	}
	
	/**
	 * 配置时垂直摆放还是左右摆放。
    * 可选值: horizontal | vertical
    */
	public GroupControl direction(Object value) {
		return (GroupControl) this.set("direction", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public GroupControl width(Object value) {
		return (GroupControl) this.set("width", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public GroupControl staticClassName(Object value) {
		return (GroupControl) this.set("staticClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public GroupControl descriptionClassName(Object value) {
		return (GroupControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public GroupControl inline(Object value) {
		return (GroupControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public GroupControl required(Object value) {
		return (GroupControl) this.set("required", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public GroupControl value(Object value) {
		return (GroupControl) this.set("value", value);
	}
	
	/**
	 * 组件样式
    */
	public GroupControl style(Object value) {
		return (GroupControl) this.set("style", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public GroupControl staticOn(Object value) {
		return (GroupControl) this.set("staticOn", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public GroupControl extraName(Object value) {
		return (GroupControl) this.set("extraName", value);
	}
	
	/**
	 * 表单项类型
    */
	public GroupControl type(Object value) {
		return (GroupControl) this.set("type", value);
	}
	
	/**
	 * 是否静态展示
    */
	public GroupControl static_(Object value) {
		return (GroupControl) this.set("static_", value);
	}
	
	/**
	 * 只读条件
    */
	public GroupControl readOnlyOn(Object value) {
		return (GroupControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否显示
    */
	public GroupControl visible(Object value) {
		return (GroupControl) this.set("visible", value);
	}
	
	/**
	 * 占位符
    */
	public GroupControl placeholder(Object value) {
		return (GroupControl) this.set("placeholder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public GroupControl className(Object value) {
		return (GroupControl) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public GroupControl staticInputClassName(Object value) {
		return (GroupControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public GroupControl validationErrors(Object value) {
		return (GroupControl) this.set("validationErrors", value);
	}
	
	/**
	    */
	public GroupControl validations(Object value) {
		return (GroupControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public GroupControl hiddenOn(Object value) {
		return (GroupControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public GroupControl staticSchema(Object value) {
		return (GroupControl) this.set("staticSchema", value);
	}
	
	/**
	 * 描述标题
    */
	public GroupControl labelAlign(Object value) {
		return (GroupControl) this.set("labelAlign", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public GroupControl labelRemark(Object value) {
		return (GroupControl) this.set("labelRemark", value);
	}
	
	/**
	 * 配置 input className
    */
	public GroupControl inputClassName(Object value) {
		return (GroupControl) this.set("inputClassName", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public GroupControl labelWidth(Object value) {
		return (GroupControl) this.set("labelWidth", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public GroupControl submitOnChange(Object value) {
		return (GroupControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public GroupControl name(Object value) {
		return (GroupControl) this.set("name", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public GroupControl hint(Object value) {
		return (GroupControl) this.set("hint", value);
	}
	
	/**
	 * 是否禁用
    */
	public GroupControl disabled(Object value) {
		return (GroupControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public GroupControl visibleOn(Object value) {
		return (GroupControl) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public GroupControl id(Object value) {
		return (GroupControl) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public GroupControl staticPlaceholder(Object value) {
		return (GroupControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否只读
    */
	public GroupControl readOnly(Object value) {
		return (GroupControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public GroupControl mode(Object value) {
		return (GroupControl) this.set("mode", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public GroupControl horizontal(Object value) {
		return (GroupControl) this.set("horizontal", value);
	}
	}