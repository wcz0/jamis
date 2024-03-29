package com.wcz0.renderers;
/**
 * Static 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/static

 * @author wcz0
 * @version 6.2.2
 */
public class StaticExactControl extends BaseRenderer {

	public StaticExactControl() {
		this.set("type", "staticExactControl");
	}

	public StaticExactControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否隐藏表达式
    */
	public StaticExactControl hiddenOn(Object value) {
		return (StaticExactControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public StaticExactControl name(Object value) {
		return (StaticExactControl) this.set("name", value);
	}
	
	/**
	 * 是否只读
    */
	public StaticExactControl readOnly(Object value) {
		return (StaticExactControl) this.set("readOnly", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public StaticExactControl validateOnChange(Object value) {
		return (StaticExactControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单项类型
    */
	public StaticExactControl type(Object value) {
		return (StaticExactControl) this.set("type", value);
	}
	
	/**
	 * 是否隐藏
    */
	public StaticExactControl hidden(Object value) {
		return (StaticExactControl) this.set("hidden", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public StaticExactControl description(Object value) {
		return (StaticExactControl) this.set("description", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public StaticExactControl mode(Object value) {
		return (StaticExactControl) this.set("mode", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public StaticExactControl staticOn(Object value) {
		return (StaticExactControl) this.set("staticOn", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public StaticExactControl inline(Object value) {
		return (StaticExactControl) this.set("inline", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public StaticExactControl staticLabelClassName(Object value) {
		return (StaticExactControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public StaticExactControl useMobileUI(Object value) {
		return (StaticExactControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public StaticExactControl extraName(Object value) {
		return (StaticExactControl) this.set("extraName", value);
	}
	
	/**
	 * 是否为必填
    */
	public StaticExactControl required(Object value) {
		return (StaticExactControl) this.set("required", value);
	}
	
	/**
	    */
	public StaticExactControl validations(Object value) {
		return (StaticExactControl) this.set("validations", value);
	}
	
	/**
	 * 描述标题
    */
	public StaticExactControl label(Object value) {
		return (StaticExactControl) this.set("label", value);
	}
	
	/**
	    */
	public StaticExactControl staticSchema(Object value) {
		return (StaticExactControl) this.set("staticSchema", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public StaticExactControl size(Object value) {
		return (StaticExactControl) this.set("size", value);
	}
	
	/**
	 * 是否禁用
    */
	public StaticExactControl disabled(Object value) {
		return (StaticExactControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public StaticExactControl visibleOn(Object value) {
		return (StaticExactControl) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public StaticExactControl id(Object value) {
		return (StaticExactControl) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public StaticExactControl staticPlaceholder(Object value) {
		return (StaticExactControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public StaticExactControl validationErrors(Object value) {
		return (StaticExactControl) this.set("validationErrors", value);
	}
	
	/**
	 * 事件动作配置
    */
	public StaticExactControl onEvent(Object value) {
		return (StaticExactControl) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public StaticExactControl style(Object value) {
		return (StaticExactControl) this.set("style", value);
	}
	
	/**
	 * 配置 label className
    */
	public StaticExactControl labelClassName(Object value) {
		return (StaticExactControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public StaticExactControl desc(Object value) {
		return (StaticExactControl) this.set("desc", value);
	}
	
	/**
	 * 内容模板，不支持 HTML
    */
	public StaticExactControl text(Object value) {
		return (StaticExactControl) this.set("text", value);
	}
	
	/**
	 * 边框模式，默认是无边框的
    * 可选值: full | half | none
    */
	public StaticExactControl borderMode(Object value) {
		return (StaticExactControl) this.set("borderMode", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public StaticExactControl submitOnChange(Object value) {
		return (StaticExactControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 只读条件
    */
	public StaticExactControl readOnlyOn(Object value) {
		return (StaticExactControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public StaticExactControl clearValueOnHidden(Object value) {
		return (StaticExactControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 配置快速编辑功能
    */
	public StaticExactControl quickEdit(Object value) {
		return (StaticExactControl) this.set("quickEdit", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public StaticExactControl labelWidth(Object value) {
		return (StaticExactControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置查看详情功能
    */
	public StaticExactControl popOver(Object value) {
		return (StaticExactControl) this.set("popOver", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public StaticExactControl editorSetting(Object value) {
		return (StaticExactControl) this.set("editorSetting", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public StaticExactControl remark(Object value) {
		return (StaticExactControl) this.set("remark", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public StaticExactControl hint(Object value) {
		return (StaticExactControl) this.set("hint", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public StaticExactControl horizontal(Object value) {
		return (StaticExactControl) this.set("horizontal", value);
	}
	
	/**
	 * 配置 input className
    */
	public StaticExactControl inputClassName(Object value) {
		return (StaticExactControl) this.set("inputClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public StaticExactControl className(Object value) {
		return (StaticExactControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public StaticExactControl visible(Object value) {
		return (StaticExactControl) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public StaticExactControl static_(Object value) {
		return (StaticExactControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public StaticExactControl staticClassName(Object value) {
		return (StaticExactControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public StaticExactControl staticInputClassName(Object value) {
		return (StaticExactControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public StaticExactControl labelRemark(Object value) {
		return (StaticExactControl) this.set("labelRemark", value);
	}
	
	/**
	 * 占位符
    */
	public StaticExactControl placeholder(Object value) {
		return (StaticExactControl) this.set("placeholder", value);
	}
	
	/**
	 * 内容模板， 支持 HTML
    */
	public StaticExactControl tpl(Object value) {
		return (StaticExactControl) this.set("tpl", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public StaticExactControl descriptionClassName(Object value) {
		return (StaticExactControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public StaticExactControl value(Object value) {
		return (StaticExactControl) this.set("value", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public StaticExactControl validateApi(Object value) {
		return (StaticExactControl) this.set("validateApi", value);
	}
	
	/**
	 * 配置点击复制功能
    */
	public StaticExactControl copyable(Object value) {
		return (StaticExactControl) this.set("copyable", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public StaticExactControl disabledOn(Object value) {
		return (StaticExactControl) this.set("disabledOn", value);
	}
	
	/**
	 * 描述标题
    */
	public StaticExactControl labelAlign(Object value) {
		return (StaticExactControl) this.set("labelAlign", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public StaticExactControl width(Object value) {
		return (StaticExactControl) this.set("width", value);
	}
	}